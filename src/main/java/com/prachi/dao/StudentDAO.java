package com.prachi.dao;

import com.prachi.model.Student;
import com.prachi.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;



import java.util.List;

public class StudentDAO {
    public void saveStudent(Student student) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.persist(student);

            tx.commit();
        }
    }

    public List<Student> getAllStudents() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Student", Student.class).list();
        }
    }
}
