package com.web.taller.Booking.Application.UseCases.Reserva;

import com.web.taller.Booking.Domain.Entities.Reserva;
import com.web.taller.Booking.Infrastructure.Repositories.ReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class BuscarReserva {
    @Autowired
    private ReservaRepositorio repositorio;

    public List<Reserva> BuscarPorNombrePasajero(String nombre) {

        List<Reserva> lista = repositorio.findAll();
        List<Reserva> resultado = new ArrayList<>();

        for (Reserva reserva : lista) {
            if (reserva.getPasajero().getNombre().equals(nombre)) {
                resultado.add(reserva);
            }
        }
        return resultado;
    }

}
