package com.web.taller.Booking.Domain.Entities;

import com.web.taller.Booking.Domain.Entities.EmailEntity;
import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity
public class Pasajero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToOne(cascade = CascadeType.ALL)
    private EmailEntity email;

    public Pasajero() {
    }

    public Pasajero(Long id, String nombre, EmailEntity email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EmailEntity getEmail() {
        return email;
    }

    public void setEmail(EmailEntity email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
