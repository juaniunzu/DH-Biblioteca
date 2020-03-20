package com.company;

import java.util.ArrayList;
import java.util.List;

public class Libro {

  private String nombre;
  private Integer codigoIsbn;
  private String autor;
  private List<Ejemplar> listaDeEjemplares;

  public Libro(String nombre, Integer codigoIsbn, String autor) {
    this.nombre = nombre;
    this.codigoIsbn = codigoIsbn;
    this.autor = autor;
    this.listaDeEjemplares = new ArrayList<Ejemplar>();
  }

  public void agregarEjemplar(Ejemplar unEjemplar){
    this.listaDeEjemplares.add(unEjemplar);
  }

  public void quitarEjemplar(Ejemplar unEjemplar){
    this.listaDeEjemplares.remove(unEjemplar);
  }

  public String getNombre() {
    return nombre;
  }

  public Integer getCodigoIsbn() {
    return codigoIsbn;
  }

  public String getAutor() {
    return autor;
  }
}
