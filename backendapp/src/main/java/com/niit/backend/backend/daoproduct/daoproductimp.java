package com.niit.backend.backend.daoproduct;

//import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.backendapp.model.product;
@Repository("Productdaointerface")
@EnableTransactionManagement
@Transactional
public class daoproductimp implements productdaointerface{
@Autowired
SessionFactory sessionFactory;
	public void addproduct(product p) {

		Session session=sessionFactory.getCurrentSession();
		session.persist(p);
	}

	

}
