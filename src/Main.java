import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al programa para sacar raices y potencias de numeros");
        System.out.println("| Raiz de un numero |");
        System.out.println("Ingresa un numero: ");
        double numero = scanner.nextDouble();

        //Si se ocupa un numero tipo Int para pasarlo a int se pone
        // int raiz = (int) Math.sqrt(numero);
        double raiz=Math.sqrt(numero);
        System.out.println("La raiz es: "+raiz);

        System.out.println("| La potencia de un numero | ");
        System.out.println("Ingresa un numero: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Ingresa un exponente: ");
        double exponente = scanner.nextDouble();

        double potencia = Math.pow(numero1, exponente);
        System.out.println("La potencia es: " + potencia);


        //Como redondear un numero
        //Para redondear un numero DOUBLE se ocupa que la variable del redondeado sea tipo LONG
        //Para redondear un numero float se ocupa que la variable del redondeado sea tipo INT
        double numero2=4.56;

        long numeroRedondeado = Math.round(numero2);

        System.out.printf("El numero es: %f\n",numero2);
        System.out.println("El numero redondeado es: "+numeroRedondeado);

        float numero3=8.97f;
        int numeroRedondeado2 = Math.round(numero3);

        System.out.printf("El numero es: %f  y el redondeado es: %d\n",numero3,numeroRedondeado2);

        //Numero random

        double numeroRandom=Math.random();
        System.out.println("Numero random: "+numeroRandom);

    }

}