package com.web.taller.Booking.Application.UseCases.Reserva;

import com.web.taller.Booking.Domain.Entities.Reserva;
import com.web.taller.Booking.Infrastructure.Repositories.ReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InformacionReserva {
    @Autowired
    private ReservaRepositorio repositorio;


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
