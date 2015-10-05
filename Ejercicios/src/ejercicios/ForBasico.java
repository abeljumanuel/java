package ejercicios;
import javax.swing.*;
public class ForBasico {
     public static void main(String[] args)
    {
        int cantnotas,sup,less,eval,notaest;
        cantnotas=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de notas a evaluar:"));
        eval=Integer.parseInt(JOptionPane.showInputDialog(null,"Punto de evaluacion:"));
        int f;
        sup = 0;
        less = 0;
        for(f=1; f<=cantnotas; f++)
        {
           notaest=Integer.parseInt(JOptionPane.showInputDialog(null,"Nota estudiante:"));
           if (notaest>=eval){
               sup=sup+1;
           }else{
               less=less+1;
           }
        }
        System.out.println("La cantidad de estudiantes con notas superiores a "+eval+" es: "+sup);
        System.out.println("La cantidad de estudiantes con notas inferiores a "+eval+" es: "+less);
    }
}
