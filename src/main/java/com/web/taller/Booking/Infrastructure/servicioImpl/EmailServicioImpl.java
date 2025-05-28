package com.web.taller.Booking.Infrastructure.servicioImpl;

import com.web.taller.Booking.API.Requests.EmailRequest;
import com.web.taller.Booking.Application.UseCases.Email.InformacionEmail;
import com.web.taller.Booking.Application.UseCases.Email.ListarTodosLosEmail;
import com.web.taller.Booking.Application.interfaces.EmailServicio;
import com.web.taller.Booking.Domain.Models.EmailDto;
import com.web.taller.Booking.Domain.Entities.EmailEntity;
import com.web.taller.Booking.Domain.ValueObjects.Email;
import com.web.taller.Booking.Domain.ValueObjects.Password;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.EmailRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmailServicioImpl implements EmailServicio {
   private final ListarTodosLosEmail todosLosEmail;
   private final InformacionEmail informacionEmail;

    public EmailServicioImpl(ListarTodosLosEmail todosLosEmail, InformacionEmail informacionEmail) {
        this.todosLosEmail = todosLosEmail;
        this.informacionEmail = informacionEmail;
    }


    @Override
    public List<EmailEntity> todosLosEmail() {
        return todosLosEmail.todosLosEmail();
    }

    @Override
    public Optional<EmailEntity> BuscarPorId(Long id) {
        return informacionEmail.BuscarPorId(id);
    }

    @Override
    public ResponseEntity<String> crearEmail(EmailRequest email) {
        return informacionEmail.crearEmail(email);
    }
}
