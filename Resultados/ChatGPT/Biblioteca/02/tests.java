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
    public void setUp() {
        biblioteca = new Biblioteca("Biblioteca Central");
        livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1000, 3);
        livro2 = new Livro("1984", "George Orwell", 328, 5);
        livro3 = new Livro("Dom Quixote", "Miguel de Cervantes", 863, 2);
    }

    @Test
    public void testGetNome() {
        assertEquals("Biblioteca Central", biblioteca.getNome());
    }

    @Test
    public void testGetQuantidadeLivrosInicial() {
        assertEquals(0, biblioteca.getQuantidadeLivros());
    }

    @Test
    public void testAdicionarLivro() {
        biblioteca.adicionarLivro(livro1);
        assertEquals(1, biblioteca.getQuantidadeLivros());
    }

    @Test
    public void testRemoverLivroExistente() {
        biblioteca.adicionarLivro(livro1);
        biblioteca.removerLivro(livro1);
        assertEquals(0, biblioteca.getQuantidadeLivros());
    }

    @Test
    public void testRemoverLivroInexistente() {
        biblioteca.removerLivro(livro1); // Tentando remover um livro que não foi adicionado
        assertEquals(0, biblioteca.getQuantidadeLivros());
    }

    @Test
    public void testBuscarLivroPorTituloExistente() {
        biblioteca.adicionarLivro(livro1);
        Livro resultado = biblioteca.buscarLivroPorTitulo("O Senhor dos Anéis");
        assertNotNull(resultado);
        assertEquals("O Senhor dos Anéis", resultado.getTitulo());
    }

    @Test
    public void testBuscarLivroPorTituloInexistente() {
        Livro resultado = biblioteca.buscarLivroPorTitulo("Livro Inexistente");
        assertNull(resultado);
    }

    @Test
    public void testVerificarDisponibilidadeLivroDisponivel() {
        biblioteca.adicionarLivro(livro1);
        assertTrue(biblioteca.verificarDisponibilidade("O Senhor dos Anéis"));
    }

    @Test
    public void testVerificarDisponibilidadeLivroIndisponivel() {
        Livro livroIndisponivel = new Livro("O Livro das Sombras", "Autor Desconhecido", 200, 0);
        biblioteca.adicionarLivro(livroIndisponivel);
        assertFalse(biblioteca.verificarDisponibilidade("O Livro das Sombras"));
    }

    @Test
    public void testVerificarDisponibilidadeLivroInexistente() {
        assertFalse(biblioteca.verificarDisponibilidade("Livro Não Catalogado"));
    }

    @Test
    public void testPopularBiblioteca() {
        biblioteca.popularBiblioteca();
        assertEquals(3, biblioteca.getQuantidadeLivros());
        assertNotNull(biblioteca.buscarLivroPorTitulo("O Senhor dos Anéis"));
        assertNotNull(biblioteca.buscarLivroPorTitulo("1984"));
        assertNotNull(biblioteca.buscarLivroPorTitulo("Dom Quixote"));
    }

    @Test
    public void testAdicionarVariosLivros() {
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        assertEquals(3, biblioteca.getQuantidadeLivros());
    }

    @Test
    public void testRemoverLivroDeBibliotecaComVariosLivros() {
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.removerLivro(livro1);
        assertEquals(1, biblioteca.getQuantidadeLivros());
    }
}
