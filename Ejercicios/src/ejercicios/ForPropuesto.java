package ejercicios;
import javax.swing.*;
public class ForPropuesto {
     public static void main(String[] args)
    {
        float base, alt, superficie;
        int cnt_triang, cumple, f;
        cnt_triang=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de triangulos a evaluar:"));
        cumple = 0;
        for(f=1; f<=cnt_triang; f++)
        {
           base= Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el valor de la Base del Triangulo"+f+":"));
           alt= Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el valor de la Altura del Triangulo"+f+":"));
           superficie = base*alt/2;
           if (superficie>12){
               cumple = cumple+1;
           }
            System.out.println("El triangulo "+f+" tiene una base="+base+", una altura= "+alt+" por tanto una superficie= "+superficie);
        }
            System.out.println("La cantidad de triangulos que tienen una superficie superior a 12 es: "+cumple);
    }
}
