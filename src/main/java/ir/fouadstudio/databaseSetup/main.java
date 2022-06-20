package ir.fouadstudio.databaseSetup;

import ir.fouadstudio.databaseSetup.util.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class main {
    public static void main(String[] args) {
        System.out.println("start test");
        EntityManagerFactory entityManagerFactory =HibernateUtil.getEntityManagerFactory();

        EntityManager entityManager= entityManagerFactory.createEntityManager();



        System.out.println("end test");
    }

}
