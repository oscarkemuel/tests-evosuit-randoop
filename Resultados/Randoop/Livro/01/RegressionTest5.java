import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, (int) (short) 100);
        int int5 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getPaginas();
        int int11 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 0, 45);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias(35);
        livro4.adicionarCopias(36);
        java.lang.String str14 = livro4.getAutor();
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 45 + "'", int7 == 45);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
        imd.Livro livro4 = new imd.Livro("hi!", "", 52, (int) (short) 100);
        livro4.adicionarCopias(81);
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
        imd.Livro livro4 = new imd.Livro("hi!", "", 86, (int) (byte) 100);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, 36);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getAutor();
        livro4.removerCopias(78);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36 + "'", int5 == 36);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        livro4.removerCopias((int) (byte) 100);
        java.lang.String str15 = livro4.getAutor();
        java.lang.String str16 = livro4.getAutor();
        int int17 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        imd.Livro livro4 = new imd.Livro("", "hi!", 173, 0);
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(69);
        java.lang.String str13 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str15 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        imd.Livro livro4 = new imd.Livro("hi!", "", 10, (int) (short) -1);
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
        imd.Livro livro4 = new imd.Livro("hi!", "", 36, (int) (short) 100);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getPaginas();
        livro4.removerCopias(44);
        livro4.adicionarCopias(2);
        java.lang.String str12 = livro4.getAutor();
        livro4.removerCopias(123);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 1, (int) '#');
        livro4.emprestar();
        livro4.devolver();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        livro4.emprestar();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        imd.Livro livro4 = new imd.Livro("", "", 44, 35);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias(0);
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 44 + "'", int5 == 44);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 0, 135);
        livro4.removerCopias((int) (short) -1);
        java.lang.String str7 = livro4.getTitulo();
        java.lang.String str8 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        livro4.removerCopias(0);
        int int10 = livro4.getPaginas();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.removerCopias(121);
        java.lang.String str16 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.removerCopias((int) (byte) 0);
        int int12 = livro4.getPaginas();
        int int13 = livro4.getPaginas();
        java.lang.String str14 = livro4.getAutor();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.emprestar();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(101);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 134 + "'", int12 == 134);
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias((int) 'a');
        livro4.adicionarCopias(32);
        java.lang.String str14 = livro4.getAutor();
        livro4.devolver();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str10 = livro4.getAutor();
        java.lang.String str11 = livro4.getTitulo();
        livro4.adicionarCopias((int) (short) 100);
        livro4.devolver();
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        imd.Livro livro4 = new imd.Livro("hi!", "", 34, (int) (short) 0);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(3);
        int int8 = livro4.getPaginas();
        livro4.removerCopias(61);
        java.lang.String str11 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(235);
        livro4.adicionarCopias(99);
        java.lang.String str12 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(120);
        livro4.adicionarCopias(2);
        livro4.emprestar();
        int int18 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 36, 31);
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        imd.Livro livro4 = new imd.Livro("", "", (int) '#', 135);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(132);
        livro4.adicionarCopias(95);
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((-1));
        livro4.adicionarCopias((int) (short) 10);
        int int15 = livro4.getPaginas();
        livro4.removerCopias((int) 'a');
        java.lang.Class<?> wildcardClass18 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias((int) (short) 100);
        livro4.emprestar();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(46);
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 42, 32);
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 69, 1);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str7 = livro4.getTitulo();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        imd.Livro livro4 = new imd.Livro("", "hi!", 35, 35);
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 0);
        livro4.devolver();
        livro4.adicionarCopias(69);
        int int12 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getAutor();
        livro4.adicionarCopias(190);
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str15 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        livro4.removerCopias((int) (byte) 100);
        livro4.devolver();
        livro4.removerCopias((int) (byte) 1);
        int int14 = livro4.getPaginas();
        int int15 = livro4.getPaginas();
        int int16 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str8 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        imd.Livro livro4 = new imd.Livro("", "", 120, 32);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getTitulo();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 120 + "'", int6 == 120);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(100);
        int int16 = livro4.getCopiasDisponiveis();
        java.lang.String str17 = livro4.getAutor();
        java.lang.String str18 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 167 + "'", int16 == 167);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(69);
        livro4.adicionarCopias(135);
        java.lang.String str15 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(36);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
        imd.Livro livro4 = new imd.Livro("", "hi!", 82, 0);
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
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
        int int18 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str20 = livro4.getAutor();
        java.lang.String str21 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int14 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.String str12 = livro4.getAutor();
        java.lang.String str13 = livro4.getTitulo();
        livro4.removerCopias((-1));
        livro4.adicionarCopias((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 0);
        livro4.removerCopias((int) ' ');
        int int7 = livro4.getPaginas();
        livro4.removerCopias(0);
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias(2);
        livro4.adicionarCopias(61);
        java.lang.String str14 = livro4.getAutor();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
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
        livro4.adicionarCopias((int) (short) 100);
        java.lang.String str18 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(69);
        java.lang.String str13 = livro4.getAutor();
        livro4.removerCopias(50);
        livro4.removerCopias((int) (short) 1);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        imd.Livro livro4 = new imd.Livro("", "hi!", 100, 45);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        int int7 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 44 + "'", int7 == 44);
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(36);
        livro4.adicionarCopias((int) (byte) 100);
        livro4.removerCopias((int) (short) -1);
        int int14 = livro4.getPaginas();
        livro4.removerCopias(0);
        int int17 = livro4.getCopiasDisponiveis();
        java.lang.String str18 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass19 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 136 + "'", int17 == 136);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) '#');
        livro4.removerCopias(137);
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 100, 35);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(12);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        imd.Livro livro4 = new imd.Livro("hi!", "", 36, (int) (short) 100);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 0, 32);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        imd.Livro livro4 = new imd.Livro("hi!", "", 34, (int) (short) 0);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getAutor();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias(32);
        java.lang.String str13 = livro4.getTitulo();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(170);
        livro4.devolver();
        livro4.removerCopias(0);
        livro4.removerCopias(47);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        java.lang.String str11 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str13 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) (short) 100);
        java.lang.String str17 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (byte) 0);
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getTitulo();
        livro4.emprestar();
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) -1, (int) '4');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(0);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((-1));
        java.lang.String str13 = livro4.getTitulo();
        livro4.adicionarCopias(59);
        int int16 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 92 + "'", int16 == 92);
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        livro4.adicionarCopias(69);
        java.lang.String str14 = livro4.getAutor();
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.devolver();
        livro4.emprestar();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.adicionarCopias((int) (short) 100);
        int int16 = livro4.getPaginas();
        livro4.removerCopias(190);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias(140);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias((int) (byte) 10);
        java.lang.String str12 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 23 + "'", int15 == 23);
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        imd.Livro livro4 = new imd.Livro("", "hi!", 45, 35);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 0, (-1));
        livro4.emprestar();
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
        imd.Livro livro4 = new imd.Livro("", "hi!", 57, 12);
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        int int11 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) -1);
        int int11 = livro4.getPaginas();
        int int12 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        livro4.adicionarCopias((int) 'a');
        java.lang.String str15 = livro4.getAutor();
        livro4.adicionarCopias(238);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.adicionarCopias(0);
        livro4.adicionarCopias((-1));
        livro4.emprestar();
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 10, 0);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str7 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        imd.Livro livro4 = new imd.Livro("hi!", "", 0, (int) (byte) 1);
        livro4.devolver();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 36);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', 157);
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 35, 100);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias(120);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str12 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
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
        int int19 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 10);
        java.lang.Class<?> wildcardClass22 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 77 + "'", int19 == 77);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getPaginas();
        livro4.removerCopias(167);
        java.lang.String str15 = livro4.getTitulo();
        livro4.removerCopias(49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 12, (int) (byte) 100);
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
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
        java.lang.String str18 = livro4.getTitulo();
        java.lang.String str19 = livro4.getAutor();
        java.lang.Class<?> wildcardClass20 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        imd.Livro livro4 = new imd.Livro("", "", 69, (int) (byte) 0);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 69 + "'", int5 == 69);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
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
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 69 + "'", int16 == 69);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(35);
        int int13 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 0);
        java.lang.String str16 = livro4.getAutor();
        livro4.adicionarCopias(69);
        java.lang.String str19 = livro4.getTitulo();
        java.lang.String str20 = livro4.getTitulo();
        java.lang.String str21 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 69 + "'", int13 == 69);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        imd.Livro livro4 = new imd.Livro("hi!", "", 44, 1);
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
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
        livro4.adicionarCopias(135);
        livro4.emprestar();
        livro4.devolver();
        java.lang.Class<?> wildcardClass22 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(226);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(92);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        imd.Livro livro4 = new imd.Livro("", "", 190, 26);
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 52, 41);
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) -1, 33);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        int int8 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) (short) 0);
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(68);
        int int15 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias((int) '4');
        java.lang.String str10 = livro4.getAutor();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 1);
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        livro4.devolver();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getAutor();
        java.lang.String str14 = livro4.getAutor();
        livro4.emprestar();
        int int16 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
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
        java.lang.String str17 = livro4.getTitulo();
        int int18 = livro4.getCopiasDisponiveis();
        java.lang.String str19 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 0, (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias(75);
        java.lang.String str9 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 34);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(81);
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        livro4.removerCopias((int) '4');
        livro4.emprestar();
        int int16 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 43 + "'", int16 == 43);
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, (int) (short) 10);
        livro4.adicionarCopias((int) ' ');
        livro4.emprestar();
        livro4.devolver();
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
        imd.Livro livro4 = new imd.Livro("hi!", "", 145, 3);
        int int5 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 145 + "'", int5 == 145);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        imd.Livro livro4 = new imd.Livro("", "hi!", 35, (int) (byte) 1);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((-1));
        livro4.adicionarCopias((int) (short) 10);
        int int15 = livro4.getPaginas();
        int int16 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias((int) '#');
        int int20 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias((int) ' ');
        livro4.emprestar();
        livro4.removerCopias(134);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 1, 190);
        livro4.adicionarCopias(232);
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.emprestar();
        livro4.removerCopias(67);
        int int15 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        imd.Livro livro4 = new imd.Livro("", "hi!", 44, 34);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        imd.Livro livro4 = new imd.Livro("", "", 69, (int) (byte) 0);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias(47);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 69 + "'", int5 == 69);
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        imd.Livro livro4 = new imd.Livro("hi!", "", 10, 0);
        livro4.removerCopias((int) (short) 1);
        livro4.devolver();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.removerCopias((int) (byte) 0);
        livro4.adicionarCopias(69);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(35);
        int int13 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 0);
        java.lang.String str16 = livro4.getAutor();
        livro4.adicionarCopias(69);
        java.lang.String str19 = livro4.getTitulo();
        livro4.adicionarCopias(134);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 69 + "'", int13 == 69);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 71, 47);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) 'a', 0);
        livro4.adicionarCopias(167);
        int int7 = livro4.getPaginas();
        int int8 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
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
        livro4.adicionarCopias(135);
        livro4.emprestar();
        java.lang.String str21 = livro4.getAutor();
        int int22 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 204 + "'", int22 == 204);
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        livro4.adicionarCopias(99);
        livro4.emprestar();
        livro4.adicionarCopias(81);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        imd.Livro livro4 = new imd.Livro("", "hi!", 8, 103);
        livro4.removerCopias(222);
        livro4.adicionarCopias(170);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(135);
        livro4.devolver();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(42);
        java.lang.String str13 = livro4.getAutor();
        java.lang.String str14 = livro4.getTitulo();
        livro4.removerCopias(145);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 171 + "'", int9 == 171);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.removerCopias((int) (byte) 0);
        livro4.adicionarCopias((int) (short) 1);
        livro4.removerCopias(37);
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
        imd.Livro livro4 = new imd.Livro("", "hi!", 2, 120);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.removerCopias((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120 + "'", int5 == 120);
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
        imd.Livro livro4 = new imd.Livro("", "hi!", 51, (int) '4');
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.emprestar();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(33);
        int int12 = livro4.getPaginas();
        livro4.removerCopias(190);
        livro4.removerCopias(170);
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 2, 32);
        livro4.adicionarCopias(81);
        livro4.removerCopias(0);
        livro4.removerCopias(144);
        livro4.removerCopias(43);
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getAutor();
        livro4.removerCopias(204);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 0, 132);
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (int) (byte) 0);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        livro4.removerCopias(35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        imd.Livro livro4 = new imd.Livro("", "", 64, 30);
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) 'a');
        livro4.removerCopias(70);
        java.lang.String str10 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        imd.Livro livro4 = new imd.Livro("hi!", "", 26, 26);
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias((int) '4');
        livro4.adicionarCopias(33);
        livro4.removerCopias(0);
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str10 = livro4.getAutor();
        java.lang.String str11 = livro4.getTitulo();
        livro4.adicionarCopias(32);
        int int14 = livro4.getCopiasDisponiveis();
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 31 + "'", int14 == 31);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        imd.Livro livro4 = new imd.Livro("", "", 38, 3);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, (int) (byte) -1);
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str7 = livro4.getTitulo();
        livro4.removerCopias(13);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) 'a', 168);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 69, 1);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(96);
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 69 + "'", int5 == 69);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 68, 190);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.devolver();
        livro4.emprestar();
        livro4.adicionarCopias((int) (byte) 0);
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        livro4.removerCopias(10);
        livro4.removerCopias(35);
        livro4.devolver();
        java.lang.String str16 = livro4.getTitulo();
        java.lang.String str17 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((-1));
        livro4.removerCopias(136);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getPaginas();
        int int13 = livro4.getPaginas();
        livro4.devolver();
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
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        livro4.removerCopias(35);
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, 0);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias(65);
        java.lang.String str11 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        livro4.devolver();
        int int14 = livro4.getCopiasDisponiveis();
        java.lang.String str15 = livro4.getTitulo();
        livro4.removerCopias(0);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 37 + "'", int14 == 37);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 0);
        livro4.removerCopias((int) ' ');
        livro4.emprestar();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str10 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, (int) (byte) 10);
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int10 = livro4.getPaginas();
        livro4.removerCopias(44);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, (int) (byte) -1);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 10, (int) (byte) 1);
        livro4.devolver();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        imd.Livro livro4 = new imd.Livro("hi!", "", 59, 77);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
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
        livro4.adicionarCopias(23);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 135 + "'", int11 == 135);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 135 + "'", int16 == 135);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        imd.Livro livro4 = new imd.Livro("hi!", "", 54, 82);
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        imd.Livro livro4 = new imd.Livro("", "hi!", 13, 90);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        livro4.removerCopias(99);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 65);
        livro4.adicionarCopias(136);
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        imd.Livro livro4 = new imd.Livro("", "hi!", 74, 36);
        livro4.devolver();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 37 + "'", int6 == 37);
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
        imd.Livro livro4 = new imd.Livro("", "hi!", 135, 0);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 135 + "'", int6 == 135);
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        imd.Livro livro4 = new imd.Livro("", "", 33, (int) (byte) 0);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getPaginas();
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getPaginas();
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', 10);
        livro4.emprestar();
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        java.lang.String str13 = livro4.getTitulo();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(126);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 44 + "'", int14 == 44);
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
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
        java.lang.String str17 = livro4.getAutor();
        java.lang.Class<?> wildcardClass18 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
        imd.Livro livro4 = new imd.Livro("", "", 0, 34);
        livro4.emprestar();
        livro4.removerCopias((int) (byte) 1);
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        imd.Livro livro4 = new imd.Livro("", "", 69, (int) (byte) 0);
        livro4.adicionarCopias((int) (byte) 0);
        livro4.removerCopias(136);
        livro4.adicionarCopias(167);
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 167 + "'", int12 == 167);
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 34);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((-1));
        livro4.adicionarCopias((int) (short) 10);
        int int15 = livro4.getPaginas();
        int int16 = livro4.getCopiasDisponiveis();
        java.lang.String str17 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 44 + "'", int16 == 44);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        imd.Livro livro4 = new imd.Livro("", "hi!", 2, 120);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120 + "'", int5 == 120);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', 35);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        int int13 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 37 + "'", int13 == 37);
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(32);
        java.lang.String str11 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 60, 8);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.removerCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.adicionarCopias(0);
        java.lang.String str15 = livro4.getTitulo();
        java.lang.String str16 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.removerCopias((int) (byte) 0);
        int int12 = livro4.getPaginas();
        livro4.emprestar();
        int int14 = livro4.getPaginas();
        livro4.removerCopias(11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
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
        livro4.removerCopias(96);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 69 + "'", int23 == 69);
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 10, 167);
        livro4.adicionarCopias(87);
        livro4.removerCopias(169);
        livro4.adicionarCopias((int) (byte) 100);
        livro4.removerCopias((int) 'a');
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 34);
        livro4.removerCopias(120);
        livro4.devolver();
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) 100);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(34);
        java.lang.String str14 = livro4.getAutor();
        livro4.removerCopias(35);
        livro4.removerCopias(101);
        int int19 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 135 + "'", int11 == 135);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        imd.Livro livro4 = new imd.Livro("hi!", "", 41, 59);
        livro4.devolver();
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        imd.Livro livro4 = new imd.Livro("", "hi!", 37, (int) (short) 0);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 100, 135);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 135 + "'", int5 == 135);
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.emprestar();
        int int11 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.emprestar();
        java.lang.String str15 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias(87);
        int int13 = livro4.getPaginas();
        int int14 = livro4.getPaginas();
        livro4.devolver();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getAutor();
        livro4.devolver();
        livro4.devolver();
        livro4.removerCopias((int) 'a');
        livro4.removerCopias(171);
        livro4.devolver();
        java.lang.Class<?> wildcardClass21 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str11 = livro4.getAutor();
        livro4.emprestar();
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
        imd.Livro livro4 = new imd.Livro("", "hi!", 100, 45);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(169);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 45 + "'", int6 == 45);
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 100);
        livro4.adicionarCopias((int) '4');
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        livro4.emprestar();
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
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
        livro4.removerCopias(31);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass19 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(38);
        int int14 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37 + "'", int11 == 37);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        livro4.adicionarCopias((int) (short) -1);
        int int14 = livro4.getCopiasDisponiveis();
        int int15 = livro4.getPaginas();
        livro4.removerCopias((int) ' ');
        java.lang.String str18 = livro4.getTitulo();
        livro4.adicionarCopias(9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        livro4.emprestar();
        livro4.emprestar();
        int int10 = livro4.getPaginas();
        livro4.adicionarCopias(37);
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, (int) (short) 10);
        java.lang.String str5 = livro4.getTitulo();
        livro4.adicionarCopias(42);
        livro4.removerCopias((int) '#');
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 120, (int) '4');
        livro4.adicionarCopias(0);
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        livro4.removerCopias(99);
        int int14 = livro4.getPaginas();
        livro4.emprestar();
        livro4.removerCopias(9);
        int int18 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(120);
        livro4.adicionarCopias(2);
        livro4.emprestar();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 24, 121);
        livro4.devolver();
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
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
        java.lang.Class<?> wildcardClass19 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        imd.Livro livro4 = new imd.Livro("", "hi!", 107, 132);
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        imd.Livro livro4 = new imd.Livro("hi!", "", 97, 24);
        livro4.emprestar();
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 1, 0);
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias(32);
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        int int10 = livro4.getPaginas();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str7 = livro4.getTitulo();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        java.lang.String str7 = livro4.getTitulo();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        imd.Livro livro4 = new imd.Livro("", "", 0, 34);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        livro4.emprestar();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(224);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(45);
        livro4.removerCopias(64);
        int int17 = livro4.getPaginas();
        int int18 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        imd.Livro livro4 = new imd.Livro("hi!", "", (-1), 31);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(11);
        int int8 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        livro4.removerCopias(2);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        imd.Livro livro4 = new imd.Livro("", "", 59, 134);
        livro4.adicionarCopias(43);
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(33);
        livro4.removerCopias(45);
        java.lang.String str14 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str16 = livro4.getTitulo();
        int int17 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str13 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str14 = livro4.getTitulo();
        int int15 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str17 = livro4.getTitulo();
        java.lang.String str18 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
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
        int int17 = livro4.getPaginas();
        livro4.adicionarCopias(226);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getCopiasDisponiveis();
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36 + "'", int14 == 36);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        livro4.removerCopias((int) (byte) 0);
        java.lang.String str13 = livro4.getAutor();
        java.lang.String str14 = livro4.getTitulo();
        livro4.removerCopias(0);
        livro4.removerCopias(190);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        imd.Livro livro4 = new imd.Livro("hi!", "", 241, 105);
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 0, (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(135);
        livro4.emprestar();
        java.lang.String str9 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(120);
        livro4.adicionarCopias(2);
        livro4.devolver();
        livro4.adicionarCopias(0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        int int15 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str17 = livro4.getTitulo();
        int int18 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 30 + "'", int18 == 30);
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (byte) 0);
        livro4.emprestar();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(173);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) -1, 135);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        imd.Livro livro4 = new imd.Livro("", "", 136, 33);
        livro4.emprestar();
        livro4.adicionarCopias(97);
        livro4.removerCopias((int) (byte) -1);
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
        imd.Livro livro4 = new imd.Livro("hi!", "", 134, 235);
        livro4.emprestar();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 134, 11);
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 100);
        livro4.adicionarCopias((int) '4');
        java.lang.String str10 = livro4.getAutor();
        livro4.adicionarCopias(46);
        int int13 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, 0);
        livro4.removerCopias(35);
        livro4.emprestar();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(45);
        livro4.adicionarCopias(37);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        imd.Livro livro4 = new imd.Livro("", "hi!", 67, 68);
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(9);
        int int8 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 67 + "'", int8 == 67);
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) 'a', (int) (byte) 100);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(59);
        livro4.emprestar();
        livro4.adicionarCopias(68);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias(52);
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getAutor();
        java.lang.String str13 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        imd.Livro livro4 = new imd.Livro("", "hi!", 37, (int) (short) 0);
        livro4.removerCopias(77);
        java.lang.String str7 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(120);
        livro4.adicionarCopias(2);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass18 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) -1, 135);
        livro4.emprestar();
        livro4.devolver();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(144);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 135 + "'", int7 == 135);
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 1);
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.String str12 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, 36);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getTitulo();
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
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
        livro4.adicionarCopias(135);
        int int20 = livro4.getPaginas();
        int int21 = livro4.getPaginas();
        int int22 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
        imd.Livro livro4 = new imd.Livro("", "hi!", 96, 61);
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getTitulo();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(86);
        java.lang.String str17 = livro4.getAutor();
        livro4.adicionarCopias(167);
        java.lang.Class<?> wildcardClass20 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        imd.Livro livro4 = new imd.Livro("hi!", "", 36, 45);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36 + "'", int5 == 36);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
        imd.Livro livro4 = new imd.Livro("hi!", "", 120, (int) (byte) -1);
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str7 = livro4.getTitulo();
        livro4.removerCopias(52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str13 = livro4.getAutor();
        livro4.adicionarCopias(0);
        int int16 = livro4.getPaginas();
        livro4.adicionarCopias((int) ' ');
        int int19 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias(144);
        java.lang.String str14 = livro4.getAutor();
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        imd.Livro livro4 = new imd.Livro("", "", 267, 157);
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        imd.Livro livro4 = new imd.Livro("", "", 33, (int) (byte) 100);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias(96);
        java.lang.String str11 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        imd.Livro livro4 = new imd.Livro("hi!", "", 38, 204);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 38 + "'", int5 == 38);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 38 + "'", int6 == 38);
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 0, 45);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        livro4.devolver();
        int int12 = livro4.getCopiasDisponiveis();
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        livro4.removerCopias(10);
        livro4.removerCopias(35);
        livro4.devolver();
        livro4.removerCopias((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
        imd.Livro livro4 = new imd.Livro("", "", 134, 120);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120 + "'", int5 == 120);
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias(120);
        livro4.removerCopias(151);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.emprestar();
        livro4.removerCopias(33);
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        livro4.removerCopias(49);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 0, 35);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        livro4.removerCopias(10);
        livro4.removerCopias(35);
        livro4.devolver();
        java.lang.String str16 = livro4.getTitulo();
        java.lang.String str17 = livro4.getTitulo();
        livro4.removerCopias(48);
        java.lang.String str20 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '4', (int) '4');
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        imd.Livro livro4 = new imd.Livro("hi!", "", 31, 86);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        imd.Livro livro4 = new imd.Livro("hi!", "", (-1), 31);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(11);
        livro4.removerCopias(224);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 145);
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 0, 52);
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        livro4.emprestar();
        int int8 = livro4.getPaginas();
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 136, (int) (byte) 10);
        livro4.adicionarCopias(135);
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        imd.Livro livro4 = new imd.Livro("", "", 51, 0);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) 'a');
        livro4.emprestar();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(170);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        imd.Livro livro4 = new imd.Livro("hi!", "", 99, 74);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str13 = livro4.getTitulo();
        livro4.adicionarCopias(26);
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 100, (int) ' ');
        livro4.removerCopias(99);
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        imd.Livro livro4 = new imd.Livro("", "", 105, 145);
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, 81);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        imd.Livro livro4 = new imd.Livro("", "hi!", 134, 0);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        livro4.removerCopias((int) (byte) 1);
        java.lang.String str15 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(100);
        int int16 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str18 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 167 + "'", int16 == 167);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getPaginas();
        livro4.removerCopias(100);
        livro4.adicionarCopias(136);
        livro4.adicionarCopias(101);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 34);
        livro4.removerCopias(120);
        livro4.devolver();
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        imd.Livro livro4 = new imd.Livro("", "", 0, 0);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
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
        int int18 = livro4.getPaginas();
        int int19 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        imd.Livro livro4 = new imd.Livro("", "hi!", 97, (int) (byte) 0);
        livro4.devolver();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', 134);
        livro4.devolver();
        livro4.adicionarCopias(0);
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        livro4.adicionarCopias(51);
        int int12 = livro4.getCopiasDisponiveis();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
        imd.Livro livro4 = new imd.Livro("", "hi!", 35, 171);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 128, 126);
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, 36);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, 36);
        livro4.removerCopias(45);
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        int int9 = livro4.getPaginas();
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias((int) ' ');
        java.lang.String str13 = livro4.getAutor();
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias(32);
        java.lang.String str13 = livro4.getTitulo();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(170);
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        livro4.removerCopias(34);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(45);
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (byte) 0);
        java.lang.String str12 = livro4.getTitulo();
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
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
        livro4.devolver();
        int int16 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        imd.Livro livro4 = new imd.Livro("", "", 44, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(115);
        java.lang.String str16 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        imd.Livro livro4 = new imd.Livro("", "hi!", 50, 43);
        livro4.devolver();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias(49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        livro4.emprestar();
        int int13 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 10, (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getPaginas();
        livro4.removerCopias(24);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        imd.Livro livro4 = new imd.Livro("", "hi!", 63, 37);
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(131);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 0, 32);
        livro4.emprestar();
        livro4.removerCopias(92);
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
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
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25 + "'", int14 == 25);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        int int8 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(0);
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 100, (int) (short) 100);
        livro4.emprestar();
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.removerCopias((int) (byte) 0);
        int int12 = livro4.getPaginas();
        int int13 = livro4.getPaginas();
        livro4.adicionarCopias(32);
        livro4.adicionarCopias(48);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        imd.Livro livro4 = new imd.Livro("", "", 86, 266);
        livro4.removerCopias(113);
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 1, 0);
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        imd.Livro livro4 = new imd.Livro("hi!", "", 1, 37);
        livro4.removerCopias(69);
        livro4.emprestar();
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        imd.Livro livro4 = new imd.Livro("hi!", "", 67, 0);
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) 'a', (int) (byte) 100);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(135);
        java.lang.String str8 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        imd.Livro livro4 = new imd.Livro("", "hi!", 225, 9);
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (byte) 0);
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str11 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
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
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getPaginas();
        livro4.removerCopias(0);
        java.lang.String str15 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str17 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 0);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(11);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        imd.Livro livro4 = new imd.Livro("", "", 224, 134);
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getPaginas();
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        imd.Livro livro4 = new imd.Livro("", "hi!", 136, (int) (byte) -1);
        livro4.adicionarCopias(49);
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
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
        livro4.adicionarCopias(51);
        int int18 = livro4.getPaginas();
        java.lang.String str19 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 69, 1);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getTitulo();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 69 + "'", int9 == 69);
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 1, 91);
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(69);
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias(267);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        livro4.removerCopias((int) (byte) 0);
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getPaginas();
        java.lang.String str15 = livro4.getAutor();
        livro4.devolver();
        int int17 = livro4.getPaginas();
        java.lang.String str18 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias(32);
        livro4.adicionarCopias((int) (byte) 1);
        int int15 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        imd.Livro livro4 = new imd.Livro("", "hi!", 45, 91);
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 0, 45);
        int int5 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 1, 156);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 156 + "'", int5 == 156);
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        imd.Livro livro4 = new imd.Livro("", "hi!", 170, 101);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        imd.Livro livro4 = new imd.Livro("", "hi!", 91, (int) (byte) 100);
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getPaginas();
        livro4.removerCopias((int) ' ');
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
        imd.Livro livro4 = new imd.Livro("hi!", "", 36, (int) (byte) -1);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36 + "'", int5 == 36);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.adicionarCopias((int) '#');
        livro4.devolver();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 71 + "'", int11 == 71);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 1, (int) (short) 1);
        livro4.devolver();
        livro4.devolver();
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 100, 96);
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 71, (int) 'a');
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        livro4.removerCopias(0);
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(10);
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        imd.Livro livro4 = new imd.Livro("", "hi!", 74, (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (byte) 0);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias(97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
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
        livro4.emprestar();
        java.lang.String str21 = livro4.getAutor();
        int int22 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass24 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        java.lang.String str11 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str13 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 10, 52);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        livro4.adicionarCopias(2);
        java.lang.String str14 = livro4.getTitulo();
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) 100);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (short) 0);
        livro4.devolver();
        int int15 = livro4.getCopiasDisponiveis();
        java.lang.String str16 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 135 + "'", int11 == 135);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 136 + "'", int15 == 136);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        imd.Livro livro4 = new imd.Livro("", "", 59, 34);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        imd.Livro livro4 = new imd.Livro("", "", 120, 151);
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.removerCopias((int) (byte) 0);
        int int12 = livro4.getPaginas();
        int int13 = livro4.getPaginas();
        int int14 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', (int) (short) 10);
        livro4.adicionarCopias(68);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        livro4.removerCopias(34);
        java.lang.String str7 = livro4.getAutor();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 151, 224);
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 100);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(0);
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
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
        int int19 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass20 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        imd.Livro livro4 = new imd.Livro("hi!", "", 35, (int) (short) 1);
        livro4.devolver();
        livro4.adicionarCopias(44);
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        imd.Livro livro4 = new imd.Livro("", "", 120, (int) (short) 0);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.adicionarCopias(2);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        imd.Livro livro4 = new imd.Livro("", "", 0, 34);
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((-1));
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        livro4.removerCopias(0);
        java.lang.String str10 = livro4.getAutor();
        livro4.adicionarCopias(24);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        imd.Livro livro4 = new imd.Livro("", "", 82, (-1));
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(126);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 82 + "'", int5 == 82);
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.devolver();
        livro4.emprestar();
        livro4.removerCopias(43);
        livro4.adicionarCopias(0);
        int int16 = livro4.getCopiasDisponiveis();
        java.lang.String str17 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str7 = livro4.getTitulo();
        livro4.devolver();
        int int9 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
        imd.Livro livro4 = new imd.Livro("", "", 57, 0);
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 44);
        livro4.emprestar();
        livro4.emprestar();
        livro4.devolver();
        livro4.removerCopias(136);
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        imd.Livro livro4 = new imd.Livro("", "hi!", 35, 35);
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 0);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str12 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) -1);
        int int15 = livro4.getPaginas();
        java.lang.String str16 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 100, (int) (short) 0);
        livro4.devolver();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias(0);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(31);
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) ' ', 30);
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) -1, 135);
        java.lang.String str5 = livro4.getAutor();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 10, (int) (byte) 1);
        livro4.removerCopias(134);
        livro4.devolver();
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 35, 100);
        livro4.removerCopias((int) (byte) 10);
        livro4.adicionarCopias(100);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(51);
        livro4.emprestar();
        int int13 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 190 + "'", int9 == 190);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 240 + "'", int13 == 240);
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.removerCopias((int) (byte) 0);
        livro4.adicionarCopias((int) (short) 1);
        livro4.removerCopias(2);
        int int16 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str18 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        imd.Livro livro4 = new imd.Livro("", "hi!", 44, 34);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 44 + "'", int7 == 44);
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) 100);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(34);
        java.lang.String str14 = livro4.getAutor();
        livro4.removerCopias(35);
        int int17 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 135 + "'", int11 == 135);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 134 + "'", int17 == 134);
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        int int9 = livro4.getPaginas();
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias((int) ' ');
        livro4.adicionarCopias(0);
        java.lang.String str15 = livro4.getAutor();
        java.lang.String str16 = livro4.getAutor();
        java.lang.String str17 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, (int) (short) 100);
        livro4.adicionarCopias(31);
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        imd.Livro livro4 = new imd.Livro("", "", 44, 44);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias(171);
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 204, 74);
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        imd.Livro livro4 = new imd.Livro("", "", 100, 87);
        int int5 = livro4.getPaginas();
        livro4.removerCopias(9);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (byte) 0);
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) (byte) 100);
        java.lang.String str13 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        livro4.removerCopias((int) (byte) 0);
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(157);
        int int17 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(35);
        livro4.devolver();
        livro4.devolver();
        java.lang.String str17 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getCopiasDisponiveis();
        int int13 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (short) -1);
        java.lang.String str14 = livro4.getAutor();
        livro4.devolver();
        int int16 = livro4.getPaginas();
        java.lang.String str17 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
        imd.Livro livro4 = new imd.Livro("hi!", "", 145, (-1));
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 34);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str7 = livro4.getTitulo();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str11 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        livro4.emprestar();
        livro4.removerCopias(42);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 34);
        livro4.removerCopias(120);
        livro4.devolver();
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 1);
        livro4.removerCopias(226);
        livro4.adicionarCopias(99);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str7 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.removerCopias(36);
        java.lang.String str13 = livro4.getAutor();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
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
        livro4.removerCopias(111);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 171 + "'", int16 == 171);
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias((int) '4');
        livro4.adicionarCopias(33);
        livro4.adicionarCopias(36);
        livro4.removerCopias(113);
        livro4.removerCopias(238);
        int int18 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
        imd.Livro livro4 = new imd.Livro("", "", 44, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(33);
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 44 + "'", int7 == 44);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 65 + "'", int10 == 65);
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        int int7 = livro4.getPaginas();
        livro4.removerCopias((int) '4');
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
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
        livro4.adicionarCopias(97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 35, 100);
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias(1);
        java.lang.String str13 = livro4.getTitulo();
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) ' ', 33);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias(144);
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        int int10 = livro4.getPaginas();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str15 = livro4.getAutor();
        livro4.adicionarCopias(48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        livro4.devolver();
        int int12 = livro4.getPaginas();
        int int13 = livro4.getCopiasDisponiveis();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int16 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36 + "'", int14 == 36);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        imd.Livro livro4 = new imd.Livro("", "", 90, 145);
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 10, 170);
        livro4.adicionarCopias(76);
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 0, (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(135);
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 137 + "'", int12 == 137);
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) -1, 10);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str7 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias((int) (byte) 1);
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        livro4.emprestar();
        livro4.emprestar();
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str13 = livro4.getAutor();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getPaginas();
        livro4.removerCopias((int) ' ');
        int int12 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 1, 38);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) -1, 0);
        livro4.adicionarCopias(98);
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        imd.Livro livro4 = new imd.Livro("", "", 120, (int) (short) 0);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120 + "'", int5 == 120);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        imd.Livro livro4 = new imd.Livro("", "", 69, 33);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias(114);
        java.lang.String str9 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        imd.Livro livro4 = new imd.Livro("", "hi!", 35, (int) '4');
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
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
        livro4.removerCopias(31);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 69, 134);
        java.lang.String str5 = livro4.getTitulo();
        livro4.adicionarCopias((int) (short) 0);
        livro4.adicionarCopias(190);
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        imd.Livro livro4 = new imd.Livro("hi!", "", 126, 168);
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 1, 31);
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
        imd.Livro livro4 = new imd.Livro("hi!", "", 44, 136);
        livro4.adicionarCopias((int) '#');
        livro4.removerCopias((int) (short) 100);
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
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
        livro4.adicionarCopias(170);
        int int21 = livro4.getCopiasDisponiveis();
        int int22 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 171 + "'", int21 == 171);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) -1, 135);
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias(100);
        livro4.removerCopias(0);
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) -1);
        livro4.adicionarCopias(33);
        livro4.removerCopias((int) (byte) 1);
        livro4.removerCopias(167);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(136);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        imd.Livro livro4 = new imd.Livro("hi!", "", 34, (int) (short) 0);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.emprestar();
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) -1, 44);
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(97);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 69, 1);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        int int7 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 69 + "'", int5 == 69);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 44);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (short) -1);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getAutor();
        livro4.removerCopias((int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.emprestar();
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias(33);
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
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
        int int19 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 34 + "'", int19 == 34);
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(69);
        livro4.adicionarCopias(135);
        java.lang.String str15 = livro4.getTitulo();
        int int16 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) -1);
        livro4.removerCopias(57);
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        imd.Livro livro4 = new imd.Livro("", "hi!", 126, 10);
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(135);
        livro4.devolver();
        livro4.removerCopias(222);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        imd.Livro livro4 = new imd.Livro("", "", 204, 31);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        imd.Livro livro4 = new imd.Livro("", "", 168, 52);
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (byte) 0);
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getPaginas();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(98);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        livro4.removerCopias((int) (byte) 1);
        livro4.adicionarCopias(128);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias((int) (short) 1);
        java.lang.String str13 = livro4.getAutor();
        livro4.removerCopias((int) (byte) -1);
        livro4.adicionarCopias(144);
        int int18 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 67, (int) (byte) -1);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        livro4.removerCopias(34);
        livro4.removerCopias((int) (byte) 100);
        livro4.removerCopias(144);
        livro4.emprestar();
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 0, 101);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 10, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(46);
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
        imd.Livro livro4 = new imd.Livro("hi!", "", 34, (int) (short) 0);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        livro4.removerCopias(87);
        livro4.adicionarCopias((int) 'a');
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        livro4.removerCopias(34);
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias(0);
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        livro4.removerCopias((int) '#');
        java.lang.String str15 = livro4.getAutor();
        livro4.removerCopias(87);
        livro4.devolver();
        java.lang.String str19 = livro4.getTitulo();
        int int20 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.adicionarCopias(0);
        livro4.adicionarCopias(81);
        livro4.adicionarCopias(106);
        int int16 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 321 + "'", int16 == 321);
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 100);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(0);
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str9 = livro4.getAutor();
        livro4.adicionarCopias(61);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.adicionarCopias(0);
        int int12 = livro4.getPaginas();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        livro4.removerCopias((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 134 + "'", int13 == 134);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 100, (int) (short) 0);
        livro4.devolver();
        livro4.devolver();
        livro4.emprestar();
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) -1, (int) '4');
        livro4.adicionarCopias((int) (byte) 100);
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.emprestar();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, 36);
        livro4.removerCopias(45);
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.adicionarCopias(36);
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.removerCopias(34);
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
        imd.Livro livro4 = new imd.Livro("hi!", "", 71, 77);
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getAutor();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        imd.Livro livro4 = new imd.Livro("hi!", "", 34, (int) (short) 0);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        livro4.removerCopias(87);
        java.lang.String str9 = livro4.getAutor();
        livro4.adicionarCopias(99);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 44);
        livro4.emprestar();
        livro4.emprestar();
        livro4.devolver();
        livro4.removerCopias(136);
        java.lang.String str10 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(1);
        int int11 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 77, 32);
        int int5 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 77 + "'", int5 == 77);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
        imd.Livro livro4 = new imd.Livro("hi!", "", 128, 67);
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        imd.Livro livro4 = new imd.Livro("", "hi!", 25, 71);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str7 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(0);
        java.lang.String str11 = livro4.getTitulo();
        livro4.adicionarCopias(12);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) -1, 100);
        livro4.emprestar();
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) -1, 10);
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) '#');
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 100, 67);
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 34);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(81);
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        livro4.emprestar();
        livro4.adicionarCopias(135);
        livro4.devolver();
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        imd.Livro livro4 = new imd.Livro("hi!", "", 267, (int) (short) -1);
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        livro4.emprestar();
        livro4.emprestar();
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getTitulo();
        livro4.emprestar();
        int int13 = livro4.getPaginas();
        livro4.adicionarCopias(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        imd.Livro livro4 = new imd.Livro("hi!", "", 36, (int) (short) 100);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias(87);
        java.lang.String str9 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        livro4.removerCopias(64);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        livro4.devolver();
        livro4.emprestar();
        livro4.adicionarCopias(47);
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
        imd.Livro livro4 = new imd.Livro("", "", 100, 87);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        livro4.removerCopias(101);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        livro4.removerCopias(34);
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        livro4.removerCopias((int) (byte) 100);
        livro4.adicionarCopias(45);
        int int13 = livro4.getPaginas();
        int int14 = livro4.getPaginas();
        int int15 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.devolver();
        livro4.emprestar();
        livro4.removerCopias(43);
        livro4.devolver();
        livro4.removerCopias(100);
        int int17 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        int int12 = livro4.getCopiasDisponiveis();
        int int13 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) -1, 44);
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        imd.Livro livro4 = new imd.Livro("hi!", "", 128, 144);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 128 + "'", int5 == 128);
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 100);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(0);
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        livro4.emprestar();
        livro4.devolver();
        int int13 = livro4.getPaginas();
        int int14 = livro4.getPaginas();
        int int15 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', (-1));
        livro4.removerCopias(87);
        livro4.devolver();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 0, 52);
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
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
        int int15 = livro4.getPaginas();
        int int16 = livro4.getPaginas();
        java.lang.String str17 = livro4.getAutor();
        java.lang.String str18 = livro4.getTitulo();
        int int19 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
        imd.Livro livro4 = new imd.Livro("", "hi!", 35, (int) (byte) 1);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(35);
        int int13 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 0);
        java.lang.String str16 = livro4.getAutor();
        livro4.adicionarCopias(69);
        java.lang.String str19 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 10);
        int int22 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 69 + "'", int13 == 69);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 128 + "'", int22 == 128);
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        imd.Livro livro4 = new imd.Livro("hi!", "", 52, 67);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) 'a', (int) (byte) 100);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(135);
        int int8 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 10, 133);
        livro4.devolver();
        livro4.removerCopias(4);
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 10, (int) '#');
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }
}

