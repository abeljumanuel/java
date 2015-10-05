package ejercicios;
import javax.swing.*;
public class PerimetroCuadrado {
    public static void main(String[] args)
    {
        int lado, perimetro;
        lado=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor del lado del cuadrado:"));
        perimetro=lado*4;
        System.out.print("El perimetro del cuadrado es:");
        System.out.print(perimetro);
    }
}
