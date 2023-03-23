package hibernate.task1.hibernate;

import hibernate.task1.hibernate.models.RubiksCube;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();

        Metadata metadata = new MetadataSources(serviceRegistry)
                .addAnnotatedClass(RubiksCube.class)
                .getMetadataBuilder()
                .build();

        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
//        session.beginTransaction();
////
////
//        RubiksCube cube = new RubiksCube("MOYU MS3R", 4444444);
////        session.save(cube);
//        session.persist(cube);
////        session.delete(3);
////
////
//        session.getTransaction().commit();

        RubiksCube rubiksCube = session.find(RubiksCube.class, 1L);
        session.remove(rubiksCube);

//        System.out.println("CUBE: " + rubiksCube);
        //Close all process
        session.close();
        sessionFactory.close();
    }
}
