package com.company;


import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

  private List<Libro> listaDeLibros;
  private List<Socio> listaDeSocios;
  private List<Prestamo> listaDePrestamos;

  public Biblioteca() {
    this.listaDeLibros = new ArrayList<Libro>();
    this.listaDeSocios = new ArrayList<Socio>();
    this.listaDePrestamos = new ArrayList<Prestamo>();
  }

  public void agregarSocio(Socio unSocio){
    this.listaDeSocios.add(unSocio);
  }

  public void agregarLibro(Libro unLibro){
    this.listaDeLibros.add(unLibro);
  }

  public void prestar(Integer ISBN, Integer numeroDeIdentificacion){

    Libro libroAPrestar = buscarLibroEnBiblioteca(ISBN);
    Socio socioQueRetira = buscarSocioEnBiblioteca(numeroDeIdentificacion);

    if(libroAPrestar.tieneEjemplaresDisponibles() && socioQueRetira.tieneCupoDisponible()){
      Ejemplar ejemplarAPrestar = libroAPrestar.prestarEjemplar();
      socioQueRetira.tomarPrestadoUnEjemplar(ejemplarAPrestar);
      Prestamo unPrestamo = new Prestamo(ejemplarAPrestar, socioQueRetira);
      this.listaDePrestamos.add(unPrestamo);
      System.out.println("El socio " + socioQueRetira.getNumeroIdentificacion() + " retira el ejemplar " + ejemplarAPrestar.getLibro().getNombre());
    } else {
      System.out.println("No es posible realizar el préstamo solicitado");
    }
  }

  public void prestar(List<Integer> unaListaDelISBN, Integer unNumeroDeIdentificacion){

    for (Integer isbn : unaListaDelISBN) {
      prestar(isbn, unNumeroDeIdentificacion);
    }

  }

  public void devolver(Ejemplar unEjemplar, Integer numeroDeIdentificacion){

    Socio socioQueDevuelve = buscarSocioEnBiblioteca(numeroDeIdentificacion);
    socioQueDevuelve.devolverUnEjemplar(unEjemplar);
    System.out.println("El socio " + socioQueDevuelve.getNumeroIdentificacion() + " devuelve el ejemplar " + unEjemplar.getLibro());

    if(buscarLibroEnBiblioteca(unEjemplar) != null){
      buscarLibroEnBiblioteca(unEjemplar).reingresarEjemplar(unEjemplar);
      System.out.println("Reingresa a la biblioteca el ejemplar " + unEjemplar.getLibro());
    }
  }

  public void devolver(List<Ejemplar> ejemplares, Integer unNumeroDeIdentificacion){

    for (Ejemplar ejemplar : ejemplares) {
      devolver(ejemplar, unNumeroDeIdentificacion);
    }

  }



  private Libro buscarLibroEnBiblioteca(Ejemplar unEjemplar){

    Libro libroBuscado = null;
    for (Libro libro : this.listaDeLibros) {
      if(libro.equals(unEjemplar.getLibro())){
        libroBuscado = libro;
        break;
      }
    }
    return libroBuscado;
  }

  private Libro buscarLibroEnBiblioteca(Integer ISBN){

    Libro libroBuscado = null;
    for (Libro libro : listaDeLibros) {
      if(ISBN.equals(libro.getCodigoIsbn())){
        libroBuscado = libro;
        break;
      }
    }
    return libroBuscado;
  }

  private Socio buscarSocioEnBiblioteca(Integer numeroIdentificacion){

    Socio socioBuscado = null;
    for (Socio socio : listaDeSocios) {
      if(numeroIdentificacion.equals(socio.getNumeroIdentificacion())){
        socioBuscado = socio;
        break;
      }
    }
    return socioBuscado;
  }

  public void informarListaDeLibros(){
    System.out.println(this.listaDeLibros);
  }


}
