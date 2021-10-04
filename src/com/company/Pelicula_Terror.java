package com.company;

public class Pelicula_Terror extends Pelicula {

    private Graduaciones.ERecomendaciones recomendacion;

    public Pelicula_Terror(String titulo, String codigo, String descripccion, Graduaciones.ERecomendaciones recomendacion) {
        super(titulo, codigo, descripccion);
        this.recomendacion = recomendacion;
    }

    public Graduaciones.ERecomendaciones getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(Graduaciones.ERecomendaciones recomendacion) {
        this.recomendacion = recomendacion;
    }

    @Override
    public String toString() {
        return "Pelicula_Terror{" +
                super.toString() +
                "recomendacion=" + recomendacion +
                '}';
    }
}
