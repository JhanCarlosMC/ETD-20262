package co.edu.uniquindio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        matrushkaRecursiva(10);
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

}
