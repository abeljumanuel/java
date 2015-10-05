package ejercicios;
import javax.swing.*;
public class CondicionalAnidado {
    public static void main(String[] args)
    {
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero entero:"));
        if(num>0)
        {   
            System.out.println("El numero ("+num+") es positivo");
        } else if( num<0) {
            System.out.println("El numero ("+num+") es negativo");
        } else {
             System.out.println("El numero ("+num+") es nulo");
        }
    }
}
