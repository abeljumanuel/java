package ejercicios;
import javax.swing.*;
public class CondicionalSimple {
    public static void main(String[] args)
    {
        float sueldo;
        sueldo=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el valor del sueldo:"));
        if(sueldo>3000)
        {
            System.out.print("Esta persona debe abonar impuestos:");
        }
    }
}
