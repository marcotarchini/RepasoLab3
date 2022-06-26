package com.utn2022;

public class Diarios extends Articulo {

    private Estado estado=Estado.LIBRE;

    public Diarios(double codigo, String titulo, String anioPublicacion) {
        super(codigo, titulo, anioPublicacion);
    }
    public Estado getEstado() {
        return estado;
    }

    public Diarios setEstado(Estado estado) {
        this.estado =estado;
        return this;
    }

    public void leerDiario() {
        if (getEstado() == Estado.LIBRE) {
            System.out.println("\nPuede leer: " + super.getTitulo());
            setEstado(Estado.OCUPADO);
        } else {
            System.out.println("\nSe esta leyendo el diario");
        }
    }

    public void devolver() {
        if (getEstado() == Estado.OCUPADO) {
            System.out.println("\nDevolvio el diario: " + super.getTitulo());
            setEstado(Estado.LIBRE);
        } else {
            System.out.println("\nError de diario");
        }
    }

    @Override
    public String toString() {
        return "\nDiario:"+
                "\nEstado: "+ estado +
                super.toString();
    }
}
