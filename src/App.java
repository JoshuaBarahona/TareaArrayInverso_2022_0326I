import java.util.Scanner;

public class App {

    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean condicionsalida = true;

        do {

            try {

                System.out.println(
                        "Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();
                condicionsalida = (tamv >= 2 && tamv <= 16) ? false : true;

            } catch (Exception e) {
                System.out.println("Ocurrió algo, revisa la entrada.");
                leer.nextLine(); // Limpiar el buffer del scanner
            }

        } while (condicionsalida);

        // recibimos el array del metodo
        int array[] = llenado();

        System.out.println("Mostrar");

        Mostrar(array);

        // Invertir y mostrar el arreglo
        int[] arrayInvertido = invertirArray(array);
        System.out.println("Arreglo invertido:");
        Mostrar(arrayInvertido);
    }

    public static int[] llenado() {
        int[] arreglo = new int[tamv];

        for (int i = 0; i < arreglo.length; i++) {
            try {
                System.out.println("Ingrese el valor [" + i + "]");
                arreglo[i] = leer.nextInt();
            } catch (Exception e) {
                System.out.println("Ocurrió algo, revisa la entrada.");
                leer.nextLine(); // Limpiar el buffer del scanner
                i--; // Decrementar i para que se repita el ingreso del valor incorrecto.
            }
        }

        return arreglo;
    }

    public static void Mostrar(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static int[] invertirArray(int[] array) {
        int[] arrayInvertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInvertido[array.length - 1 - i] = array[i];
        }
        return arrayInvertido;
    }
}
