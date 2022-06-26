package com.utn2022;

public class Revistas extends Articulo implements Acciones{

    private Estado estado=Estado.LIBRE;

    public Revistas(double codigo, String titulo, String anioPublicacion) {
        super(codigo, titulo, anioPublicacion);
    }

    public Estado getEstado() {
        return estado;
    }

    public Revistas setEstado(Estado estado) {
        this.estado =estado;
        return this;
    }

    @Override
    public void alquilar() {
        if (getEstado() == Estado.LIBRE) {
            System.out.println("\nAlquilo la revista: " + getTitulo());
            setEstado(Estado.OCUPADO);
        } else {
            System.out.println("\nError de alquiler");
        }
    }

    @Override
    public void devolver() {
        if (getEstado() == Estado.OCUPADO) {
            System.out.println("\nDevolvio la revista: " + super.getTitulo());
            setEstado(Estado.LIBRE);
        } else {
            System.out.println("\nError de alquiler");
        }

    }

    @Override
    public void alquilado() {
        if (getEstado() == Estado.LIBRE) {
            System.out.println("\nLa revista se puede alquilar: " + super.getTitulo());

        } else {
            System.out.println("\nLa revista esta alquilado");
        }
    }

    @Override
    public String toString() {
        return "\nRevista"+
                "\nEstado:" + estado+
                super.toString();
    }
}
