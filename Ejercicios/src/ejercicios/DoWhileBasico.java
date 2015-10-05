package ejercicios;
import javax.swing.*;
public class DoWhileBasico {
     public static void main(String[] args)
    {
        int cuenta, valor, saldo;
        saldo=0;
        do{
            cuenta=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa numero de la cuenta:"));
            if (cuenta>=0){
                valor=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa saldo de la cuenta:"));
                if (valor > 0 ){
                    JOptionPane.showMessageDialog(null, "La cuenta de #"+cuenta+" con saldo "+valor+" tiene estado Acreedor");
                    saldo=saldo+valor;
                }else if (valor < 0){
                    JOptionPane.showMessageDialog(null, "La cuenta de #"+cuenta+" con saldo "+valor+" tiene estado Deudor");
                }else{
                    JOptionPane.showMessageDialog(null, "La cuenta de #"+cuenta+" con saldo "+valor+" tiene estado Nulo");
                }
            }
        }while (cuenta>(-1));
        JOptionPane.showMessageDialog(null, "La suma total de los saldos acreedores es : $"+saldo);
        
    }
}
