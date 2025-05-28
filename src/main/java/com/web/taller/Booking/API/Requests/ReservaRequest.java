package com.web.taller.Booking.API.Requests;

import java.time.LocalDate;

public class ReservaRequest {

    private Long idPasajero;
    private Long idRuta;
    private LocalDate fecha;
    private boolean reservaEstado;

    public Long getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(Long idPasajero) {
        this.idPasajero = idPasajero;
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

    public Long getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Long idRuta) {
        this.idRuta = idRuta;
    }
}
