public class Gastos {

    private String Tipo;
    private double Valor;
    private String Pagamento;
    private String Data;

    public Gastos(String tipo, double valor, String pagamento, String data) {
        this.Tipo = tipo;
        this.Valor = valor;
        this.Pagamento = pagamento;
        this.Data = data;
    }

    public String getTipo() {
        return this.Tipo;
    }

    public double getValor() {
        return this.Valor;
    }

    public String getPagamento() {
        return this.Pagamento;
    }

    public String getData() {
        return this.Data;
    }
} 