package java;
import java.util.Date;

public class Entrada {
    private Date data;
    private float valor;
    private int quantidade;

    public Entrada(Date data, float valor, int quantidade) {
        this.data = data;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void registrarEntrada() {
        // Lógica para registrar uma entrada
    }
}