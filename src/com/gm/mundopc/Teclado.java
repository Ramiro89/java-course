package com.gm.mundopc;

public class Teclado extends DispositivoEntrada {
    private int idTeclado;
    private static int contTeclado;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++contTeclado;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public static int getContTeclado() {
        return contTeclado;
    }

    public static void setContTeclado(int contTeclado) {
        Teclado.contTeclado = contTeclado;
    }

    @Override
    public String toString() {
        return super.toString()+"Teclado{" + "idTeclado=" + idTeclado + '}';
    }
}
