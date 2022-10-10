package Principal;


import Servicios.Bebidas;
import Servicios.Frutas;
import Servicios.Higiene;
import Servicios.Supermercado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Supermercado> listaProductos = new ArrayList<>();

        System.out.println();
        Bebidas cocaColaZero = new Bebidas("Coca-Cola Zero", 20, 1.5);
        listaProductos.add(cocaColaZero);
        System.out.println(cocaColaZero);
        Bebidas cocaCola = new Bebidas("Coca-Cola", 18, 1.5);
        listaProductos.add(cocaCola);
        System.out.println(cocaCola);
        Higiene shampoo = new Higiene("Shampoo Sedal", 19, 500);
        listaProductos.add(shampoo);
        System.out.println(shampoo);
        Frutas frutas = new Frutas("Frutillas ", 64, 0, "Kilo");
        listaProductos.add(frutas);
        System.out.println(frutas);

        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println();
        Collections.sort(listaProductos);

        System.out.println("=============================");

        System.out.println("El producto más caro es: " + listaProductos.get(0).getProducto());
        System.out.println("El producto más barato es: " + listaProductos.get(listaProductos.size() - 1).getProducto());

    }
}
