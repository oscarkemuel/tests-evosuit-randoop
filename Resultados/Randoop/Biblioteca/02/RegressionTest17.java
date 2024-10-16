import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test8501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8501");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        java.lang.String str20 = biblioteca1.getNome();
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        int int23 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro24 = null;
        biblioteca1.removerLivro(livro24);
        imd.Livro livro26 = null;
        biblioteca1.removerLivro(livro26);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
    }

    @Test
    public void test8502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8502");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test8503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8503");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
    }

    @Test
    public void test8504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8504");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test8505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8505");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        java.lang.String str22 = biblioteca1.getNome();
        java.lang.String str23 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test8506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8506");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test8507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8507");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test8508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8508");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test8509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8509");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test8510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8510");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8511");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test8512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8512");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.String str16 = biblioteca1.getNome();
        java.lang.String str17 = biblioteca1.getNome();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int24 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(livro21);
        org.junit.Assert.assertNull(livro23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test8513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8513");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        int int20 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro23 = null;
        biblioteca1.adicionarLivro(livro23);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(livro22);
    }

    @Test
    public void test8514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8514");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        biblioteca1.popularBiblioteca();
        java.lang.String str14 = biblioteca1.getNome();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test8515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8515");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test8516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8516");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8517");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        imd.Livro livro23 = null;
        biblioteca1.removerLivro(livro23);
        boolean boolean26 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test8518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8518");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test8519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8519");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        int int21 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test8520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8520");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str21 = biblioteca1.getNome();
        int int22 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass23 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8521");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test8522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8522");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str20 = biblioteca1.getNome();
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test8523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8523");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test8524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8524");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str16 = biblioteca1.getNome();
        java.lang.String str17 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test8525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8525");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8526");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        imd.Livro livro23 = null;
        biblioteca1.removerLivro(livro23);
        imd.Livro livro26 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro29 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertNull(livro26);
        org.junit.Assert.assertNull(livro29);
    }

    @Test
    public void test8527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8527");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str16 = biblioteca1.getNome();
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        java.lang.String str20 = biblioteca1.getNome();
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        int int23 = biblioteca1.getQuantidadeLivros();
        java.lang.String str24 = biblioteca1.getNome();
        imd.Livro livro25 = null;
        biblioteca1.removerLivro(livro25);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test8528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8528");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        int int2 = biblioteca1.getQuantidadeLivros();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test8529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8529");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        biblioteca1.popularBiblioteca();
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro21);
    }

    @Test
    public void test8530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8530");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test8531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8531");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.String str16 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test8532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8532");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int5 = biblioteca1.getQuantidadeLivros();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str11 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test8533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8533");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str17 = biblioteca1.getNome();
        int int18 = biblioteca1.getQuantidadeLivros();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        biblioteca1.popularBiblioteca();
        java.lang.String str24 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test8534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8534");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str12 = biblioteca1.getNome();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test8535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8535");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test8536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8536");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str15 = biblioteca1.getNome();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str20 = biblioteca1.getNome();
        boolean boolean22 = biblioteca1.verificarDisponibilidade("");
        int int23 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test8537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8537");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro23 = null;
        biblioteca1.adicionarLivro(livro23);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertNull(livro22);
    }

    @Test
    public void test8538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8538");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        int int15 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test8539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8539");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str18 = biblioteca1.getNome();
        int int19 = biblioteca1.getQuantidadeLivros();
        java.lang.String str20 = biblioteca1.getNome();
        boolean boolean22 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean26 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(livro24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test8540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8540");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test8541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8541");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int15 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test8542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8542");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        int int20 = biblioteca1.getQuantidadeLivros();
        java.lang.String str21 = biblioteca1.getNome();
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        java.lang.Class<?> wildcardClass24 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8543");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str20 = biblioteca1.getNome();
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test8544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8544");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str14 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str18 = biblioteca1.getNome();
        java.lang.String str19 = biblioteca1.getNome();
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test8545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8545");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        int int18 = biblioteca1.getQuantidadeLivros();
        int int19 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test8546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8546");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        int int18 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test8547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8547");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        int int15 = biblioteca1.getQuantidadeLivros();
        int int16 = biblioteca1.getQuantidadeLivros();
        java.lang.String str17 = biblioteca1.getNome();
        java.lang.String str18 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8548");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        java.lang.String str20 = biblioteca1.getNome();
        int int21 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str24 = biblioteca1.getNome();
        imd.Livro livro25 = null;
        biblioteca1.removerLivro(livro25);
        java.lang.String str27 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNull(livro23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test8549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8549");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test8550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8550");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.String str16 = biblioteca1.getNome();
        int int17 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test8551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8551");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test8552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8552");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8553");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str17 = biblioteca1.getNome();
        int int18 = biblioteca1.getQuantidadeLivros();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        biblioteca1.popularBiblioteca();
        int int24 = biblioteca1.getQuantidadeLivros();
        java.lang.String str25 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test8554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8554");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test8555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8555");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.String str13 = biblioteca1.getNome();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test8556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8556");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test8557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8557");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str14 = biblioteca1.getNome();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str17 = biblioteca1.getNome();
        int int18 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8558");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str21 = biblioteca1.getNome();
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test8559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8559");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        java.lang.String str16 = biblioteca1.getNome();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test8560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8560");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str16 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test8561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8561");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test8562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8562");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test8563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8563");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        boolean boolean22 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean24 = biblioteca1.verificarDisponibilidade("");
        int int25 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
    }

    @Test
    public void test8564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8564");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8565");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        biblioteca1.popularBiblioteca();
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test8566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8566");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test8567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8567");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        int int16 = biblioteca1.getQuantidadeLivros();
        java.lang.String str17 = biblioteca1.getNome();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str20 = biblioteca1.getNome();
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test8568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8568");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        boolean boolean25 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro27 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int28 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro32 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(livro27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(livro32);
    }

    @Test
    public void test8569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8569");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str16 = biblioteca1.getNome();
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test8570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8570");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int19 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test8571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8571");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str19 = biblioteca1.getNome();
        int int20 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.Class<?> wildcardClass23 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(livro22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8572");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str14 = biblioteca1.getNome();
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        biblioteca1.popularBiblioteca();
        imd.Livro livro23 = null;
        biblioteca1.adicionarLivro(livro23);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test8573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8573");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8574");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        imd.Livro livro23 = null;
        biblioteca1.removerLivro(livro23);
        imd.Livro livro26 = biblioteca1.buscarLivroPorTitulo("");
        int int27 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro29 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int30 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertNull(livro26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNull(livro29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test8575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8575");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8576");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8577");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test8578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8578");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int15 = biblioteca1.getQuantidadeLivros();
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        int int19 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test8579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8579");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8580");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        int int15 = biblioteca1.getQuantidadeLivros();
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test8581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8581");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        int int21 = biblioteca1.getQuantidadeLivros();
        java.lang.String str22 = biblioteca1.getNome();
        imd.Livro livro23 = null;
        biblioteca1.removerLivro(livro23);
        imd.Livro livro26 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean28 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(livro26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test8582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8582");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test8583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8583");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        biblioteca1.popularBiblioteca();
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        java.lang.String str21 = biblioteca1.getNome();
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test8584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8584");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int18 = biblioteca1.getQuantidadeLivros();
        int int19 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test8585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8585");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.String str14 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test8586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8586");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        java.lang.String str20 = biblioteca1.getNome();
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test8587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8587");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test8588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8588");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test8589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8589");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        int int20 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test8590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8590");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8591");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str19 = biblioteca1.getNome();
        java.lang.String str20 = biblioteca1.getNome();
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test8592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8592");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str19 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test8593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8593");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test8594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8594");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str20 = biblioteca1.getNome();
        java.lang.String str21 = biblioteca1.getNome();
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        biblioteca1.popularBiblioteca();
        imd.Livro livro26 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str27 = biblioteca1.getNome();
        java.lang.String str28 = biblioteca1.getNome();
        imd.Livro livro29 = null;
        biblioteca1.adicionarLivro(livro29);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(livro26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test8595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8595");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
    }

    @Test
    public void test8596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8596");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8597");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test8598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8598");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.String str13 = biblioteca1.getNome();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        biblioteca1.popularBiblioteca();
        int int19 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(livro21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8599");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str14 = biblioteca1.getNome();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str21 = biblioteca1.getNome();
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test8600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8600");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test8601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8601");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        biblioteca1.popularBiblioteca();
        int int15 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
    }

    @Test
    public void test8602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8602");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8603");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str17 = biblioteca1.getNome();
        int int18 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass23 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8604");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test8605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8605");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int14 = biblioteca1.getQuantidadeLivros();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str17 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test8606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8606");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test8607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8607");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8608");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test8609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8609");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test8610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8610");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test8611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8611");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test8612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8612");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test8613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8613");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        int int5 = biblioteca1.getQuantidadeLivros();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test8614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8614");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test8615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8615");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test8616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8616");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test8617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8617");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        boolean boolean22 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test8618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8618");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        int int23 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro24 = null;
        biblioteca1.adicionarLivro(livro24);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test8619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8619");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test8620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8620");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(livro11);
    }

    @Test
    public void test8621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8621");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test8622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8622");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str13 = biblioteca1.getNome();
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.String str16 = biblioteca1.getNome();
        java.lang.String str17 = biblioteca1.getNome();
        java.lang.String str18 = biblioteca1.getNome();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test8623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8623");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        java.lang.String str22 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test8624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8624");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test8625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8625");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean22 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test8626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8626");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int17 = biblioteca1.getQuantidadeLivros();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test8627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8627");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str19 = biblioteca1.getNome();
        int int20 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean24 = biblioteca1.verificarDisponibilidade("hi!");
        int int25 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass26 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(livro22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8628");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro7);
    }

    @Test
    public void test8629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8629");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test8630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8630");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8631");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test8632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8632");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test8633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8633");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8634");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int9 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test8635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8635");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test8636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8636");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test8637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8637");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test8638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8638");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertNull(livro23);
    }

    @Test
    public void test8639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8639");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean22 = biblioteca1.verificarDisponibilidade("hi!");
        int int23 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test8640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8640");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        biblioteca1.popularBiblioteca();
        int int18 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test8641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8641");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test8642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8642");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test8643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8643");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8644");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str15 = biblioteca1.getNome();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        int int18 = biblioteca1.getQuantidadeLivros();
        int int19 = biblioteca1.getQuantidadeLivros();
        int int20 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test8645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8645");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8646");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int18 = biblioteca1.getQuantidadeLivros();
        java.lang.String str19 = biblioteca1.getNome();
        int int20 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        imd.Livro livro23 = null;
        biblioteca1.removerLivro(livro23);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test8647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8647");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test8648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8648");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test8649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8649");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test8650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8650");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        int int13 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test8651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8651");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test8652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8652");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str16 = biblioteca1.getNome();
        java.lang.String str17 = biblioteca1.getNome();
        int int18 = biblioteca1.getQuantidadeLivros();
        int int19 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test8653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8653");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test8654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8654");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        int int16 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        boolean boolean23 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro25 = biblioteca1.buscarLivroPorTitulo("");
        int int26 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro27 = null;
        biblioteca1.adicionarLivro(livro27);
        biblioteca1.popularBiblioteca();
        java.lang.String str30 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(livro25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test8655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8655");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test8656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8656");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test8657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8657");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        java.lang.String str21 = biblioteca1.getNome();
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test8658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8658");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test8659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8659");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str16 = biblioteca1.getNome();
        java.lang.String str17 = biblioteca1.getNome();
        int int18 = biblioteca1.getQuantidadeLivros();
        java.lang.String str19 = biblioteca1.getNome();
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean23 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str24 = biblioteca1.getNome();
        java.lang.String str25 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test8660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8660");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test8661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8661");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        biblioteca1.popularBiblioteca();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test8662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8662");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test8663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8663");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        biblioteca1.popularBiblioteca();
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        imd.Livro livro23 = null;
        biblioteca1.adicionarLivro(livro23);
        imd.Livro livro25 = null;
        biblioteca1.adicionarLivro(livro25);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8664");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test8665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8665");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro25 = null;
        biblioteca1.adicionarLivro(livro25);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(livro22);
        org.junit.Assert.assertNull(livro24);
    }

    @Test
    public void test8666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8666");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test8667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8667");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        int int17 = biblioteca1.getQuantidadeLivros();
        java.lang.String str18 = biblioteca1.getNome();
        int int19 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test8668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8668");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test8669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8669");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        boolean boolean23 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str25 = biblioteca1.getNome();
        int int26 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test8670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8670");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str20 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test8671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8671");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        java.lang.String str6 = biblioteca1.getNome();
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test8672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8672");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        biblioteca1.popularBiblioteca();
        int int13 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test8673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8673");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        biblioteca1.popularBiblioteca();
        boolean boolean24 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro25 = null;
        biblioteca1.adicionarLivro(livro25);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test8674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8674");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8675");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        biblioteca1.popularBiblioteca();
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test8676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8676");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8677");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test8678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8678");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
    }

    @Test
    public void test8679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8679");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
    }

    @Test
    public void test8680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8680");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str15 = biblioteca1.getNome();
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test8681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8681");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test8682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8682");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass23 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8683");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        java.lang.String str23 = biblioteca1.getNome();
        imd.Livro livro25 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(livro25);
    }

    @Test
    public void test8684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8684");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test8685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8685");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test8686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8686");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        java.lang.String str17 = biblioteca1.getNome();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8687");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(livro9);
    }

    @Test
    public void test8688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8688");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        boolean boolean22 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro23 = null;
        biblioteca1.removerLivro(livro23);
        biblioteca1.popularBiblioteca();
        imd.Livro livro27 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(livro27);
    }

    @Test
    public void test8689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8689");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.String str14 = biblioteca1.getNome();
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8690");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test8691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8691");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int15 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test8692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8692");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        java.lang.String str6 = biblioteca1.getNome();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test8693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8693");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8694");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test8695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8695");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        java.lang.String str21 = biblioteca1.getNome();
        java.lang.String str22 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test8696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8696");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int15 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test8697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8697");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        java.lang.String str2 = biblioteca1.getNome();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test8698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8698");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        int int21 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test8699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8699");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        biblioteca1.popularBiblioteca();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test8700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8700");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test8701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8701");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test8702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8702");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test8703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8703");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        int int15 = biblioteca1.getQuantidadeLivros();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        int int18 = biblioteca1.getQuantidadeLivros();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str21 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test8704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8704");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8705");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test8706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8706");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str14 = biblioteca1.getNome();
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test8707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8707");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int20 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        boolean boolean25 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro26 = null;
        biblioteca1.removerLivro(livro26);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNull(livro22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test8708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8708");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8709");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int16 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test8710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8710");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test8711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8711");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8712");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int13 = biblioteca1.getQuantidadeLivros();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test8713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8713");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8714");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test8715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8715");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8716");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        int int15 = biblioteca1.getQuantidadeLivros();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        int int18 = biblioteca1.getQuantidadeLivros();
        java.lang.String str19 = biblioteca1.getNome();
        java.lang.String str20 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean23 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test8717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8717");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test8718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8718");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str12 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test8719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8719");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int13 = biblioteca1.getQuantidadeLivros();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        int int21 = biblioteca1.getQuantidadeLivros();
        java.lang.String str22 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test8720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8720");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.String str14 = biblioteca1.getNome();
        java.lang.String str15 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8721");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str19 = biblioteca1.getNome();
        java.lang.String str20 = biblioteca1.getNome();
        java.lang.String str21 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test8722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8722");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro11);
    }

    @Test
    public void test8723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8723");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str17 = biblioteca1.getNome();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str20 = biblioteca1.getNome();
        int int21 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test8724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8724");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test8725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8725");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = livro12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test8726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8726");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        int int13 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
    }

    @Test
    public void test8727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8727");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        boolean boolean22 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str23 = biblioteca1.getNome();
        int int24 = biblioteca1.getQuantidadeLivros();
        java.lang.String str25 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test8728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8728");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str19 = biblioteca1.getNome();
        int int20 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean24 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str25 = biblioteca1.getNome();
        imd.Livro livro26 = null;
        biblioteca1.removerLivro(livro26);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(livro22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test8729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8729");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test8730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8730");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test8731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8731");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test8732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8732");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        java.lang.Class<?> wildcardClass23 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8733");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8734");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        boolean boolean23 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test8735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8735");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8736");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str15 = biblioteca1.getNome();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8737");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
    }

    @Test
    public void test8738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8738");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str20 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8739");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str6 = biblioteca1.getNome();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test8740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8740");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
        int int22 = biblioteca1.getQuantidadeLivros();
        int int23 = biblioteca1.getQuantidadeLivros();
        boolean boolean25 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean27 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass28 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test8741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8741");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8742");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8743");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        imd.Livro livro24 = null;
        biblioteca1.removerLivro(livro24);
        java.lang.String str26 = biblioteca1.getNome();
        int int27 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro28 = null;
        biblioteca1.removerLivro(livro28);
        imd.Livro livro30 = null;
        biblioteca1.adicionarLivro(livro30);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
    }

    @Test
    public void test8744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8744");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test8745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8745");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test8746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8746");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test8747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8747");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int21 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str23 = biblioteca1.getNome();
        imd.Livro livro25 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(livro25);
    }

    @Test
    public void test8748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8748");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8749");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int15 = biblioteca1.getQuantidadeLivros();
        java.lang.String str16 = biblioteca1.getNome();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertNull(livro22);
    }

    @Test
    public void test8750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8750");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test8751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8751");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
    }

    @Test
    public void test8752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8752");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test8753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8753");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test8754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8754");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        int int16 = biblioteca1.getQuantidadeLivros();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int20 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test8755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8755");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test8756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8756");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str12 = biblioteca1.getNome();
        int int13 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test8757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8757");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test8758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8758");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        biblioteca1.popularBiblioteca();
        boolean boolean23 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean26 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str27 = biblioteca1.getNome();
        int int28 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
    }

    @Test
    public void test8759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8759");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        biblioteca1.popularBiblioteca();
        java.lang.String str21 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8760");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        int int5 = biblioteca1.getQuantidadeLivros();
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test8761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8761");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str14 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test8762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8762");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        biblioteca1.popularBiblioteca();
        int int15 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test8763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8763");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test8764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8764");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8765");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        java.lang.String str20 = biblioteca1.getNome();
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test8766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8766");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test8767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8767");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test8768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8768");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test8769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8769");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean22 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str23 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test8770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8770");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
    }

    @Test
    public void test8771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8771");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        biblioteca1.popularBiblioteca();
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro23 = null;
        biblioteca1.removerLivro(livro23);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test8772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8772");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        int int5 = biblioteca1.getQuantidadeLivros();
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str12 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test8773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8773");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8774");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test8775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8775");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        biblioteca1.popularBiblioteca();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test8776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8776");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8777");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test8778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8778");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8779");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        int int22 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNull(livro24);
    }

    @Test
    public void test8780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8780");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = livro23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertNull(livro23);
    }

    @Test
    public void test8781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8781");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test8782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8782");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str14 = biblioteca1.getNome();
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test8783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8783");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test8784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8784");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test8785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8785");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test8786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8786");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test8787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8787");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test8788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8788");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        java.lang.String str15 = biblioteca1.getNome();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8789");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test8790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8790");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test8791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8791");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8792");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8793");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test8794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8794");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test8795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8795");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test8796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8796");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8797");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        biblioteca1.popularBiblioteca();
        java.lang.String str14 = biblioteca1.getNome();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int19 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test8798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8798");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test8799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8799");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        int int15 = biblioteca1.getQuantidadeLivros();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8800");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        int int22 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass23 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8801");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test8802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8802");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str12 = biblioteca1.getNome();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8803");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        int int16 = biblioteca1.getQuantidadeLivros();
        java.lang.String str17 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test8804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8804");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.String str14 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8805");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = livro16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test8806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8806");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test8807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8807");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test8808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8808");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8809");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        imd.Livro livro23 = null;
        biblioteca1.removerLivro(livro23);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test8810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8810");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        int int15 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test8811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8811");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test8812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8812");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        java.lang.String str12 = biblioteca1.getNome();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8813");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8814");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro23 = null;
        biblioteca1.adicionarLivro(livro23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test8815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8815");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro11);
    }

    @Test
    public void test8816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8816");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro11);
    }

    @Test
    public void test8817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8817");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test8818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8818");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        int int18 = biblioteca1.getQuantidadeLivros();
        java.lang.String str19 = biblioteca1.getNome();
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str22 = biblioteca1.getNome();
        imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(livro24);
    }

    @Test
    public void test8819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8819");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        int int16 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNull(livro23);
    }

    @Test
    public void test8820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8820");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        int int20 = biblioteca1.getQuantidadeLivros();
        boolean boolean22 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(livro24);
    }

    @Test
    public void test8821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8821");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test8822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8822");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test8823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8823");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test8824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8824");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        biblioteca1.popularBiblioteca();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test8825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8825");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.String str13 = biblioteca1.getNome();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str16 = biblioteca1.getNome();
        java.lang.String str17 = biblioteca1.getNome();
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test8826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8826");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str17 = biblioteca1.getNome();
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test8827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8827");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test8828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8828");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8829");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test8830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8830");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str16 = biblioteca1.getNome();
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test8831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8831");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        java.lang.String str2 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8832");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        biblioteca1.popularBiblioteca();
        java.lang.String str17 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str19 = biblioteca1.getNome();
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
        int int22 = biblioteca1.getQuantidadeLivros();
        int int23 = biblioteca1.getQuantidadeLivros();
        int int24 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test8833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8833");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test8834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8834");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        biblioteca1.popularBiblioteca();
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro25 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        boolean boolean28 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertNull(livro21);
        org.junit.Assert.assertNull(livro23);
        org.junit.Assert.assertNull(livro25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test8835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8835");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8836");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test8837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8837");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str18 = biblioteca1.getNome();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test8838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8838");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8839");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test8840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8840");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test8841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8841");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        int int5 = biblioteca1.getQuantidadeLivros();
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8842");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str21 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test8843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8843");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test8844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8844");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str22 = biblioteca1.getNome();
        boolean boolean24 = biblioteca1.verificarDisponibilidade("");
        int int25 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro26 = null;
        biblioteca1.adicionarLivro(livro26);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(livro21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test8845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8845");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test8846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8846");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        boolean boolean22 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro23 = null;
        biblioteca1.adicionarLivro(livro23);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test8847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8847");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test8848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8848");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test8849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8849");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str17 = biblioteca1.getNome();
        int int18 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8850");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        java.lang.String str20 = biblioteca1.getNome();
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        imd.Livro livro23 = null;
        biblioteca1.removerLivro(livro23);
        imd.Livro livro25 = null;
        biblioteca1.removerLivro(livro25);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test8851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8851");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test8852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8852");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test8853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8853");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str6 = biblioteca1.getNome();
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test8854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8854");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8855");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8856");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        int int14 = biblioteca1.getQuantidadeLivros();
        int int15 = biblioteca1.getQuantidadeLivros();
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test8857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8857");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test8858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8858");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test8859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8859");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str16 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        java.lang.String str21 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12 + "'", int20 == 12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test8860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8860");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.String str14 = biblioteca1.getNome();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8861");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        int int15 = biblioteca1.getQuantidadeLivros();
        java.lang.String str16 = biblioteca1.getNome();
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test8862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8862");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str22 = biblioteca1.getNome();
        imd.Livro livro23 = null;
        biblioteca1.adicionarLivro(livro23);
        imd.Livro livro25 = null;
        biblioteca1.removerLivro(livro25);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(livro21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test8863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8863");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8864");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str15 = biblioteca1.getNome();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str20 = biblioteca1.getNome();
        boolean boolean22 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test8865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8865");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test8866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8866");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str21 = biblioteca1.getNome();
        java.lang.String str22 = biblioteca1.getNome();
        int int23 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test8867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8867");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str14 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        int int19 = biblioteca1.getQuantidadeLivros();
        int int20 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test8868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8868");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test8869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8869");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test8870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8870");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        int int15 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test8871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8871");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str13 = biblioteca1.getNome();
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.String str16 = biblioteca1.getNome();
        java.lang.String str17 = biblioteca1.getNome();
        java.lang.String str18 = biblioteca1.getNome();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str21 = biblioteca1.getNome();
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(livro23);
    }

    @Test
    public void test8872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8872");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8873");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str20 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test8874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8874");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        biblioteca1.popularBiblioteca();
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        java.lang.String str23 = biblioteca1.getNome();
        imd.Livro livro24 = null;
        biblioteca1.adicionarLivro(livro24);
        java.lang.String str26 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test8875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8875");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        int int17 = biblioteca1.getQuantidadeLivros();
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test8876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8876");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test8877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8877");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test8878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8878");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8879");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test8880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8880");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        boolean boolean22 = biblioteca1.verificarDisponibilidade("");
        boolean boolean24 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro26 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(livro26);
    }

    @Test
    public void test8881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8881");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test8882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8882");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str12 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test8883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8883");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str20 = biblioteca1.getNome();
        boolean boolean22 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro25 = null;
        biblioteca1.adicionarLivro(livro25);
        java.lang.Class<?> wildcardClass27 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(livro24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8884");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8885");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test8886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8886");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test8887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8887");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test8888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8888");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str16 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test8889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8889");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.String str16 = biblioteca1.getNome();
        java.lang.String str17 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test8890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8890");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str6 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str13 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8891");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test8892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8892");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        int int16 = biblioteca1.getQuantidadeLivros();
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test8893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8893");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.String str14 = biblioteca1.getNome();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        int int17 = biblioteca1.getQuantidadeLivros();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
        boolean boolean23 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test8894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8894");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str19 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str21 = biblioteca1.getNome();
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(livro23);
    }

    @Test
    public void test8895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8895");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test8896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8896");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8897");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test8898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8898");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        boolean boolean25 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro27 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int28 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass29 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(livro27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8899");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str17 = biblioteca1.getNome();
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        int int20 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test8900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8900");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test8901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8901");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        java.lang.String str20 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test8902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8902");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        java.lang.String str2 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(livro6);
    }

    @Test
    public void test8903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8903");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test8904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8904");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test8905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8905");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test8906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8906");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test8907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8907");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str22 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(livro21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test8908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8908");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test8909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8909");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        biblioteca1.popularBiblioteca();
        imd.Livro livro23 = null;
        biblioteca1.adicionarLivro(livro23);
        imd.Livro livro25 = null;
        biblioteca1.removerLivro(livro25);
        int int27 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test8910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8910");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        java.lang.Class<?> wildcardClass24 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8911");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test8912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8912");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro8);
    }

    @Test
    public void test8913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8913");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        java.lang.String str21 = biblioteca1.getNome();
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        java.lang.String str24 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test8914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8914");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str14 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str17 = biblioteca1.getNome();
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        java.lang.String str20 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test8915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8915");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        java.lang.String str22 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test8916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8916");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test8917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8917");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        biblioteca1.popularBiblioteca();
        int int22 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro25 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNull(livro25);
    }

    @Test
    public void test8918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8918");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test8919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8919");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test8920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8920");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test8921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8921");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test8922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8922");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test8923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8923");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
    }

    @Test
    public void test8924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8924");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(livro23);
    }

    @Test
    public void test8925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8925");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        biblioteca1.popularBiblioteca();
        java.lang.String str15 = biblioteca1.getNome();
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test8926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8926");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        int int5 = biblioteca1.getQuantidadeLivros();
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test8927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8927");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test8928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8928");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test8929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8929");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test8930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8930");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        java.lang.String str23 = biblioteca1.getNome();
        imd.Livro livro24 = null;
        biblioteca1.removerLivro(livro24);
        java.lang.String str26 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test8931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8931");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test8932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8932");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test8933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8933");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test8934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8934");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str18 = biblioteca1.getNome();
        int int19 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8935");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test8936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8936");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test8937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8937");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test8938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8938");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        biblioteca1.popularBiblioteca();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test8939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8939");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str17 = biblioteca1.getNome();
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test8940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8940");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test8941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8941");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str14 = biblioteca1.getNome();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8942");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str18 = biblioteca1.getNome();
        int int19 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test8943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8943");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test8944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8944");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        int int17 = biblioteca1.getQuantidadeLivros();
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test8945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8945");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        int int23 = biblioteca1.getQuantidadeLivros();
        java.lang.String str24 = biblioteca1.getNome();
        java.lang.String str25 = biblioteca1.getNome();
        boolean boolean27 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro29 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(livro29);
    }

    @Test
    public void test8946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8946");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertNull(livro21);
    }

    @Test
    public void test8947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8947");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test8948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8948");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        int int5 = biblioteca1.getQuantidadeLivros();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test8949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8949");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int13 = biblioteca1.getQuantidadeLivros();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        biblioteca1.popularBiblioteca();
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8950");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test8951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8951");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        biblioteca1.popularBiblioteca();
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test8952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8952");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8953");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test8954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8954");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test8955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8955");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test8956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8956");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test8957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8957");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8958");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
        int int22 = biblioteca1.getQuantidadeLivros();
        int int23 = biblioteca1.getQuantidadeLivros();
        boolean boolean25 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean27 = biblioteca1.verificarDisponibilidade("");
        boolean boolean29 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test8959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8959");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test8960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8960");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test8961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8961");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test8962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8962");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8963");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test8964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8964");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test8965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8965");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        biblioteca1.popularBiblioteca();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8966");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test8967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8967");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.String str16 = biblioteca1.getNome();
        java.lang.String str17 = biblioteca1.getNome();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("");
        int int22 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass23 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(livro21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8968");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test8969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8969");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str6 = biblioteca1.getNome();
        int int7 = biblioteca1.getQuantidadeLivros();
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test8970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8970");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.String str13 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8971");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        int int20 = biblioteca1.getQuantidadeLivros();
        java.lang.String str21 = biblioteca1.getNome();
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        imd.Livro livro24 = null;
        biblioteca1.removerLivro(livro24);
        boolean boolean27 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass28 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test8972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8972");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test8973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8973");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test8974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8974");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test8975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8975");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8976");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str6 = biblioteca1.getNome();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test8977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8977");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        int int21 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test8978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8978");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        java.lang.String str15 = biblioteca1.getNome();
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str21 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8979");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro9);
    }

    @Test
    public void test8980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8980");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8981");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test8982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8982");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str13 = biblioteca1.getNome();
        int int14 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int16 = biblioteca1.getQuantidadeLivros();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        int int19 = biblioteca1.getQuantidadeLivros();
        int int20 = biblioteca1.getQuantidadeLivros();
        boolean boolean22 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test8983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8983");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test8984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8984");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro25 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test8985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8985");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str16 = biblioteca1.getNome();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test8986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8986");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(livro9);
    }

    @Test
    public void test8987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8987");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str15 = biblioteca1.getNome();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test8988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8988");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8989");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test8990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8990");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int13 = biblioteca1.getQuantidadeLivros();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8991");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str19 = biblioteca1.getNome();
        int int20 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test8992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8992");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test8993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8993");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        biblioteca1.popularBiblioteca();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        imd.Livro livro23 = null;
        biblioteca1.adicionarLivro(livro23);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test8994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8994");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test8995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8995");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str20 = biblioteca1.getNome();
        int int21 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro24 = null;
        biblioteca1.removerLivro(livro24);
        int int26 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass27 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(livro23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8996");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro24 = null;
        biblioteca1.removerLivro(livro24);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(livro21);
        org.junit.Assert.assertNull(livro23);
    }

    @Test
    public void test8997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8997");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test8998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8998");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8999");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro26 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(livro24);
        org.junit.Assert.assertNull(livro26);
    }

    @Test
    public void test9000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test9000");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNull(livro15);
    }
}

