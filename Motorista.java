public class Motorista {
    private String nome;
    private String contato;
    private String carro;
    private String avaliacao;

    Motorista(String nome, String contato, String carro, String avaliacao) {
            this.nome = nome;
            this.contato = contato;
            this.carro = carro;
            this.avaliacao = avaliacao;
    }

    String getNome(){
       return this.nome;
    }

    void setNome(String nome){
       this.nome = nome;
    }

    String getCarro(){
       return this.carro;
    }

    void setCarro(String carro){
       this.carro = carro;
    }

    String getAvaliacao(){
       return this.avaliacao;
    }

    void setAvaliacao(String avaliacao){
       this.avaliacao = avaliacao;
    }

    String getContato(){
       return this.contato;
    }

    void setContato(String contato){
       this.contato = contato;
    }


    void MostrarMotorista() {
        System.out.println("---Motorista---");
        System.out.println("nome:" + this.nome);
        System.out.println("carro:" + this.carro);
        System.out.println("avaliacao:" + this.avaliacao);
        System.out.println("contato:" + this.contato);
    }
}