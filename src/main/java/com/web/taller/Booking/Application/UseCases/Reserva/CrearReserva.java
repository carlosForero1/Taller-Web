package com.web.taller.Booking.Application.UseCases.Reserva;

import com.web.taller.Booking.API.Requests.ReservaRequest;
import com.web.taller.Booking.API.Respone.ReservaResponse;
import com.web.taller.Booking.Domain.Aggregate.Reserva;
import com.web.taller.Booking.Domain.Entities.Pasajero;
import com.web.taller.Booking.Domain.Entities.Ruta;
import com.web.taller.Booking.Infrastructure.repositorio.Repositories.ReservaRepositorio;
import org.springframework.stereotype.Service;

@Service
public class CrearReserva {

    private final ReservaRepositorio repositorio;


    public CrearReserva(ReservaRepositorio repositorio) {
        this.repositorio = repositorio;
    }


    public ReservaResponse crearReserva(ReservaRequest reserva) {

        Reserva reserva1 = null;
        ReservaResponse response = new ReservaResponse();

        try {

            if (reserva.getFecha().isBefore(java.time.LocalDate.now())) {
                throw new IllegalArgumentException("No se puede reservar en fechas pasadas");
            }
            if (reserva != null) {
                Pasajero pasajero = repositorio.buscarPorIdPasajero(reserva.getIdPasajero());
                Ruta ruta = repositorio.BuscarPorIdRuta(reserva.getIdRuta());
                if (pasajero != null && ruta != null) {
                    reserva1 = new Reserva(pasajero, ruta, reserva.getFecha(), reserva.isReservaEstado());
                    repositorio.save(reserva1);

                    response.setNombre(pasajero.getNombre());
                    response.setCorreo(pasajero.getEmail().getCorreo().getCorreo());
                    response.setNombreRuta(ruta.getNombreRuta());
                }
                return response;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return response;
    }
}
