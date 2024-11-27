package edu.adrian.DTO;

import java.util.List;

import edu.adrian.Entities.Carrera;
import edu.adrian.enumerated.Conduccion;

public class PilotoDTO {

private String nombre;
private Conduccion conduccion;
private List<Carrera> listaCarreras;

public PilotoDTO() {}

public PilotoDTO(String nombre, Conduccion conduccion, List<Carrera> listaCarreras) {
    this.nombre = nombre;
    this.conduccion = conduccion;
    this.listaCarreras = listaCarreras;
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

public List<Carrera> getListaCarreras() {
    return listaCarreras;
}

public void setListaCarreras(List<Carrera> listaCarreras) {
    this.listaCarreras = listaCarreras;
}

@Override
public String toString() {
    return "PilotoDTO [nombre=" + nombre + ", conduccion=" + conduccion + ", listaCarreras=" + listaCarreras + "]";
}



}
