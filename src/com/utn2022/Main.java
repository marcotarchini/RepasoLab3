package com.utn2022;

public class Main {

    public static void main(String[] args) {

        Libros libro1=new Libros(1,"Viaje a marte","1984","aventura");
        Libros libro2=new Libros(2,"Me enamore de un potus","1978","romantico");
        Libros libro3=new Libros(3,"Argentina superpotencia","2004","fantasia");

        Diarios diario1=new Diarios(4,"La nacion","2022");
        Diarios diario2=new Diarios(5,"La capital","2022");
        Diarios diario3=new Diarios(6,"Clarin","2022");

        Revistas revista1=new Revistas(7,"Billequen","1995");
        Revistas revista2=new Revistas(8,"Conozca mas","1992");
        Revistas revista3=new Revistas(9,"Action game","1991");

        System.out.println(libro1);
        libro1.alquilar();
        System.out.println(libro1);
        libro1.alquilar();
        libro1.devolver();
        System.out.println(libro1);
        System.out.println(libro2);
        libro2.alquilar();
        System.out.println(libro2);
        System.out.println(diario1);
        System.out.println(revista1);
        revista1.alquilar();
        System.out.println(revista1);
        System.out.println(diario1);
        diario1.leerDiario();
        diario1.leerDiario();
        System.out.println(diario1);

    }
}
/*REPASO LABO PRIMER PARCIAL @Comision 5 :

Ejercicio Repaso

Roberto tiene 2 bibliotecas, ambas almacenan libros, diarios y revistas. Los cuales tienen las siguientes
caracteristicas: codigo, titulo (o titular en caso de los diarios y revistas) y año de publicacion, que son pasadas
por parametro al momento de crear los objetos.

Los libros pueden ser de distintos generos, novelas, cuentos, etc.
Los libros y las revistas poseen los siguientes metodos : alquilar(), devolver() y alquilado().
Los diarios solo se pueden leer en la biblioteca y Roberto quiere saber si el diario se esta leyendo o no.

Cosas obligatorias del ejercicio:

Superclase para aplicar herencia (Ejemplar)
Interfaz (alquilar(), devolver() y alquilado())
Enum (generos, novelas, cuentos, etc.)


Crear 3 libros (de distinto genero), 3 revistas y 3 diarios
Alquilar un libro y devolverlo
Mostrar errores si se quiere alquilar un libro alquilado
Mostrar errores si se quiere devolver una revista devuelta
Mostrar errores si se esta leyendo un diario

Mostrar un listado de libros, revistas y diarios disponibles y no disponibles. */