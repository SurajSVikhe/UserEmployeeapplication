package com.Operation.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Operation.pojo.Employee;

@Repository
public class DaoImpl implements DaoI {

	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public Long SaveEmployee (Employee employee) {
		System.out.println("dao layer method");
		System.out.println(employee);
		 Session openSession = sessionfactory.openSession();
		openSession.beginTransaction();
		 Long save = (Long) openSession.save(employee);// for store
		openSession.getTransaction().commit(); // commit for store &
		return save;
	}

	@Override
	public List<Employee> getAlldata() {
		Session session = sessionfactory.openSession();
		Query createQuery = session.createQuery("from Employee");
		List<Employee> resultList = createQuery.getResultList();

		return resultList;
	}


}
