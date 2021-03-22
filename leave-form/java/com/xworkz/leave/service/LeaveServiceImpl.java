package com.xworkz.leave.service;

import com.xworkz.leave.dao.LeaveDAO;
import com.xworkz.leave.entity.LeaveEntity;

public class LeaveServiceImpl implements LeaveService<LeaveEntity> {

	private LeaveDAO dao;

	public LeaveServiceImpl(LeaveDAO dao) {
		System.out.println("created " + this.getClass().getSimpleName());
		this.dao = dao;
	}

	@Override
	public boolean validateAndSave(LeaveEntity entity) {
		System.out.println("invoked validateAndSave");
		System.out.println("entity " + entity);
		boolean valid = true;
		if (entity != null) {
			System.out.println("can add entity");
			if (valid) {
				String name = entity.getName();
				if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
					System.out.println("name is valid");
					valid = true;
				} else {
					System.out.println("name is invalid");
					valid = false;
				}
			}
			if (valid) {
				String email = entity.getEmail();
				if (email != null && !email.isEmpty() && email.contains("@") && email.endsWith(".com")) {
					System.out.println("email is valid");
					valid = true;
				} else {
					System.out.println("email is invalid");
					valid = false;
				}
			}
			if (valid) {
				String reason = entity.getReason();
				if (reason != null && !reason.isEmpty() && reason.length() > 3 && reason.length() < 15) {
					System.out.println("reason is valid");
					valid = true;
				} else {
					System.out.println("reason is invalid");
					valid = false;
				}
			}
			if (valid) {
				int leaves = entity.getNoOfLeaves();
				if (leaves != 0) {
					System.out.println("leaves is valid");
					valid = true;
				} else {
					System.out.println("leaves is invalid");
					valid = false;
				}
			}

			if (valid) {
				String date = entity.getDate();
				if (date != null) {
					System.out.println("date no is valid");
					valid = true;
				} else {
					System.out.println("date no is invalid");
					valid = false;
				}
			}

		} else {
			System.out.println("can not add entity");
		}

		return valid;
	}
}
