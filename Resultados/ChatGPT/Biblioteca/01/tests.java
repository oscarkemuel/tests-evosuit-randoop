import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class BibliotecaTest {

    private Biblioteca biblioteca;
    private Livro livro1;
    private Livro livro2;
    private Livro livro3;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca("Biblioteca Central");
        livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1000, 3);
        livro2 = new Livro("1984", "George Orwell", 328, 5);
        livro3 = new Livro("Dom Quixote", "Miguel de Cervantes", 863, 2);
    }

    @Test
    void testGetNome() {
        assertEquals("Biblioteca Central", biblioteca.getNome());
    }

    @Test
    void testAdicionarLivro() {
        biblioteca.adicionarLivro(livro1);
        assertEquals(1, biblioteca.getQuantidadeLivros());
    }

    @Test
    void testRemoverLivroExistente() {
        biblioteca.adicionarLivro(livro1);
        biblioteca.removerLivro(livro1);
        assertEquals(0, biblioteca.getQuantidadeLivros());
    }

    @Test
    void testRemoverLivroNaoExistente() {
        biblioteca.adicionarLivro(livro1);
        biblioteca.removerLivro(livro2); // Tentativa de remover um livro que não foi adicionado
        assertEquals(1, biblioteca.getQuantidadeLivros());
    }

    @Test
    void testBuscarLivroPorTituloExistente() {
        biblioteca.adicionarLivro(livro1);
        Livro livroEncontrado = biblioteca.buscarLivroPorTitulo("O Senhor dos Anéis");
        assertNotNull(livroEncontrado);
        assertEquals("O Senhor dos Anéis", livroEncontrado.getTitulo());
    }

    @Test
    void testBuscarLivroPorTituloNaoExistente() {
        biblioteca.adicionarLivro(livro1);
        Livro livroEncontrado = biblioteca.buscarLivroPorTitulo("Livro Inexistente");
        assertNull(livroEncontrado);
    }

    @Test
    void testVerificarDisponibilidadeLivroDisponivel() {
        biblioteca.adicionarLivro(livro1);
        assertTrue(biblioteca.verificarDisponibilidade("O Senhor dos Anéis"));
    }

    @Test
    void testVerificarDisponibilidadeLivroIndisponivel() {
        Livro livroSemCopias = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1000, 0);
        biblioteca.adicionarLivro(livroSemCopias);
        assertFalse(biblioteca.verificarDisponibilidade("O Senhor dos Anéis"));
    }

    @Test
    void testVerificarDisponibilidadeLivroNaoExistente() {
        assertFalse(biblioteca.verificarDisponibilidade("Livro Inexistente"));
    }

    @Test
    void testPopularBiblioteca() {
        biblioteca.popularBiblioteca();
        assertEquals(3, biblioteca.getQuantidadeLivros());

        assertNotNull(biblioteca.buscarLivroPorTitulo("O Senhor dos Anéis"));
        assertNotNull(biblioteca.buscarLivroPorTitulo("1984"));
        assertNotNull(biblioteca.buscarLivroPorTitulo("Dom Quixote"));
    }

    @Test
    void testQuantidadeLivrosInicialmenteZerada() {
        assertEquals(0, biblioteca.getQuantidadeLivros());
    }

    @Test
    void testAdicionarMultiplosLivros() {
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        assertEquals(2, biblioteca.getQuantidadeLivros());
    }
}
