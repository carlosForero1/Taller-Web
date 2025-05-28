package com.web.taller.Booking.Application.UseCases.Pasajero;

import com.web.taller.Booking.Domain.Entities.Pasajero;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.PasajeroRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuscarEmail {

    private PasajeroRepositorio repositorio;

    public BuscarEmail(PasajeroRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public Pasajero buscarPorEmail(String email){
        List<Pasajero> lista = repositorio.findAll();
        for (Pasajero pasajero: lista){
            if (pasajero.getEmail().getCorreo().getCorreo().equals(email)){
                return pasajero;
            }
        }
        return null;
    }
}
