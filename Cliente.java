public class Cliente {
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private String contato;

    public Cliente(String nome, String email, String senha,
                   String cpf, String contato) {

        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void mostrarCliente() {
        System.out.println("--- CLIENTE ---");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
        System.out.println("Contato: " + contato);
    }
}