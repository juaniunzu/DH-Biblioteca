package com.company;

public class SocioVip extends Socio {

  private Integer valorCuotaMensual;
  public static final Integer LIBROS_AUTORIZADOS_A_RETIRAR = 15;

  public SocioVip(String nombre, String apellido, Integer numeroIdentificacion, Integer valorCuotaMensual) {
    super(nombre, apellido, numeroIdentificacion);
    this.valorCuotaMensual = valorCuotaMensual;
  }

  public Integer getValorCuotaMensual() {
    return valorCuotaMensual;
  }
}
