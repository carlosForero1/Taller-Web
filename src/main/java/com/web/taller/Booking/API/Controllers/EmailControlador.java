package com.web.taller.Booking.API.Controllers;

import com.web.taller.Booking.API.Requests.EmailRequest;
import com.web.taller.Booking.Application.interfaces.EmailServicio;
import com.web.taller.Booking.Domain.Entities.EmailEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/email")
public class EmailControlador {
    @Autowired
    private EmailServicio servicio;


    @GetMapping
    public List<EmailEntity> todasLosEmail() {
        return servicio.todosLosEmail();
    }

    @GetMapping("/buscarPorID/{id}")
    public Optional<EmailEntity> BuscarPorId(@PathVariable Long id) {
        return servicio.BuscarPorId(id);
    }

    @PostMapping("/crear")
    public ResponseEntity<String> crearEmail(@RequestBody EmailRequest email) {
        return servicio.crearEmail(email);
    }
}
