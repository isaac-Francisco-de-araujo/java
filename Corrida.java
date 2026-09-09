public class Corrida {
    private int id;
    private Cliente cliente;
    private Motorista Motorista;
    private Endereco origem;
    private Endereco destino;
    private double preco;
    private String status;
    private Pagamento pagamento;
    private Avaliacao avaliacao;

    public Corrida(int id, Cliente cliente,
                   Endereco origem, Endereco destino,
                   double preco) {

        this.id = id;
        this.cliente = cliente;
        this.origem = origem;
        this.destino = destino;
        this.preco = preco;
        this.status = "Solicitada";
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Motorista getMotorista() {
        return Motorista;
    }

    public Endereco getOrigem() {
        return origem;
    }

    public Endereco getDestino() {
        return destino;
    }

    public double getPreco() {
        return preco;
    }

    public String getStatus() {
        return status;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void aceitarCorrida(Motorista Motorista) {
        if (Motorista.isDisponivel()) {
            this.Motorista = Motorista;
            Motorista.setDisponivel(false);
            this.status = "Aceita";
        }
    }

    public void iniciarCorrida() {
        if (Motorista != null) {
            status = "Em andamento";
        }
    }

    public void finalizarCorrida() {
        if (Motorista != null) {
            status = "Finalizada";
            Motorista.setDisponivel(true);
        }
    }

    public void adicionarPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void cancelarCorrida() {
        if (!status.equals("Finalizada")) {
            status = "Cancelada";

            if (Motorista != null) {
                Motorista.setDisponivel(true);
            }
        }
    }

    public void mostrarCorrida() {
        System.out.println("ID: " + id);
        System.out.println("Cliente: " + cliente.getNome());

        if (Motorista != null) {
            System.out.println("Motorista: " + Motorista.getNome());
        } else {
            System.out.println("Motorista: Aguardando");
        }

        System.out.println("Origem:");
        origem.mostrarEndereco();

        System.out.println("Destino:");
        destino.mostrarEndereco();

        System.out.println("Preço: R$ " + preco);
        System.out.println("Status: " + status);

        if (pagamento != null) {
            pagamento.mostrarPagamento();
        }

        if (avaliacao != null) {
            avaliacao.mostrarAvaliacao();
        }
    }
}