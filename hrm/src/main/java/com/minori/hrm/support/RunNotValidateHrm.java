package com.minori.hrm.support;

public interface RunNotValidateHrm<T,R> {
	R runService(T data);
}
