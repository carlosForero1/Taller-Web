package com.web.taller.Booking.Application.interfaces;

import com.web.taller.Booking.API.Requests.EmailRequest;
import com.web.taller.Booking.Domain.Entities.EmailEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface EmailServicio {

    List<EmailEntity> todosLosEmail();

    Optional<EmailEntity> BuscarPorId(Long id);

    ResponseEntity<String> crearEmail(EmailRequest email);
}
