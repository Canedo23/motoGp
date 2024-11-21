package edu.adrian.Entities;

import edu.adrian.enumerated.Conduccion;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "piloto")
public class Piloto {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(nullable = false, length = 100)
private String nombre;
@Enumerated(EnumType.STRING)
@Column(nullable = false)
private Conduccion conduccion;


public Piloto() {
}


public Piloto(String nombre, Conduccion conduccion) {
    this.nombre = nombre;
    this.conduccion = conduccion;
}


public Piloto(Long id, String nombre, Conduccion conduccion) {
    this.id = id;
    this.nombre = nombre;
    this.conduccion = conduccion;
}


public Long getId() {
    return id;
}


public void setId(Long id) {
    this.id = id;
}


public String getNombre() {
    return nombre;
}


public void setNombre(String nombre) {
    this.nombre = nombre;
}


public Conduccion getConduccion() {
    return conduccion;
}


public void setConduccion(Conduccion conduccion) {
    this.conduccion = conduccion;
}


@Override
public String toString() {
    return "Piloto [id=" + id + ", nombre=" + nombre + ", conduccion=" + conduccion + "]";
}



}

