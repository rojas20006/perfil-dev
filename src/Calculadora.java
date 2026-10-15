import java.util.Scanner;

public class Calculadora {
    public static double restar(double a, double b){
        return a - b;
}

public static double sumar(double a, double b){
        return a + b;
}

Run|Debug
public static avoid main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("ingrese el primer numero");
    double a = entrada.nextDouble();
    System.out.println("ingrese el segundo  numero");
    double b = entrada.nextDouble();

    System.out.println("suma: " + sumar(a, b));
    System.out.println("resta: " + restar(a, b));

    entrada.close();

}