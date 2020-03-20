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

  public Boolean tieneCupoDisponible(){
    return (this.ejemplaresRetirados.size() < this.LIBROS_AUTORIZADOS_A_RETIRAR);
  }

  public void tomarPrestadoUnEjemplar(Ejemplar unEjemplar){
    this.ejemplaresRetirados.add(unEjemplar);
  }

  public void devolverUnEjemplar(Ejemplar unEjemplar){
    this.ejemplaresRetirados.remove(unEjemplar);
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

  public List<Ejemplar> informarLibrosAlquilados(){
    System.out.println("El socio " + this.numeroIdentificacion + " tiene en su poder: " + this.ejemplaresRetirados);
    return this.ejemplaresRetirados;
  }
}
