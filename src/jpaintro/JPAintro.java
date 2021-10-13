/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaintro;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import jpaintro.entidades.Pelicula;
import jpaintro.entidades.Persona;
import jpaintro.entidades.SalaCine;
import jpaintro.servicios.PeliculaService;
import jpaintro.servicios.PersonaService;
import jpaintro.servicios.SalaCineService;

/**
 *
 * @author santi
 */
public class JPAintro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            PersonaService ps = new PersonaService();
            PeliculaService pes = new PeliculaService();
            SalaCineService scs = new SalaCineService();
            Persona p1 = new Persona(18746512L, "Juan", new Date(1990 - 1900, 5, 10));
            Persona p2 = new Persona(20246411L, "Santiago", new Date(1999 - 1900, 6, 21));
            Persona p3 = new Persona(39776502L, "Mariela", new Date(1980 - 1900, 8, 19));
            Persona p4 = new Persona(41742556L, "Francisco", new Date(1945 - 1900, 9, 1));
            Persona p5 = new Persona(19036510L, "Gaston", new Date(1962 - 1900, 7, 30));
            Persona p6 = new Persona(34896511L, "Mariana", new Date(2000 - 1900, 11, 25));
            Persona p7 = new Persona(42546599L, "Ricardo", new Date(2005 - 1900, 10, 3));
            ps.crearPersona(p1);
            ps.crearPersona(p2);
            ps.crearPersona(p3);
            ps.crearPersona(p4);
            ps.crearPersona(p5);
            ps.crearPersona(p6);
            ps.crearPersona(p7);
            Pelicula p = new Pelicula(2.3, "La Era del Hielo 3", "Jason Carter Eaton");
            pes.crearPelicula(p);
            SalaCine sc = new SalaCine(p, Arrays.asList(p1, p2, p3, p4, p5, p6, p7));
            scs.crearSalaCine(sc);
            
            SalaCine aux = scs.buscarPorId(1);
            System.out.println(aux.toString());
            
            System.out.println("--------------");
            System.out.println(ps.buscarPorDni(18746512L).toString());
            System.out.println("----------------");
            List<Persona> aux2 = ps.listarTodas();
            for (int i = 0; i < aux2.size(); i++) {
                System.out.println(aux2.get(i).toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

}
