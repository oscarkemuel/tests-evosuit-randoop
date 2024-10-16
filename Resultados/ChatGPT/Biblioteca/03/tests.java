import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

public class BibliotecaTest {

    private Biblioteca biblioteca;

    @BeforeEach
    public void setUp() {
        // Inicializando a biblioteca antes de cada teste
        biblioteca = new Biblioteca("Biblioteca Central");
    }

    @Test
    public void testGetNome() {
        assertEquals("Biblioteca Central", biblioteca.getNome(), "O nome da biblioteca não corresponde ao esperado.");
    }

    @Test
    public void testGetQuantidadeLivrosInicial() {
        assertEquals(0, biblioteca.getQuantidadeLivros(), "A quantidade inicial de livros deve ser 0.");
    }

    @Test
    public void testAdicionarLivro() {
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1000, 5);
        biblioteca.adicionarLivro(livro);
        assertEquals(1, biblioteca.getQuantidadeLivros(), "A quantidade de livros após adicionar não corresponde ao esperado.");
    }

    @Test
    public void testRemoverLivroExistente() {
        Livro livro = new Livro("1984", "George Orwell", 328, 5);
        biblioteca.adicionarLivro(livro);
        biblioteca.removerLivro(livro);
        assertEquals(0, biblioteca.getQuantidadeLivros(), "A quantidade de livros após remover deve ser 0.");
    }

    @Test
    public void testRemoverLivroNaoExistente() {
        Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes", 863, 2);
        biblioteca.removerLivro(livro);  // Tentando remover um livro que não foi adicionado
        assertEquals(0, biblioteca.getQuantidadeLivros(), "A quantidade de livros não deve mudar ao tentar remover um livro que não está no catálogo.");
    }

    @Test
    public void testBuscarLivroPorTituloExistente() {
        Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes", 863, 2);
        biblioteca.adicionarLivro(livro);
        assertNotNull(biblioteca.buscarLivroPorTitulo("Dom Quixote"), "O livro deve ser encontrado no catálogo.");
    }

    @Test
    public void testBuscarLivroPorTituloNaoExistente() {
        assertNull(biblioteca.buscarLivroPorTitulo("Livro Desconhecido"), "O resultado deve ser null ao buscar por um livro não existente.");
    }

    @Test
    public void testVerificarDisponibilidadeLivroDisponivel() {
        Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes", 863, 2);
        biblioteca.adicionarLivro(livro);
        assertTrue(biblioteca.verificarDisponibilidade("Dom Quixote"), "O livro deve estar disponível para empréstimo.");
    }

    @Test
    public void testVerificarDisponibilidadeLivroIndisponivel() {
        Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes", 863, 0); // Sem cópias disponíveis
        biblioteca.adicionarLivro(livro);
        assertFalse(biblioteca.verificarDisponibilidade("Dom Quixote"), "O livro não deve estar disponível para empréstimo.");
    }

    @Test
    public void testPopularBiblioteca() {
        biblioteca.popularBiblioteca();
        assertEquals(3, biblioteca.getQuantidadeLivros(), "A biblioteca deve conter 3 livros após ser populada.");
        assertNotNull(biblioteca.buscarLivroPorTitulo("O Senhor dos Anéis"), "O livro 'O Senhor dos Anéis' deve estar no catálogo.");
        assertNotNull(biblioteca.buscarLivroPorTitulo("1984"), "O livro '1984' deve estar no catálogo.");
        assertNotNull(biblioteca.buscarLivroPorTitulo("Dom Quixote"), "O livro 'Dom Quixote' deve estar no catálogo.");
    }
}
