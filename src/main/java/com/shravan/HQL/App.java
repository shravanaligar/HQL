package com.shravan.HQL;


import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class App 
{
    public static void main( String[] args )
    {
    	  Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
          
          SessionFactory sf = con.buildSessionFactory();
          
          Session s = sf.openSession();
          
          s.beginTransaction();
          Random r = new Random();
          
          /*for(int i=1;i<=50;i++)
          {
        	  Student st = new Student();
        	  st.setRoolno(i);
        	  st.setName("Name"+i);
        	  st.setMarks(r.nextInt(100));
        	  s.save(st);
          }*/
          
          Query q = s.createQuery("from Student where marks >50");
          List<Student> l = q.list();
          for(Student ss : l)
          {
        	  System.out.println(ss);
          }
          
          s.getTransaction().commit();
       
    }
}
