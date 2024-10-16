import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    private Livro livro;

    @BeforeEach
    void setUp() {
        livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1200, 5);
    }

    @Test
    void testGetTitulo() {
        assertEquals("O Senhor dos Anéis", livro.getTitulo());
    }

    @Test
    void testGetAutor() {
        assertEquals("J.R.R. Tolkien", livro.getAutor());
    }

    @Test
    void testGetPaginas() {
        assertEquals(1200, livro.getPaginas());
    }

    @Test
    void testGetCopiasDisponiveis() {
        assertEquals(5, livro.getCopiasDisponiveis());
    }

    @Test
    void testEmprestarCopiaDisponivel() {
        livro.emprestar();
        assertEquals(4, livro.getCopiasDisponiveis());
    }

    @Test
    void testEmprestarSemCopiasDisponiveis() {
        livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1200, 0);
        livro.emprestar();
        assertEquals(0, livro.getCopiasDisponiveis());
    }

    @Test
    void testDevolver() {
        livro.emprestar(); // Reduz as cópias para 4
        livro.devolver();  // Aumenta para 5
        assertEquals(5, livro.getCopiasDisponiveis());
    }

    @Test
    void testAdicionarCopias() {
        livro.adicionarCopias(3);
        assertEquals(8, livro.getCopiasDisponiveis());
    }

    @Test
    void testRemoverCopiasComQuantidadeDisponivel() {
        livro.removerCopias(2);
        assertEquals(3, livro.getCopiasDisponiveis());
    }

    @Test
    void testRemoverCopiasSemQuantidadeDisponivel() {
        livro.removerCopias(6); // Não deve reduzir porque a quantidade é maior que as cópias disponíveis
        assertEquals(5, livro.getCopiasDisponiveis());
    }

    @Test
    void testRemoverExatamenteTodasAsCopias() {
        livro.removerCopias(5);
        assertEquals(0, livro.getCopiasDisponiveis());
    }
}
