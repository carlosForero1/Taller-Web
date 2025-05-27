package com.web.taller.Booking.Domain.Models;

import com.web.taller.Booking.Domain.ValueObjects.Email;
import jakarta.persistence.*;


public class EmailDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String correo;

    public EmailDto() {
    }

    public EmailDto(Long id, String correo) {
        this.id = id;
        this.correo = correo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return correo;
    }
}
