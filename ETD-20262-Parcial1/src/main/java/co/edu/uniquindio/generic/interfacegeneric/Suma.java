package co.edu.uniquindio.generic.interfacegeneric;

public class Suma implements IOperacion<Integer>{
    @Override
    public Integer operar(Integer element1, Integer element2) {
        return element1 + element2;
    }
}
