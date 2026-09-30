package co.edu.uniquindio.generic.classgeneric;

public class CajaParesGenerica<K, V> {
    private K llave;
    private V valor;

    public CajaParesGenerica(K llave, V valor) {
        this.llave = llave;
        this.valor = valor;
    }

    public <S extends Double> S cambiar(S atributo){

        atributo++;

        return atributo;
    }

    public K getLlave() {
        return llave;
    }

    public void setLlave(K llave) {
        this.llave = llave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }
}
