package hibernate.task2;

import hibernate.task2.models.Car.Car;
import hibernate.task2.models.Car.Type;
import hibernate.task2.models.DriveLicense;
import hibernate.task2.models.Owner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();
        Metadata metadata = new MetadataSources(serviceRegistry)
                .addAnnotatedClass(Car.class)
                .addAnnotatedClass(DriveLicense.class)
                .addAnnotatedClass(Owner.class)
                .getMetadataBuilder()
                .build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Zhigul", Type.PICKUP, 100, 4000, 1998));
        cars.add(new Car("KIA", Type.TRUCK, 500, 12000, 2008));

        Owner katya = new Owner("Katya", cars, new DriveLicense("54354-34543534fc-vfdfg"));
        session.persist(katya);

        Owner oleh = new Owner("Oleh", cars, new DriveLicense("93449-3-590000-003333"));
        session.persist(oleh);

//        Owner owner = session.find(Owner.class, 4L);
//        System.out.println(owner);
//        session.remove(owner);


        session.getTransaction().commit();

        session.createQuery("select o FROM Owner o  where o.name = 'Oleh' ", Owner.class)
                .getResultList()
                .forEach(owner -> System.out.println(owner.getCars()));

        session.close();
        sessionFactory.close();

    }
}
