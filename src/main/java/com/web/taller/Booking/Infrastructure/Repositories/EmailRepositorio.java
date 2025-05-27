package com.web.taller.Booking.Infrastructure.Repositories;

import com.web.taller.Booking.Domain.Entities.EmailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepositorio extends JpaRepository<EmailEntity,Long> {
}
