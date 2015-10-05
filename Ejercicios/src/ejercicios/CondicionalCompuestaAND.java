package ejercicios;
import javax.swing.*;
public class CondicionalCompuestaAND {
     public static void main(String[] args)
    {
        float sueldo, sueldoTotal;
        int antiguedad;
        sueldo=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el sueldo del empleado:"));
        antiguedad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la antiguedad del empleado:"));
        if(sueldo<500 && antiguedad>10)
        {   
            float aumento = sueldo*0.2f;
            sueldoTotal = sueldo+aumento;
        } else if( sueldo<500) {
            float aumento = sueldo*0.05f;
            sueldoTotal = sueldo+aumento;
        } else {
            sueldoTotal = sueldo;
        }
        System.out.println("Sueldo a Pagar: "+sueldoTotal);
    }
}
