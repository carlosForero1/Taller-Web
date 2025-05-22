package com.web.taller.Booking.API.Controllers;

import com.web.taller.Booking.Domain.Entities.Email;
import com.web.taller.Booking.Application.interfaces.EmailServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmailControlador {
    @Autowired
    private EmailServicio servicio;


    @GetMapping("/Email")
    public List<Email> todasLosEmail(){
       return servicio.todosLosEmail();
    }

    @GetMapping("/buscarPorID/{id}")
    public Optional<Email> BuscarPorId( @PathVariable Long id){
        return servicio.BuscarPorId(id);
    }

    @PostMapping("/email/crear")
    public String crearEmail(@RequestBody Email email) {
        if (servicio.crearEmail(email)){
            return "Creado exitosamente";
        }
        return null;
    }
}
