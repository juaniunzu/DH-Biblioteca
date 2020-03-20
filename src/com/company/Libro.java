package com.company;

public class Libro {

  private String nombre;
  private Integer codigoIsbn;
  private String autor;

  public Libro(String nombre, Integer codigoIsbn, String autor) {
    this.nombre = nombre;
    this.codigoIsbn = codigoIsbn;
    this.autor = autor;
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
