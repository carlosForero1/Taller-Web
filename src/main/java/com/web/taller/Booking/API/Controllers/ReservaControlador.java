package com.web.taller.Booking.API.Controllers;

import com.web.taller.Booking.Domain.Entities.Reserva;
import com.web.taller.Booking.Application.interfaces.ReservaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservaControlador {
    @Autowired
    private ReservaServicio servicio;

    @GetMapping("/Reserva/{nombre}")
    public List<Reserva> buscarPorNombre(@PathVariable String nombre) {
        return servicio.buscarPorNombrePasajero(nombre);
    }

    @DeleteMapping
    public String eliminarReserva(Long id) {
        if (servicio.borrarReserva(id)) {
            return "Reserva Eliminada";
        }
        return "Error";
    }

    @GetMapping("Reserva/informacion/{id}")
    public String informacionPorID(@PathVariable Long id) {
        return servicio.obtenerInformacionReserva(id);
    }

    @PostMapping("Reserva/crear")
    public ResponseEntity<String> crearReserva(@RequestBody Reserva reserva) {
        if (reserva != null) {
            servicio.crearReserva(reserva);
            return ResponseEntity.ok("se creo la reserva de manera exitosa "+reserva);
        }
        return ResponseEntity.ofNullable("No se creo la reserva cominiquese con su administrador");
    }

    @GetMapping ("/Reserva/todasLasReservas")
    public List<Reserva> todasLasReservas(){
        return servicio.listaReservas();
    }
}
