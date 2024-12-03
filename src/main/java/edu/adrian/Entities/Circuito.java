package edu.adrian.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "circuitos")
public class Circuito {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(nullable = false, length = 100, unique = false)
private String nombre;
@Column(nullable = false, length = 100)
private String localidad;
@JsonIgnore
@OneToMany(mappedBy = "circuito", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
private List<Carrera> listaCarreras;


public Circuito() {
}


public Circuito(String nombre, String localidad, List<Carrera> listaCarreras) {
    this.nombre = nombre;
    this.localidad = localidad;
    this.listaCarreras = listaCarreras;
}


public Circuito(Long id, String nombre, String localidad, List<Carrera> listaCarreras) {
    this.id = id;
    this.nombre = nombre;
    this.localidad = localidad;
    this.listaCarreras = listaCarreras;
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


public List<Carrera> getListaCarreras() {
    return listaCarreras;
}


public void setListaCarreras(List<Carrera> listaCarreras) {
    this.listaCarreras = listaCarreras;
}


@Override
public String toString() {
    return "Circuito [id=" + id + ", nombre=" + nombre + ", localidad=" + localidad + "]";
}




}

