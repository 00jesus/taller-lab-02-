import java.util.InputMismatchException;
import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        String[][] registro = new String[50][3];


    }
    public static String ingresarNombre () {
        String nombre;
        while(true) {
            try {
                nombre = new Scanner(System.in).nextLine();
                return nombre;
            } catch (InputMismatchException e) {
                System.err.println("Opción inválida");
            }
        }
    }
    public static String ingresarEdad () {
        String edad;
        while(true) {
            try {
                edad = validarEntero();
                return edad;
            } catch (InputMismatchException e) {
                System.err.println("Opción inválida");
            }
        }
    }
    public static String validarEntero() {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        int num = -1;
        while (!valido) {
            System.out.print("Ingresa una opcion: ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num >= 0) {
                    valido = true;
                } else {
                    System.out.println("El número debe ser mayor que cero o cero");
                }
            } else {
                System.out.println("No es un número entero válido");
                sc.next();
            }
        }
        return String.valueOf(num);
    }

    public static int stringToInt(String edad) {
        int resultado = Integer.parseInt(edad);
        return resultado;
    }

    public static int mostrarCantidadMayores(String[][] personas) {
        int cantidad = 0;
        String aux;
        int temp;
        for (int pers = 0; pers < 50; pers++) {
            aux = personas[pers][2];//EDAD siempre esta en 3ra columna, por lo tanto, indice 2
            if (aux == null) {
                System.out.println("");
            } else {
                temp = stringToInt(aux);
                if (temp >= 18 && temp < 65) {
                    cantidad = cantidad + 1;
                }
            }
        }
        return cantidad;
    }

    public static int mostrarCantidadMenores(String[][] personas) {
        int cantidad = 0;
        String aux;
        int temp;
        for (int pers = 0; pers < 50; pers++) {
            aux = personas[pers][2];//EDAD siempre esta en 3ra columna, por lo tanto, indice 2
            if (aux == null) {
                System.out.println("");
            } else {
                temp = stringToInt(aux);
                if (temp < 18) {
                    cantidad = cantidad + 1;
                }
            }
        }
        return cantidad;
    }

    public static int mostrarCantidadTerceraEdad(String[][] personas) {
        int cantidad = 0;
        String aux;
        int temp;
        for (int pers = 0; pers < 50; pers++) {
            aux = personas[pers][2];//EDAD siempre esta en 3ra columna, por lo tanto, indice 2
            if (aux == null) {
                System.out.println("");
            } else {
                temp = stringToInt(aux);
                if (temp >= 65) {
                    cantidad = cantidad + 1;
                }
            }
        }
        return cantidad;
    }
}





