package com.web.taller.Booking.API.Controllers;

import com.web.taller.Booking.API.Requests.ReservaRequest;
import com.web.taller.Booking.API.Respone.ReservaResponse;
import com.web.taller.Booking.Application.interfaces.ReservaServicio;
import com.web.taller.Booking.Domain.Aggregate.Reserva;
import com.web.taller.Booking.Infrastructure.servicioImpl.ReservaServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Reserva")
public class ReservaControlador {
    @Autowired
    private ReservaServicio servicio;

    @GetMapping("/{nombre}")
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

    @GetMapping("informacion/{id}")
    public String informacionPorID(@PathVariable Long id) {
        return servicio.obtenerInformacionReserva(id);
    }

    @PostMapping("/crear")
    public ResponseEntity<String> crearReserva(@RequestBody ReservaRequest reserva) {
        if (reserva != null) {
           ReservaResponse response= servicio.crearReserva(reserva);
            return ResponseEntity.ok("se creo la reserva de manera exitosa "+response);
        }
        return ResponseEntity.ofNullable("No se creo la reserva cominiquese con su administrador");
    }

    @GetMapping ("/todasLasReservas")
    public List<Reserva> todasLasReservas(){
        return servicio.listaReservas();
    }
}
