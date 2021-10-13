/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaintro.servicios;

import jpaintro.entidades.Pelicula;
import jpaintro.persistencia.PeliculaDAO;

/**
 *
 * @author santi
 */
public class PeliculaService {
    
    PeliculaDAO pdao = new PeliculaDAO();
    
    public Pelicula crearPelicula(Pelicula p) throws Exception{
        
        if (p.getTitulo()==null || p.getTitulo().isEmpty()) {
            throw new Exception("Ingresaste un titulo nulo o vacio");
        }
        if (p.getDuracion()==null || p.getDuracion()<=0) {
            throw new Exception("La duracion es invalido");
        }
//        if (p.getDni()) {
//            
//        }

        if (p.getAutor()==null || p.getAutor().isEmpty()) {
            throw new Exception("Ingresaste un autor nulo o vacio");
        }
        
        pdao.crear(p);
        return p;
    }
    
}
