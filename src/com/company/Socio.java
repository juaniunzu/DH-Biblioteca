package com.company;

import java.util.ArrayList;
import java.util.List;

public class Socio {

  private String nombre;
  private String apellido;
  private Integer numeroIdentificacion;
  private List<Ejemplar> ejemplaresRetirados;
  public static final Integer LIBROS_AUTORIZADOS_A_RETIRAR = 3;


  public Socio(String nombre, String apellido, Integer numeroIdentificacion) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.numeroIdentificacion = numeroIdentificacion;
    this.ejemplaresRetirados = new ArrayList<Ejemplar>();
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
