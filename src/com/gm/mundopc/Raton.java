package com.gm.mundopc;

public class Raton extends DispositivoEntrada {

    private int idRaton;
    private static int contRaton;



    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton=++contRaton;
    }

    public int getIdRaton() {
        return idRaton;
    }

    public static int getContRaton() {
        return contRaton;
    }

    public static void setContRaton(int contRaton) {
        Raton.contRaton = contRaton;
    }

    @Override
    public String toString() {
        return super.toString()+"Raton{" + "idRaton=" + idRaton + '}';
    }
}
