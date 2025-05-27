package com.web.taller.Booking.Application.interfaces;

import com.web.taller.Booking.API.Requests.EmailRequest;
import com.web.taller.Booking.Domain.Models.EmailDto;
import com.web.taller.Booking.Domain.Entities.EmailEntity;
import com.web.taller.Booking.Domain.ValueObjects.Email;
import com.web.taller.Booking.Domain.ValueObjects.Password;
import com.web.taller.Booking.Infrastructure.Repositories.EmailRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmailServicio {
    @Autowired
    private EmailRepositorio repositorio;


    public List<EmailEntity> todosLosEmail() {
        return repositorio.findAll();
    }

    public Optional<EmailEntity> BuscarPorId(Long id) {
        return repositorio.findById(id);
    }

    public ResponseEntity<String> crearEmail(EmailRequest email) {
        try {
            Email correo = new Email(email.getCorreo());
            Password contrasena = new Password(email.getPassword());

            EmailEntity entidad = new EmailEntity(correo, contrasena);
            EmailDto emailDto = new EmailDto();
            if ( entidad.getCorreo() != null && entidad.getContrasena() != null){
                repositorio.save(entidad);
                emailDto.setCorreo(correo.toString());
            }else {
                return ResponseEntity.ok("Faltan datos.");
            }

            return ResponseEntity.ok("Email creado correctamente " + emailDto);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
