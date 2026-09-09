package co.edu.uniquindio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
//        matrushkaRecursiva(10);
//        IO.println(factorial(5,1));
        int[] numeros = {2,4,6,8,9,14,20,142,1234};
//        recorrerArreglo(numeros, 0);

//        int respuesta = sumarArregloDivideVenceras(numeros, 0 , numeros.length-1);
//        IO.println(respuesta);
        int pos = busquedaBinaria(numeros, 0 , numeros.length-1,1);
        IO.println(pos);
    }
    //Caso Base/Parada -> El caso minimo que podemos tener
    //Caso Recursivo -> El caso donde se invoca el metodo de nuevo,
        // y nos lleva a el caso base
    public static void matrushkaRecursiva(int cantMatrushkas){
        //Caso Base
        if(cantMatrushkas <= 0) {
            return;
        }
        IO.println("Abri la matrushka numero: " + cantMatrushkas);

        //Caso Recursivo
        matrushkaRecursiva(cantMatrushkas-1);
        IO.println("Cerre la matrushka numero: " + cantMatrushkas);
    }

    //Escribe un programa que calcule el factorial (!) de un entero no negativo.
    // Directo - Lineal - Cola
    public static int factorial(int numero, int operacion){
        //Caso Base
        if(numero <= 1)
            return operacion;

        //Caso recursivo
        return factorial(numero-1,operacion * numero);
    }

    public static void recorrerArreglo(int[] numeros, int indice) {
        if (indice == numeros.length){
            IO.println("");
            IO.println("-----------");
            return;
        }
        IO.print(numeros[indice] + " ");
        recorrerArreglo(numeros, indice+1);
        IO.print(numeros[indice] + " ");
    }

    public static int sumarArreglo(int[] numeros, int indice) {
        // CASO BASE: cuando el indice llegue al final del arreglo (igual a la cantidad de elementos)
        if (indice == numeros.length) {
            return 0;
        }

        IO.print(numeros[indice] + " ");

        return sumarArreglo(numeros, indice+1);
    }

    public static int sumarArregloDivideVenceras(int[] numeros, int inicio, int fin){
        //Caso Base
        if(inicio == fin) return numeros[inicio];

        int mitad = inicio + (fin - inicio) / 2;

        //Casos recursivos
        int sumaIzq = sumarArregloDivideVenceras(numeros, inicio, mitad);
        int sumaDer = sumarArregloDivideVenceras(numeros, mitad+1, fin);

        return sumaIzq + sumaDer;
    }

    public static int busquedaBinaria(int[] numeros, int inicio, int fin, int numBuscado){
        if(inicio > fin) return -1;

        int mitad = inicio + (fin - inicio) / 2;

        //Caso base
        if(numBuscado == numeros[mitad]) return mitad;

        if(numBuscado < numeros[mitad]){
            return busquedaBinaria(numeros, inicio, mitad-1,numBuscado);
        }

        return busquedaBinaria(numeros, mitad+1, fin,numBuscado);
    }

}
