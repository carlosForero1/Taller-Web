package com.web.taller.Booking.API.Respone;

public class ReservaResponse {

    private String nombre;

    private String correo;

    private String nombreRuta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

    @Override
    public String toString() {
        return "ReservaResponse{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", nombreRuta='" + nombreRuta + '\'' +
                '}';
    }
}
