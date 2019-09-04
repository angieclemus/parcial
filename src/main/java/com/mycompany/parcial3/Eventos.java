package com.mycompany.parcial3;

import java.util.Date;

/**
 *
 * @author 000384515
 */
public class Eventos {
    String nombreEvento;
    String tipoEvento;
    int horaEvento;
    int horasOtorga;
    int horasFinal;
    Date  fechaEvento;
    Date fechaFinal;

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getHoraEvento() {
        return horaEvento;
    }

    public void setHoraEvento(int horaEvento) {
        this.horaEvento = horaEvento;
    }

    public int getHorasOtorga() {
        return horasOtorga;
    }

    public void setHorasOtorga(int horasOtorga) {
        this.horasOtorga = horasOtorga;
    }

    public int getHorasFinal() {
        return horasFinal;
    }

    public void setHorasFinal(int horasFinal) {
        this.horasFinal = horasFinal;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
}
