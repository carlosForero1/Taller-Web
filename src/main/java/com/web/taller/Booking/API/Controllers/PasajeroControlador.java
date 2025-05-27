package com.web.taller.Booking.API.Controllers;

import com.web.taller.Booking.Domain.Entities.Pasajero;
import com.web.taller.Booking.Application.interfaces.PasejeroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PasajeroControlador {

    @Autowired
    private PasejeroServicio servicio;

    @GetMapping("/Pasajero/{email}")
    public Pasajero buscarPasajeroPorEmail(@PathVariable String email){
        if (email != null){
            return servicio.buscarPorEmail(email);
        }
     return null;
    }

    @PostMapping("/Pasajero/crear")
    public String crearPasajero(@RequestBody  Pasajero pasajero){
        return servicio.CrearPasajero(pasajero);
    }


}
