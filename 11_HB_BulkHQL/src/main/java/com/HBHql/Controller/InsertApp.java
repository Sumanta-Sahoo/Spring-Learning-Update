package com.HBHql.Controller;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.HBHql.Entity.InsurancePolicy;
import com.HBHql.Util.HibernateUtil;


public class InsertApp {

	public static void main(String[] args) {
		
		Session session = null;
		InsurancePolicy p1 = null;
		
		try {
			session = HibernateUtil.getSession();
			if(session!=null) {
				Query query = session.createQuery("FROM com.HBHql.Entity.InsurancePolicy");
				List<InsurancePolicy>  list= query.list();
				
				for(InsurancePolicy elem : list) {
					System.out.println(elem);
				}
				
			}
//			if(transaction!=null) {
//				p1.setPolicyHolderName("Pritam Pradhan");
//				p1.setPolicyHolderNomineeName("Anil Biswal");
//				p1.setPolicyMonthlyPremium(10000.00);
//				p1.setPolicyTenure("25");
//				p1.setPolicyType("Type 3");
				
//				p1 = session.get(InsurancePolicy.class, id);
//				if(p1 == null) {
//					System.out.println("Record not found with id : " + id);
//				}else {
//					p1.setPolicyHolderNomineeName("Biswojit Tarai");
//					session.persist(p1);
//					flag = true;
//				}
				
//			}
		}catch(HibernateException he) {
			he.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
	}

}
