package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    System.out.println(Socio.LIBROS_AUTORIZADOS_A_RETIRAR);
    System.out.println(SocioVip.LIBROS_AUTORIZADOS_A_RETIRAR);

    List<String> lista = new ArrayList<String>();
    System.out.println(lista.size());
    lista.add("hola");
    lista.add("vengo");

    System.out.println(lista);
    String loRemovido = lista.remove(0);
    System.out.println(lista);
    System.out.println(loRemovido);
    lista.remove("vengo");
    System.out.println(lista);


  }



}
