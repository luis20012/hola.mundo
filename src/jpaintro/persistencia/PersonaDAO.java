/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaintro.persistencia;

import java.util.List;
import jpaintro.entidades.Persona;

/**
 *
 * @author santi
 */
public class PersonaDAO extends DAO {

    public void crear(Persona persona) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(persona);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al persitir una persona");
        }
    }
    
    public void modificar(Persona persona) throws Exception{
        try {
            em.getTransaction().begin();
            em.merge(persona);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al modificar una persona");
        }
    }
    
    public void eliminar(Persona persona) throws Exception{
        try {
            em.getTransaction().begin();
            em.remove(persona);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al eliminar una persona");
        }
    }
    
    public Persona buscarPorId(Integer id){
        return em.find(Persona.class, id);
    }
    
    public Persona buscarPorDni(Long dni){
        return (Persona) em.createQuery("SELECT p FROM Persona p WHERE p.dni = :dni ").setParameter("dni", dni).getSingleResult();
    }
    
    public List<Persona> listarTodas(){
        return em.createQuery("SELECT p FROM Persona p").getResultList();
    }

}
