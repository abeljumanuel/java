package ejercicios;
import javax.swing.*;
public class SumaProducto {
    public static void main(String[] args)
    {
        int num1,num2,suma,producto;
        num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese primer valor:"));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese segundo valor"));
        suma=num1+num2;
        producto=num1*num2;
        System.out.print("La suma de los dos valores es:");
        System.out.print(suma);
        System.out.print("El producto de los dos valores es:");
        System.out.print(producto);
    }
}
