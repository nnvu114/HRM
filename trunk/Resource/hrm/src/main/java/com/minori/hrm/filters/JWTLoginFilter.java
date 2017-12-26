package com.minori.hrm.filters;


import com.minori.hrm.form.LoginForm;
import com.minori.hrm.models.AccountCredentials;
import com.minori.hrm.models.UserDeviceToken;
import com.minori.hrm.services.TokenAuthenticationService;

import com.minori.hrm.services.UserDeviceTokenService;
import com.minori.hrm.services.UserService;
import com.minori.hrm.validators.LoginValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;

public class JWTLoginFilter extends AbstractAuthenticationProcessingFilter {
	
	private LoginValidate loginValidate;
	
	@Autowired
	private UserDeviceTokenService userDeviceTokenService;
	
	@Autowired
	private UserService userService;
	
	public JWTLoginFilter(String url, AuthenticationManager authManager) {
		super(new AntPathRequestMatcher(url));
		setAuthenticationManager(authManager);
		loginValidate = new LoginValidate();
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException, IOException, ServletException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String deviceToken = request.getParameter("device-token");
		if(!loginValidate.validate(new LoginForm(username, password, deviceToken))) {
			return null;
		}
		AccountCredentials credentials = new AccountCredentials(username, password, deviceToken);
		UserDeviceToken userDeviceToken = new UserDeviceToken();
		userDeviceToken.setUserDeviceTokenId(deviceToken);
		userDeviceToken.setUser(userService.findByUserName(username));
		userDeviceTokenService.save(userDeviceToken);
		return getAuthenticationManager().authenticate(
			new UsernamePasswordAuthenticationToken(
				credentials.getUsername(),
				credentials.getPassword(),
				Collections.emptyList()
			)
		);
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response,
			FilterChain chain, Authentication authResult) throws IOException, ServletException {
		TokenAuthenticationService.addAuthentication(response, authResult.getName());
	}
}
