package com.xworkz.leave.service;

public interface LeaveService<T> {
	
	public boolean validateAndSave(T entity);

}
