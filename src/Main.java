import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Aqui el JOptionPane lo que hace es desplegar una interfaz para los prints

        String cadena= JOptionPane.showInputDialog("Ingrese una cadena de texto");
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        char letra=JOptionPane.showInputDialog("Ingresa un letra: ").charAt(0);
        double decimal=Double.parseDouble(JOptionPane.showInputDialog("Ingresa una decimal: "));

        JOptionPane.showMessageDialog(null,"La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null,"El numero es: "+numero);
        JOptionPane.showMessageDialog(null,"La letra es: "+letra);
        JOptionPane.showMessageDialog(null,"El decimal es: "+decimal);
    }

}