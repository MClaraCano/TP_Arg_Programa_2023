import Clases.Cliente;
import Clases.Servicio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Cliente cliente = new Cliente(); //← Seteamos todos los atributos
        em.persist(cliente);
        tx.commit();

        Servicio servicio = new Servicio();

        System.out.println("");
        System.out.println("-------------");
        System.out.println("Prueba");
    }

    public static EntityManager getEntityManager(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }

}
