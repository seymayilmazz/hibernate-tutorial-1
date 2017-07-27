package com.codnect;

import com.codnect.model.Employee;
import com.codnect.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Şeyma Yılmaz on 26.7.2017.
 */
public class HibernateTest {

    public static void main(String[] args) {

        /* konfigurasyon icin */
        Configuration configuration = new Configuration();
        /* configure metodu cagrildiginda hibernate otomatik olarak
         * "hibernate.cfg.xml" dosyasini arar ve konfigurasyon
         * islemini yapar.
         */
        configuration.configure();

        /* hibernate de oturum baslatmak icin SessionFactory yardimiyla
         * oturumu baslatiyoruz/aciyoruz.
         */
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();


        /*
         * Transaction, belirli işlemleri bir bütün halinde çalıştırmak için
         * kullanılan bir yapıdır. Transaction ile birden çok komut bir blok
         * halinde çalıştırılır ve tüm komutların başarılı olması halinde işlemler
         * onaylanır. Eğer komutlardan bir tanesi bile başarısız olursa işlem iptal
         * olur.
         *
         */
        session.beginTransaction(); /* begin transaction */

        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setName("Şeyma Yılmaz");
        employee1.setSalary(4000);

        Employee employee2=new Employee();
        employee2.setId(2);
        employee2.setName("Burak Koken");
        employee2.setSalary(10000);

        Person person1=new Person();
        person1.setId(1);
        person1.setName("Merve");
        person1.setAge(22);


        /* kaydetme islemi */
        session.save(employee1);
        session.save(employee2);
        session.save(person1);

        /* transaction icin yapilan islemleri kalici hale getir. */
        session.getTransaction().commit();

        /* oturumu kapatma */
        session.close();
    }

}
