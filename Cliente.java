public class Cliente extends Usuario {
    private String endereco;

     Cliente(String nome, String email, String senha,
                   String cpf, String contato) {
        super(nome, email, senha, cpf, contato);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


}