package com.minori.hrm.utils;

public class CommonResponse {
	private Object list;
	
	private int total;

	public CommonResponse(Object list, int total) {
		this.list = list;
		this.total = total;
	}

	public Object getList() {
		return list;
	}

	public void setList(Object list) {
		this.list = list;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
