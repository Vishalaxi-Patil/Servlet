package com.xworkz.leave.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.leave.entity.LeaveEntity;

public class LeaveDAOImpl implements LeaveDAO {

	@Override
	public void save(LeaveEntity entity) {
		System.out.println("invoked save");
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
	}

}
