import Logica.Circulo;
import Logica.Cuadrado;
import Logica.Figura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tipo =0;

        System.out.println("**********MENU******************");
        System.out.println("* [1] CUADRADO                 *");
        System.out.println("* [2] CIRCULO                  *");
        System.out.println("********************************\n");
        System.out.println("Ingrese un numero: ");
        tipo = scanner.nextInt();
        scanner.nextLine();

        mostrarResultados(scanner, tipo);

    }

    public static void mostrarResultados(Scanner scanner, int tipo){
        if(tipo == 1){
            Cuadrado cuadrado = new Cuadrado();
            System.out.println("Ingrese el lado del cuadraro: ");
            cuadrado.setLado(scanner.nextDouble());

            // mostra el area del cuadrado
            double area = cuadrado.calcularArea();
            System.out.println("El area del cuadrado es: " + area);
            scanner.close();
        }else{
            Circulo circulo = new Circulo();
            System.out.println("Ingrese el radio del circulo: ");
            circulo.setRadio(scanner.nextDouble());

            // mostra el area del circulo
            double area = circulo.calcularArea();
            System.out.println("El radio del circulo es: " + area);
            scanner.close();
        }
    }

}