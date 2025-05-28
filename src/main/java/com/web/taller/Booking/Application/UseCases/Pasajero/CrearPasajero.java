package com.web.taller.Booking.Application.UseCases.Pasajero;

import com.web.taller.Booking.Application.interfaces.EmailServicio;
import com.web.taller.Booking.Domain.Entities.EmailEntity;
import com.web.taller.Booking.Domain.Entities.Pasajero;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.EmailRepositorio;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.PasajeroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrearPasajero {
    private PasajeroRepositorio repositorio;
    private EmailRepositorio emailRepositorio;

    public CrearPasajero(PasajeroRepositorio repositorio, EmailRepositorio emailRepositorio) {
        this.repositorio = repositorio;
        this.emailRepositorio = emailRepositorio;
    }

        public String CrearPasajero(Pasajero pasajero) {
            if (pasajero != null) {
                repositorio.save(pasajero);
                return "Pasajero creado";
            }
            return "Error";
        }
}