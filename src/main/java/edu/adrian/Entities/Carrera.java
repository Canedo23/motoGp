package edu.adrian.Entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.adrian.enumerated.Posicion;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "carreras")
public class Carrera {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@JsonIgnore
@OnDelete(action = OnDeleteAction.CASCADE)
@ManyToOne(optional = true, targetEntity = Piloto.class, fetch = FetchType.EAGER)
@JoinColumn(nullable = false)
private Piloto piloto;
@OnDelete(action = OnDeleteAction.CASCADE)
@ManyToOne(optional = true, targetEntity = Circuito.class, fetch = FetchType.EAGER)
@JoinColumn(nullable = false)
private Circuito circuito;
@Column(nullable = false, length = 8)
private String temporada;
@Enumerated(EnumType.STRING)
@Column(nullable = true)
private Posicion posicion;

public Carrera() {
}

public Carrera(Piloto piloto, Circuito circuito, String temporada, Posicion posicion) {
    this.piloto = piloto;
    this.circuito = circuito;
    this.temporada = temporada;
    this.posicion = posicion;
}

public Carrera(Long id, Piloto piloto, Circuito circuito, String temporada, Posicion posicion) {
    this.id = id;
    this.piloto = piloto;
    this.circuito = circuito;
    this.temporada = temporada;
    this.posicion = posicion;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
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





}
