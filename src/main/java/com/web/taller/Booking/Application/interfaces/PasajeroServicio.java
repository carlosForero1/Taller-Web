package com.web.taller.Booking.Application.interfaces;

import com.web.taller.Booking.Domain.Entities.Pasajero;

public interface PasajeroServicio {


    Pasajero buscarPorEmail(String email);

    public String CrearPasajero(Pasajero pasajero);

}
