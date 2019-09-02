package br.com.devmedia.curso.domain;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CargaHoraria {

    VINTE_HORAS("20HS"), TRINTA_HORAS("30HS"), QUARENTA_HORAS("40HS"), SESSENTA_HORAS("60HS");

    private String horas;

    CargaHoraria(String horas) {
        this.horas = horas;
    }

    @JsonValue
    public String getHoras() {
        return horas;
    }

}
