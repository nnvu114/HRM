package com.hrm.commons;

public final class Constands {

	/** The status active*/
	public final static int STATUS_ACTIVE = 0;
	
	/** The status inactive*/
	public final static int STATUS_INACTIVE = 1;

	/** OK – the request has succeeded. */
	public final static int STATUS_OK = 200;

	/**
	 * Created – the request has succeeded and a request was created a new
	 * resource ( ex:- create a new user).
	 */
	public final static int STATUS_CREATED = 201;

	/**
	 * Not Content – the request has succeeded and no need to return any content
	 * ( ex:- such as update operation)
	 */
	public final static int STATUS_NOT_CONTENT = 204;

	/** Bad Request – the request could not be understood. */
	public final static int STATUS_BAD_REQUEST = 400;

	/** Unauthorized – the request require user authorization. */
	public final static int STATUS_UNAUTHORIZED = 401;

	/** Forbidden – the server refusing to fulfill the request. */
	public final static int STATUS_FORBIDDEN = 403;

	/**
	 * Not found – the server can not find anything that related to the request
	 * ( ex:- try to get user by id that not in the server).
	 */
	public final static int STATUS_NOT_FOUND = 404;

	/**
	 * Conflict – the request can not be completed due to a resource conflict. 
	 * (ex:- user id already exist).
	 */
	public final static int STATUS_CONFLICT = 409;

	/**
	 * Internal Server Error - The server encountered an unexpected condition
	 * which prevented it from fulfilling the request.
	 */
	public final static int STATUS_INTERNAL_SERVER_ERROR = 500;
}
