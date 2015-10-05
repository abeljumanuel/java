package ejercicios;
import javax.swing.*;
public class WhileBasico {
     public static void main(String[] args)
    {
        int cant,count,apta,noapta;
        float length;
        count=1;
        apta=0;
        noapta=0;
        cant=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la cantidad de Piezas:"));
        while(count<=cant)
        {
            length=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingresa la longitud de la Pieza numero ("+count+")"));
            count=count+1;
            if (length >= 1.2 && length<=1.3){
                apta=apta+1;
            }else{
                noapta=noapta+1;
            }
        }
        System.out.print("La cantidad de piezas aptas es: ("+apta+") y la candidad de piezas no aptas es: ("+noapta+")");
    }
}
