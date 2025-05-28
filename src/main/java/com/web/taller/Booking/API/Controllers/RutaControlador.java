package com.web.taller.Booking.API.Controllers;

import com.web.taller.Booking.Application.interfaces.RutasService;
import com.web.taller.Booking.Domain.Entities.Ruta;
import com.web.taller.Booking.Infrastructure.servicioImpl.RutasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Ruta")
public class RutaControlador {

    @Autowired
    private RutasService service;

    @PostMapping
    public String crearRuta(@RequestBody Ruta ruta){
        if (service.crearRuta(ruta)){
            return "creado exitosamente";
        }
        return "error en creacion";
    }


}
