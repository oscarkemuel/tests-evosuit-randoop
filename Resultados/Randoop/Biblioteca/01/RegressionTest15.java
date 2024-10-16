import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test7501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7501");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int14 = biblioteca1.getQuantidadeLivros();
        int int15 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str22 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(livro21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.String str16 = biblioteca1.getNome();
        java.lang.String str17 = biblioteca1.getNome();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        java.lang.String str6 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        biblioteca1.popularBiblioteca();
        int int13 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str6 = biblioteca1.getNome();
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = livro21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNull(livro21);
    }

    @Test
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean23 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro24 = null;
        biblioteca1.adicionarLivro(livro24);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(livro21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str18 = biblioteca1.getNome();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        boolean boolean22 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str20 = biblioteca1.getNome();
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro25 = null;
        biblioteca1.adicionarLivro(livro25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass8 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        biblioteca1.popularBiblioteca();
        int int17 = biblioteca1.getQuantidadeLivros();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
        boolean boolean23 = biblioteca1.verificarDisponibilidade("");
        int int24 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
    }

    @Test
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        java.lang.String str19 = biblioteca1.getNome();
        int int20 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        biblioteca1.popularBiblioteca();
        java.lang.String str15 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        int int24 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro25 = null;
        biblioteca1.adicionarLivro(livro25);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.Class<?> wildcardClass10 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        biblioteca1.popularBiblioteca();
        java.lang.String str16 = biblioteca1.getNome();
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        int int18 = biblioteca1.getQuantidadeLivros();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int13 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        int int19 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str22 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(livro21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str12 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str12 = biblioteca1.getNome();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str15 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str6 = biblioteca1.getNome();
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = livro14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str22 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        int int5 = biblioteca1.getQuantidadeLivros();
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro25 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro27 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(livro23);
        org.junit.Assert.assertNull(livro25);
        org.junit.Assert.assertNull(livro27);
    }

    @Test
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test7560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7560");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test7561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7561");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test7562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7562");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test7563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7563");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test7564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7564");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test7565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7565");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test7566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7566");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str19 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int22 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro23 = null;
        biblioteca1.adicionarLivro(livro23);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
    }

    @Test
    public void test7567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7567");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        int int21 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test7568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7568");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        int int18 = biblioteca1.getQuantidadeLivros();
        java.lang.String str19 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test7569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7569");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str16 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7570");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        biblioteca1.popularBiblioteca();
        int int21 = biblioteca1.getQuantidadeLivros();
        int int22 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 13 + "'", int22 == 13);
    }

    @Test
    public void test7571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7571");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test7572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7572");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test7573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7573");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test7574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7574");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test7575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7575");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7576");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test7577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7577");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        int int22 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test7578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7578");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7579");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean26 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro28 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertNull(livro22);
        org.junit.Assert.assertNull(livro24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(livro28);
    }

    @Test
    public void test7580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7580");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(livro11);
    }

    @Test
    public void test7581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7581");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test7582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7582");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int20 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12 + "'", int20 == 12);
        org.junit.Assert.assertNull(livro22);
    }

    @Test
    public void test7583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7583");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        int int9 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test7584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7584");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test7585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7585");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7586");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test7587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7587");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test7588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7588");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test7589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7589");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test7590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7590");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        biblioteca1.popularBiblioteca();
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.String str16 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7591");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str12 = biblioteca1.getNome();
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.String str14 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test7592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7592");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test7593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7593");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str6 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test7594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7594");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        int int18 = biblioteca1.getQuantidadeLivros();
        java.lang.String str19 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test7595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7595");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str20 = biblioteca1.getNome();
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        boolean boolean24 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7596");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test7597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7597");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
    }

    @Test
    public void test7598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7598");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test7599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7599");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        java.lang.String str6 = biblioteca1.getNome();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test7600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7600");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test7601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7601");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test7602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7602");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        biblioteca1.popularBiblioteca();
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test7603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7603");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test7604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7604");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7605");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test7606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7606");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test7607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7607");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test7608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7608");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test7609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7609");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test7610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7610");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7611");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        int int7 = biblioteca1.getQuantidadeLivros();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test7612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7612");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7613");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test7614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7614");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test7615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7615");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str13 = biblioteca1.getNome();
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13 + "'", int14 == 13);
    }

    @Test
    public void test7616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7616");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str7 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test7617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7617");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7618");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass10 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7619");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test7620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7620");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass5 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test7621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7621");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str20 = biblioteca1.getNome();
        java.lang.String str21 = biblioteca1.getNome();
        java.lang.String str22 = biblioteca1.getNome();
        boolean boolean24 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro25 = null;
        biblioteca1.removerLivro(livro25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7622");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7623");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test7624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7624");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str14 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test7625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7625");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
    }

    @Test
    public void test7626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7626");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7627");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        biblioteca1.popularBiblioteca();
        java.lang.String str18 = biblioteca1.getNome();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7628");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7629");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test7630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7630");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        java.lang.String str16 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7631");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str6 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7632");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7633");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7634");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7635");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test7636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7636");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        int int13 = biblioteca1.getQuantidadeLivros();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test7637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7637");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        int int20 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test7638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7638");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        java.lang.String str21 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test7639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7639");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7640");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test7641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7641");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test7642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7642");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str13 = biblioteca1.getNome();
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test7643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7643");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int21 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
    }

    @Test
    public void test7644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7644");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.String str13 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7645");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str14 = biblioteca1.getNome();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7646");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        biblioteca1.popularBiblioteca();
        java.lang.String str19 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7647");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        java.lang.String str6 = biblioteca1.getNome();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test7648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7648");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        java.lang.String str20 = biblioteca1.getNome();
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(livro22);
    }

    @Test
    public void test7649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7649");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        java.lang.String str12 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test7650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7650");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int14 = biblioteca1.getQuantidadeLivros();
        int int15 = biblioteca1.getQuantidadeLivros();
        java.lang.String str16 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7651");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test7652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7652");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass10 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7653");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7654");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7655");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro23 = null;
        biblioteca1.adicionarLivro(livro23);
        imd.Livro livro25 = null;
        biblioteca1.adicionarLivro(livro25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(livro22);
    }

    @Test
    public void test7656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7656");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test7657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7657");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test7658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7658");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7659");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test7660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7660");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7661");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test7662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7662");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        int int14 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test7663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7663");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        java.lang.String str3 = biblioteca1.getNome();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test7664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7664");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
    }

    @Test
    public void test7665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7665");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test7666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7666");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test7667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7667");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
    }

    @Test
    public void test7668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7668");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7669");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test7670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7670");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass8 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7671");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test7672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7672");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7673");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int13 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test7674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7674");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test7675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7675");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        int int16 = biblioteca1.getQuantidadeLivros();
        java.lang.String str17 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test7676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7676");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        int int5 = biblioteca1.getQuantidadeLivros();
        java.lang.String str6 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
    }

    @Test
    public void test7677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7677");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test7678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7678");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7679");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test7680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7680");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7681");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
    }

    @Test
    public void test7682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7682");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test7683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7683");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str12 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test7684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7684");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(livro21);
    }

    @Test
    public void test7685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7685");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7686");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test7687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7687");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test7688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7688");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
    }

    @Test
    public void test7689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7689");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        int int14 = biblioteca1.getQuantidadeLivros();
        int int15 = biblioteca1.getQuantidadeLivros();
        int int16 = biblioteca1.getQuantidadeLivros();
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test7690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7690");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(livro11);
    }

    @Test
    public void test7691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7691");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test7692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7692");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test7693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7693");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str12 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        int int21 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test7694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7694");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7695");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test7696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7696");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7697");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test7698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7698");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test7699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7699");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test7700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7700");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        java.lang.String str3 = biblioteca1.getNome();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str8 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test7701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7701");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        int int5 = biblioteca1.getQuantidadeLivros();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7702");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test7703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7703");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str6 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7704");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7705");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str14 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7706");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7707");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test7708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7708");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test7709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7709");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7710");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7711");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        java.lang.String str17 = biblioteca1.getNome();
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test7712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7712");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7713");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7714");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        biblioteca1.popularBiblioteca();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test7715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7715");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7716");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str6 = biblioteca1.getNome();
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        int int15 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test7717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7717");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        boolean boolean24 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7718");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test7719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7719");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.String str14 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test7720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7720");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        biblioteca1.popularBiblioteca();
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        imd.Livro livro23 = null;
        biblioteca1.adicionarLivro(livro23);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro26 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test7721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7721");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
    }

    @Test
    public void test7722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7722");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str15 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test7723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7723");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7724");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
    }

    @Test
    public void test7725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7725");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test7726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7726");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7727");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7728");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        biblioteca1.popularBiblioteca();
        int int20 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
    }

    @Test
    public void test7729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7729");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7730");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test7731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7731");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test7732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7732");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7733");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        int int12 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test7734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7734");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        int int11 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
    }

    @Test
    public void test7735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7735");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        java.lang.String str20 = biblioteca1.getNome();
        java.lang.String str21 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test7736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7736");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test7737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7737");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test7738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7738");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        int int21 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test7739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7739");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7740");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7741");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7742");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7743");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7744");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7745");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        biblioteca1.popularBiblioteca();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test7746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7746");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test7747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7747");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test7748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7748");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7749");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test7750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7750");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test7751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7751");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test7752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7752");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str16 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7753");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        int int15 = biblioteca1.getQuantidadeLivros();
        java.lang.String str16 = biblioteca1.getNome();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7754");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
    }

    @Test
    public void test7755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7755");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7756");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean22 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro23 = null;
        biblioteca1.adicionarLivro(livro23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7757");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        biblioteca1.popularBiblioteca();
        boolean boolean23 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str24 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7758");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test7759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7759");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7760");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean23 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str24 = biblioteca1.getNome();
        imd.Livro livro25 = null;
        biblioteca1.adicionarLivro(livro25);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(livro21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7761");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.String str14 = biblioteca1.getNome();
        java.lang.String str15 = biblioteca1.getNome();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test7762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7762");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str13 = biblioteca1.getNome();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7763");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        int int5 = biblioteca1.getQuantidadeLivros();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test7764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7764");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7765");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7766");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.Class<?> wildcardClass10 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7767");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
    }

    @Test
    public void test7768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7768");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str12 = biblioteca1.getNome();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test7769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7769");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7770");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test7771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7771");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        java.lang.Class<?> wildcardClass23 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7772");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test7773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7773");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test7774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7774");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(livro21);
    }

    @Test
    public void test7775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7775");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int16 = biblioteca1.getQuantidadeLivros();
        int int17 = biblioteca1.getQuantidadeLivros();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7776");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7777");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(livro7);
    }

    @Test
    public void test7778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7778");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test7779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7779");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test7780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7780");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str12 = biblioteca1.getNome();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7781");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
    }

    @Test
    public void test7782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7782");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        java.lang.String str6 = biblioteca1.getNome();
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test7783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7783");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7784");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
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
            imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test7785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7785");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test7786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7786");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str20 = biblioteca1.getNome();
        int int21 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        int int24 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
    }

    @Test
    public void test7787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7787");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        java.lang.String str7 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test7788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7788");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        int int21 = biblioteca1.getQuantidadeLivros();
        int int22 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass23 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7789");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7790");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test7791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7791");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        java.lang.String str21 = biblioteca1.getNome();
        int int22 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
    }

    @Test
    public void test7792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7792");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        boolean boolean22 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str23 = biblioteca1.getNome();
        java.lang.String str24 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7793");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str6 = biblioteca1.getNome();
        int int7 = biblioteca1.getQuantidadeLivros();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test7794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7794");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(livro9);
    }

    @Test
    public void test7795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7795");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test7796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7796");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test7797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7797");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test7798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7798");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        boolean boolean22 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str23 = biblioteca1.getNome();
        boolean boolean25 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test7799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7799");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test7800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7800");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str17 = biblioteca1.getNome();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str20 = biblioteca1.getNome();
        java.lang.String str21 = biblioteca1.getNome();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test7801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7801");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7802");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
    }

    @Test
    public void test7803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7803");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test7804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7804");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test7805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7805");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str18 = biblioteca1.getNome();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        java.lang.Class<?> wildcardClass23 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7806");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        int int17 = biblioteca1.getQuantidadeLivros();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(livro21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7807");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7808");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int10 = biblioteca1.getQuantidadeLivros();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7809");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str16 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7810");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7811");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
    }

    @Test
    public void test7812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7812");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int13 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test7813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7813");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str6 = biblioteca1.getNome();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test7814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7814");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        int int16 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7815");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int14 = biblioteca1.getQuantidadeLivros();
        int int15 = biblioteca1.getQuantidadeLivros();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int23 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test7816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7816");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test7817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7817");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test7818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7818");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test7819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7819");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.String str14 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7820");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test7821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7821");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7822");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass10 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7823");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        java.lang.String str21 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test7824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7824");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7825");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        java.lang.String str18 = biblioteca1.getNome();
        int int19 = biblioteca1.getQuantidadeLivros();
        int int20 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        int int23 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test7826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7826");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
    }

    @Test
    public void test7827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7827");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test7828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7828");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test7829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7829");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int5 = biblioteca1.getQuantidadeLivros();
        java.lang.String str6 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass7 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7830");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
        boolean boolean23 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro24 = null;
        biblioteca1.adicionarLivro(livro24);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro27 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test7831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7831");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        int int21 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int23 = biblioteca1.getQuantidadeLivros();
        java.lang.String str24 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro26 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7832");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test7833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7833");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str10 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7834");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7835");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        int int21 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        java.lang.String str24 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7836");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test7837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7837");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test7838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7838");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test7839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7839");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test7840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7840");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test7841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7841");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test7842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7842");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7843");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        biblioteca1.popularBiblioteca();
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.String str13 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7844");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7845");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str16 = biblioteca1.getNome();
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test7846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7846");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test7847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7847");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test7848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7848");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertNull(livro22);
    }

    @Test
    public void test7849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7849");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7850");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
    }

    @Test
    public void test7851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7851");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test7852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7852");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7853");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test7854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7854");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str12 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        int int21 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        int int24 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
    }

    @Test
    public void test7855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7855");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test7856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7856");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test7857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7857");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str16 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        java.lang.String str22 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test7858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7858");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass10 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7859");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7860");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7861");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test7862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7862");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str21 = biblioteca1.getNome();
        int int22 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test7863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7863");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        java.lang.String str6 = biblioteca1.getNome();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7864");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7865");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        int int15 = biblioteca1.getQuantidadeLivros();
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test7866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7866");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        int int21 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test7867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7867");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        int int23 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
    }

    @Test
    public void test7868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7868");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str16 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7869");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int15 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        int int22 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test7870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7870");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test7871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7871");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        int int19 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test7872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7872");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7873");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str14 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7874");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7875");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int15 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test7876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7876");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7877");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        int int18 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int20 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test7878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7878");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test7879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7879");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test7880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7880");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test7881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7881");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test7882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7882");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7883");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7884");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test7885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7885");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        java.lang.String str7 = biblioteca1.getNome();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test7886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7886");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str20 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test7887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7887");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test7888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7888");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7889");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7890");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test7891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7891");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        java.lang.String str6 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass8 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7892");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(livro21);
    }

    @Test
    public void test7893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7893");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 12 + "'", int13 == 12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 13 + "'", int17 == 13);
    }

    @Test
    public void test7894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7894");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro22);
    }

    @Test
    public void test7895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7895");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7896");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(livro9);
    }

    @Test
    public void test7897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7897");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test7898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7898");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test7899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7899");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test7900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7900");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.String str16 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test7901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7901");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test7902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7902");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int18 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7903");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str13 = biblioteca1.getNome();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test7904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7904");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str16 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7905");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro23 = null;
        biblioteca1.removerLivro(livro23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro22);
    }

    @Test
    public void test7906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7906");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test7907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7907");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int19 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
    }

    @Test
    public void test7908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7908");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test7909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7909");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7910");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7911");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test7912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7912");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test7913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7913");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test7914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7914");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test7915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7915");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        int int21 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
    }

    @Test
    public void test7916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7916");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        biblioteca1.popularBiblioteca();
        int int17 = biblioteca1.getQuantidadeLivros();
        java.lang.String str18 = biblioteca1.getNome();
        java.lang.String str19 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test7917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7917");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro7);
    }

    @Test
    public void test7918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7918");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test7919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7919");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        int int21 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int23 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro24 = null;
        biblioteca1.adicionarLivro(livro24);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro27 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test7920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7920");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test7921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7921");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        java.lang.String str21 = biblioteca1.getNome();
        boolean boolean23 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test7922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7922");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        int int16 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test7923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7923");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str12 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        int int21 = biblioteca1.getQuantidadeLivros();
        java.lang.String str22 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test7924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7924");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        biblioteca1.popularBiblioteca();
        java.lang.String str19 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test7925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7925");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int21 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test7926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7926");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test7927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7927");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test7928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7928");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test7929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7929");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test7930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7930");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test7931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7931");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str17 = biblioteca1.getNome();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7932");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str16 = biblioteca1.getNome();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = livro20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test7933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7933");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7934");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        java.lang.String str20 = biblioteca1.getNome();
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test7935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7935");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
    }

    @Test
    public void test7936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7936");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7937");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7938");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test7939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7939");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str17 = biblioteca1.getNome();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test7940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7940");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7941");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test7942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7942");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test7943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7943");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str12 = biblioteca1.getNome();
        int int13 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test7944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7944");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7945");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str16 = biblioteca1.getNome();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7946");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.String str13 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test7947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7947");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test7948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7948");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test7949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7949");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7950");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        java.lang.String str6 = biblioteca1.getNome();
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
    }

    @Test
    public void test7951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7951");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str12 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test7952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7952");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.Class<?> wildcardClass10 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7953");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test7954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7954");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test7955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7955");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.String str14 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test7956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7956");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        int int21 = biblioteca1.getQuantidadeLivros();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test7957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7957");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7958");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str15 = biblioteca1.getNome();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7959");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        int int5 = biblioteca1.getQuantidadeLivros();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7960");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test7961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7961");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        int int20 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str23 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNull(livro22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test7962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7962");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        biblioteca1.popularBiblioteca();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test7963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7963");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test7964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7964");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7965");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test7966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7966");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        biblioteca1.popularBiblioteca();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test7967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7967");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test7968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7968");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        int int21 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        imd.Livro livro24 = null;
        biblioteca1.removerLivro(livro24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
    }

    @Test
    public void test7969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7969");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
    }

    @Test
    public void test7970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7970");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        int int16 = biblioteca1.getQuantidadeLivros();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7971");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.String str14 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test7972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7972");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test7973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7973");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        imd.Livro livro24 = null;
        biblioteca1.adicionarLivro(livro24);
        java.lang.String str26 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test7974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7974");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test7975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7975");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test7976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7976");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7977");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(livro9);
    }

    @Test
    public void test7978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7978");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        biblioteca1.popularBiblioteca();
        java.lang.String str12 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test7979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7979");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        java.lang.String str20 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test7980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7980");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test7981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7981");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7982");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test7983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7983");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        int int18 = biblioteca1.getQuantidadeLivros();
        java.lang.String str19 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str21 = biblioteca1.getNome();
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test7984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7984");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test7985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7985");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        java.lang.String str6 = biblioteca1.getNome();
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test7986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7986");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7987");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        int int16 = biblioteca1.getQuantidadeLivros();
        java.lang.String str17 = biblioteca1.getNome();
        int int18 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test7988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7988");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test7989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7989");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test7990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7990");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
    }

    @Test
    public void test7991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7991");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        int int24 = biblioteca1.getQuantidadeLivros();
        boolean boolean26 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test7992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7992");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test7993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7993");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7994");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test7995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7995");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str14 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test7996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7996");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
    }

    @Test
    public void test7997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7997");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test7998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7998");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        biblioteca1.popularBiblioteca();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test7999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7999");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        java.lang.String str20 = biblioteca1.getNome();
        java.lang.String str21 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str23 = biblioteca1.getNome();
        imd.Livro livro24 = null;
        biblioteca1.adicionarLivro(livro24);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test8000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test8000");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
    }
}

