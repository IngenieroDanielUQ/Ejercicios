package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

public class Reserva {

    // Atributos propios de la clase Reserva
    private LocalDateTime fechaSalida;
    private short duracionViaje;
    private String destino, transporte, actividadesPlaneadas, dietasEspeciales;
    private TipoAlojamiento tipoAlojamiento;

    // Constructor para la clase Reserva
    public Reserva(LocalDateTime fechaSalida, short duracionViaje, String destino,
            String transporte, String actividadesPlaneadas, String dietasEspeciales, TipoAlojamiento tipoAlojamiento) {
        this.fechaSalida = fechaSalida;
        this.duracionViaje = duracionViaje;
        this.destino = destino;
        this.tipoAlojamiento = tipoAlojamiento;
        this.transporte = transporte;
        this.actividadesPlaneadas = actividadesPlaneadas;
        this.dietasEspeciales = dietasEspeciales;
    }

    // Getters and setters: se utilizan para obtener las variables y poder
    // modificarlas
    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public short getDuracionViaje() {
        return duracionViaje;
    }

    public void setDuracionViaje(short duracionViaje) {
        this.duracionViaje = duracionViaje;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public TipoAlojamiento getTipoAlojamiento() {
        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(TipoAlojamiento tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public String getActividadesPlaneadas() {
        return actividadesPlaneadas;
    }

    public void setActividadesPlaneadas(String actividadesPlaneadas) {
        this.actividadesPlaneadas = actividadesPlaneadas;
    }

    public String getDietasEspeciales() {
        return dietasEspeciales;
    }

    public void setDietasEspeciales(String dietasEspeciales) {
        this.dietasEspeciales = dietasEspeciales;
    }

    // Método builder para poder ser flexibles con los parámetros que se reciben
    public static ReservaBuilder builder() {
        return new ReservaBuilder();
    }

    // Método ToString para acceder a los datos
    @Override
    public String toString() {
        return "Reserva:" + "\n" + "Fecha de salida: " + fechaSalida + "\n" +
                "Duración del viaje: " + duracionViaje + "\n" +
                "Destino: " + destino + "\n" +
                "Tipo de alojamiento: " + tipoAlojamiento + "\n" +
                "Preferencia de transporte: " + transporte + "\n" +
                "Actividades planeadas: " + actividadesPlaneadas + "\n" +
                "Dietas especiales: " + dietasEspeciales + "\n" ;
    }
}
