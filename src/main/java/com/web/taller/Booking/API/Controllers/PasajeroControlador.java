package com.web.taller.Booking.API.Controllers;

import com.web.taller.Booking.Domain.Entities.Pasajero;
import com.web.taller.Booking.Application.interfaces.PasejeroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PasajeroControlador {

    @Autowired
    private PasejeroServicio servicio;

    @GetMapping("/Pasajero/{nombre}")
    public List<Pasajero> buscar(@PathVariable String nombre){
       return servicio.buscarPorNombre(nombre);
    }

    @PostMapping("/Pasajero/crear")
    public String crearPasajero(@RequestBody  Pasajero pasajero){
        return servicio.CrearPasajero(pasajero);
    }
}
