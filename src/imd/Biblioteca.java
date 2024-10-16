package imd;
import java.util.List;
import java.util.ArrayList;


public class Biblioteca {
    private String nome;
    private int quantidadeLivros;
    private List<Livro> catalogo;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.quantidadeLivros = 0;
        this.catalogo = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeLivros() {
        return quantidadeLivros;
    }

    public void adicionarLivro(Livro livro) {
        this.catalogo.add(livro);
        this.quantidadeLivros++;
    }

    public void removerLivro(Livro livro) {
        if (this.catalogo.remove(livro)) {
            this.quantidadeLivros--;
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : catalogo) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public boolean verificarDisponibilidade(String titulo) {
        Livro livro = buscarLivroPorTitulo(titulo);
        if (livro != null) {
        	return livro.getCopiasDisponiveis() < 0;
        }
        
        return false;
    }
    
    public void popularBiblioteca() {
        this.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1000, 3));
        this.adicionarLivro(new Livro("1984", "George Orwell", 328, 5));
        this.adicionarLivro(new Livro("Dom Quixote", "Miguel de Cervantes", 863, 2));
    }
}


