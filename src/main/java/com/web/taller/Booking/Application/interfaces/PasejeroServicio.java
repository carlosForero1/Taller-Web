package com.web.taller.Booking.Application.interfaces;

import com.web.taller.Booking.Domain.Entities.Pasajero;
import com.web.taller.Booking.Infrastructure.Repositories.PasajeroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasejeroServicio {
    @Autowired
    private PasajeroRepositorio repositorio;


    public Pasajero buscarPorEmail(String email){
        List<Pasajero> lista = repositorio.findAll();
        for (Pasajero pasajero: lista){
            if (pasajero.getEmail().equals(email)){
                return pasajero;
            }
        }
        return null;
    }

    public String CrearPasajero(Pasajero pasajero){
        if (pasajero != null){
            repositorio.save(pasajero);
            return "Pasajero creado";
        }
        return "Error";
    }
}
