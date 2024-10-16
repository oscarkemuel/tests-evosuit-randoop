import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test03501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03501");
        imd.Livro livro4 = new imd.Livro("", "", 37, 9);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(114);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias((int) (byte) 10);
        java.lang.String str12 = livro4.getAutor();
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str15 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        imd.Livro livro4 = new imd.Livro("hi!", "", (-1), 31);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, 0);
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        java.lang.String str11 = livro4.getTitulo();
        livro4.devolver();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(3);
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) -1, 135);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getPaginas();
        livro4.removerCopias(43);
        int int13 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
        imd.Livro livro4 = new imd.Livro("", "", 0, 100);
        java.lang.String str5 = livro4.getTitulo();
        livro4.adicionarCopias(24);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) -1, (int) '4');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str7 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        imd.Livro livro4 = new imd.Livro("", "", 0, 52);
        livro4.devolver();
        livro4.devolver();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', (-1));
        livro4.removerCopias(87);
        livro4.devolver();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getAutor();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        livro4.removerCopias((int) (byte) 0);
        java.lang.String str13 = livro4.getAutor();
        livro4.adicionarCopias(36);
        livro4.adicionarCopias(43);
        int int18 = livro4.getPaginas();
        livro4.adicionarCopias(4);
        int int21 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        livro4.removerCopias(0);
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(10);
        java.lang.String str15 = livro4.getAutor();
        int int16 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 47 + "'", int16 == 47);
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 35, 67);
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        imd.Livro livro4 = new imd.Livro("", "hi!", 82, 0);
        livro4.devolver();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
        imd.Livro livro4 = new imd.Livro("", "", 12, 115);
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias(10);
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
        imd.Livro livro4 = new imd.Livro("", "hi!", 204, (int) (byte) -1);
        livro4.removerCopias((int) ' ');
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
        imd.Livro livro4 = new imd.Livro("", "", 34, (int) (byte) 1);
        livro4.removerCopias(36);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        imd.Livro livro4 = new imd.Livro("", "hi!", 63, 138);
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        imd.Livro livro4 = new imd.Livro("", "hi!", 35, 35);
        livro4.adicionarCopias(134);
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
        imd.Livro livro4 = new imd.Livro("", "", 3, 52);
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        imd.Livro livro4 = new imd.Livro("", "", 54, 33);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        imd.Livro livro4 = new imd.Livro("", "hi!", 43, (int) '4');
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        livro4.devolver();
        livro4.emprestar();
        int int13 = livro4.getCopiasDisponiveis();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(114);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, 135);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(1);
        livro4.emprestar();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(133);
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.String str12 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias(26);
        livro4.adicionarCopias(57);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        imd.Livro livro4 = new imd.Livro("hi!", "", 45, 1);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        livro4.emprestar();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 45 + "'", int6 == 45);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 100);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias(10);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias(76);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(33);
        livro4.removerCopias(45);
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        livro4.devolver();
        int int17 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
        imd.Livro livro4 = new imd.Livro("", "", 97, 190);
        livro4.removerCopias(76);
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getAutor();
        livro4.adicionarCopias(44);
        int int16 = livro4.getPaginas();
        livro4.removerCopias((int) 'a');
        java.lang.String str19 = livro4.getTitulo();
        livro4.adicionarCopias(156);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 0, (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        java.lang.String str11 = livro4.getAutor();
        livro4.adicionarCopias(45);
        int int14 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
        imd.Livro livro4 = new imd.Livro("", "", 133, 77);
        livro4.devolver();
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
        imd.Livro livro4 = new imd.Livro("", "", 204, 31);
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
        imd.Livro livro4 = new imd.Livro("", "", 224, 12);
        livro4.adicionarCopias(156);
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.removerCopias((int) (byte) 0);
        livro4.adicionarCopias((int) (short) 1);
        livro4.removerCopias(120);
        int int16 = livro4.getPaginas();
        int int17 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        imd.Livro livro4 = new imd.Livro("", "hi!", 26, 138);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26 + "'", int5 == 26);
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
        imd.Livro livro4 = new imd.Livro("hi!", "", 81, 190);
        livro4.adicionarCopias((int) (byte) 0);
        int int7 = livro4.getPaginas();
        livro4.emprestar();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 81 + "'", int7 == 81);
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 9);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias(25);
        livro4.adicionarCopias(35);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 68 + "'", int11 == 68);
    }

    @Test
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        livro4.devolver();
        int int12 = livro4.getPaginas();
        livro4.emprestar();
        int int14 = livro4.getPaginas();
        java.lang.String str15 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 174, 172);
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 35, 100);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias(133);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
        imd.Livro livro4 = new imd.Livro("", "", (int) '#', (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
        imd.Livro livro4 = new imd.Livro("", "", 59, 134);
        livro4.emprestar();
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias((int) 'a');
        java.lang.String str12 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
        imd.Livro livro4 = new imd.Livro("hi!", "", 169, 36);
        livro4.devolver();
        livro4.adicionarCopias(171);
        livro4.removerCopias((-1));
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
        imd.Livro livro4 = new imd.Livro("", "hi!", 51, 25);
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
        imd.Livro livro4 = new imd.Livro("hi!", "", 36, (int) (short) -1);
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        imd.Livro livro4 = new imd.Livro("hi!", "", 87, (int) '4');
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(37);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(135);
        livro4.devolver();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(42);
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getPaginas();
        livro4.adicionarCopias(172);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 171 + "'", int9 == 171);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
        imd.Livro livro4 = new imd.Livro("", "", 10, 135);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(157);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getCopiasDisponiveis();
        int int13 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 67 + "'", int12 == 67);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 67 + "'", int13 == 67);
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, 36);
        livro4.removerCopias(45);
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) '#');
        livro4.devolver();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getPaginas();
        int int15 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
    }

    @Test
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
        imd.Livro livro4 = new imd.Livro("hi!", "", 86, 46);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 46 + "'", int5 == 46);
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((-1));
        livro4.devolver();
        int int14 = livro4.getPaginas();
        java.lang.String str15 = livro4.getTitulo();
        java.lang.String str16 = livro4.getTitulo();
        java.lang.String str17 = livro4.getTitulo();
        livro4.removerCopias((int) 'a');
        int int20 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass21 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
        imd.Livro livro4 = new imd.Livro("hi!", "", 68, 57);
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias(9);
        java.lang.String str13 = livro4.getAutor();
        livro4.adicionarCopias(68);
        int int16 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 95 + "'", int16 == 95);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
        imd.Livro livro4 = new imd.Livro("hi!", "", 41, 78);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str13 = livro4.getAutor();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
        imd.Livro livro4 = new imd.Livro("", "hi!", 156, 12);
        livro4.devolver();
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        imd.Livro livro4 = new imd.Livro("", "hi!", 167, 34);
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(144);
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str13 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str15 = livro4.getAutor();
        java.lang.String str16 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 133, 71);
        livro4.devolver();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 133 + "'", int6 == 133);
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, (int) (short) 10);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
        imd.Livro livro4 = new imd.Livro("", "hi!", 100, 45);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getAutor();
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str12 = livro4.getAutor();
        livro4.emprestar();
        int int14 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
        imd.Livro livro4 = new imd.Livro("", "", (int) '4', 168);
        livro4.adicionarCopias(57);
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((-1));
        livro4.devolver();
        int int14 = livro4.getPaginas();
        java.lang.String str15 = livro4.getTitulo();
        livro4.adicionarCopias(35);
        livro4.adicionarCopias((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.devolver();
        livro4.devolver();
        int int14 = livro4.getPaginas();
        java.lang.String str15 = livro4.getTitulo();
        livro4.adicionarCopias(90);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getAutor();
        livro4.devolver();
        int int14 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
        imd.Livro livro4 = new imd.Livro("", "hi!", 44, 94);
        livro4.removerCopias((int) 'a');
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
        imd.Livro livro4 = new imd.Livro("", "", 31, 121);
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.removerCopias((int) (byte) 0);
        livro4.adicionarCopias(69);
        livro4.adicionarCopias(65);
        livro4.adicionarCopias(134);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias((int) 'a');
        livro4.adicionarCopias(32);
        java.lang.String str14 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str16 = livro4.getAutor();
        livro4.removerCopias(87);
        int int19 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 68 + "'", int19 == 68);
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        imd.Livro livro4 = new imd.Livro("", "hi!", 43, (int) (short) -1);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
        imd.Livro livro4 = new imd.Livro("", "hi!", 235, 0);
        livro4.emprestar();
        livro4.adicionarCopias(48);
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
        imd.Livro livro4 = new imd.Livro("", "", 34, (int) (byte) 1);
        livro4.adicionarCopias((int) (short) 1);
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.devolver();
        livro4.devolver();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getAutor();
        livro4.removerCopias(222);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 126, 31);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 33, 3);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(235);
        int int8 = livro4.getPaginas();
        int int9 = livro4.getPaginas();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(103);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 238 + "'", int11 == 238);
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str14 = livro4.getAutor();
        livro4.removerCopias(241);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.emprestar();
        int int13 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        java.lang.String str13 = livro4.getTitulo();
        int int14 = livro4.getPaginas();
        int int15 = livro4.getCopiasDisponiveis();
        java.lang.String str16 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 44 + "'", int15 == 44);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getPaginas();
        livro4.adicionarCopias(52);
        java.lang.String str13 = livro4.getAutor();
        livro4.removerCopias(169);
        java.lang.String str16 = livro4.getAutor();
        livro4.removerCopias(98);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(36);
        livro4.adicionarCopias((int) (byte) 100);
        java.lang.String str12 = livro4.getTitulo();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.String str14 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 135 + "'", int13 == 135);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
        imd.Livro livro4 = new imd.Livro("", "hi!", 26, 37);
        livro4.removerCopias(12);
        java.lang.String str7 = livro4.getTitulo();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25 + "'", int8 == 25);
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.devolver();
        livro4.removerCopias(35);
        java.lang.String str13 = livro4.getAutor();
        livro4.adicionarCopias(9);
        livro4.adicionarCopias(61);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 100);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str13 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getPaginas();
        livro4.removerCopias(84);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 36, 69);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(42);
        livro4.adicionarCopias(0);
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 69 + "'", int5 == 69);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 0, 52);
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        int int15 = livro4.getCopiasDisponiveis();
        java.lang.String str16 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((-1));
        livro4.devolver();
        int int14 = livro4.getPaginas();
        java.lang.String str15 = livro4.getTitulo();
        java.lang.String str16 = livro4.getAutor();
        livro4.removerCopias(37);
        java.lang.String str19 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        livro4.removerCopias(240);
        livro4.removerCopias(101);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str11 = livro4.getTitulo();
        livro4.removerCopias(44);
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getCopiasDisponiveis();
        java.lang.String str16 = livro4.getAutor();
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
        imd.Livro livro4 = new imd.Livro("", "hi!", 43, (int) (short) -1);
        livro4.removerCopias(3);
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(0);
        java.lang.String str12 = livro4.getTitulo();
        livro4.removerCopias(10);
        int int15 = livro4.getPaginas();
        livro4.adicionarCopias(140);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        livro4.removerCopias(0);
        java.lang.String str10 = livro4.getAutor();
        livro4.adicionarCopias(138);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
        imd.Livro livro4 = new imd.Livro("hi!", "", 34, (int) (short) 0);
        livro4.emprestar();
        livro4.adicionarCopias(44);
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(81);
        livro4.removerCopias(105);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 44 + "'", int8 == 44);
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        livro4.removerCopias((int) (byte) 0);
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(37);
        int int21 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 34 + "'", int21 == 34);
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        imd.Livro livro4 = new imd.Livro("", "", 74, 97);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 135, (int) (short) 0);
        livro4.devolver();
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
        imd.Livro livro4 = new imd.Livro("hi!", "", 69, 81);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) -1, 10);
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getPaginas();
        livro4.removerCopias(0);
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(99);
        int int15 = livro4.getCopiasDisponiveis();
        int int16 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 36 + "'", int16 == 36);
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
        imd.Livro livro4 = new imd.Livro("hi!", "", 240, 61);
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getAutor();
        livro4.removerCopias(26);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, 0);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        java.lang.String str10 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
        imd.Livro livro4 = new imd.Livro("hi!", "", 35, 135);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) (short) 0);
        livro4.emprestar();
        livro4.adicionarCopias(34);
        livro4.devolver();
        java.lang.String str15 = livro4.getAutor();
        int int16 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 68 + "'", int16 == 68);
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 0, 135);
        livro4.removerCopias((int) (short) -1);
        livro4.emprestar();
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.devolver();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, 107);
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        imd.Livro livro4 = new imd.Livro("hi!", "", 37, (int) (short) 1);
        livro4.devolver();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getTitulo();
        livro4.removerCopias(171);
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        livro4.removerCopias(34);
        livro4.removerCopias((int) (byte) 100);
        java.lang.String str9 = livro4.getAutor();
        livro4.removerCopias(67);
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 100, 135);
        livro4.adicionarCopias(136);
        int int7 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 271 + "'", int7 == 271);
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
        imd.Livro livro4 = new imd.Livro("", "", 0, (int) (byte) 1);
        livro4.devolver();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        imd.Livro livro4 = new imd.Livro("", "hi!", 81, (int) 'a');
        java.lang.String str5 = livro4.getTitulo();
        livro4.adicionarCopias(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 69, 134);
        java.lang.String str5 = livro4.getTitulo();
        livro4.adicionarCopias((int) (short) 0);
        livro4.adicionarCopias(190);
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 324 + "'", int10 == 324);
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
        imd.Livro livro4 = new imd.Livro("", "hi!", 103, 59);
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.emprestar();
        livro4.removerCopias(33);
        int int10 = livro4.getPaginas();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(172);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(33);
        int int12 = livro4.getPaginas();
        int int13 = livro4.getPaginas();
        int int14 = livro4.getCopiasDisponiveis();
        java.lang.String str15 = livro4.getAutor();
        livro4.removerCopias(44);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) '4');
        livro4.emprestar();
        livro4.removerCopias(32);
        java.lang.String str8 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
        imd.Livro livro4 = new imd.Livro("", "", 120, (int) (short) 0);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getAutor();
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
        imd.Livro livro4 = new imd.Livro("", "", 57, (-1));
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        java.lang.String str13 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
        imd.Livro livro4 = new imd.Livro("hi!", "", 36, (int) (byte) -1);
        livro4.adicionarCopias(0);
        livro4.adicionarCopias((int) '4');
        livro4.removerCopias((int) (byte) 100);
        livro4.devolver();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(235);
        livro4.adicionarCopias(99);
        int int12 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        livro4.removerCopias((int) (byte) 100);
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
        imd.Livro livro4 = new imd.Livro("", "hi!", 51, 101);
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        livro4.removerCopias((-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
        imd.Livro livro4 = new imd.Livro("hi!", "", 36, (int) (byte) -1);
        livro4.adicionarCopias(0);
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias(87);
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        java.lang.String str13 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (byte) 0);
        livro4.emprestar();
        java.lang.String str9 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, (int) 'a');
        livro4.emprestar();
    }

    @Test
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        livro4.adicionarCopias((int) (byte) 10);
        livro4.removerCopias(84);
        livro4.removerCopias(81);
        java.lang.String str13 = livro4.getAutor();
        java.lang.String str14 = livro4.getTitulo();
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias(12);
        int int15 = livro4.getPaginas();
        int int16 = livro4.getCopiasDisponiveis();
        int int17 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 45 + "'", int17 == 45);
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.devolver();
        livro4.emprestar();
        livro4.adicionarCopias((int) (byte) 0);
        java.lang.String str14 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str16 = livro4.getAutor();
        livro4.devolver();
        livro4.devolver();
        livro4.removerCopias(226);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
        imd.Livro livro4 = new imd.Livro("hi!", "", 169, 11);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (short) -1);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
        imd.Livro livro4 = new imd.Livro("hi!", "", 156, (int) (short) 10);
        livro4.removerCopias(45);
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(324);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 156 + "'", int7 == 156);
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
        imd.Livro livro4 = new imd.Livro("hi!", "", 168, 32);
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.adicionarCopias(59);
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str7 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        livro4.emprestar();
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        imd.Livro livro4 = new imd.Livro("", "", 170, (int) (short) 100);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
        imd.Livro livro4 = new imd.Livro("", "", 1, (int) (short) 0);
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias(8);
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
        imd.Livro livro4 = new imd.Livro("hi!", "", 226, 63);
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias((int) 'a');
        livro4.adicionarCopias(32);
        java.lang.String str14 = livro4.getTitulo();
        livro4.removerCopias((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
        imd.Livro livro4 = new imd.Livro("", "hi!", 136, (int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(86);
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, 36);
        livro4.removerCopias(45);
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) '#');
        livro4.removerCopias(167);
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias((int) '4');
        livro4.adicionarCopias(33);
        int int12 = livro4.getPaginas();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.devolver();
        int int16 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 120 + "'", int13 == 120);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias(135);
        int int16 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(157);
        livro4.devolver();
        livro4.removerCopias(226);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 171 + "'", int16 == 171);
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        livro4.removerCopias(99);
        java.lang.String str14 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        livro4.removerCopias(43);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 1, (int) (short) 1);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.emprestar();
        livro4.removerCopias(77);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '4', 10);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        imd.Livro livro4 = new imd.Livro("", "", 0, 0);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 1, 23);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.emprestar();
        int int13 = livro4.getCopiasDisponiveis();
        int int14 = livro4.getCopiasDisponiveis();
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        livro4.removerCopias(144);
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((-1));
        livro4.adicionarCopias((int) (short) 10);
        int int15 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) '4');
        java.lang.String str18 = livro4.getTitulo();
        int int19 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 44 + "'", int15 == 44);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 44 + "'", int19 == 44);
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias((-1));
        java.lang.String str16 = livro4.getTitulo();
        int int17 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 0, 135);
        livro4.removerCopias((int) (short) -1);
        java.lang.String str7 = livro4.getTitulo();
        livro4.adicionarCopias(135);
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
        imd.Livro livro4 = new imd.Livro("", "hi!", 38, 120);
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        imd.Livro livro4 = new imd.Livro("", "hi!", 2, 135);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(114);
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, 36);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(24);
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36 + "'", int5 == 36);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
        imd.Livro livro4 = new imd.Livro("hi!", "", (-1), 31);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(11);
        livro4.removerCopias(76);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, (int) (short) 10);
        livro4.adicionarCopias((int) ' ');
        livro4.devolver();
        livro4.devolver();
        livro4.removerCopias(97);
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
        imd.Livro livro4 = new imd.Livro("hi!", "", 1, 133);
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
        imd.Livro livro4 = new imd.Livro("", "", 136, 42);
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.emprestar();
        int int11 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str14 = livro4.getAutor();
        livro4.removerCopias(24);
        java.lang.String str17 = livro4.getTitulo();
        java.lang.String str18 = livro4.getAutor();
        int int19 = livro4.getPaginas();
        livro4.adicionarCopias(99);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getPaginas();
        livro4.removerCopias((int) '#');
        livro4.emprestar();
        java.lang.String str9 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        livro4.emprestar();
        livro4.emprestar();
        int int10 = livro4.getPaginas();
        livro4.adicionarCopias(37);
        livro4.devolver();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 71 + "'", int14 == 71);
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', 35);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (byte) 0);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 10);
        livro4.devolver();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(11);
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str12 = livro4.getAutor();
        java.lang.String str13 = livro4.getAutor();
        livro4.adicionarCopias(68);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
        imd.Livro livro4 = new imd.Livro("hi!", "", 37, (int) (short) 1);
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, 120);
        livro4.devolver();
        livro4.emprestar();
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str9 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.devolver();
        livro4.devolver();
        int int14 = livro4.getPaginas();
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) (short) 0);
        livro4.emprestar();
        livro4.devolver();
        livro4.removerCopias(266);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        livro4.devolver();
        int int12 = livro4.getPaginas();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int15 = livro4.getPaginas();
        int int16 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 37 + "'", int16 == 37);
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
        imd.Livro livro4 = new imd.Livro("", "", 267, 0);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.adicionarCopias(75);
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 109 + "'", int11 == 109);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        java.lang.String str14 = livro4.getAutor();
        livro4.emprestar();
        livro4.adicionarCopias((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (short) -1);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int14 = livro4.getCopiasDisponiveis();
        java.lang.String str15 = livro4.getTitulo();
        int int16 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 33 + "'", int14 == 33);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias(171);
        livro4.removerCopias(232);
        java.lang.String str11 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getPaginas();
        livro4.removerCopias(100);
        livro4.removerCopias((int) (short) -1);
        livro4.removerCopias(24);
        int int19 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 133, 113);
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(0);
        livro4.removerCopias(135);
        livro4.adicionarCopias((int) (short) 10);
        java.lang.String str16 = livro4.getTitulo();
        java.lang.String str17 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
        imd.Livro livro4 = new imd.Livro("", "", 36, 144);
        livro4.adicionarCopias(44);
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias(44);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(95);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
        imd.Livro livro4 = new imd.Livro("", "hi!", 135, (int) (byte) -1);
        livro4.devolver();
        livro4.removerCopias(48);
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        livro4.removerCopias(0);
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str14 = livro4.getAutor();
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str13 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str15 = livro4.getAutor();
        livro4.adicionarCopias(190);
        java.lang.Class<?> wildcardClass18 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        imd.Livro livro4 = new imd.Livro("", "", 52, (int) (short) 100);
        livro4.adicionarCopias(2);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        imd.Livro livro4 = new imd.Livro("", "hi!", 3, 10);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, (int) (short) 100);
        int int5 = livro4.getPaginas();
        livro4.removerCopias(90);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 132);
        livro4.adicionarCopias(167);
        livro4.removerCopias(77);
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        livro4.emprestar();
        int int8 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(33);
        livro4.removerCopias(45);
        livro4.removerCopias((int) (short) -1);
        java.lang.String str16 = livro4.getTitulo();
        livro4.adicionarCopias(169);
        livro4.removerCopias(120);
        int int21 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass22 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        imd.Livro livro4 = new imd.Livro("", "hi!", 81, (int) 'a');
        livro4.removerCopias(34);
        livro4.removerCopias(151);
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
        imd.Livro livro4 = new imd.Livro("", "", 63, 109);
        livro4.emprestar();
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
        imd.Livro livro4 = new imd.Livro("hi!", "", 34, (int) (short) 0);
        livro4.emprestar();
        livro4.adicionarCopias(44);
        livro4.devolver();
        livro4.adicionarCopias(99);
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 10);
        livro4.removerCopias(87);
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, 0);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias(65);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias(0);
        livro4.emprestar();
        livro4.removerCopias(37);
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        livro4.removerCopias(34);
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias(0);
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        livro4.removerCopias((int) '#');
        java.lang.String str15 = livro4.getAutor();
        livro4.removerCopias(77);
        livro4.adicionarCopias(121);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
        imd.Livro livro4 = new imd.Livro("", "", 70, 225);
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        livro4.adicionarCopias(0);
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(33);
        livro4.removerCopias(45);
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) -1, 35);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        java.lang.String str11 = livro4.getAutor();
        livro4.devolver();
        int int13 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias(172);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        imd.Livro livro4 = new imd.Livro("hi!", "", 52, (int) (short) 100);
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias(12);
        int int15 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 2, (int) (byte) 1);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(114);
        int int8 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
        imd.Livro livro4 = new imd.Livro("", "hi!", 4, 100);
        int int5 = livro4.getPaginas();
        livro4.removerCopias(224);
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) 100);
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str14 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 135 + "'", int12 == 135);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias((int) 'a');
        livro4.adicionarCopias(32);
        int int14 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(114);
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 67 + "'", int14 == 67);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias(37);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias(2);
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        livro4.removerCopias((int) (byte) 0);
        java.lang.String str13 = livro4.getAutor();
        livro4.adicionarCopias(36);
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((-1));
        livro4.devolver();
        int int14 = livro4.getPaginas();
        java.lang.String str15 = livro4.getTitulo();
        java.lang.String str16 = livro4.getTitulo();
        livro4.removerCopias(0);
        java.lang.String str19 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass20 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getPaginas();
        livro4.removerCopias(105);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getTitulo();
        livro4.adicionarCopias(225);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) -1, 67);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias(99);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(36);
        java.lang.String str9 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.removerCopias((int) (byte) 0);
        int int12 = livro4.getPaginas();
        livro4.emprestar();
        livro4.removerCopias(32);
        livro4.devolver();
        java.lang.String str17 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias(82);
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
        imd.Livro livro4 = new imd.Livro("", "hi!", 167, 101);
        livro4.removerCopias(131);
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(35);
        int int13 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 0);
        livro4.devolver();
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 69 + "'", int13 == 69);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(26);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 43 + "'", int11 == 43);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 43 + "'", int12 == 43);
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias((int) '4');
        livro4.adicionarCopias(36);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
        imd.Livro livro4 = new imd.Livro("", "", 67, 4);
        livro4.adicionarCopias(99);
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, 0);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(0);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
        imd.Livro livro4 = new imd.Livro("hi!", "", 36, (int) (byte) -1);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias(235);
        int int9 = livro4.getPaginas();
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 100, (int) (short) 0);
        livro4.devolver();
        livro4.devolver();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) ' ');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) -1, 135);
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 132 + "'", int9 == 132);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
        imd.Livro livro4 = new imd.Livro("hi!", "", 1, 177);
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias((int) 'a');
        livro4.adicionarCopias(44);
        livro4.devolver();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str11 = livro4.getAutor();
        livro4.emprestar();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 34 + "'", int13 == 34);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 0, 170);
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '#', 82);
        livro4.removerCopias(84);
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
        imd.Livro livro4 = new imd.Livro("", "", 136, (int) (byte) -1);
        livro4.adicionarCopias(24);
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(33);
        livro4.removerCopias(45);
        java.lang.String str14 = livro4.getTitulo();
        livro4.adicionarCopias(34);
        int int17 = livro4.getCopiasDisponiveis();
        java.lang.String str18 = livro4.getAutor();
        livro4.removerCopias((-1));
        livro4.adicionarCopias(32);
        int int23 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(86);
        java.lang.Class<?> wildcardClass29 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 69 + "'", int23 == 69);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
        imd.Livro livro4 = new imd.Livro("", "", 33, (int) (byte) 1);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        int int11 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str13 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.emprestar();
        int int11 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str14 = livro4.getAutor();
        livro4.adicionarCopias(36);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        int int9 = livro4.getPaginas();
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, 0);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias(169);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 100);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
        imd.Livro livro4 = new imd.Livro("hi!", "", 86, 98);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
        imd.Livro livro4 = new imd.Livro("", "", 69, (int) (byte) 0);
        livro4.adicionarCopias((int) (byte) 0);
        livro4.removerCopias(136);
        livro4.adicionarCopias(167);
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 69 + "'", int11 == 69);
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.adicionarCopias(0);
        int int12 = livro4.getPaginas();
        livro4.emprestar();
        livro4.removerCopias((int) (short) 10);
        int int16 = livro4.getPaginas();
        int int17 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(157);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 123 + "'", int17 == 123);
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(4);
        java.lang.String str15 = livro4.getTitulo();
        livro4.removerCopias((int) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((-1));
        livro4.devolver();
        int int14 = livro4.getPaginas();
        java.lang.String str15 = livro4.getTitulo();
        java.lang.String str16 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str18 = livro4.getTitulo();
        int int19 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(86);
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        livro4.devolver();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias(170);
        int int13 = livro4.getPaginas();
        livro4.devolver();
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 135, 156);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
        imd.Livro livro4 = new imd.Livro("", "", 44, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.adicionarCopias(31);
        livro4.devolver();
        int int11 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 44 + "'", int11 == 44);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        livro4.emprestar();
        livro4.devolver();
        livro4.devolver();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str13 = livro4.getTitulo();
        livro4.removerCopias(136);
        livro4.removerCopias(98);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
        imd.Livro livro4 = new imd.Livro("", "", 105, 34);
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, (int) 'a');
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
        imd.Livro livro4 = new imd.Livro("", "", 324, 170);
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        livro4.removerCopias((int) (short) 100);
        int int10 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(78);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.devolver();
        livro4.adicionarCopias(98);
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getCopiasDisponiveis();
        java.lang.String str16 = livro4.getTitulo();
        livro4.adicionarCopias(121);
        livro4.emprestar();
        livro4.removerCopias((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 0, (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.adicionarCopias(44);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
        imd.Livro livro4 = new imd.Livro("", "", 134, 174);
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getTitulo();
        int int15 = livro4.getCopiasDisponiveis();
        java.lang.String str16 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(204);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias(0);
        livro4.removerCopias(36);
        java.lang.String str13 = livro4.getAutor();
        livro4.removerCopias(77);
        livro4.removerCopias(10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(33);
        livro4.removerCopias(45);
        java.lang.String str14 = livro4.getTitulo();
        livro4.adicionarCopias(34);
        int int17 = livro4.getCopiasDisponiveis();
        java.lang.String str18 = livro4.getAutor();
        livro4.devolver();
        livro4.devolver();
        java.lang.String str21 = livro4.getAutor();
        livro4.devolver();
        java.lang.Class<?> wildcardClass23 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
        imd.Livro livro4 = new imd.Livro("", "hi!", 8, 103);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
    }

    @Test
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', 81);
        livro4.adicionarCopias(51);
        livro4.emprestar();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 131 + "'", int9 == 131);
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 43 + "'", int11 == 43);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 43 + "'", int12 == 43);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 0);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 10);
        livro4.devolver();
        int int9 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) -1, 135);
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) -1);
        livro4.devolver();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 27, 111);
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.emprestar();
        livro4.removerCopias((int) ' ');
        int int11 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(33);
        livro4.removerCopias(45);
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        int int16 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (byte) 10);
        int int19 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, 0);
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias(0);
        livro4.emprestar();
        java.lang.String str14 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str16 = livro4.getTitulo();
        livro4.devolver();
        livro4.removerCopias(67);
        livro4.removerCopias(3);
        livro4.adicionarCopias(106);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) -1, 33);
        livro4.devolver();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias(101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        java.lang.String str11 = livro4.getAutor();
        livro4.devolver();
        int int13 = livro4.getPaginas();
        livro4.removerCopias(156);
        java.lang.String str16 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str13 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) 10);
        int int16 = livro4.getCopiasDisponiveis();
        java.lang.String str17 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 43 + "'", int16 == 43);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        imd.Livro livro4 = new imd.Livro("hi!", "", 36, (int) (byte) -1);
        livro4.adicionarCopias(0);
        livro4.adicionarCopias((int) '4');
        livro4.removerCopias((int) (byte) 100);
        livro4.devolver();
        java.lang.String str12 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(35);
        int int15 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(235);
        int int18 = livro4.getPaginas();
        livro4.devolver();
        int int20 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 71 + "'", int15 == 71);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 72 + "'", int20 == 72);
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
        imd.Livro livro4 = new imd.Livro("", "hi!", 133, 9);
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 37, (int) (short) 0);
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        imd.Livro livro4 = new imd.Livro("", "", 100, 87);
        int int5 = livro4.getPaginas();
        livro4.removerCopias(9);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (byte) 10);
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 68 + "'", int13 == 68);
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 100, (int) (short) 0);
        livro4.devolver();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias(0);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
        imd.Livro livro4 = new imd.Livro("hi!", "", 1, 59);
        livro4.removerCopias(9);
        livro4.emprestar();
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (short) -1);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getPaginas();
        livro4.removerCopias(100);
        livro4.devolver();
        livro4.adicionarCopias(12);
        livro4.emprestar();
        livro4.removerCopias(226);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (byte) 0);
        int int12 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(60);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) ' ', 120);
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        livro4.removerCopias(1);
        livro4.emprestar();
        int int16 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
        imd.Livro livro4 = new imd.Livro("", "", 0, 34);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getTitulo();
        livro4.removerCopias(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(51);
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
        imd.Livro livro4 = new imd.Livro("hi!", "", 87, 48);
        livro4.removerCopias(190);
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str12 = livro4.getAutor();
        livro4.emprestar();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias(324);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 37, 54);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 54 + "'", int5 == 54);
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        livro4.removerCopias((int) (byte) 100);
        java.lang.String str15 = livro4.getTitulo();
        int int16 = livro4.getCopiasDisponiveis();
        java.lang.String str17 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33 + "'", int16 == 33);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) -1, 135);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getAutor();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
        imd.Livro livro4 = new imd.Livro("hi!", "", 0, (int) (byte) 1);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getCopiasDisponiveis();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 34 + "'", int13 == 34);
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
        imd.Livro livro4 = new imd.Livro("", "hi!", 100, 45);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 170, 0);
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
        imd.Livro livro4 = new imd.Livro("", "hi!", 266, 35);
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.adicionarCopias(0);
        int int12 = livro4.getPaginas();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.String str14 = livro4.getTitulo();
        livro4.removerCopias(69);
        java.lang.String str17 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass19 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 134 + "'", int13 == 134);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
        imd.Livro livro4 = new imd.Livro("", "hi!", 135, 0);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) 100);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        int int16 = livro4.getCopiasDisponiveis();
        int int17 = livro4.getPaginas();
        livro4.emprestar();
        livro4.emprestar();
        int int20 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 135 + "'", int11 == 135);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 135 + "'", int16 == 135);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 133 + "'", int20 == 133);
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) 100);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        java.lang.String str16 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 135 + "'", int11 == 135);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
        imd.Livro livro4 = new imd.Livro("", "hi!", 44, 34);
        livro4.adicionarCopias((int) 'a');
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(68);
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
        imd.Livro livro4 = new imd.Livro("", "", 87, 37);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 37 + "'", int5 == 37);
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.removerCopias(48);
        livro4.removerCopias(177);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getPaginas();
        int int13 = livro4.getPaginas();
        livro4.removerCopias(0);
        livro4.devolver();
        int int17 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
        imd.Livro livro4 = new imd.Livro("hi!", "", 36, (int) (byte) -1);
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.removerCopias(45);
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.adicionarCopias((int) (byte) 10);
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 43 + "'", int13 == 43);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        livro4.removerCopias(67);
        livro4.removerCopias(46);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        livro4.adicionarCopias(34);
        livro4.removerCopias(0);
        livro4.adicionarCopias((int) ' ');
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        livro4.removerCopias(99);
        livro4.emprestar();
        livro4.emprestar();
        int int16 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass18 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) 100);
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str14 = livro4.getAutor();
        livro4.removerCopias(95);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 135 + "'", int12 == 135);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
        imd.Livro livro4 = new imd.Livro("", "", 135, 52);
        livro4.removerCopias(134);
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 120, (int) '#');
        livro4.adicionarCopias(1);
        java.lang.String str7 = livro4.getTitulo();
        livro4.removerCopias((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.emprestar();
        livro4.adicionarCopias(169);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(33);
        livro4.removerCopias(45);
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) -1);
        int int18 = livro4.getCopiasDisponiveis();
        int int19 = livro4.getPaginas();
        java.lang.String str20 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
        imd.Livro livro4 = new imd.Livro("", "", 114, 9);
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), 135);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(100);
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 100, (int) (short) 10);
        livro4.adicionarCopias((int) ' ');
        livro4.adicionarCopias(68);
        livro4.removerCopias(84);
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 9);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias(25);
        livro4.adicionarCopias(35);
        java.lang.String str11 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        livro4.removerCopias((int) (byte) 0);
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
        imd.Livro livro4 = new imd.Livro("", "", 54, 33);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((-1));
        java.lang.String str14 = livro4.getAutor();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 45 + "'", int11 == 45);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) 100);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(34);
        java.lang.String str14 = livro4.getAutor();
        livro4.removerCopias(35);
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 135 + "'", int11 == 135);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 42, 32);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
        imd.Livro livro4 = new imd.Livro("hi!", "", 169, 36);
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        java.lang.String str13 = livro4.getTitulo();
        int int14 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 44 + "'", int14 == 44);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) -1, 33);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 33 + "'", int6 == 33);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
        imd.Livro livro4 = new imd.Livro("hi!", "", 81, (int) (byte) -1);
        livro4.adicionarCopias(50);
        livro4.removerCopias(68);
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
        imd.Livro livro4 = new imd.Livro("", "hi!", 224, 133);
        livro4.removerCopias(87);
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) -1, 135);
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.removerCopias(69);
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias(0);
        livro4.removerCopias(36);
        java.lang.String str13 = livro4.getAutor();
        livro4.removerCopias(77);
        int int16 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, (int) (short) 1);
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 34, 45);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 45 + "'", int5 == 45);
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getTitulo();
        livro4.adicionarCopias(75);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        imd.Livro livro4 = new imd.Livro("", "", 107, 51);
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
        imd.Livro livro4 = new imd.Livro("", "", 44, 132);
        livro4.removerCopias(24);
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getAutor();
        livro4.emprestar();
        livro4.removerCopias(145);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(45);
        java.lang.String str12 = livro4.getAutor();
        livro4.adicionarCopias(134);
        java.lang.String str15 = livro4.getAutor();
        livro4.removerCopias(12);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        livro4.adicionarCopias(34);
        livro4.adicionarCopias(2);
        livro4.adicionarCopias(52);
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 34);
        livro4.removerCopias(120);
        livro4.devolver();
        java.lang.String str8 = livro4.getAutor();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 118, 72);
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
        imd.Livro livro4 = new imd.Livro("hi!", "", 170, 1);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) 'a', (int) (byte) 100);
        livro4.removerCopias(32);
        livro4.emprestar();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        imd.Livro livro4 = new imd.Livro("", "", 10, 37);
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(97);
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        java.lang.String str11 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', 10);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(47);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
        imd.Livro livro4 = new imd.Livro("hi!", "", 37, (int) (short) 1);
        livro4.emprestar();
        livro4.emprestar();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
        imd.Livro livro4 = new imd.Livro("", "", 0, 36);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias((-1));
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.removerCopias((int) (byte) 0);
        livro4.adicionarCopias(69);
        livro4.adicionarCopias(1);
        int int16 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(100);
        java.lang.String str19 = livro4.getAutor();
        livro4.emprestar();
        livro4.removerCopias(36);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 69 + "'", int16 == 69);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
        imd.Livro livro4 = new imd.Livro("", "hi!", 59, 144);
        livro4.devolver();
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 0, 52);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((-1));
        livro4.adicionarCopias((int) (short) 10);
        int int15 = livro4.getCopiasDisponiveis();
        int int16 = livro4.getPaginas();
        livro4.emprestar();
        int int18 = livro4.getPaginas();
        int int19 = livro4.getCopiasDisponiveis();
        int int20 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str23 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 44 + "'", int15 == 44);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 43 + "'", int19 == 43);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 43 + "'", int20 == 43);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.adicionarCopias((int) ' ');
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        java.lang.String str11 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str13 = livro4.getAutor();
        livro4.devolver();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        livro4.adicionarCopias(167);
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 69, 1);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
        imd.Livro livro4 = new imd.Livro("hi!", "", 25, 151);
    }

    @Test
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 109, 172);
        livro4.removerCopias(153);
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        imd.Livro livro4 = new imd.Livro("hi!", "", 68, 2);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias((int) (byte) 10);
        java.lang.String str12 = livro4.getAutor();
        livro4.devolver();
        int int14 = livro4.getCopiasDisponiveis();
        java.lang.String str15 = livro4.getAutor();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25 + "'", int14 == 25);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        livro4.removerCopias(34);
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias(0);
        int int11 = livro4.getPaginas();
        livro4.adicionarCopias(87);
        livro4.removerCopias(121);
        java.lang.String str16 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias((int) (byte) 1);
        int int12 = livro4.getPaginas();
        int int13 = livro4.getPaginas();
        livro4.removerCopias(2);
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
        imd.Livro livro4 = new imd.Livro("", "", 59, 134);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 134 + "'", int5 == 134);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(77);
        livro4.devolver();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 113 + "'", int12 == 113);
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str7 = livro4.getAutor();
        livro4.removerCopias(0);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 32, 120);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(65);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
        imd.Livro livro4 = new imd.Livro("hi!", "", 44, 0);
        livro4.devolver();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 44 + "'", int6 == 44);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.emprestar();
        livro4.removerCopias((int) (byte) 100);
        livro4.adicionarCopias((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        java.lang.String str7 = livro4.getTitulo();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
        imd.Livro livro4 = new imd.Livro("", "hi!", 81, (int) ' ');
        livro4.devolver();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 0);
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 167, 32);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', 26);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 10, (int) ' ');
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
        imd.Livro livro4 = new imd.Livro("hi!", "", 97, 24);
        livro4.devolver();
        livro4.adicionarCopias(107);
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str7 = livro4.getAutor();
        livro4.removerCopias(71);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
        imd.Livro livro4 = new imd.Livro("", "", 1, (int) ' ');
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        int int9 = livro4.getPaginas();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.devolver();
        livro4.removerCopias(135);
        livro4.emprestar();
        int int14 = livro4.getPaginas();
        java.lang.String str15 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
        imd.Livro livro4 = new imd.Livro("", "", 81, 97);
        livro4.removerCopias((int) '4');
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(133);
        livro4.emprestar();
        livro4.removerCopias(25);
        int int13 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 81 + "'", int7 == 81);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 152 + "'", int13 == 152);
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
        imd.Livro livro4 = new imd.Livro("", "hi!", 35, 171);
        livro4.removerCopias(133);
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) ' ');
        livro4.emprestar();
        int int14 = livro4.getPaginas();
        livro4.adicionarCopias((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 34);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(81);
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias(169);
        livro4.devolver();
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias((int) 'a');
        livro4.adicionarCopias(44);
        livro4.devolver();
        livro4.removerCopias(0);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 69, 134);
        java.lang.String str5 = livro4.getTitulo();
        livro4.adicionarCopias((int) (short) 0);
        livro4.emprestar();
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(0);
        java.lang.String str12 = livro4.getTitulo();
        livro4.removerCopias(10);
        java.lang.String str15 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
        imd.Livro livro4 = new imd.Livro("", "hi!", 133, 10);
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 133 + "'", int5 == 133);
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, (int) (byte) 0);
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
        imd.Livro livro4 = new imd.Livro("", "", 120, (int) (byte) 0);
        livro4.devolver();
        livro4.adicionarCopias(50);
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.removerCopias(23);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str11 = livro4.getAutor();
        livro4.emprestar();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.removerCopias(0);
        livro4.removerCopias(74);
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 34 + "'", int13 == 34);
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((-1));
        livro4.devolver();
        int int14 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str16 = livro4.getTitulo();
        java.lang.String str17 = livro4.getAutor();
        java.lang.Class<?> wildcardClass18 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
        imd.Livro livro4 = new imd.Livro("", "", 10, 37);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias(33);
        int int9 = livro4.getPaginas();
        int int10 = livro4.getPaginas();
        livro4.removerCopias(100);
        java.lang.String str13 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
        imd.Livro livro4 = new imd.Livro("hi!", "", 35, (int) (short) 1);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, 36);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(169);
        livro4.devolver();
        livro4.adicionarCopias(64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
        imd.Livro livro4 = new imd.Livro("", "hi!", 135, 0);
        livro4.adicionarCopias((int) ' ');
        livro4.devolver();
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.emprestar();
        livro4.removerCopias((int) ' ');
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        imd.Livro livro4 = new imd.Livro("", "hi!", 59, 71);
        livro4.removerCopias(11);
        java.lang.String str7 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
        imd.Livro livro4 = new imd.Livro("hi!", "", 169, 36);
        livro4.devolver();
        livro4.removerCopias(98);
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getPaginas();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) ' ');
        livro4.emprestar();
        livro4.removerCopias((-1));
        int int16 = livro4.getCopiasDisponiveis();
        java.lang.String str17 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 68 + "'", int16 == 68);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias(0);
        livro4.removerCopias(36);
        livro4.adicionarCopias(114);
        java.lang.String str15 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        imd.Livro livro4 = new imd.Livro("", "hi!", 34, 53);
        livro4.removerCopias(97);
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        int int9 = livro4.getPaginas();
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias((int) ' ');
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        livro4.emprestar();
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        imd.Livro livro4 = new imd.Livro("", "hi!", 35, 35);
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(11);
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 24 + "'", int9 == 24);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 24 + "'", int10 == 24);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
        imd.Livro livro4 = new imd.Livro("", "", 0, 34);
        livro4.emprestar();
        livro4.adicionarCopias(34);
        livro4.adicionarCopias(51);
        livro4.adicionarCopias(69);
        livro4.devolver();
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
        imd.Livro livro4 = new imd.Livro("", "", (int) '#', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getTitulo();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(37);
        java.lang.String str11 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) -1, 222);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, (int) (short) 10);
        livro4.adicionarCopias((int) ' ');
        livro4.devolver();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
        imd.Livro livro4 = new imd.Livro("", "hi!", 35, 35);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias(24);
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
        imd.Livro livro4 = new imd.Livro("hi!", "", 36, (int) (byte) -1);
        livro4.adicionarCopias(0);
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias(87);
        livro4.devolver();
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 95, 321);
        int int5 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 95 + "'", int5 == 95);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
        imd.Livro livro4 = new imd.Livro("hi!", "", 69, 174);
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(69);
        java.lang.String str13 = livro4.getAutor();
        livro4.removerCopias(50);
        int int16 = livro4.getCopiasDisponiveis();
        int int17 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 54 + "'", int16 == 54);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 54 + "'", int17 == 54);
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        int int9 = livro4.getPaginas();
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias((int) ' ');
        java.lang.String str13 = livro4.getAutor();
        livro4.removerCopias(324);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
        imd.Livro livro4 = new imd.Livro("", "", 71, 47);
        livro4.devolver();
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(33);
        livro4.removerCopias(45);
        java.lang.String str14 = livro4.getTitulo();
        livro4.adicionarCopias(34);
        int int17 = livro4.getCopiasDisponiveis();
        java.lang.String str18 = livro4.getAutor();
        livro4.removerCopias((-1));
        livro4.adicionarCopias(32);
        int int23 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(86);
        livro4.adicionarCopias(54);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 69 + "'", int23 == 69);
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 61);
        livro4.devolver();
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
        imd.Livro livro4 = new imd.Livro("hi!", "", 144, 71);
        livro4.adicionarCopias((int) (short) 1);
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getTitulo();
        int int15 = livro4.getCopiasDisponiveis();
        java.lang.String str16 = livro4.getTitulo();
        livro4.adicionarCopias(52);
        java.lang.String str19 = livro4.getAutor();
        int int20 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 85 + "'", int20 == 85);
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias((int) (byte) 10);
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.devolver();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
        imd.Livro livro4 = new imd.Livro("hi!", "", 47, 94);
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 10, (int) ' ');
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        livro4.removerCopias((int) '4');
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
        imd.Livro livro4 = new imd.Livro("", "", 45, 241);
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((-1));
        livro4.devolver();
        int int14 = livro4.getPaginas();
        int int15 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(0);
        livro4.removerCopias(98);
        int int20 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '#', 0);
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
        imd.Livro livro4 = new imd.Livro("", "hi!", 235, 0);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
        imd.Livro livro4 = new imd.Livro("hi!", "", 0, 58);
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 10);
        livro4.removerCopias(87);
        livro4.adicionarCopias(3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 34);
        livro4.removerCopias(120);
        livro4.devolver();
        java.lang.String str8 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str10 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.emprestar();
        java.lang.String str13 = livro4.getTitulo();
        livro4.devolver();
        livro4.removerCopias(46);
        int int17 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass18 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 45 + "'", int17 == 45);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(35);
        int int15 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(235);
        int int18 = livro4.getPaginas();
        int int19 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 71 + "'", int15 == 71);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 71 + "'", int19 == 71);
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 0);
        livro4.removerCopias((int) ' ');
        livro4.emprestar();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(169);
        livro4.removerCopias(226);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getPaginas();
        java.lang.String str13 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str15 = livro4.getTitulo();
        java.lang.String str16 = livro4.getAutor();
        livro4.removerCopias(26);
        livro4.adicionarCopias(225);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((-1));
        livro4.adicionarCopias((int) (short) 10);
        int int15 = livro4.getCopiasDisponiveis();
        int int16 = livro4.getPaginas();
        int int17 = livro4.getCopiasDisponiveis();
        int int18 = livro4.getPaginas();
        int int19 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 44 + "'", int15 == 44);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 44 + "'", int17 == 44);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 44 + "'", int19 == 44);
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) -1);
        int int15 = livro4.getPaginas();
        int int16 = livro4.getPaginas();
        int int17 = livro4.getPaginas();
        int int18 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(31);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str14 = livro4.getTitulo();
        int int15 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
        imd.Livro livro4 = new imd.Livro("hi!", "", 101, 26);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        imd.Livro livro4 = new imd.Livro("hi!", "", 44, 0);
        livro4.devolver();
        int int6 = livro4.getPaginas();
        livro4.removerCopias(23);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 44 + "'", int6 == 44);
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        imd.Livro livro4 = new imd.Livro("", "", 157, 12);
        livro4.emprestar();
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
        imd.Livro livro4 = new imd.Livro("", "", 157, 12);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 157 + "'", int5 == 157);
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 45, 10);
        livro4.emprestar();
        livro4.devolver();
        livro4.devolver();
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, (int) (short) 100);
        livro4.adicionarCopias(1);
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(61);
        livro4.devolver();
        livro4.removerCopias(271);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        imd.Livro livro4 = new imd.Livro("hi!", "", 34, (int) (short) 0);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        livro4.emprestar();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getPaginas();
        livro4.removerCopias(0);
        java.lang.String str15 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
        imd.Livro livro4 = new imd.Livro("", "hi!", 64, (int) (short) 10);
        livro4.emprestar();
        livro4.adicionarCopias(43);
        livro4.adicionarCopias(47);
        livro4.devolver();
        int int11 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
        imd.Livro livro4 = new imd.Livro("", "", 3, 86);
        int int5 = livro4.getPaginas();
        livro4.removerCopias((int) (short) 100);
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
        imd.Livro livro4 = new imd.Livro("", "", 45, 0);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias(52);
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 2, 128);
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
        imd.Livro livro4 = new imd.Livro("hi!", "", 36, (int) (byte) -1);
        livro4.adicionarCopias(0);
        livro4.devolver();
        livro4.adicionarCopias(43);
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.String str12 = livro4.getAutor();
        livro4.adicionarCopias(144);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(97);
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 129 + "'", int8 == 129);
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
        imd.Livro livro4 = new imd.Livro("hi!", "", 31, 167);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str14 = livro4.getTitulo();
        livro4.removerCopias(33);
        livro4.adicionarCopias(0);
        java.lang.String str19 = livro4.getAutor();
        int int20 = livro4.getCopiasDisponiveis();
        java.lang.String str21 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        imd.Livro livro4 = new imd.Livro("", "", 156, 92);
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
        imd.Livro livro4 = new imd.Livro("", "hi!", 68, 0);
        livro4.emprestar();
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
        imd.Livro livro4 = new imd.Livro("", "", 0, 36);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36 + "'", int5 == 36);
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) -1);
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias(71);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (short) -1);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(87);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
    }
}

