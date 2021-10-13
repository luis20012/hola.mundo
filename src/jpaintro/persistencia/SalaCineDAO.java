/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaintro.persistencia;

import jpaintro.entidades.SalaCine;

/**
 *
 * @author santi
 */
public class SalaCineDAO extends DAO{
    
    public void crear(SalaCine sc)  throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(sc);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al persitir una persona");
        }
    }
    
    public void modificar(SalaCine sc) throws Exception{
        try {
            em.getTransaction().begin();
            em.merge(sc);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al modificar una persona");
        }
    }
    
    public void eliminar(SalaCine sc) throws Exception{
        try {
            em.getTransaction().begin();
            em.remove(sc);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al eliminar una persona");
        }
    }
    
    public SalaCine buscarPorId(Integer id){
        return em.find(SalaCine.class, id);
    }
    
}
