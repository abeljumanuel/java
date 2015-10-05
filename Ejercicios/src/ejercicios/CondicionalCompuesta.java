package ejercicios;
import javax.swing.*;
public class CondicionalCompuesta {
    public static void main(String[] args)
    {
        int num1, num2;
        num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese primer valor:"));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese segundo valor:"));
        if(num1>num2)
        {   
            System.out.println("El mayor es: "+num1);
        }else {
            System.out.println("El mayor es: "+num2);
        }
    }
}
