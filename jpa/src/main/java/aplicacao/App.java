package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {
//        Pessoa p1 = new Pessoa(null, "Igor", "igor@gmail.com");
//        Pessoa p2 = new Pessoa(null, "João", "joao@gmail.com");
//        Pessoa p3 = new Pessoa(null, "Maria", "maria@gmail.com");
//
//
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
//        EntityManager em = emf.createEntityManager();
//
//        em.getTransaction().begin();
//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);
//        em.getTransaction().commit();
//        System.out.println("Fim!");
//        em.close();
//        emf.close();

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
//        EntityManager em = emf.createEntityManager();
//
//        Pessoa p =em.find(Pessoa.class, 2);
//        System.out.println(p);
//
//        em.close();
//        emf.close();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa p = em.find(Pessoa.class, 3);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
