public class Registro {
    public static void main(String[] args) {
        String[][] registro = new String[50][3];


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





