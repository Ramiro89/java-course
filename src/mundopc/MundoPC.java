package mundopc;
import com.gm.mundopc.*;

public class MundoPC {
public static void main(String [] arg){
    //Creacion de computadora Toshiba
    Monitor monitorToshi=new Monitor("Toshiba", 17);
    Teclado tecladoToshi=new Teclado("USB","Toshiba");
    Raton raton=new Raton("USB","Toshiba");

    Computadora c1= new Computadora("TOshiba",monitorToshi,tecladoToshi,raton);

    Orden orden1= new Orden();

    orden1.agregarComputadora(c1);
    orden1.mostrarOrden();
}

}
