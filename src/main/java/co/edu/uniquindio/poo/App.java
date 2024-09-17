package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        //Usando el constructor por default.
        Reserva miReserva = new Reserva(LocalDateTime.of(2024, 12, 31, 9, 0, 0), (short)0, "Medellín", "Bus", "Visita sitios turisticos", "N/A", TipoAlojamiento.MOTEL);

        //Usando el patrón builder.
        Reserva miReserva2 = Reserva.builder()
                            .fechaSalida(LocalDateTime.of(2024, 12, 31, 9, 0, 0))
                            .destino("Medellín")
                            .tipoAlojamiento(TipoAlojamiento.MOTEL)
                            .build();

        //Impresion de los metodos default y patrón builder.
        System.out.println(miReserva);
        System.out.println(miReserva2);

    }
}
