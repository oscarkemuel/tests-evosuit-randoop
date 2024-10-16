import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = livro12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
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
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.String str16 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
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
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
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
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
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
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
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
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.Class<?> wildcardClass10 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        int int17 = biblioteca1.getQuantidadeLivros();
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
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
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
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
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
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
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
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
        boolean boolean23 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.String str14 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        int int11 = biblioteca1.getQuantidadeLivros();
        java.lang.String str12 = biblioteca1.getNome();
        java.lang.String str13 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
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
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
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
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int10 = biblioteca1.getQuantidadeLivros();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        int int13 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.String str16 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
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
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str16 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
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
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        java.lang.String str3 = biblioteca1.getNome();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str12 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
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
        biblioteca1.adicionarLivro(livro15);
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
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
        biblioteca1.popularBiblioteca();
        boolean boolean21 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro24 = null;
        biblioteca1.removerLivro(livro24);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(livro23);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
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
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str6 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str7 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        int int13 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.Class<?> wildcardClass10 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        int int16 = biblioteca1.getQuantidadeLivros();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.String str14 = biblioteca1.getNome();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
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
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(livro9);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        int int15 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int13 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str10 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str6 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str15 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str17 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
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
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str19 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
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
        java.lang.String str17 = biblioteca1.getNome();
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
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str14 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
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
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        java.lang.String str6 = biblioteca1.getNome();
        int int7 = biblioteca1.getQuantidadeLivros();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int15 = biblioteca1.getQuantidadeLivros();
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        biblioteca1.popularBiblioteca();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
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
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str17 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.String str14 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
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
        java.lang.String str19 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        int int13 = biblioteca1.getQuantidadeLivros();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(livro8);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
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
        biblioteca1.popularBiblioteca();
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean7 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass10 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
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
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
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
        biblioteca1.popularBiblioteca();
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
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
        biblioteca1.popularBiblioteca();
        java.lang.String str23 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
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
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        biblioteca1.popularBiblioteca();
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(livro11);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
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
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
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
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        int int20 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
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
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str6 = biblioteca1.getNome();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        int int2 = biblioteca1.getQuantidadeLivros();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 12 + "'", int13 == 12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
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
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str12 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
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
        int int13 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        int int19 = biblioteca1.getQuantidadeLivros();
        java.lang.String str20 = biblioteca1.getNome();
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("");
        int int23 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(livro22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12 + "'", int23 == 12);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
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
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
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
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
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
        java.lang.String str27 = biblioteca1.getNome();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
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
        biblioteca1.popularBiblioteca();
        java.lang.String str15 = biblioteca1.getNome();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        int int19 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass10 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
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
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        java.lang.String str21 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
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
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
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
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
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
        biblioteca1.popularBiblioteca();
        int int20 = biblioteca1.getQuantidadeLivros();
        java.lang.String str21 = biblioteca1.getNome();
        int int22 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
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
        java.lang.String str25 = biblioteca1.getNome();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
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
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(livro8);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        java.lang.String str6 = biblioteca1.getNome();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str15 = biblioteca1.getNome();
        int int16 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
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
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        java.lang.String str19 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
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
        int int15 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str6 = biblioteca1.getNome();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str14 = biblioteca1.getNome();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
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
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
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
        biblioteca1.popularBiblioteca();
        java.lang.String str15 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str17 = biblioteca1.getNome();
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
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
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.String str14 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.String str13 = biblioteca1.getNome();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
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
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
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
        java.lang.String str19 = biblioteca1.getNome();
        java.lang.String str20 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str10 = biblioteca1.getNome();
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
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
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
        biblioteca1.adicionarLivro(livro16);
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
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
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
        int int21 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        int int13 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
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
        imd.Livro livro22 = null;
        biblioteca1.adicionarLivro(livro22);
        java.lang.Class<?> wildcardClass24 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
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
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        int int18 = biblioteca1.getQuantidadeLivros();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
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
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.String str14 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        int int5 = biblioteca1.getQuantidadeLivros();
        java.lang.String str6 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
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
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
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
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertNull(livro22);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str15 = biblioteca1.getNome();
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
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
        biblioteca1.popularBiblioteca();
        int int15 = biblioteca1.getQuantidadeLivros();
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
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
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int16 = biblioteca1.getQuantidadeLivros();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 14 + "'", int14 == 14);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
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
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean22 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
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
        imd.Livro livro22 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str23 = biblioteca1.getNome();
        boolean boolean25 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro27 = biblioteca1.buscarLivroPorTitulo("");
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
        org.junit.Assert.assertNull(livro22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(livro27);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(livro24);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
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
        int int14 = biblioteca1.getQuantidadeLivros();
        int int15 = biblioteca1.getQuantidadeLivros();
        java.lang.String str16 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
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
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
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
            imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
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
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str6 = biblioteca1.getNome();
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = livro11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertNull(livro11);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
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
        java.lang.String str18 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
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
        java.lang.String str17 = biblioteca1.getNome();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
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
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        int int16 = biblioteca1.getQuantidadeLivros();
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        int int12 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str6 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int14 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
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
        int int13 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
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
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.String str16 = biblioteca1.getNome();
        java.lang.String str17 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str6 = biblioteca1.getNome();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        biblioteca1.popularBiblioteca();
        java.lang.String str14 = biblioteca1.getNome();
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        int int22 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
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
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        imd.Livro livro23 = null;
        biblioteca1.removerLivro(livro23);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
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
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(livro21);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = livro19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
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
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        java.lang.String str21 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean24 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean26 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
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
        java.lang.Class<?> wildcardClass25 = biblioteca1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
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
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.String str18 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass19 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str16 = biblioteca1.getNome();
        int int17 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
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
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
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
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        int int5 = biblioteca1.getQuantidadeLivros();
        java.lang.String str6 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
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
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        int int17 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
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
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        biblioteca1.popularBiblioteca();
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        biblioteca1.popularBiblioteca();
        imd.Livro livro23 = null;
        biblioteca1.removerLivro(livro23);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro26 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
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
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        int int22 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNull(livro24);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
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
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
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
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int22 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro24 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNull(livro24);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
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
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str15 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro9);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
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
        java.lang.String str17 = biblioteca1.getNome();
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str20 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
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
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        java.lang.String str7 = biblioteca1.getNome();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro11);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
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
        biblioteca1.popularBiblioteca();
        int int17 = biblioteca1.getQuantidadeLivros();
        java.lang.String str18 = biblioteca1.getNome();
        java.lang.String str19 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
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
        int int16 = biblioteca1.getQuantidadeLivros();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        int int5 = biblioteca1.getQuantidadeLivros();
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
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
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro8);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro7);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        java.lang.String str6 = biblioteca1.getNome();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
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
        biblioteca1.popularBiblioteca();
        int int20 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
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
        biblioteca1.removerLivro(livro19);
        biblioteca1.popularBiblioteca();
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        int int24 = biblioteca1.getQuantidadeLivros();
        int int25 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
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
        biblioteca1.popularBiblioteca();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int11 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
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
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
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
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        biblioteca1.popularBiblioteca();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = biblioteca1.verificarDisponibilidade("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro4);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        biblioteca1.popularBiblioteca();
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
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
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro11);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
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
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.String str13 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        org.junit.Assert.assertNull(livro3);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
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
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.String str12 = biblioteca1.getNome();
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
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
        java.lang.String str17 = biblioteca1.getNome();
        int int18 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass11 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 13 + "'", int17 == 13);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int10 = biblioteca1.getQuantidadeLivros();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str10 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str14 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        java.lang.String str14 = biblioteca1.getNome();
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        int int2 = biblioteca1.getQuantidadeLivros();
        java.lang.String str3 = biblioteca1.getNome();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.String str14 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str17 = biblioteca1.getNome();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        imd.Livro livro22 = null;
        biblioteca1.removerLivro(livro22);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str13 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        java.lang.String str20 = biblioteca1.getNome();
        int int21 = biblioteca1.getQuantidadeLivros();
        boolean boolean23 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
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
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        int int14 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        boolean boolean19 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
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
        int int18 = biblioteca1.getQuantidadeLivros();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str4 = biblioteca1.getNome();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
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
        int int15 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        int int10 = biblioteca1.getQuantidadeLivros();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str13 = biblioteca1.getNome();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        imd.Livro livro23 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro25 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertNull(livro23);
        org.junit.Assert.assertNull(livro25);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        java.lang.String str6 = biblioteca1.getNome();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro11);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
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
        java.lang.String str18 = biblioteca1.getNome();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
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
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
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
        java.lang.String str15 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.adicionarLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.String str13 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
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
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        int int20 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
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
        java.lang.String str13 = biblioteca1.getNome();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        int int6 = biblioteca1.getQuantidadeLivros();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        java.lang.String str16 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str15 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int17 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str20 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        java.lang.String str12 = biblioteca1.getNome();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
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
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        java.lang.String str20 = biblioteca1.getNome();
        imd.Livro livro21 = null;
        biblioteca1.removerLivro(livro21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str15 = biblioteca1.getNome();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        int int20 = biblioteca1.getQuantidadeLivros();
        int int21 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
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
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str18 = biblioteca1.getNome();
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.String str13 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
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
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(livro9);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
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
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        java.lang.String str20 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = biblioteca1.verificarDisponibilidade("");
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
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
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
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int15 = biblioteca1.getQuantidadeLivros();
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        int int13 = biblioteca1.getQuantidadeLivros();
        int int14 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        int int14 = biblioteca1.getQuantidadeLivros();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
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
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro21 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertNull(livro21);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
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
        int int13 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
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
        int int19 = biblioteca1.getQuantidadeLivros();
        java.lang.String str20 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        java.lang.String str7 = biblioteca1.getNome();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro11);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
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
        int int19 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass21 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str7 = biblioteca1.getNome();
        int int8 = biblioteca1.getQuantidadeLivros();
        java.lang.String str9 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean12 = biblioteca1.verificarDisponibilidade("");
        int int13 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        biblioteca1.popularBiblioteca();
        int int16 = biblioteca1.getQuantidadeLivros();
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str19 = biblioteca1.getNome();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int4 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int6 = biblioteca1.getQuantidadeLivros();
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        java.lang.String str23 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        int int5 = biblioteca1.getQuantidadeLivros();
        java.lang.String str6 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro10 = null;
        biblioteca1.adicionarLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
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
        int int19 = biblioteca1.getQuantidadeLivros();
        java.lang.String str20 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
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
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        int int15 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        boolean boolean22 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str23 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
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
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        biblioteca1.popularBiblioteca();
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str16 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
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
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
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
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        int int23 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
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
        int int18 = biblioteca1.getQuantidadeLivros();
        java.lang.String str19 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = livro18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
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
        biblioteca1.popularBiblioteca();
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
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        java.lang.String str12 = biblioteca1.getNome();
        int int13 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        biblioteca1.popularBiblioteca();
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(livro13);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
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
        int int13 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int15 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
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
        int int20 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        int int9 = biblioteca1.getQuantidadeLivros();
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        java.lang.String str12 = biblioteca1.getNome();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
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
        biblioteca1.removerLivro(livro22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.Class<?> wildcardClass4 = biblioteca1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13 + "'", int14 == 13);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
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
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro21 = null;
        biblioteca1.adicionarLivro(livro21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = biblioteca1.verificarDisponibilidade("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str14 = biblioteca1.getNome();
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        boolean boolean19 = biblioteca1.verificarDisponibilidade("");
        boolean boolean21 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
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
        java.lang.Class<?> wildcardClass20 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        java.lang.String str4 = biblioteca1.getNome();
        int int5 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
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
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str17 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str10 = biblioteca1.getNome();
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str11 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("hi!");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(livro14);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str15 = biblioteca1.getNome();
        boolean boolean17 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str18 = biblioteca1.getNome();
        java.lang.String str19 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str19 = biblioteca1.getNome();
        int int20 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12 + "'", int20 == 12);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
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
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        imd.Livro livro20 = null;
        biblioteca1.adicionarLivro(livro20);
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
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
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("");
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.String str13 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("");
        boolean boolean20 = biblioteca1.verificarDisponibilidade("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        int int15 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(livro17);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
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
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = null;
        biblioteca1.removerLivro(livro4);
        java.lang.String str6 = biblioteca1.getNome();
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("hi!");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        java.lang.Class<?> wildcardClass13 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
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
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro19 = null;
        biblioteca1.adicionarLivro(livro19);
        java.lang.String str21 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        java.lang.String str7 = biblioteca1.getNome();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.Class<?> wildcardClass12 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean13 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean7 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.adicionarLivro(livro9);
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        imd.Livro livro13 = null;
        biblioteca1.adicionarLivro(livro13);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
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
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        java.lang.String str14 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
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
        int int23 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(livro19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12 + "'", int23 == 12);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
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
        biblioteca1.removerLivro(livro12);
        biblioteca1.popularBiblioteca();
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
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
        int int13 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        java.lang.Class<?> wildcardClass18 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        java.lang.String str11 = biblioteca1.getNome();
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str10 = biblioteca1.getNome();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro3 = null;
        biblioteca1.removerLivro(livro3);
        int int5 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        int int10 = biblioteca1.getQuantidadeLivros();
        int int11 = biblioteca1.getQuantidadeLivros();
        int int12 = biblioteca1.getQuantidadeLivros();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass15 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        java.lang.String str17 = biblioteca1.getNome();
        imd.Livro livro18 = null;
        biblioteca1.removerLivro(livro18);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        boolean boolean11 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str12 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        int int7 = biblioteca1.getQuantidadeLivros();
        boolean boolean9 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
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
        int int16 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro19 = biblioteca1.buscarLivroPorTitulo("hi!");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(livro19);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        biblioteca1.popularBiblioteca();
        imd.Livro livro8 = null;
        biblioteca1.removerLivro(livro8);
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int12 = biblioteca1.getQuantidadeLivros();
        java.lang.String str13 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
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
        imd.Livro livro13 = null;
        biblioteca1.removerLivro(livro13);
        boolean boolean16 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
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
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro20 = null;
        biblioteca1.removerLivro(livro20);
        biblioteca1.popularBiblioteca();
        imd.Livro livro23 = null;
        biblioteca1.removerLivro(livro23);
        biblioteca1.popularBiblioteca();
        imd.Livro livro27 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro18);
        org.junit.Assert.assertNull(livro27);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro4 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        int int6 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro7 = null;
        biblioteca1.adicionarLivro(livro7);
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
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
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro10 = null;
        biblioteca1.removerLivro(livro10);
        boolean boolean13 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str14 = biblioteca1.getNome();
        boolean boolean16 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean18 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = livro20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(livro20);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        boolean boolean3 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro4 = null;
        biblioteca1.adicionarLivro(livro4);
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        java.lang.Class<?> wildcardClass9 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        int int7 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
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
        java.lang.String str14 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str6 = biblioteca1.getNome();
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.removerLivro(livro14);
        int int16 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(livro10);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
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
        biblioteca1.removerLivro(livro12);
        int int14 = biblioteca1.getQuantidadeLivros();
        java.lang.String str15 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro6 = null;
        biblioteca1.adicionarLivro(livro6);
        imd.Livro livro8 = null;
        biblioteca1.adicionarLivro(livro8);
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro11 = null;
        biblioteca1.adicionarLivro(livro11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        int int11 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int8 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("");
        int int10 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = null;
        biblioteca1.removerLivro(livro11);
        imd.Livro livro14 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro16 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro3 = null;
        biblioteca1.adicionarLivro(livro3);
        java.lang.String str5 = biblioteca1.getNome();
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
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
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        int int19 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str5 = biblioteca1.getNome();
        java.lang.String str6 = biblioteca1.getNome();
        boolean boolean8 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int10 = biblioteca1.getQuantidadeLivros();
        java.lang.String str11 = biblioteca1.getNome();
        int int12 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("hi!");
        int int6 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        java.lang.String str8 = biblioteca1.getNome();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
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
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
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
        java.lang.Class<?> wildcardClass22 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        int int9 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        boolean boolean12 = biblioteca1.verificarDisponibilidade("hi!");
        int int13 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        boolean boolean8 = biblioteca1.verificarDisponibilidade("hi!");
        int int9 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean14 = biblioteca1.verificarDisponibilidade("hi!");
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean10 = biblioteca1.verificarDisponibilidade("hi!");
        int int11 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro12 = null;
        biblioteca1.removerLivro(livro12);
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
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
        imd.Livro livro15 = null;
        biblioteca1.adicionarLivro(livro15);
        java.lang.Class<?> wildcardClass17 = biblioteca1.getClass();
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
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
        imd.Livro livro18 = biblioteca1.buscarLivroPorTitulo("");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(livro18);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
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
        java.lang.String str13 = biblioteca1.getNome();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("");
        java.lang.Class<?> wildcardClass16 = biblioteca1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        imd.Livro livro3 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str4 = biblioteca1.getNome();
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        biblioteca1.popularBiblioteca();
        int int8 = biblioteca1.getQuantidadeLivros();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.adicionarLivro(livro16);
        imd.Livro livro18 = null;
        biblioteca1.adicionarLivro(livro18);
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(livro12);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.popularBiblioteca();
        java.lang.String str5 = biblioteca1.getNome();
        imd.Livro livro6 = null;
        biblioteca1.removerLivro(livro6);
        imd.Livro livro9 = biblioteca1.buscarLivroPorTitulo("hi!");
        int int10 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        int int16 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        // The following exception was thrown during execution in test generation
        try {
            imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro8 = biblioteca1.buscarLivroPorTitulo("hi!");
        java.lang.String str9 = biblioteca1.getNome();
        java.lang.String str10 = biblioteca1.getNome();
        imd.Livro livro12 = biblioteca1.buscarLivroPorTitulo("");
        java.lang.String str13 = biblioteca1.getNome();
        imd.Livro livro14 = null;
        biblioteca1.adicionarLivro(livro14);
        imd.Livro livro16 = null;
        biblioteca1.removerLivro(livro16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(livro8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
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
        imd.Livro livro15 = null;
        biblioteca1.removerLivro(livro15);
        imd.Livro livro17 = null;
        biblioteca1.adicionarLivro(livro17);
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(livro12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        int int3 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        imd.Livro livro6 = biblioteca1.buscarLivroPorTitulo("");
        int int7 = biblioteca1.getQuantidadeLivros();
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        imd.Livro livro2 = null;
        biblioteca1.adicionarLivro(livro2);
        int int4 = biblioteca1.getQuantidadeLivros();
        imd.Livro livro5 = null;
        biblioteca1.removerLivro(livro5);
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        imd.Livro livro10 = biblioteca1.buscarLivroPorTitulo("hi!");
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(livro10);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        boolean boolean4 = biblioteca1.verificarDisponibilidade("");
        boolean boolean6 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str7 = biblioteca1.getNome();
        java.lang.String str8 = biblioteca1.getNome();
        boolean boolean10 = biblioteca1.verificarDisponibilidade("");
        java.lang.String str11 = biblioteca1.getNome();
        imd.Livro livro13 = biblioteca1.buscarLivroPorTitulo("hi!");
        imd.Livro livro15 = biblioteca1.buscarLivroPorTitulo("");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
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
        biblioteca1.popularBiblioteca();
        imd.Livro livro19 = null;
        biblioteca1.removerLivro(livro19);
        java.lang.String str21 = biblioteca1.getNome();
        org.junit.Assert.assertNull(livro4);
        org.junit.Assert.assertNull(livro6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(livro13);
        org.junit.Assert.assertNull(livro17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
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
        int int17 = biblioteca1.getQuantidadeLivros();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(livro9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
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
        int int13 = biblioteca1.getQuantidadeLivros();
        boolean boolean15 = biblioteca1.verificarDisponibilidade("hi!");
        boolean boolean17 = biblioteca1.verificarDisponibilidade("hi!");
        java.lang.String str18 = biblioteca1.getNome();
        imd.Livro livro20 = biblioteca1.buscarLivroPorTitulo("hi!");
        boolean boolean22 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(livro20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("hi!");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        java.lang.String str6 = biblioteca1.getNome();
        imd.Livro livro7 = null;
        biblioteca1.removerLivro(livro7);
        java.lang.String str9 = biblioteca1.getNome();
        imd.Livro livro11 = biblioteca1.buscarLivroPorTitulo("");
        imd.Livro livro12 = null;
        biblioteca1.adicionarLivro(livro12);
        java.lang.Class<?> wildcardClass14 = biblioteca1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(livro11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
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
        imd.Livro livro17 = null;
        biblioteca1.removerLivro(livro17);
        boolean boolean20 = biblioteca1.verificarDisponibilidade("hi!");
        org.junit.Assert.assertNull(livro3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(livro14);
        org.junit.Assert.assertNull(livro16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        imd.Biblioteca biblioteca1 = new imd.Biblioteca("");
        biblioteca1.popularBiblioteca();
        biblioteca1.popularBiblioteca();
        boolean boolean5 = biblioteca1.verificarDisponibilidade("");
        imd.Livro livro7 = biblioteca1.buscarLivroPorTitulo("");
        biblioteca1.popularBiblioteca();
        imd.Livro livro9 = null;
        biblioteca1.removerLivro(livro9);
        biblioteca1.popularBiblioteca();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(livro7);
    }
}

