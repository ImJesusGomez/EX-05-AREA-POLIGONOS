package areapoligono;

import java.io.*;

public class AreaPoligono {

    public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("CALCULAR EL AREA DE UN POLIGONO");
        
        
        boolean temporal = true;

        while (temporal) {
            System.out.println("Escribe la opcion a calcular su area \n1. Triangulo \n2. Cuadrado \n3. Rectangulo");
            int opcion = Integer.parseInt(teclado.readLine());

            double area = 0;

            switch (opcion) {
                case 1:
                    System.out.println("\nAREA: TRIANGULO");
                    System.out.println("Ingresa la base del triangulo en cm");
                    double base = Double.parseDouble(teclado.readLine());
                    System.out.println("Ingresa la altura del triangulo en cm");
                    double altura = Double.parseDouble(teclado.readLine());

                    area = (base * altura) / 2;
                    System.out.println("Area del triangulo: " + area + " cm2");
                    temporal = false;
                    break;

                case 2:
                    System.out.println("\nAREA: CUADRADO");
                    System.out.println("Ingresa la medida en cm de el lado del cuadrado en cm");
                    double lado = Double.parseDouble(teclado.readLine());

                    area = lado * lado;
                    System.out.println("Area del cuadrado: " + area + " cm2");
                    temporal = false;
                    break;
                case 3:
                    System.out.println("\nAREA: RECTANGULO");
                    System.out.println("Ingresa la base del rectangulo en cm");
                    double base2 = Double.parseDouble(teclado.readLine());
                    System.out.println("Ingresa la altura del rectangulo en cm");
                    double altura2 = Double.parseDouble(teclado.readLine());

                    area = base2 * altura2;

                    System.out.println("Area del rectangulo: " + area + " cm2");
                    temporal = false;
                    break;
                default:
                    System.out.println("OPCION ERRONEA. ESCOGE UNA OPCION CORRECTA.");

            }

        }

    }
}
