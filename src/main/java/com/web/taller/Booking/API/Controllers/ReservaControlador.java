package com.web.taller.Booking.API.Controllers;

import com.web.taller.Booking.Domain.Entities.Reserva;
import com.web.taller.Booking.Application.interfaces.ReservaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservaControlador {
    @Autowired
    private ReservaServicio servicio;

    @GetMapping("/Reserva/{nombre}")
    public List<Reserva> buscarPorNombre(@PathVariable String nombre){
        return servicio.BuscarPorNombrePasajero(nombre);
    }

    @DeleteMapping
    public String eliminarReserva(Long id){
        if (servicio.borrarReserva(id)){
            return "Reserva Eliminada";
        }
        return "Error";
    }
}
