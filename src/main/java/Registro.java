import java.util.InputMismatchException;
import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        String[][] registro = new String[50][3];

        menu(registro);
    }
    public static void mostrarMenu(){

        System.out.println("Bienvenido, ingrese un numero"
                + "\n1) Agregar persona:"
                + "\n2) Mostrar personas mayores de edad"
                + "\n3) Mostrar personas menores de edad"
                + "\n4) Mostrar cantidad de personas de tercera dedad"
                + "\n5) Mostar cantidad de personas segun estado civil"
                + "\n6) salir");
    }
    public static int entradaMenu(){

        boolean continuar = false;
        Scanner sc = new Scanner(System.in);
        int entrada = 0;

        do{
            System.out.println("ingrese un numero");
            if(sc.hasNextInt()){
                entrada = sc.nextInt();
                if(entrada > 0 && entrada < 7){
                    continuar = true;
                }
            }else{
                sc.nextLine();
                System.out.println("ingrese un valor valido");
            }
        }while(!continuar);

        return entrada;
    }
    private static void menu(String[][] registro){

        mostrarMenu();

        switch(entradaMenu()){

            case 1: agregarPersona(registro);
            case 2: mostrarCantidadMayores(registro);
            case 3: mostrarCantidadMenores(registro);
            case 4: mostrarCantidadTerceraEdad(registro);
            case 5: mostrarPersonasEstadoCivil(registro);
            case 6: salir();

        }
    }
    public static String[][] agregarPersona(String[][] registro) {

        boolean seIngreso = false;



        while (!seIngreso) {
            for (int fila = 0; fila < registro.length; fila++) {
                if (registro[fila][0].isBlank()) {
                    seIngreso = true;
                    for (int columna = 0; columna < registro[fila].length; columna++) {
                        registro[fila][columna] = teclado();
                    }
                }
            }
        }
        return registro;
    }

    public static String cantidadPersonasEstadoCivil(String[][] registro){

        int personasSolteras = personasSolteras(registro);
        int personasCasadas = personasCasadas(registro);

        String estadoCivilPersonas ="hay " + personasSolteras + " personas solteras, y hay " + personasCasadas + " personas casadas";

        return estadoCivilPersonas;
    }
    public static void mostrarPersonasEstadoCivil(String[][] registro){

        System.out.println(cantidadPersonasEstadoCivil(registro));
    }
    public static int personasSolteras(String[][] registro){

        int cantidadSolteros = 0;
        for(int fila = 0; fila < registro.length; fila++){

            if(registro[fila][3] == "soltero"){

                cantidadSolteros ++;
            }
            cantidadSolteros ++;
            System.out.println(cantidadSolteros);
        }
        return cantidadSolteros;
    }
    public static int personasCasadas(String[][] registro){
        int cantidadCasadas = 0;
        return cantidadCasadas;
    }
    public static String teclado(){
        return new Scanner(System.in).nextLine();
    }
    private static void salir(){
        System.exit(0);
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

}
