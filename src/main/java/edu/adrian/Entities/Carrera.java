package edu.adrian.Entities;

import edu.adrian.enumerated.Posicion;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "carreras")
public class Carrera {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(nullable = false)
private Long idPiloto;
@Column(nullable = false)
private Long idCircuito;
@Column(nullable = false, length = 8)
private String temporada;
@Enumerated(EnumType.STRING)
@Column(nullable = true)
private Posicion posicion;

public Carrera() {
}

public Carrera(Long idPiloto, Long idCircuito, String temporada, Posicion posicion) {
    this.idPiloto = idPiloto;
    this.idCircuito = idCircuito;
    this.temporada = temporada;
    this.posicion = posicion;
}

public Carrera(Long id, Long idPiloto, Long idCircuito, String temporada, Posicion posicion) {
    this.id = id;
    this.idPiloto = idPiloto;
    this.idCircuito = idCircuito;
    this.temporada = temporada;
    this.posicion = posicion;
}



}
