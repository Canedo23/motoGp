
package edu.adrian.DTO;

import edu.adrian.Entities.Circuito;
import edu.adrian.Entities.Piloto;
import edu.adrian.enumerated.Posicion;

public class CarreraDTO {

private Piloto piloto;
private Circuito circuito;
private String temporada;
private Posicion posicion;

public CarreraDTO() {}

public CarreraDTO(Piloto piloto, Circuito circuito, String temporada, Posicion posicion) {
    this.piloto = piloto;
    this.circuito = circuito;
    this.temporada = temporada;
    this.posicion = posicion;
}

public Piloto getPiloto() {
    return piloto;
}

public void setPiloto(Piloto piloto) {
    this.piloto = piloto;
}

public Circuito getCircuito() {
    return circuito;
}

public void setCircuito(Circuito circuito) {
    this.circuito = circuito;
}

public String getTemporada() {
    return temporada;
}

public void setTemporada(String temporada) {
    this.temporada = temporada;
}

public Posicion getPosicion() {
    return posicion;
}

public void setPosicion(Posicion posicion) {
    this.posicion = posicion;
}

@Override
public String toString() {
    return "CarreraDTO [piloto=" + piloto + ", circuito=" + circuito + ", temporada=" + temporada + ", posicion="
            + posicion + "]";
}



}
