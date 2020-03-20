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

  public void agregarNuevoEjemplar(Ejemplar unEjemplar){
    this.listaDeEjemplares.add(unEjemplar);
  }

  public Boolean tieneEjemplaresDisponibles(){
    return(this.listaDeEjemplares.size() != 0);
  }

  public Ejemplar prestarEjemplar(){
    Ejemplar ejemplarAPrestar = this.listaDeEjemplares.remove(0);
    return ejemplarAPrestar;
  }

  public void reingresarEjemplar(Ejemplar unEjemplar){
    agregarNuevoEjemplar(unEjemplar);
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

  @Override
  public boolean equals(Object o){
    if(this == o) return true;
    if(o == null) return false;
    if(!(o instanceof Libro)) return false;

    Libro libroAComparar = (Libro) o;
    return (this.codigoIsbn.equals(libroAComparar.getCodigoIsbn()));

  }

  @Override
  public String toString() {
    return this.getNombre();
  }
}
