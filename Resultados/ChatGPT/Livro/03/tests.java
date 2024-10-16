import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    private Livro livro;

    @BeforeEach
    public void setUp() {
        // Inicializando um objeto Livro antes de cada teste
        livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1000, 5);
    }

    @Test
    public void testGetTitulo() {
        assertEquals("O Senhor dos Anéis", livro.getTitulo(), "O título não corresponde ao esperado.");
    }

    @Test
    public void testGetAutor() {
        assertEquals("J.R.R. Tolkien", livro.getAutor(), "O autor não corresponde ao esperado.");
    }

    @Test
    public void testGetPaginas() {
        assertEquals(1000, livro.getPaginas(), "O número de páginas não corresponde ao esperado.");
    }

    @Test
    public void testGetCopiasDisponiveis() {
        assertEquals(5, livro.getCopiasDisponiveis(), "O número de cópias disponíveis não corresponde ao esperado.");
    }

    @Test
    public void testEmprestarLivroDisponivel() {
        livro.emprestar();
        assertEquals(4, livro.getCopiasDisponiveis(), "O número de cópias disponíveis após o empréstimo não corresponde ao esperado.");
    }

    @Test
    public void testEmprestarLivroSemCopiasDisponiveis() {
        Livro livroSemCopias = new Livro("O Hobbit", "J.R.R. Tolkien", 300, 0);
        livroSemCopias.emprestar();
        assertEquals(0, livroSemCopias.getCopiasDisponiveis(), "O número de cópias disponíveis deve ser 0 ao tentar emprestar um livro sem cópias.");
    }

    @Test
    public void testDevolverLivro() {
        livro.emprestar();
        livro.devolver();
        assertEquals(5, livro.getCopiasDisponiveis(), "O número de cópias disponíveis após devolução não corresponde ao esperado.");
    }

    @Test
    public void testAdicionarCopias() {
        livro.adicionarCopias(3);
        assertEquals(8, livro.getCopiasDisponiveis(), "O número de cópias disponíveis após adicionar não corresponde ao esperado.");
    }

    @Test
    public void testRemoverCopiasSuficiente() {
        livro.removerCopias(2);
        assertEquals(3, livro.getCopiasDisponiveis(), "O número de cópias disponíveis após remover não corresponde ao esperado.");
    }

    @Test
    public void testRemoverCopiasExcedente() {
        livro.removerCopias(10);  // Tentando remover mais cópias do que disponíveis
        assertEquals(5, livro.getCopiasDisponiveis(), "O número de cópias disponíveis não deve mudar se a quantidade a remover for maior que as cópias disponíveis.");
    }
}
