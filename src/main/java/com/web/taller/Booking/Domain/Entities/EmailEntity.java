package com.web.taller.Booking.Domain.Entities;

import com.web.taller.Booking.Domain.ValueObjects.Email;
import com.web.taller.Booking.Domain.ValueObjects.Password;
import jakarta.persistence.*;

@Entity
public class EmailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @Column(name = "correo")
    private Email correo;

    @Embedded
    @Column(name = "contrasena")
    private Password contrasena;


    public EmailEntity() {
    }

    public EmailEntity(Email correo, Password contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Email getCorreo() {
        return correo;
    }

    public void setCorreo(Email correo) {
        this.correo = correo;
    }

    public Password getContrasena() {
        return contrasena;
    }

    public void setContrasena(Password contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Email{" +
                "id=" + id +
                ", correo='" + correo + '\'' +
                '}';
    }
}
