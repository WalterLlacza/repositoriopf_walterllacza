
package Programas;

import java.util.Scanner;

public class Cliente_compras {
    //metodo principal
    public static void main(String[] args) {
        //declaracion de variables
        String cliente;
        double compra1,compra2,compra3,tc,pc;
        //creando el objeto de lectura
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
        System.out.print("Nombre del Cliente :");
        cliente=lectura.next();
        System.out.print("Ingrese La Compra 1 :");
        compra1=lectura.nextDouble();
        System.out.print("Ingrese La Compra 2 :");
        compra2=lectura.nextDouble();
        System.out.print("Ingrese La Compra 3 :");
        compra3=lectura.nextDouble();
        //proceso de datos
        tc=compra1+compra2+compra3;
        pc=tc/3;
        //salida de datos
        System.out.println("EL MONTO TOTAL DE COMPRAS: "+tc);
        System.out.println("EL PROMEDIO DE COMPRAS: "+pc);
    }//fin del metodo
}//fin del programa