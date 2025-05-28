package com.web.taller.Booking.Application.UseCases.Reserva;

import com.web.taller.Booking.Infrastructure.repositorio.Repositories.ReservaRepositorio;
import org.springframework.stereotype.Service;

@Service
public class BorrarReserva {

    private final ReservaRepositorio repositorio;

    public BorrarReserva(ReservaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public boolean borrar(Long id){
        if (id != null) {
            repositorio.deleteById(id);
            return true;
        }
        return false;
    }
}
