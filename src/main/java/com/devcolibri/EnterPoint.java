package com.devcolibri;

import com.devcolibri.entity.User;
import com.devcolibri.persistence.HibernateUtil;
import org.hibernate.*;

public class EnterPoint {

    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        User user1 = new User();
        Integer UID = null;

//        user1.setFirstName("Ivanov");
//        user1.setLastName("Vasia");
//        UID = (Integer) session.save(user1);
//        System.out.println("User "  + UID + " was stored to the DB");

        user1 = (User) session.get(User.class, 5);
        session.delete(user1);

//        User user2 = new User();
//        user2.setFirstName("Kysiuk");
//        user2.setLastName("Dimasik");

//        session.save(user1);
//        session.save(user2);
//        session.delete("from user u where u.USER_ID = '1'");
//        User user = new User();
//        user.setUserId(new Integer(2));
//        session.delete(user);

//        Query query = session.createQuery("delete User where USER_ID = :ID");
//        query.setParameter("ID", new Integer(1));
//        int result = query.executeUpdate();

        session.getTransaction().commit();

    }

}