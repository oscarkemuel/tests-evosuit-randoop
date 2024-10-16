import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    private Livro livro;

    @BeforeEach
    public void setUp() {
        livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1200, 5);
    }

    @Test
    public void testGetTitulo() {
        assertEquals("O Senhor dos Anéis", livro.getTitulo());
    }

    @Test
    public void testGetAutor() {
        assertEquals("J.R.R. Tolkien", livro.getAutor());
    }

    @Test
    public void testGetPaginas() {
        assertEquals(1200, livro.getPaginas());
    }

    @Test
    public void testGetCopiasDisponiveis() {
        assertEquals(5, livro.getCopiasDisponiveis());
    }

    @Test
    public void testEmprestarComCopiasDisponiveis() {
        livro.emprestar();
        assertEquals(4, livro.getCopiasDisponiveis());
    }

    @Test
    public void testEmprestarSemCopiasDisponiveis() {
        Livro livroSemCopias = new Livro("Livro Teste", "Autor Teste", 100, 0);
        livroSemCopias.emprestar();
        assertEquals(0, livroSemCopias.getCopiasDisponiveis()); // Não deve emprestar
    }

    @Test
    public void testDevolver() {
        livro.emprestar();  // Copias diminuem para 4
        livro.devolver();   // Devolve e volta para 5
        assertEquals(5, livro.getCopiasDisponiveis());
    }

    @Test
    public void testAdicionarCopias() {
        livro.adicionarCopias(3);
        assertEquals(8, livro.getCopiasDisponiveis());
    }

    @Test
    public void testRemoverCopiasComQuantidadeValida() {
        livro.removerCopias(2);
        assertEquals(3, livro.getCopiasDisponiveis());
    }

    @Test
    public void testRemoverCopiasComQuantidadeInvalida() {
        livro.removerCopias(6);  // Tentando remover mais do que disponível
        assertEquals(5, livro.getCopiasDisponiveis());  // Não deve alterar o número de cópias
    }
}
