/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaintro.persistencia;

import jpaintro.entidades.Pelicula;

/**
 *
 * @author santi
 */
public class PeliculaDAO extends DAO{
    
    public void crear(Pelicula pelicula) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(pelicula);
            em.getTransaction().commit();
        } catch (Exception e) {
            try {
                em.getTransaction().rollback();
            } catch (Exception ex) {
                throw new Exception("Error haciendo un rollback");
            }
            
            throw new Exception("Error al persitir una persona");
        }
    }
    
    public void modificar(Pelicula pelicula) throws Exception{
        try {
            em.getTransaction().begin();
            em.merge(pelicula);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al modificar una persona");
        }
    }
    
    public void eliminar(Pelicula pelicula) throws Exception{
        try {
            em.getTransaction().begin();
            em.remove(pelicula);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al eliminar una persona");
        }
    }
    
    public Pelicula buscarPorId(Integer id){
        return em.find(Pelicula.class, id);
    }
    
}
