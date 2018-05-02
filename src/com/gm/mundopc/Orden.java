package com.gm.mundopc;

public class Orden {

    private final int idOrden;
    private static int contOrden;
    private final Computadora computadoras[];
    private final int maxComputadoras=10;

    public Orden() {
        this.idOrden = ++contOrden;
        computadoras = new Computadora[maxComputadoras];
    }

    public void agregarComputadora(Computadora computadora){
        if(contOrden<maxComputadoras){
            computadoras[contOrden++]=computadora;
        }
        else {
            System.out.println("");
            System.out.println("No se ha podido agregar el producto: "+ computadora);
            System.out.println("Porque se ha superado el maximo de productos permitido por una orden. "+maxComputadoras);
        }
    }

    //public calcularTotal()

    public void mostrarOrden(){
        System.out.println("");
        System.out.println("Orden #: "+ idOrden);
        System.out.println("Los productos de la orden # "+idOrden+" son: ");
        for (int i=0;i<contOrden;i++){
            System.out.println(computadoras[i]);
        }
    }


}
