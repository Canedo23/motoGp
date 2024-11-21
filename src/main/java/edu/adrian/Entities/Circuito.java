package edu.adrian.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "circuito")
public class Circuito {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(nullable = false, length = 100, unique = false)
private String nombre;
@Column(nullable = false, length = 100)
private String localidad;


public Circuito() {
}


public Circuito(String nombre, String localidad) {
    this.nombre = nombre;
    this.localidad = localidad;
}


public Circuito(Long id, String nombre, String localidad) {
    this.id = id;
    this.nombre = nombre;
    this.localidad = localidad;
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


public String getLocalidad() {
    return localidad;
}


public void setLocalidad(String localidad) {
    this.localidad = localidad;
}


@Override
public String toString() {
    return "Circuito [id=" + id + ", nombre=" + nombre + ", localidad=" + localidad + "]";
}



}
