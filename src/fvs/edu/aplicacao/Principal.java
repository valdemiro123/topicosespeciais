package fvs.edu.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fvs.edu.dominio.Aluno;


public class Principal {

	public static void main(String[] args) {
		EntityManagerFactory emf = 
	    Persistence.createEntityManagerFactory
	    ("topicos-fvs");
		
		EntityManager em = emf.createEntityManager();
		
		Aluno aluno = em.find(Aluno.class,1);
		System.out.println(aluno);
		
		//em.getTransaction().begin();
		//Aluno aluno1 = new Aluno (null,"valdemiro neto","123456","123456",123);
		//em.persist(aluno1);
		//em.getTransaction().commit();
		
		
	}

}
