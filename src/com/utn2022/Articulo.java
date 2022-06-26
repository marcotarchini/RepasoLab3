package com.utn2022;

public abstract class Articulo {

    private double codigo;
    private String titulo;
    private String anioPublicacion;
    private String estado;

    public Articulo(double codigo, String titulo, String anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;

    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return  "\ncodigo=" + codigo +
                "\ntitulo=" + titulo +
                "\nAño de Publicacion=" + anioPublicacion;
    }
}
