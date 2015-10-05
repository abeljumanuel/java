package ejercicios;
import javax.swing.*;
public class CadenaCaracteres {
    public static void main(String[] args)
    {
        String nombre1,nombre2;
        int edad1,edad2;
        nombre1=String.valueOf(JOptionPane.showInputDialog(null,"Ingrese Nombre primer sujeto:"));
        edad1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Edad del primer sujeto:"));
        nombre2=String.valueOf(JOptionPane.showInputDialog(null,"Ingrese Nombre segundo sujeto:"));
        edad2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Edad del segundo sujeto:"));
        if(edad1>edad2)
        {   
            JOptionPane.showMessageDialog(null, nombre1+" es mayor");
        } else if(edad2>edad1) {
            JOptionPane.showMessageDialog(null, nombre2+" es mayor");
        } else {
            JOptionPane.showMessageDialog(null, nombre1+" y "+nombre2+" tienen la misma edad");
        }
    }
}
