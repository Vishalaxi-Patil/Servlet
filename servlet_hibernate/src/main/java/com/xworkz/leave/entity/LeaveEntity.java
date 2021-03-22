package com.xworkz.leave.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "leave")
public class LeaveEntity {

	
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "NO_OF_LEAVES")
	private int noOfLeaves;
	@Column(name = "REASON")
	private String reason;
	@Column(name = "START_DATE")
	private String date;
	
	
}
