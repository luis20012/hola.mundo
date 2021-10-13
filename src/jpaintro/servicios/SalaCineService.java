/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaintro.servicios;

import jpaintro.entidades.SalaCine;
import jpaintro.persistencia.SalaCineDAO;

/**
 *
 * @author santi
 */
public class SalaCineService {
    
    SalaCineDAO scdao = new SalaCineDAO();
    
    public SalaCine crearSalaCine(SalaCine salaCine) throws Exception{
        
        if (salaCine.getPersonas()==null||salaCine.getPersonas().isEmpty()) {
           throw new Exception("Antes de crear la sala llenala de personas"); 
        }
        if (salaCine.getPelicula()==null) {
            throw new Exception("Antes de crear la sala, crea la pelicula");
        }
        
        scdao.crear(salaCine);
        return salaCine;
    }
    
    public void eliminarSalaCine(Integer id) throws Exception{
        SalaCine sc = scdao.buscarPorId(id);
        if (sc==null) {
            throw new Exception("La sala de cine que buscaste no existe en la bd");
        }
        scdao.eliminar(sc);
    }
    
    public SalaCine buscarPorId(Integer id){
        return scdao.buscarPorId(id);
    }
    
}
