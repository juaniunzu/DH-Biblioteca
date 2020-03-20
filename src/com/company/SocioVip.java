package com.company;

public class SocioVip extends Socio {

  private Integer valorCuotaMensual;

  public SocioVip(String nombre, String apellido, Integer numeroIdentificacion, Integer valorCuotaMensual) {
    super(nombre, apellido, numeroIdentificacion);
    this.valorCuotaMensual = valorCuotaMensual;
  }

  public Integer getValorCuotaMensual() {
    return valorCuotaMensual;
  }
}
