package com.web.taller.Booking.Application.interfaces;

import com.web.taller.Booking.API.Requests.ReservaRequest;
import com.web.taller.Booking.API.Respone.ReservaResponse;
import com.web.taller.Booking.Application.UseCases.Reserva.BorrarReserva;
import com.web.taller.Booking.Application.UseCases.Reserva.BuscarReserva;
import com.web.taller.Booking.Application.UseCases.Reserva.CrearReserva;
import com.web.taller.Booking.Application.UseCases.Reserva.InformacionReserva;
import com.web.taller.Booking.Domain.Aggregate.Reserva;

import java.util.List;

public interface ReservaServicio {

    List<Reserva> buscarPorNombrePasajero(String nombre);

    boolean borrarReserva(Long id);

    String obtenerInformacionReserva(Long id);

    ReservaResponse crearReserva(ReservaRequest reserva);

    List<Reserva> listaReservas();
}
