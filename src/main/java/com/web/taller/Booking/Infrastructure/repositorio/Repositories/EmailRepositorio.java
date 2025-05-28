package com.web.taller.Booking.Infrastructure.repositorio.Repositories;

import com.web.taller.Booking.Domain.Entities.EmailEntity;
import com.web.taller.Booking.Domain.Entities.Ruta;
import com.web.taller.Booking.Domain.ValueObjects.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface EmailRepositorio {
    EmailEntity save(EmailEntity email);
    List<EmailEntity> findAll();
    Optional<EmailEntity> findById(Long id);
}
