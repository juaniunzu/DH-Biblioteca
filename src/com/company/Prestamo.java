package com.company;

import java.util.Date;

public class Prestamo {

  private Ejemplar ejemplar;
  private Socio socio;
  private Date fecha;

  public Prestamo(Ejemplar ejemplar, Socio socio) {
    this.ejemplar = ejemplar;
    this.socio = socio;
    this.fecha = new Date();
  }
}
