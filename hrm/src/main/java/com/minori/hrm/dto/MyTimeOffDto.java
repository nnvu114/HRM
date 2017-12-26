package com.minori.hrm.dto;

import java.util.List;

/**
 * 
 * @author KhanhNM
 *
 */
public class MyTimeOffDto {
	
	private long total;
	
	private List<CreateTimeOffDto> data;

	/**
	 * @return the total
	 */
	public long getTotal() {
		return total;
	}

	/**
	 * @return the data
	 */
	public List<CreateTimeOffDto> getData() {
		return data;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(long total) {
		this.total = total;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(List<CreateTimeOffDto> data) {
		this.data = data;
	}

}
