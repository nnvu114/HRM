package com.minori.hrm.support;

import java.util.Optional;

public interface RunHrm<T,R> {
	
	Optional<R> run(T request);

}
