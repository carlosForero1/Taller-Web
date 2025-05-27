package com.web.taller.Booking.Application.interfaces;

import com.web.taller.Booking.Application.UseCases.Reserva.BorrarReserva;
import com.web.taller.Booking.Application.UseCases.Reserva.BuscarReserva;
import com.web.taller.Booking.Application.UseCases.Reserva.CrearReserva;
import com.web.taller.Booking.Application.UseCases.Reserva.InformacionReserva;
import com.web.taller.Booking.Domain.Entities.Reserva;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServicio {
    private final CrearReserva crearReserva;
    private final BorrarReserva borrarReserva;
    private final InformacionReserva informacionReserva;
    private final BuscarReserva buscarReserva;

    public ReservaServicio(CrearReserva crearReserva,
                           BorrarReserva borrarReserva,
                           InformacionReserva informacionReserva,
                           BuscarReserva buscarReserva) {
        this.crearReserva = crearReserva;
        this.borrarReserva = borrarReserva;
        this.informacionReserva = informacionReserva;
        this.buscarReserva = buscarReserva;
    }

    public List<Reserva> buscarPorNombrePasajero(String nombre) {
        return buscarReserva.BuscarPorNombrePasajero(nombre);
    }

    public boolean borrarReserva(Long id) {
        return borrarReserva.borrar(id);
    }

    public String obtenerInformacionReserva(Long id) {
        return informacionReserva.informacionReserva(id);
    }

    public Reserva crearReserva(Reserva reserva) {
        return crearReserva.crearReserva(reserva);
    }

    public List<Reserva> listaReservas() {
        return informacionReserva.ListarReservas();
    }
}
