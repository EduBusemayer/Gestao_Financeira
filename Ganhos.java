public class Ganhos {

    private String Tipo;
    private double Valor;
    private String Data;
    

    public Ganhos(String tipo, double valor, String data) {
        this.Tipo = tipo;
        this.Valor = valor;
        this.Data = data;
    }

    public String getTipo() {
        return this.Tipo;
    }

    public double getValor() {
        return this.Valor;
    }

    public String getData() {
        return this.Data;
    }
} 