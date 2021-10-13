/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaintro.servicios;

import java.util.List;
import jpaintro.entidades.Persona;
import jpaintro.persistencia.PersonaDAO;

/**
 *
 * @author santi
 */
public class PersonaService {
    
    PersonaDAO pdao = new PersonaDAO();
    
    public Persona crearPersona(Persona p) throws Exception{
        
        if (p.getNombre()==null || p.getNombre().isEmpty()) {
            throw new Exception("Ingresaste un nombre nulo o vacio");
        }
        if (p.getDni()==null || p.getDni()<=0) {
            throw new Exception("El DNI es invalido");
        }
//        if (p.getDni()) {
//            
//        }

        if (p.getCumple()==null) {
            throw new Exception("Fecha invalida");
        }
        
        pdao.crear(p);
        return p;
    }
    
    public Persona buscarPorDni(Long dni){
        return pdao.buscarPorDni(dni);
    }
    
    public List<Persona> listarTodas(){
        return pdao.listarTodas();
    }
    
}
