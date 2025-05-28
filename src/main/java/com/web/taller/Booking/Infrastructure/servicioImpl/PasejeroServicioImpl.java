package com.web.taller.Booking.Infrastructure.servicioImpl;

import com.web.taller.Booking.Application.UseCases.Pasajero.BuscarEmail;
import com.web.taller.Booking.Application.UseCases.Pasajero.CrearPasajero;
import com.web.taller.Booking.Application.interfaces.PasajeroServicio;
import com.web.taller.Booking.Domain.Entities.Pasajero;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.PasajeroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasejeroServicioImpl implements PasajeroServicio {
    private final CrearPasajero crearPasajero;
    private final BuscarEmail buscarEmail;

    public PasejeroServicioImpl(CrearPasajero crearPasajero, BuscarEmail buscarEmail) {
        this.crearPasajero = crearPasajero;
        this.buscarEmail = buscarEmail;
    }


    @Override
    public Pasajero buscarPorEmail(String email) {
        return buscarEmail.buscarPorEmail(email);
    }

    @Override
    public String CrearPasajero(Pasajero pasajero) {
        return crearPasajero.CrearPasajero(pasajero);
    }
}
