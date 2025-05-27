package com.web.taller.Booking.Domain.ValueObjects;

import jakarta.persistence.Embeddable;

@Embeddable
public class Email {

    private String correo;

    protected Email() {
    }

    public Email(String value) {
        if (!isValid(value)) throw new IllegalArgumentException("Correo inválido");
        this.correo = value;
    }

    private boolean isValid(String value) {
        return value != null && value.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "correo='" + correo;
    }
}
