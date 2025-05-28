package com.web.taller.Booking.Domain.Aggregate;

import com.web.taller.Booking.Domain.Entities.Pasajero;
import com.web.taller.Booking.Domain.Entities.Ruta;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Pasajero pasajero;

    @ManyToOne
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

    public Reserva(Pasajero pasajero, Ruta ruta, LocalDate fecha, boolean reservaEstado) {
        this.pasajero = pasajero;
        this.ruta = ruta;
        this.fecha = fecha;
        this.reservaEstado = reservaEstado;
    }

    public String  confirmar() {
        String informacion = "La reserva con id "+getId()+ " a nombre de " + pasajero.getNombre();

        if (reservaEstado) {
            informacion += " ya está confirmada, ";
        }else {
            informacion += " no esta confirmada, ";
        }

        if (!ruta.tieneCupo()) {
            informacion += "la ruta no tiene cupo disponible";
        }else {
            informacion += "y la ruta tiene cupo disponible.";
        }

        return informacion;

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
