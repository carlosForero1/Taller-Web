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

    private String nombreRuta;
    private double kilometrosRuta;

    public Ruta() {
    }

    public Ruta(Long id, String nombreRuta, double kilometrosRuta) {
        this.id = id;
        this.nombreRuta = nombreRuta;
        this.kilometrosRuta = kilometrosRuta;
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

    @Override
    public String toString() {
        return "Ruta{" +
                "id=" + id +
                ", nombreRuta='" + nombreRuta + '\'' +
                ", kilometrosRuta=" + kilometrosRuta +
                '}';
    }
}
