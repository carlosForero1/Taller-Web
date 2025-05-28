package com.web.taller.Booking.API.Controllers;

import com.web.taller.Booking.Application.interfaces.PasajeroServicio;
import com.web.taller.Booking.Domain.Entities.Pasajero;
import com.web.taller.Booking.Infrastructure.servicioImpl.PasejeroServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Pasajero")
public class PasajeroControlador {

    @Autowired
    private PasajeroServicio servicio;

    @GetMapping("/{email}")
    public Pasajero buscarPasajeroPorEmail(@PathVariable String email){
        if (email != null){
            return servicio.buscarPorEmail(email);
        }
     return null;
    }

    @PostMapping("/crear")
    public String crearPasajero(@RequestBody  Pasajero pasajero){
        return servicio.CrearPasajero(pasajero);
    }


}
