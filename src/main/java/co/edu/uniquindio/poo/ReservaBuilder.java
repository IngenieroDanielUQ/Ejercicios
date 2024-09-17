package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

public class ReservaBuilder {
    
    //Atributos que entran a la clase para poder usar
    private LocalDateTime fechaSalida;
    private short duracionViaje;
    private String destino, transporte, actividadesPlaneadas, dietasEspeciales;
    TipoAlojamiento tipoAlojamiento;

    //Constructor que no recibe ningún parámetro
    public ReservaBuilder() {
    }

    public ReservaBuilder fechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
        return this;
    }

    public ReservaBuilder duracionViaje(short duracionViaje) {
        this.duracionViaje = duracionViaje;
        return this;
    }

    public ReservaBuilder destino(String destino) {
        this.destino = destino;
        return this;
    }

    public ReservaBuilder tipoAlojamiento(TipoAlojamiento tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
        return this;
    }

    public ReservaBuilder transporte(String transporte) {
        this.transporte = transporte;
        return this;
    }

    public ReservaBuilder actividadesPlaneadas(String actividadesPlaneadas) {
        this.actividadesPlaneadas = actividadesPlaneadas;
        return this;
    }

    public ReservaBuilder dietasEspeciales(String dietasEspeciales) {
        this.dietasEspeciales = dietasEspeciales;
        return this;
    }

    public Reserva build() {
        return new Reserva(fechaSalida, duracionViaje, destino, transporte, actividadesPlaneadas, dietasEspeciales, null);
    }

}
