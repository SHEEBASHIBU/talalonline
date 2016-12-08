package com.niit.backend.backendapp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;
import com.niit.backend.backend.daoproduct.*;
import com.niit.backend.backend.daoproduct.productdaointerface;
import com.niit.backend.backendapp.model.product;
import com.niit.backend.backendapp.contextconfigaration;
import org.hibernate.Session;
import java.util.List;

public class App 
{
   

	public static void main( String[] args )
    {
    //	Session session = HibernateUtil.getSessionFactory().openSession();
    	 
     //  session.beginTransaction();
    //   product p = new product(0,null);
 
     //   p.setID(1);
    //   p.setName("Mukesh");
        
           AbstractApplicationContext context =new AnnotationConfigApplicationContext(contextconfigaration.class);
            
          productdaointerface Productdaointerface=(productdaointerface)context.getBean("Productdaointerface");
            
            product p1=new product(0,null);
           
           p1.setID(1);
           p1.setName("suma");
            Productdaointerface.addproduct(p1);
        
        
  //      session.save(p);
   //     session.getTransaction().commit();
    }
}
