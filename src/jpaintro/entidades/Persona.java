/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaintro.entidades;

import com.sun.istack.internal.NotNull;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author santi
 */
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotNull
    @Column(unique = true)
    private Long dni;
    
    private String nombre;
    @Temporal(TemporalType.DATE)
    private Date cumple;
    

    public Persona() {
    }

    public Persona(Long dni, String nombre, Date cumple) {
        this.dni = dni;
        this.nombre = nombre;
        this.cumple = cumple;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getCumple() {
        return cumple;
    }

    public void setCumple(Date cumple) {
        this.cumple = cumple;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", cumple=" + cumple + '}';
    }
    
    
    
}
