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
}
