package com.web.taller.Booking.Domain.ValueObjects;

public class Password {

    private  String contrasena;

    public Password (){
    }

    public Password(String valor) {
        if (!esValida(valor)) {
            throw new IllegalArgumentException("La contraseña no cumple con los requisitos de seguridad.");
        }
        this.contrasena = valor;
    }

    private boolean esValida(String valor) {
        return valor != null &&
                valor.length() >= 8 &&
                valor.matches(".*[A-Z].*") &&
                valor.matches(".*[a-z].*") &&
                valor.matches(".*\\d.*");
    }

    public String getContrasena() {
        return contrasena;
    }
}
