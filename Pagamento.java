public class Pagamento {
    private String metodo;
    private double valor;
    private String status;

    public Pagamento(String metodo, double valor) {
        this.metodo = metodo;
        this.valor = valor;
        this.status = "Pendente";
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void realizarPagamento() {
        status = "Pago";
    }

    public void mostrarPagamento() {
        System.out.println("--- PAGAMENTO ---");
        System.out.println("Método: " + metodo);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Status: " + status);
    }
}