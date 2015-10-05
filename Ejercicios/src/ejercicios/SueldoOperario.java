package ejercicios;
import javax.swing.*;
public class SueldoOperario {
    public static void main(String[] args)
    {
        int horasTrabajadas;
        float costoHora;
        float sueldo;
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de horas:"));
        costoHora=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el valor de la hora trabajada:"));
        sueldo = horasTrabajadas * costoHora;
        System.out.print("El empleado debe cobrar:"+sueldo);
    }
}
