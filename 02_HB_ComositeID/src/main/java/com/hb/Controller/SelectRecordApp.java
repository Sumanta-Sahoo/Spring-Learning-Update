package com.hb.Controller;

import org.hibernate.HibernateException;


import org.hibernate.Session;

import com.hb.Entity.ProgrammerProjectId;
import com.hb.Entity.ProgrammerProjectInfo;
import com.hb.Utils.HibernateUtil;

public class SelectRecordApp {

	public static void main(String[] args) {

		Session session = null;

		try {
			if (session == null) {
				session = HibernateUtil.getSession();
				if (session != null) {
					ProgrammerProjectId id = new ProgrammerProjectId();
					id.setProID(102);
					id.setProjectID(509);
					ProgrammerProjectInfo object = session.get(ProgrammerProjectInfo.class, id);
					if (object != null) {
						System.out.println(object);
					} else {
						System.out.println("Record not found with PK : " + id);
					}
				}
			}

		} catch (HibernateException hbe) {
			hbe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
	}

}
