package imd;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private int copiasDisponiveis;

    public Livro(String titulo, String autor, int paginas, int copiasDisponiveis) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.copiasDisponiveis = copiasDisponiveis;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getCopiasDisponiveis() {
        return copiasDisponiveis;
    }

    public void emprestar() {
        if (copiasDisponiveis > 0) {
            copiasDisponiveis--;
        }
    }

    public void devolver() {
        copiasDisponiveis++;
    }

    public void adicionarCopias(int quantidade) {
        copiasDisponiveis += quantidade;
    }

    public void removerCopias(int quantidade) {
        if (quantidade <= copiasDisponiveis) {
            copiasDisponiveis -= quantidade;
        }
    }
}

