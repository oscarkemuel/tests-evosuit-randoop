import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        int int12 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str15 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.String str16 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.Class<?> wildcardClass4 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        biblioteca1.popularBiblioteca();
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = livro18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass23 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        int int19 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        java.lang.String str20 = biblioteca1.getNome();
        java.lang.String str21 = biblioteca1.getNome();
        int int22 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean25 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.String str14 = biblioteca1.getNome();
        int int15 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        java.lang.String str2 = biblioteca1.getNome();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        int int5 = biblioteca1.getQuantidadeLivros();
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = livro10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        java.lang.String str20 = biblioteca1.getNome();
        java.lang.String str21 = biblioteca1.getNome();
        int int22 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass24 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = livro12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro8);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass25 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        biblioteca1.popularBiblioteca();
        java.lang.String str12 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.String str14 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.Class<?> wildcardClass8 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int24 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(livro23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        java.lang.String str6 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        int int14 = biblioteca1.getQuantidadeLivros();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        int int18 = biblioteca1.getQuantidadeLivros();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.String str13 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.String str16 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str12 = biblioteca1.getNome();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        int int21 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        java.lang.String str2 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.Class<?> wildcardClass7 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        biblioteca1.popularBiblioteca();
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro23 = null;
        biblioteca1.adicionarLivro(livro23);
        java.lang.Class<?> wildcardClass25 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str16 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        int int14 = biblioteca1.getQuantidadeLivros();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        java.lang.String str6 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass7 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        java.lang.String str2 = biblioteca1.getNome();
        int int3 = biblioteca1.getQuantidadeLivros();
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNull(livro11);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        java.lang.String str2 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(livro21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        int int15 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        int int14 = biblioteca1.getQuantidadeLivros();
        int int15 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        biblioteca1.popularBiblioteca();
        java.lang.String str22 = biblioteca1.getNome();
        java.lang.String str23 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        biblioteca1.popularBiblioteca();
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        int int16 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        java.lang.String str6 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass10 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        java.lang.String str20 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str19 = biblioteca1.getNome();
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        int int22 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNull(livro24);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        java.lang.Class<?> wildcardClass7 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        int int15 = biblioteca1.getQuantidadeLivros();
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 13 + "'", int11 == 13);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = livro13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str21 = biblioteca1.getNome();
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro25 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.Class<?> wildcardClass8 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        java.lang.String str15 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 13 + "'", int11 == 13);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int13 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        java.lang.String str12 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        biblioteca1.popularBiblioteca();
        int int20 = biblioteca1.getQuantidadeLivros();
        boolean boolean22 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass10 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.String str13 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        boolean boolean25 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        java.lang.Class<?> wildcardClass24 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("");
        int int24 = biblioteca1.getQuantidadeLivros();
        java.lang.String str25 = biblioteca1.getNome();
        imd.Livro livro26 = null;
        biblioteca1.adicionarLivro(livro26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(livro23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro8);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        java.lang.String str17 = biblioteca1.getNome();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean24 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro25 = null;
        biblioteca1.adicionarLivro(livro25);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(livro22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str17 = biblioteca1.getNome();
        java.lang.String str18 = biblioteca1.getNome();
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        int int24 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.Class<?> wildcardClass10 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = livro16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro24 = null;
        biblioteca1.removerLivro(livro24);
        java.lang.Class<?> wildcardClass26 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(livro21);
        org.junit.Assert.assertNull(livro23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass10 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str19 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass8 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        java.lang.String str12 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.String str14 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str17 = biblioteca1.getNome();
        java.lang.String str18 = biblioteca1.getNome();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        java.lang.String str21 = biblioteca1.getNome();
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        imd.Livro livro24 = null;
        biblioteca1.adicionarLivro(livro24);
        imd.Livro livro26 = null;
        biblioteca1.removerLivro(livro26);
        imd.Livro livro28 = null;
        biblioteca1.adicionarLivro(livro28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = livro17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str20 = biblioteca1.getNome();
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        imd.Livro livro23 = null;
        biblioteca1.removerLivro(livro23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        java.lang.String str2 = biblioteca1.getNome();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro8);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        java.lang.String str6 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.String str13 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        biblioteca1.popularBiblioteca();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro8);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str14 = biblioteca1.getNome();
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        java.lang.String str6 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.Class<?> wildcardClass7 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        int int19 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.String str13 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = livro15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        biblioteca1.popularBiblioteca();
        int int15 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14 + "'", int15 == 14);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str19 = biblioteca1.getNome();
        java.lang.String str20 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro23 = null;
        biblioteca1.adicionarLivro(livro23);
        imd.Livro livro25 = null;
        biblioteca1.adicionarLivro(livro25);
        imd.Livro livro27 = null;
        biblioteca1.removerLivro(livro27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro22);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        java.lang.String str6 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        int int15 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        int int15 = biblioteca1.getQuantidadeLivros();
        java.lang.String str16 = biblioteca1.getNome();
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        int int17 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str17 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        biblioteca1.popularBiblioteca();
        java.lang.String str12 = biblioteca1.getNome();
        int int13 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("");
        int int24 = biblioteca1.getQuantidadeLivros();
        java.lang.String str25 = biblioteca1.getNome();
        int int26 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(livro23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        java.lang.String str21 = biblioteca1.getNome();
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        imd.Livro livro24 = null;
        biblioteca1.adicionarLivro(livro24);
        java.lang.String str26 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass27 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int17 = biblioteca1.getQuantidadeLivros();
        int int18 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        int int21 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int15 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass7 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        int int18 = biblioteca1.getQuantidadeLivros();
        int int19 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNull(livro21);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass8 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str14 = biblioteca1.getNome();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean22 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro23 = null;
        biblioteca1.adicionarLivro(livro23);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        int int15 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        int int15 = biblioteca1.getQuantidadeLivros();
        java.lang.String str16 = biblioteca1.getNome();
        java.lang.String str17 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("");
        int int22 = biblioteca1.getQuantidadeLivros();
        boolean boolean24 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass25 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNull(livro21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.Class<?> wildcardClass10 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro8);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        java.lang.String str20 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        java.lang.String str17 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int21 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertNull(livro23);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        boolean boolean24 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro26 = biblioteca1.buscarLivroPorTitulo("");
        int int27 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass28 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(livro26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        biblioteca1.popularBiblioteca();
        int int20 = biblioteca1.getQuantidadeLivros();
        java.lang.String str21 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        java.lang.String str12 = biblioteca1.getNome();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str14 = biblioteca1.getNome();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str11 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        java.lang.String str2 = biblioteca1.getNome();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        biblioteca1.popularBiblioteca();
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        biblioteca1.popularBiblioteca();
        imd.Livro livro25 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean27 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro28 = null;
        biblioteca1.removerLivro(livro28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertNull(livro25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str12 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        java.lang.String str2 = biblioteca1.getNome();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str13 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str14 = biblioteca1.getNome();
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        java.lang.String str17 = biblioteca1.getNome();
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.String str13 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int15 = biblioteca1.getQuantidadeLivros();
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass6 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str19 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.String str13 = biblioteca1.getNome();
        int int14 = biblioteca1.getQuantidadeLivros();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass7 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.String str14 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.String str14 = biblioteca1.getNome();
        int int15 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.String str13 = biblioteca1.getNome();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int22 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.String str16 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }
}

