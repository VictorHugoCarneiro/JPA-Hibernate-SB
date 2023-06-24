package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {

		/*Pessoa p1 = new Pessoa(null, "Hugo", "hugo@gmail.com");
		Pessoa p2 = new Pessoa(null, "Victor", "victor@gmail.com");
		Pessoa p3 = new Pessoa(null, "Carneiro", "carneiro@gmail.com");*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
						
		/* Inserir dados no BD
	 	em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();*/
		
		/*Buscar dados
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);*/
		
		em.getTransaction().begin();
		Pessoa p = em.find(Pessoa.class, 2);
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("Pronto!");
		em.close();
		emf.close();

	}

}
