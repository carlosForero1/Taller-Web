package com.web.taller.Booking.Infrastructure.repositorio.RepositoriesJpa;

import com.web.taller.Booking.Domain.Entities.EmailEntity;
import com.web.taller.Booking.Domain.ValueObjects.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataJpaEmail extends JpaRepository<EmailEntity,Long> {
}
