package co.edu.uniquindio.generic.interfacegeneric;

public class Concatenar implements IOperacion<String>{
    @Override
    public String operar(String element1, String element2) {
        return element1 + element2;
    }
}
