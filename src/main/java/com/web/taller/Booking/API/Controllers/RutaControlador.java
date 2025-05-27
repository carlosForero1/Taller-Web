package com.web.taller.Booking.API.Controllers;

import com.web.taller.Booking.Domain.Entities.Ruta;
import com.web.taller.Booking.Application.interfaces.RutasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RutaControlador {

    @Autowired
    private RutasService service;

    @PostMapping("/Ruta")
    public String crearRuta(@RequestBody Ruta ruta){
        if (service.crearRuta(ruta)){
            return "creado exitosamente";
        }
        return null;
    }


}
