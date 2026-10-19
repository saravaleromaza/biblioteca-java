package com.saravm;

public class Libro {

    //Clase que abarca todos los datos de cada uno de los libros que se agreguen
    //Evita tener que crear 4 ArrayList diferentes (título, autor, año y precio).

    //Atributos principales
    String titulo;
    String autor;
    int año;
    double precio;

    //Constructores que inicializan el objeto libro con cada dato que se introduzca
    public Libro (String titulo, String autor, int año, double precio){

        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.precio = precio;
    }

    public String mostrarDatos(){
        //Método que retorna los datos del libro de una forma estructurada
        return "Título: " + titulo + " | " + "Autor: " + autor + " | " +
                "Año de publicación: " + año + " | " + "Precio: " + precio + "€";
    }
}
