public class Avaliacao {
    private int nota;
    private String comentario;

    public Avaliacao(int nota, String comentario) {
        if (nota < 1 || nota > 5) {
            throw new IllegalArgumentException(
                "A nota deve estar entre 1 e 5."
            );
        }

        this.nota = nota;
        this.comentario = comentario;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if (nota >= 1 && nota <= 5) {
            this.nota = nota;
        }
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void mostrarAvaliacao() {
        System.out.println("--- AVALIAÇÃO ---");
        System.out.println("Nota: " + nota);
        System.out.println("Comentário: " + comentario);
    }
}