import java.sql.SQLOutput;
import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        String[][] registro = new String[50][3];

        menu();
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
    private static void menu(){

        mostrarMenu();

        switch(entradaMenu()){

            case 1:
            case 2:
            case 3:
            case 4:
            case 5: cantidadPersonasEstadoCivil();
            case 6: salir();

        }
    }
    public static String cantidadPersonasEstadoCivil(){

        String estadoCivilPersonas ="hay " + personasSolteras() + " personas solteras, y hay " + personasCasadas() + " personas casadas";

        return estadoCivilPersonas;
    }
    public static int personasSolteras(){

        int cantidadSolteras = 0;
        return cantidadSolteras;
    }
    public static int personasCasadas(){
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
