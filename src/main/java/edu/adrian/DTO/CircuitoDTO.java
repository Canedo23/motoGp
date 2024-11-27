package edu.adrian.DTO;

import java.util.List;

import edu.adrian.Entities.Carrera;

public class CircuitoDTO {

private String nombre;
private String localidad;
private List<Carrera> listaCarreras;

public CircuitoDTO() {}

public CircuitoDTO(String nombre, String localidad, List<Carrera> listaCarreras) {
    this.nombre = nombre;
    this.localidad = localidad;
    this.listaCarreras = listaCarreras;
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
    return "CircuitoDTO [nombre=" + nombre + ", localidad=" + localidad + ", listaCarreras=" + listaCarreras + "]";
}



}
