package com.web.taller.Booking.Application.UseCases.Reserva;

import com.web.taller.Booking.Domain.Entities.Reserva;
import com.web.taller.Booking.Infrastructure.Repositories.ReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class CrearReserva {

    @Autowired
    private ReservaRepositorio repositorio;


    public Reserva crearReserva(Reserva reserva){
        if (reserva.getFecha().isBefore(java.time.LocalDate.now())) {
            throw new IllegalArgumentException("No se puede reservar en fechas pasadas");
        }
        return repositorio.save(reserva);
    }
}
