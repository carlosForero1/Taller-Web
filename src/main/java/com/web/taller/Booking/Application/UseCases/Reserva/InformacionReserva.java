package com.web.taller.Booking.Application.UseCases.Reserva;

import com.web.taller.Booking.Domain.Aggregate.Reserva;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.ReservaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformacionReserva {
    private final ReservaRepositorio repositorio;

    public InformacionReserva(ReservaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public String informacionReserva(Long id){
        List<Reserva> reserva = repositorio.findAll();
        String infor = null;
        if (reserva != null){
            for (Reserva reserva1: reserva){
                if (reserva1.getId().equals(id)){
                    infor =reserva1.confirmar();
                }
            }
        }
        return infor;
    }

    public List<Reserva> ListarReservas(){
        return repositorio.findAll();
    }
}
