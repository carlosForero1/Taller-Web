package com.web.taller.Booking.Domain.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Pasajero pasajero;

    @OneToOne
    private Ruta ruta;
    private LocalDate fecha;
    private boolean reservaEstado;

    public Reserva() {
    }

    public Reserva(Long id, Pasajero pasajero, Ruta ruta, LocalDate fecha, boolean reservaEstado) {
        this.id = id;
        this.pasajero = pasajero;
        this.ruta = ruta;
        this.fecha = fecha;
        this.reservaEstado = reservaEstado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isReservaEstado() {
        return reservaEstado;
    }

    public void setReservaEstado(boolean reservaEstado) {
        this.reservaEstado = reservaEstado;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", pasajero=" + pasajero +
                ", ruta=" + ruta +
                ", fecha=" + fecha +
                ", reservaEstado=" + reservaEstado +
                '}';
    }
}
