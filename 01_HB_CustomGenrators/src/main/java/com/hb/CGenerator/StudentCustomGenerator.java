package com.hb.CGenerator;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class StudentCustomGenerator implements IdentifierGenerator {

	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        System.out.println("StudentCustomGenerator.generate()");
        Integer id = new Random().nextInt(1000);
        String customId = "HB-"+id;
        return customId;
    }

}
