import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
        imd.Livro livro23 = null;
        biblioteca1.adicionarLivro(livro23);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = livro18.getClass();
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
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str23 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(livro22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        int int18 = biblioteca1.getQuantidadeLivros();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        int int13 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        biblioteca1.popularBiblioteca();
        java.lang.String str21 = biblioteca1.getNome();
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.Class<?> wildcardClass24 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(livro23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
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
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        biblioteca1.adicionarLivro(livro17);
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        biblioteca1.popularBiblioteca();
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        java.lang.String str14 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str16 = biblioteca1.getNome();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int17 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str12 = biblioteca1.getNome();
        int int13 = biblioteca1.getQuantidadeLivros();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        int int20 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        int int21 = biblioteca1.getQuantidadeLivros();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        int int13 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro25 = biblioteca1.buscarLivroPorTitulo("hi!");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        java.lang.String str18 = biblioteca1.getNome();
        int int19 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        biblioteca1.popularBiblioteca();
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = livro16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        imd.Livro livro24 = null;
        biblioteca1.adicionarLivro(livro24);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertNull(livro21);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        int int14 = biblioteca1.getQuantidadeLivros();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str16 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        biblioteca1.popularBiblioteca();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        int int19 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        int int18 = biblioteca1.getQuantidadeLivros();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str6 = biblioteca1.getNome();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        boolean boolean24 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str25 = biblioteca1.getNome();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean24 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro26 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int27 = biblioteca1.getQuantidadeLivros();
        boolean boolean29 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean32 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertNull(livro22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(livro26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        biblioteca1.removerLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        java.lang.String str20 = biblioteca1.getNome();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int19 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        biblioteca1.removerLivro(livro14);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        int int23 = biblioteca1.getQuantidadeLivros();
        int int24 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro25 = null;
        biblioteca1.adicionarLivro(livro25);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(livro11);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        java.lang.String str13 = biblioteca1.getNome();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        biblioteca1.removerLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        int int14 = biblioteca1.getQuantidadeLivros();
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int20 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        java.lang.String str2 = biblioteca1.getNome();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        java.lang.String str21 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        int int18 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
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
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        int int21 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int15 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        int int18 = biblioteca1.getQuantidadeLivros();
        int int19 = biblioteca1.getQuantidadeLivros();
        int int20 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
            boolean boolean12 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = biblioteca1.verificarDisponibilidade("");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = biblioteca1.verificarDisponibilidade("");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int16 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        biblioteca1.removerLivro(livro14);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        int int20 = biblioteca1.getQuantidadeLivros();
        int int21 = biblioteca1.getQuantidadeLivros();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean24 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro26 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro27 = null;
        biblioteca1.adicionarLivro(livro27);
        int int29 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = biblioteca1.verificarDisponibilidade("");
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
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertNull(livro22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(livro26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro11);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
        biblioteca1.popularBiblioteca();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        biblioteca1.popularBiblioteca();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str21 = biblioteca1.getNome();
        int int22 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str25 = biblioteca1.getNome();
        imd.Livro livro26 = null;
        biblioteca1.adicionarLivro(livro26);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro29 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNull(livro24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        biblioteca1.adicionarLivro(livro21);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        int int2 = biblioteca1.getQuantidadeLivros();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        java.lang.String str14 = biblioteca1.getNome();
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        biblioteca1.popularBiblioteca();
        java.lang.String str16 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        java.lang.String str15 = biblioteca1.getNome();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
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
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
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
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        java.lang.String str2 = biblioteca1.getNome();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(livro6);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        boolean boolean22 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro25 = null;
        biblioteca1.removerLivro(livro25);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(livro24);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        int int19 = biblioteca1.getQuantidadeLivros();
        java.lang.String str20 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        int int19 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str21 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        java.lang.String str20 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(livro9);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        java.lang.String str2 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass4 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        biblioteca1.popularBiblioteca();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        imd.Livro livro23 = null;
        biblioteca1.removerLivro(livro23);
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
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        biblioteca1.popularBiblioteca();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        int int19 = biblioteca1.getQuantidadeLivros();
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        int int21 = biblioteca1.getQuantidadeLivros();
        java.lang.String str22 = biblioteca1.getNome();
        imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(livro24);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        java.lang.String str17 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean24 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro26 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro27 = null;
        biblioteca1.adicionarLivro(livro27);
        int int29 = biblioteca1.getQuantidadeLivros();
        int int30 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertNull(livro22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(livro26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        int int2 = biblioteca1.getQuantidadeLivros();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
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
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        int int20 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        java.lang.String str20 = biblioteca1.getNome();
        java.lang.String str21 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        biblioteca1.popularBiblioteca();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str21 = biblioteca1.getNome();
        int int22 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str25 = biblioteca1.getNome();
        imd.Livro livro26 = null;
        biblioteca1.removerLivro(livro26);
        imd.Livro livro28 = null;
        biblioteca1.removerLivro(livro28);
        boolean boolean31 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNull(livro24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
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
        java.lang.String str15 = biblioteca1.getNome();
        int int16 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        int int18 = biblioteca1.getQuantidadeLivros();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
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
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        java.lang.String str22 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
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
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str20 = biblioteca1.getNome();
        java.lang.String str21 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
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
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.String str13 = biblioteca1.getNome();
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        int int16 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
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
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        int int13 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
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
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        java.lang.String str6 = biblioteca1.getNome();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
        int int22 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass23 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        int int19 = biblioteca1.getQuantidadeLivros();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
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
        java.lang.Class<?> wildcardClass25 = biblioteca1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
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
        int int17 = biblioteca1.getQuantidadeLivros();
        int int18 = biblioteca1.getQuantidadeLivros();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        boolean boolean22 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro23 = null;
        biblioteca1.removerLivro(livro23);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
        biblioteca1.removerLivro(livro20);
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        java.lang.String str24 = biblioteca1.getNome();
        java.lang.String str25 = biblioteca1.getNome();
        imd.Livro livro27 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str28 = biblioteca1.getNome();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(livro27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
            boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
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
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
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
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        int int2 = biblioteca1.getQuantidadeLivros();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
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
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
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
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        java.lang.String str21 = biblioteca1.getNome();
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        biblioteca1.popularBiblioteca();
        imd.Livro livro25 = null;
        biblioteca1.adicionarLivro(livro25);
        java.lang.String str27 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        biblioteca1.adicionarLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        biblioteca1.popularBiblioteca();
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        java.lang.String str2 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
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
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        int int18 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.String str14 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        biblioteca1.popularBiblioteca();
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str9 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
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
        biblioteca1.removerLivro(livro20);
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        java.lang.String str24 = biblioteca1.getNome();
        imd.Livro livro26 = biblioteca1.buscarLivroPorTitulo("");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(livro26);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
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
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
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
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        biblioteca1.popularBiblioteca();
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
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
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        java.lang.String str21 = biblioteca1.getNome();
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass25 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str13 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
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
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = livro12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
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
        int int22 = biblioteca1.getQuantidadeLivros();
        int int23 = biblioteca1.getQuantidadeLivros();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
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
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("hi!");
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
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = biblioteca1.verificarDisponibilidade("");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
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
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        biblioteca1.popularBiblioteca();
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
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
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        boolean boolean22 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.Class<?> wildcardClass25 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(livro24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        int int22 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
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
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
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
        biblioteca1.adicionarLivro(livro20);
        int int22 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = biblioteca1.verificarDisponibilidade("hi!");
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
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = livro17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
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
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
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
        biblioteca1.popularBiblioteca();
        java.lang.String str17 = biblioteca1.getNome();
        java.lang.String str18 = biblioteca1.getNome();
        int int19 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str12 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
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
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        imd.Livro livro23 = null;
        biblioteca1.removerLivro(livro23);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
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
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
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
        java.lang.String str16 = biblioteca1.getNome();
        java.lang.String str17 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        int int19 = biblioteca1.getQuantidadeLivros();
        int int20 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
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
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        java.lang.String str2 = biblioteca1.getNome();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = biblioteca1.verificarDisponibilidade("");
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
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        int int16 = biblioteca1.getQuantidadeLivros();
        java.lang.String str17 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        int int20 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
        java.lang.Class<?> wildcardClass25 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
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
        java.lang.String str13 = biblioteca1.getNome();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        int int18 = biblioteca1.getQuantidadeLivros();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        java.lang.String str23 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
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
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
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
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str14 = biblioteca1.getNome();
        int int15 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
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
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
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
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
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
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int13 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 12 + "'", int13 == 12);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
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
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str14 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = livro5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(livro5);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
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
        java.lang.String str15 = biblioteca1.getNome();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        java.lang.String str14 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
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
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.String str16 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
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
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        int int14 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro11);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
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
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        java.lang.String str21 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass8 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
        biblioteca1.popularBiblioteca();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str24 = biblioteca1.getNome();
        int int25 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(livro23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
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
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
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
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        java.lang.String str20 = biblioteca1.getNome();
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        java.lang.Class<?> wildcardClass23 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int18 = biblioteca1.getQuantidadeLivros();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str14 = biblioteca1.getNome();
        int int15 = biblioteca1.getQuantidadeLivros();
        java.lang.String str16 = biblioteca1.getNome();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        java.lang.String str2 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
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
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
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
        java.lang.String str18 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
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
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str10 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
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
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int19 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str6 = biblioteca1.getNome();
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass10 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
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
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
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
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
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
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
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
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        java.lang.String str2 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        int int23 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
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
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
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
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
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
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass24 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(livro22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
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
        int int15 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
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
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        biblioteca1.popularBiblioteca();
        imd.Livro livro23 = null;
        biblioteca1.adicionarLivro(livro23);
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
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
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
        biblioteca1.popularBiblioteca();
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        int int8 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
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
        java.lang.String str18 = biblioteca1.getNome();
        java.lang.String str19 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
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
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
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
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        int int5 = biblioteca1.getQuantidadeLivros();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(livro8);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
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
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        int int20 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNull(livro22);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
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
        java.lang.String str19 = biblioteca1.getNome();
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
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
        int int15 = biblioteca1.getQuantidadeLivros();
        java.lang.String str16 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
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
        java.lang.String str13 = biblioteca1.getNome();
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
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
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
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
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.Class<?> wildcardClass10 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
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
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        int int18 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
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
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        imd.Livro livro24 = null;
        biblioteca1.removerLivro(livro24);
        imd.Livro livro26 = null;
        biblioteca1.adicionarLivro(livro26);
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
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
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
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
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
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = biblioteca1.verificarDisponibilidade("");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(livro9);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
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
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        int int19 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        imd.Livro livro24 = null;
        biblioteca1.removerLivro(livro24);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNull(livro21);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
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
        int int13 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
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
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
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
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = livro15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
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
        int int20 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
        biblioteca1.popularBiblioteca();
        java.lang.String str17 = biblioteca1.getNome();
        java.lang.String str18 = biblioteca1.getNome();
        int int19 = biblioteca1.getQuantidadeLivros();
        java.lang.String str20 = biblioteca1.getNome();
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
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
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        int int20 = biblioteca1.getQuantidadeLivros();
        int int21 = biblioteca1.getQuantidadeLivros();
        int int22 = biblioteca1.getQuantidadeLivros();
        java.lang.String str23 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int20 = biblioteca1.getQuantidadeLivros();
        java.lang.String str21 = biblioteca1.getNome();
        boolean boolean23 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
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
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
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
        java.lang.String str22 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
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
        biblioteca1.popularBiblioteca();
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
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
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
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean24 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro25 = null;
        biblioteca1.removerLivro(livro25);
        imd.Livro livro28 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str29 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertNull(livro22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(livro28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
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
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
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
        biblioteca1.adicionarLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
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
        biblioteca1.popularBiblioteca();
        java.lang.String str25 = biblioteca1.getNome();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
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
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        int int2 = biblioteca1.getQuantidadeLivros();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass5 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
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
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        int int22 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro23 = null;
        biblioteca1.removerLivro(livro23);
        int int25 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro26 = null;
        biblioteca1.removerLivro(livro26);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        int int13 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
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
        biblioteca1.popularBiblioteca();
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
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
        int int19 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        java.lang.String str24 = biblioteca1.getNome();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
        biblioteca1.adicionarLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro22);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
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
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean24 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro25 = null;
        biblioteca1.removerLivro(livro25);
        imd.Livro livro28 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.Class<?> wildcardClass29 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertNull(livro22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(livro28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
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
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        int int2 = biblioteca1.getQuantidadeLivros();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro11);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
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
        biblioteca1.adicionarLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        boolean boolean22 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.Class<?> wildcardClass8 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
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
        int int19 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("hi!");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
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
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        int int22 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro23 = null;
        biblioteca1.removerLivro(livro23);
        int int25 = biblioteca1.getQuantidadeLivros();
        java.lang.String str26 = biblioteca1.getNome();
        java.lang.String str27 = biblioteca1.getNome();
        imd.Livro livro28 = null;
        biblioteca1.adicionarLivro(livro28);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro31 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
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
        biblioteca1.adicionarLivro(livro19);
        java.lang.String str21 = biblioteca1.getNome();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
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
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
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
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
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
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
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
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass10 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
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
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
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
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        int int18 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
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
        biblioteca1.adicionarLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.removerLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
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
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
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
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
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
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
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
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
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
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
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
        biblioteca1.popularBiblioteca();
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
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
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
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
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = livro17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
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
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
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
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int17 = biblioteca1.getQuantidadeLivros();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
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
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
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
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        int int19 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass8 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
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
        int int13 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
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
        int int18 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
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
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
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
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
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
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass5 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
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
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
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
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean22 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        java.lang.String str3 = biblioteca1.getNome();
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = livro9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
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
        java.lang.String str19 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
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
        java.lang.String str16 = biblioteca1.getNome();
        java.lang.String str17 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
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
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
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
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
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
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
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
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
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
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = livro15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
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
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass25 = biblioteca1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
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
        biblioteca1.popularBiblioteca();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int19 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
    }
}

