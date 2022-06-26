package com.utn2022;

public class Libros extends Articulo implements Acciones{

    private String narrativa;
    private Estado estado=Estado.LIBRE;

    public Libros(double codigo, String titulo, String anioPublicacion, String narrativa) {
    super(codigo, titulo, anioPublicacion);
    this.narrativa=narrativa;
    }

    public Estado getEstado() {
        return estado;
    }

    public Libros setEstado(Estado estado) {
        this.estado = estado;
        return this;
    }

    public String getNarrativa() {
        return narrativa;
    }

    public void setNarrativa(String narrativa) {
        this.narrativa = narrativa;
    }

    @Override
    public void alquilar() {
        if (getEstado() == Estado.LIBRE) {
            System.out.println("\nAlquilo el libro: " + super.getTitulo());
            setEstado(Estado.OCUPADO);
        } else {
            System.out.println("\nError de alquiler");
        }
    }

    @Override
    public void devolver() {
        if (getEstado() == Estado.OCUPADO) {
            System.out.println("\nDevolvio el libro: " + super.getTitulo());
            setEstado(Estado.LIBRE);
        } else {
            System.out.println("\nError de aquiler");
        }

    }

    @Override
    public void alquilado() {
        if (getEstado() == Estado.LIBRE) {
            System.out.println("\nEl libro se puede alquilar: " + super.getTitulo());

        } else {
            System.out.println("\nEl libro esta alquilado");
        }
    }

    @Override
    public String toString() {
        return "\n\nLibros:"+
                "\nGenero:"+ narrativa+
                "\nEstado:" + estado+
                 super.toString();
    }
}
