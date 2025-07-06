package org.example;

import org.example.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure(); // reads hibernate.cfg.xml
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        Student student = new Student(1, "Harsh Jain");
        session.save(student);
        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
