package com.web.taller.Booking.Application.UseCases.Reserva;

import com.web.taller.Booking.Infrastructure.Repositories.ReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class BorrarReserva {
    @Autowired
    private ReservaRepositorio repositorio;

    public boolean borrar(Long id){
        if (id != null) {
            repositorio.deleteById(id);
            return true;
        }
        return false;
    }
}
