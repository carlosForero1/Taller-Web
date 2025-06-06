package com.web.taller.Booking.Domain.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int cupo;
    private int limiteDelCupo;
    private String nombreRuta;
    private double kilometrosRuta;

    public Ruta() {
    }

    public Ruta(Long id, int cupo, int limiteDelCupo, String nombreRuta, double kilometrosRuta) {
        this.id = id;
        this.cupo = cupo;
        this.limiteDelCupo = limiteDelCupo;
        this.nombreRuta = nombreRuta;
        this.kilometrosRuta = kilometrosRuta;
    }

    public boolean tieneCupo() {
        return cupo > 0 && cupo < limiteDelCupo;
    }

    public void reducirCupo() {
        if (cupo <= 0) {
            throw new IllegalStateException("No hay cupos disponibles.");
        }
        cupo--;
    }

    public void incrementarCupo() {
        cupo++;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

    public double getKilometrosRuta() {
        return kilometrosRuta;
    }

    public void setKilometrosRuta(double kilometrosRuta) {
        this.kilometrosRuta = kilometrosRuta;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public int getLimiteDelCupo() {
        return limiteDelCupo;
    }

    public void setLimiteDelCupo(int limiteDelCupo) {
        this.limiteDelCupo = limiteDelCupo;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "id=" + id +
                ", nombreRuta='" + nombreRuta + '\'' +
                ", kilometrosRuta=" + kilometrosRuta +
                '}';
    }
}
