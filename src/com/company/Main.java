package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    //creo biblioteca
    Biblioteca bibliotecaDeBabal = new Biblioteca();

    //creo libros
    Libro hp1 = new Libro("harry potter y la piedra filosofal", 1001, "rowling");
    Libro hp2 = new Libro("harry potter y la camara de los secretos", 1002, "rowling");
    Libro hp3 = new Libro("harry potter y el prisionero de azkaban", 1003, "rowling");
    Libro hp4 = new Libro("harry potter y el caliz de fuego", 1004, "rowling");
    Libro hp5 = new Libro("harry potter y la orden del fenix", 1005, "rowling");
    Libro hp6 = new Libro("harry potter y el principe mestizo", 1006, "rowling");
    Libro hp7 = new Libro("harry potter y las reliquias de la muerte", 1007, "rowling");
    Libro cormoran1 = new Libro("el canto del cuco", 2001, "galbraith");
    Libro cormoran2 = new Libro("el gusano de seda", 2002, "galbraith");
    Libro cormoran3 = new Libro("el oficio del mal", 2003, "galbraith");
    Libro cormoran4 = new Libro("blanco letal", 2004, "galbraith");

    //creo ejemplares hp
    Ejemplar hp101 = new Ejemplar(hp1, 1, "aaa111");
    Ejemplar hp102 = new Ejemplar(hp1, 2, "aaa112");
    Ejemplar hp201 = new Ejemplar(hp2, 1, "aaa211");
    Ejemplar hp301 = new Ejemplar(hp3, 1, "aaa311");
    Ejemplar hp302 = new Ejemplar(hp3, 1, "aaa312");
    Ejemplar hp303 = new Ejemplar(hp3, 2, "aaa313");
    Ejemplar hp401 = new Ejemplar(hp4, 1, "aaa411");
    Ejemplar hp501 = new Ejemplar(hp5, 2, "aaa511");
    Ejemplar hp601 = new Ejemplar(hp6, 1, "aaa611");
    Ejemplar hp701 = new Ejemplar(hp7, 1, "aaa711");

    //agrego ejemplares a libros hp
    hp1.agregarNuevoEjemplar(hp101);
    hp1.agregarNuevoEjemplar(hp102);
    hp2.agregarNuevoEjemplar(hp201);
    hp3.agregarNuevoEjemplar(hp301);
    hp3.agregarNuevoEjemplar(hp302);
    hp3.agregarNuevoEjemplar(hp303);
    hp4.agregarNuevoEjemplar(hp401);
    hp5.agregarNuevoEjemplar(hp501);
    hp6.agregarNuevoEjemplar(hp601);
    hp7.agregarNuevoEjemplar(hp701);

    //creo ejemplares cormoran
    Ejemplar c101 = new Ejemplar(cormoran1, 1, "baa111");
    Ejemplar c102 = new Ejemplar(cormoran1, 1, "baa112");
    Ejemplar c103 = new Ejemplar(cormoran1, 1, "baa113");
    Ejemplar c201 = new Ejemplar(cormoran2, 1, "baa211");
    Ejemplar c202 = new Ejemplar(cormoran2, 1, "baa212");
    Ejemplar c301 = new Ejemplar(cormoran3, 1, "baa311");
    Ejemplar c302 = new Ejemplar(cormoran3, 1, "baa312");
    Ejemplar c303 = new Ejemplar(cormoran3, 1, "baa313");
    Ejemplar c304 = new Ejemplar(cormoran3, 1, "baa314");
    Ejemplar c401 = new Ejemplar(cormoran4, 1, "baa411");
    Ejemplar c402 = new Ejemplar(cormoran4, 1, "baa412");
    Ejemplar c403 = new Ejemplar(cormoran4, 1, "baa413");
    Ejemplar c404 = new Ejemplar(cormoran4, 1, "baa414");
    Ejemplar c405 = new Ejemplar(cormoran4, 1, "baa415");

    //agrego ejemplares a libro cormoran
    cormoran1.agregarNuevoEjemplar(c101);
    cormoran1.agregarNuevoEjemplar(c102);
    cormoran1.agregarNuevoEjemplar(c103);
    cormoran2.agregarNuevoEjemplar(c201);
    cormoran2.agregarNuevoEjemplar(c202);
    cormoran3.agregarNuevoEjemplar(c301);
    cormoran3.agregarNuevoEjemplar(c302);
    cormoran3.agregarNuevoEjemplar(c303);
    cormoran3.agregarNuevoEjemplar(c304);
    cormoran4.agregarNuevoEjemplar(c401);
    cormoran4.agregarNuevoEjemplar(c402);
    cormoran4.agregarNuevoEjemplar(c403);
    cormoran4.agregarNuevoEjemplar(c404);
    cormoran4.agregarNuevoEjemplar(c405);

    //creo socios
    Socio pepe = new Socio("pepe", "richards", 10001);
    Socio niki = new Socio("niki", "lauda", 10002);
    Socio lalo = new Socio("lalo", "salamanca", 10003);
    SocioVip walter = new SocioVip("walter", "blanco", 20001, 100);
    SocioVip ringo = new SocioVip("ríchar", "starky", 20002, 100);
    SocioVip pablo = new SocioVip("pablo", "macCarne", 20003, 100);

    //agrego socios a biblioteca
    bibliotecaDeBabal.agregarSocio(pepe);
    bibliotecaDeBabal.agregarSocio(niki);
    bibliotecaDeBabal.agregarSocio(lalo);
    bibliotecaDeBabal.agregarSocio(walter);
    bibliotecaDeBabal.agregarSocio(ringo);
    bibliotecaDeBabal.agregarSocio(pablo);

    //agrego libros a biblioteca
    bibliotecaDeBabal.agregarLibro(hp1);
    bibliotecaDeBabal.agregarLibro(hp2);
    bibliotecaDeBabal.agregarLibro(hp3);
    bibliotecaDeBabal.agregarLibro(hp4);
    bibliotecaDeBabal.agregarLibro(hp5);
    bibliotecaDeBabal.agregarLibro(hp6);
    bibliotecaDeBabal.agregarLibro(hp7);
    bibliotecaDeBabal.agregarLibro(cormoran1);
    bibliotecaDeBabal.agregarLibro(cormoran2);
    bibliotecaDeBabal.agregarLibro(cormoran3);
    bibliotecaDeBabal.agregarLibro(cormoran4);

    System.out.println("------------ informo libros en biblioteca -------------");
    //informo lista de libros en biblioteca
    bibliotecaDeBabal.informarListaDeLibros();

    System.out.println("--------------- alquiler por unidad -------------");
    //prestamos, probando si se sobrepasa la cantidad de prestamos por persona
    bibliotecaDeBabal.prestar(1001, 10001);
    bibliotecaDeBabal.prestar(1002, 10001);
    bibliotecaDeBabal.prestar(1003, 10001);
    bibliotecaDeBabal.prestar(1004, 10001);

    System.out.println("----------- libros alquilados por un socio -----------");
    //informo libros alquilados por un socio determinado
    pepe.informarLibrosAlquilados();

    //creo lista de libros que van a ser alquilados por un socio
    List<Integer> unaListaDeLibros = new ArrayList<Integer>();
    unaListaDeLibros.add(1001);
    unaListaDeLibros.add(1002);
    unaListaDeLibros.add(1003);
    unaListaDeLibros.add(2001);
    unaListaDeLibros.add(2002);
    unaListaDeLibros.add(2003);

    System.out.println("---------------- alquiler por lista --------------");
    bibliotecaDeBabal.prestar(unaListaDeLibros, 10003);

    System.out.println("---------- devolucion individual de libro ------------");
    bibliotecaDeBabal.devolver(hp101, 10001);

    System.out.println("------------- devolucion de libros en lista (un socio devuelve todo lo que tiene) ----------");
    bibliotecaDeBabal.devolver(pepe.informarLibrosAlquilados(), 10001);










  }



}
