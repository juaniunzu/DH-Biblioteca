package com.company;

public class Socio {

  private String nombre;
  private String apellido;
  private Integer numeroIdentificacion;

  public Socio(String nombre, String apellido, Integer numeroIdentificacion) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.numeroIdentificacion = numeroIdentificacion;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public Integer getNumeroIdentificacion() {
    return numeroIdentificacion;
  }
}
