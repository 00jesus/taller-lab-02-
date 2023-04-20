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
        String[][] registro = new String[50][3];


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
}
