import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24 {

    public static boolean debug = false;

    @Test
    public void test12001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12001");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', 30);
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getPaginas();
        java.lang.String str10 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test12002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12002");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 128, 41);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 128 + "'", int6 == 128);
    }

    @Test
    public void test12003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12003");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 0);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getAutor();
        livro4.removerCopias(252);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test12004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12004");
        imd.Livro livro4 = new imd.Livro("", "", 102, 12);
    }

    @Test
    public void test12005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12005");
        imd.Livro livro4 = new imd.Livro("", "", 21, (int) '4');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(34);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test12006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12006");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.adicionarCopias((int) (short) 0);
        int int7 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias(66);
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12007");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 1);
        livro4.removerCopias((int) (byte) 1);
        java.lang.String str15 = livro4.getTitulo();
        java.lang.String str16 = livro4.getTitulo();
        livro4.removerCopias(146);
        int int19 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 31 + "'", int19 == 31);
    }

    @Test
    public void test12008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12008");
        imd.Livro livro4 = new imd.Livro("hi!", "", 49, 134);
        livro4.removerCopias(30);
    }

    @Test
    public void test12009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12009");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(269);
        int int15 = livro4.getPaginas();
        int int16 = livro4.getPaginas();
        livro4.removerCopias(82);
        int int19 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 30 + "'", int12 == 30);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test12010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12010");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 31);
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias(90);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test12011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12011");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getAutor();
        java.lang.String str13 = livro4.getAutor();
        livro4.removerCopias(223);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12012");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 31);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getAutor();
        livro4.removerCopias(30);
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        livro4.adicionarCopias(173);
        java.lang.String str14 = livro4.getTitulo();
        int int15 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(222);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 174 + "'", int15 == 174);
    }

    @Test
    public void test12013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12013");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias((int) '#');
        java.lang.String str11 = livro4.getAutor();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12014");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', (int) '#');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        livro4.removerCopias(67);
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test12015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12015");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getPaginas();
        livro4.removerCopias(32);
        int int15 = livro4.getCopiasDisponiveis();
        int int16 = livro4.getPaginas();
        livro4.removerCopias(36);
        int int19 = livro4.getPaginas();
        java.lang.String str20 = livro4.getTitulo();
        java.lang.String str21 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test12016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12016");
        imd.Livro livro4 = new imd.Livro("hi!", "", 32, 172);
        livro4.removerCopias(311);
        java.lang.String str7 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test12017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12017");
        imd.Livro livro4 = new imd.Livro("", "", 212, 87);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 212 + "'", int5 == 212);
    }

    @Test
    public void test12018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12018");
        imd.Livro livro4 = new imd.Livro("hi!", "", 52, 128);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test12019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12019");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 1);
        livro4.removerCopias((int) (byte) 1);
        livro4.removerCopias(101);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test12020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12020");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 290, (int) 'a');
    }

    @Test
    public void test12021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12021");
        imd.Livro livro4 = new imd.Livro("", "", 167, 215);
        livro4.devolver();
    }

    @Test
    public void test12022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12022");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getAutor();
        java.lang.String str11 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12023");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias(100);
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(11);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
    }

    @Test
    public void test12024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12024");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias(66);
        livro4.devolver();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 10);
        livro4.removerCopias((int) '4');
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test12025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12025");
        imd.Livro livro4 = new imd.Livro("", "hi!", 11, (int) (byte) 1);
        livro4.adicionarCopias(243);
        java.lang.String str7 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test12026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12026");
        imd.Livro livro4 = new imd.Livro("", "hi!", 41, 358);
    }

    @Test
    public void test12027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12027");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), (int) (short) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test12028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12028");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        int int5 = livro4.getPaginas();
        livro4.removerCopias((int) '4');
        livro4.emprestar();
        livro4.devolver();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test12029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12029");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test12030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12030");
        imd.Livro livro4 = new imd.Livro("hi!", "", 149, (int) (byte) -1);
        livro4.emprestar();
        livro4.removerCopias((int) (short) 1);
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 149 + "'", int10 == 149);
    }

    @Test
    public void test12031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12031");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 106, 0);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 106 + "'", int5 == 106);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test12032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12032");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        livro4.emprestar();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        livro4.adicionarCopias(149);
        livro4.devolver();
        int int15 = livro4.getPaginas();
        livro4.adicionarCopias(274);
        livro4.removerCopias(119);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test12033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12033");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias(51);
        livro4.adicionarCopias((int) '4');
        livro4.removerCopias(65);
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12034");
        imd.Livro livro4 = new imd.Livro("", "hi!", 238, (int) ' ');
    }

    @Test
    public void test12035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12035");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 41, (int) (short) 10);
        livro4.adicionarCopias((int) (short) 100);
        livro4.emprestar();
        livro4.adicionarCopias(91);
        livro4.removerCopias(252);
    }

    @Test
    public void test12036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12036");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        int int13 = livro4.getPaginas();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str18 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test12037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12037");
        imd.Livro livro4 = new imd.Livro("", "", 167, 35);
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias(57);
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 167 + "'", int11 == 167);
    }

    @Test
    public void test12038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12038");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 141, 149);
        livro4.adicionarCopias(64);
        livro4.removerCopias(175);
        livro4.devolver();
    }

    @Test
    public void test12039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12039");
        imd.Livro livro4 = new imd.Livro("hi!", "", 69, (int) 'a');
        livro4.emprestar();
    }

    @Test
    public void test12040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12040");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(10);
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        int int16 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass18 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test12041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12041");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 0);
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getTitulo();
        livro4.adicionarCopias((int) ' ');
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test12042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12042");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 10, (int) (short) 1);
        livro4.adicionarCopias(35);
        livro4.removerCopias(149);
    }

    @Test
    public void test12043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12043");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 141, 149);
        livro4.removerCopias(66);
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 141 + "'", int8 == 141);
    }

    @Test
    public void test12044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12044");
        imd.Livro livro4 = new imd.Livro("hi!", "", 128, 82);
    }

    @Test
    public void test12045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12045");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        livro4.emprestar();
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getTitulo();
        livro4.emprestar();
        int int16 = livro4.getPaginas();
        int int17 = livro4.getCopiasDisponiveis();
        java.lang.String str18 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test12046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12046");
        imd.Livro livro4 = new imd.Livro("", "hi!", 130, 9);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias(72);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 130 + "'", int5 == 130);
    }

    @Test
    public void test12047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12047");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) '4');
        livro4.emprestar();
        livro4.removerCopias(27);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test12048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12048");
        imd.Livro livro4 = new imd.Livro("hi!", "", 11, 40);
        livro4.emprestar();
        livro4.adicionarCopias(81);
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test12049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12049");
        imd.Livro livro4 = new imd.Livro("", "", 106, 65);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(119);
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 65 + "'", int5 == 65);
    }

    @Test
    public void test12050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12050");
        imd.Livro livro4 = new imd.Livro("hi!", "", 0, 11);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test12051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12051");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias(9);
        livro4.emprestar();
        livro4.removerCopias(33);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test12052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12052");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 98, 166);
        livro4.emprestar();
        livro4.adicionarCopias(105);
    }

    @Test
    public void test12053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12053");
        imd.Livro livro4 = new imd.Livro("", "", 164, 306);
    }

    @Test
    public void test12054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12054");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 0);
        livro4.devolver();
        livro4.removerCopias(2);
        livro4.adicionarCopias(152);
        livro4.removerCopias(51);
        int int12 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(87);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 102 + "'", int12 == 102);
    }

    @Test
    public void test12055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12055");
        imd.Livro livro4 = new imd.Livro("", "hi!", 20, 215);
        livro4.removerCopias(0);
        livro4.emprestar();
        livro4.devolver();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test12056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12056");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias((int) '#');
        livro4.devolver();
        int int13 = livro4.getCopiasDisponiveis();
        int int14 = livro4.getPaginas();
        livro4.emprestar();
        livro4.removerCopias(66);
        livro4.emprestar();
        livro4.adicionarCopias(4);
        int int21 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test12057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12057");
        imd.Livro livro4 = new imd.Livro("", "hi!", 167, 243);
    }

    @Test
    public void test12058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12058");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str9 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        livro4.removerCopias((int) 'a');
        java.lang.String str14 = livro4.getTitulo();
        int int15 = livro4.getPaginas();
        int int16 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test12059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12059");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 10, (int) (short) -1);
        livro4.adicionarCopias(20);
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test12060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12060");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getPaginas();
        livro4.removerCopias(32);
        int int15 = livro4.getCopiasDisponiveis();
        java.lang.String str16 = livro4.getAutor();
        int int17 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        int int20 = livro4.getPaginas();
        int int21 = livro4.getPaginas();
        java.lang.String str22 = livro4.getAutor();
        livro4.removerCopias((int) (short) 100);
        int int25 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
    }

    @Test
    public void test12061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12061");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test12062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12062");
        imd.Livro livro4 = new imd.Livro("", "hi!", 91, 93);
        livro4.removerCopias((int) (byte) 1);
    }

    @Test
    public void test12063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12063");
        imd.Livro livro4 = new imd.Livro("", "", 67, 97);
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(3);
        livro4.devolver();
        livro4.adicionarCopias(3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
    }

    @Test
    public void test12064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12064");
        imd.Livro livro4 = new imd.Livro("", "hi!", 269, 0);
        livro4.emprestar();
    }

    @Test
    public void test12065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12065");
        imd.Livro livro4 = new imd.Livro("", "", 1, (int) (byte) 100);
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
    }

    @Test
    public void test12066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12066");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) ' ');
        livro4.emprestar();
        livro4.removerCopias(141);
        livro4.removerCopias(171);
        java.lang.String str14 = livro4.getTitulo();
        livro4.adicionarCopias(311);
        livro4.adicionarCopias(201);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test12067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12067");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 194, 220);
    }

    @Test
    public void test12068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12068");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getAutor();
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getTitulo();
        livro4.removerCopias(38);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test12069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12069");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((-1));
        livro4.removerCopias(21);
        java.lang.String str14 = livro4.getAutor();
        livro4.devolver();
        int int16 = livro4.getPaginas();
        livro4.removerCopias(36);
        java.lang.String str19 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test12070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12070");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(67);
        int int12 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(52);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test12071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12071");
        imd.Livro livro4 = new imd.Livro("", "hi!", 212, 10);
    }

    @Test
    public void test12072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12072");
        imd.Livro livro4 = new imd.Livro("", "", 246, 91);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(96);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test12073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12073");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), (int) '#');
        java.lang.String str5 = livro4.getTitulo();
        livro4.adicionarCopias(246);
        java.lang.String str8 = livro4.getAutor();
        livro4.removerCopias((int) (short) 1);
        java.lang.String str11 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12074");
        imd.Livro livro4 = new imd.Livro("hi!", "", 67, (int) 'a');
        livro4.removerCopias(30);
        int int7 = livro4.getPaginas();
        int int8 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 67 + "'", int7 == 67);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 67 + "'", int8 == 67);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test12075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12075");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 100, 0);
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test12076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12076");
        imd.Livro livro4 = new imd.Livro("hi!", "", 41, 36);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getAutor();
        livro4.removerCopias(294);
        livro4.adicionarCopias(227);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test12077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12077");
        imd.Livro livro4 = new imd.Livro("", "hi!", 304, 0);
        livro4.adicionarCopias(276);
    }

    @Test
    public void test12078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12078");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), (int) (short) 0);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test12079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12079");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 31);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getAutor();
        livro4.removerCopias(30);
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        livro4.adicionarCopias(173);
        java.lang.String str14 = livro4.getTitulo();
        int int15 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 174 + "'", int15 == 174);
    }

    @Test
    public void test12080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12080");
        imd.Livro livro4 = new imd.Livro("", "hi!", 129, 187);
    }

    @Test
    public void test12081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12081");
        imd.Livro livro4 = new imd.Livro("hi!", "", 168, 66);
        livro4.removerCopias(0);
    }

    @Test
    public void test12082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12082");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(67);
        livro4.removerCopias((int) (short) -1);
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test12083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12083");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 146);
    }

    @Test
    public void test12084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12084");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 252, 91);
    }

    @Test
    public void test12085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12085");
        imd.Livro livro4 = new imd.Livro("", "hi!", 244, 137);
    }

    @Test
    public void test12086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12086");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias((int) (short) 10);
        livro4.devolver();
        livro4.removerCopias(130);
        java.lang.String str14 = livro4.getAutor();
        livro4.removerCopias(1);
        livro4.removerCopias(137);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test12087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12087");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) '4', 171);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias(110);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 171 + "'", int5 == 171);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 171 + "'", int6 == 171);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test12088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12088");
        imd.Livro livro4 = new imd.Livro("", "", 306, 261);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test12089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12089");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str13 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12090");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        livro4.removerCopias(306);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test12091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12091");
        imd.Livro livro4 = new imd.Livro("hi!", "", 132, 134);
        livro4.adicionarCopias(62);
        livro4.removerCopias(165);
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test12092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12092");
        imd.Livro livro4 = new imd.Livro("", "hi!", 164, 135);
    }

    @Test
    public void test12093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12093");
        imd.Livro livro4 = new imd.Livro("hi!", "", 137, 36);
        livro4.removerCopias(307);
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 137 + "'", int7 == 137);
    }

    @Test
    public void test12094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12094");
        imd.Livro livro4 = new imd.Livro("", "hi!", 242, 158);
        livro4.removerCopias((int) (byte) 10);
        int int7 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 148 + "'", int7 == 148);
    }

    @Test
    public void test12095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12095");
        imd.Livro livro4 = new imd.Livro("hi!", "", 31, 10);
        livro4.emprestar();
        livro4.adicionarCopias(15);
    }

    @Test
    public void test12096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12096");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.devolver();
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        int int13 = livro4.getPaginas();
        java.lang.String str14 = livro4.getTitulo();
        livro4.removerCopias(129);
        livro4.removerCopias(195);
        int int19 = livro4.getCopiasDisponiveis();
        java.lang.String str20 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test12097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12097");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int11 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
    }

    @Test
    public void test12098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12098");
        imd.Livro livro4 = new imd.Livro("", "hi!", 42, 265);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias(228);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 265 + "'", int5 == 265);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 42 + "'", int6 == 42);
    }

    @Test
    public void test12099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12099");
        imd.Livro livro4 = new imd.Livro("hi!", "", 153, 306);
    }

    @Test
    public void test12100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12100");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str14 = livro4.getTitulo();
        int int15 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(91);
        java.lang.String str18 = livro4.getTitulo();
        livro4.adicionarCopias(171);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test12101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12101");
        imd.Livro livro4 = new imd.Livro("", "", 141, (int) 'a');
    }

    @Test
    public void test12102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12102");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(128);
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 130 + "'", int9 == 130);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test12103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12103");
        imd.Livro livro4 = new imd.Livro("hi!", "", 141, 100);
        livro4.adicionarCopias(9);
        livro4.adicionarCopias(65);
        livro4.devolver();
    }

    @Test
    public void test12104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12104");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getAutor();
        livro4.removerCopias(127);
        livro4.emprestar();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12105");
        imd.Livro livro4 = new imd.Livro("", "hi!", 174, 92);
    }

    @Test
    public void test12106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12106");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias(21);
        int int14 = livro4.getPaginas();
        livro4.adicionarCopias(21);
        java.lang.String str17 = livro4.getAutor();
        int int18 = livro4.getCopiasDisponiveis();
        int int19 = livro4.getPaginas();
        int int20 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21 + "'", int18 == 21);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 21 + "'", int20 == 21);
    }

    @Test
    public void test12107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12107");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias((int) ' ');
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test12108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12108");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 41, (int) (short) 10);
        livro4.emprestar();
        livro4.adicionarCopias(91);
        livro4.adicionarCopias(225);
    }

    @Test
    public void test12109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12109");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', (int) '#');
        livro4.removerCopias((int) (byte) -1);
        java.lang.String str7 = livro4.getAutor();
        livro4.devolver();
        int int9 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test12110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12110");
        imd.Livro livro4 = new imd.Livro("", "", 67, (int) (byte) 1);
        livro4.removerCopias(132);
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test12111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12111");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 179, 65);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test12112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12112");
        imd.Livro livro4 = new imd.Livro("hi!", "", 7, 130);
        livro4.removerCopias(92);
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
    }

    @Test
    public void test12113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12113");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        livro4.emprestar();
        livro4.emprestar();
        int int14 = livro4.getCopiasDisponiveis();
        int int15 = livro4.getPaginas();
        int int16 = livro4.getCopiasDisponiveis();
        int int17 = livro4.getCopiasDisponiveis();
        int int18 = livro4.getPaginas();
        livro4.removerCopias(72);
        livro4.adicionarCopias(364);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29 + "'", int17 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test12114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12114");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias(135);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test12115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12115");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', 30);
        livro4.removerCopias(285);
    }

    @Test
    public void test12116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12116");
        imd.Livro livro4 = new imd.Livro("hi!", "", 29, 50);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test12117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12117");
        imd.Livro livro4 = new imd.Livro("hi!", "", 146, 93);
    }

    @Test
    public void test12118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12118");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, 265);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test12119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12119");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(30);
        livro4.devolver();
        livro4.removerCopias(9);
        int int11 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test12120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12120");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(30);
        livro4.emprestar();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        livro4.removerCopias(243);
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test12121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12121");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 97);
        livro4.removerCopias(31);
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.removerCopias(2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 67 + "'", int8 == 67);
    }

    @Test
    public void test12122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12122");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 1);
        livro4.adicionarCopias((-1));
        livro4.removerCopias(265);
        java.lang.String str17 = livro4.getTitulo();
        livro4.removerCopias(54);
        java.lang.String str20 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test12123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12123");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        int int5 = livro4.getPaginas();
        livro4.removerCopias((int) '4');
        livro4.emprestar();
        livro4.devolver();
        livro4.removerCopias(97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test12124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12124");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 309, 11);
    }

    @Test
    public void test12125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12125");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 32, 96);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test12126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12126");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 97, (int) (byte) 1);
        livro4.removerCopias((int) (short) 1);
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias(29);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test12127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12127");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', 97);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test12128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12128");
        imd.Livro livro4 = new imd.Livro("hi!", "", 78, 7);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
    }

    @Test
    public void test12129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12129");
        imd.Livro livro4 = new imd.Livro("hi!", "", 346, 181);
    }

    @Test
    public void test12130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12130");
        imd.Livro livro4 = new imd.Livro("hi!", "", 41, 36);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(242);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test12131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12131");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 147, 254);
        livro4.removerCopias(147);
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 107 + "'", int7 == 107);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 147 + "'", int8 == 147);
    }

    @Test
    public void test12132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12132");
        imd.Livro livro4 = new imd.Livro("", "", 325, 149);
    }

    @Test
    public void test12133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12133");
        imd.Livro livro4 = new imd.Livro("", "hi!", 145, 242);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 242 + "'", int5 == 242);
    }

    @Test
    public void test12134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12134");
        imd.Livro livro4 = new imd.Livro("", "", 82, 241);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test12135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12135");
        imd.Livro livro4 = new imd.Livro("", "hi!", 265, 122);
    }

    @Test
    public void test12136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12136");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        int int10 = livro4.getPaginas();
        livro4.removerCopias(0);
        int int13 = livro4.getPaginas();
        livro4.removerCopias(32);
        livro4.emprestar();
        livro4.devolver();
        livro4.devolver();
        int int19 = livro4.getPaginas();
        livro4.devolver();
        int int21 = livro4.getPaginas();
        java.lang.String str22 = livro4.getAutor();
        java.lang.String str23 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test12137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12137");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) 'a', 247);
    }

    @Test
    public void test12138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12138");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 118, 306);
    }

    @Test
    public void test12139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12139");
        imd.Livro livro4 = new imd.Livro("", "hi!", 101, (int) (short) 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.adicionarCopias(32);
        java.lang.String str8 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias(246);
        livro4.adicionarCopias(146);
        int int14 = livro4.getCopiasDisponiveis();
        int int15 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 179 + "'", int14 == 179);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 179 + "'", int15 == 179);
    }

    @Test
    public void test12140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12140");
        imd.Livro livro4 = new imd.Livro("", "hi!", 162, 30);
    }

    @Test
    public void test12141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12141");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', (int) '#');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test12142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12142");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias(242);
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 274 + "'", int11 == 274);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 274 + "'", int15 == 274);
    }

    @Test
    public void test12143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12143");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 1);
        livro4.removerCopias((int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(200);
        java.lang.String str18 = livro4.getTitulo();
        int int19 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 217 + "'", int19 == 217);
    }

    @Test
    public void test12144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12144");
        imd.Livro livro4 = new imd.Livro("hi!", "", 21, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(54);
        int int10 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 21 + "'", int10 == 21);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test12145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12145");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(173);
        livro4.devolver();
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12146");
        imd.Livro livro4 = new imd.Livro("hi!", "", 247, 383);
    }

    @Test
    public void test12147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12147");
        imd.Livro livro4 = new imd.Livro("hi!", "", 69, (int) (byte) 0);
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        livro4.removerCopias(9);
        int int9 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 69 + "'", int5 == 69);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 69 + "'", int9 == 69);
    }

    @Test
    public void test12148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12148");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', (int) '#');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) 100);
        int int10 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (short) -1);
        java.lang.String str13 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 134 + "'", int10 == 134);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test12149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12149");
        imd.Livro livro4 = new imd.Livro("hi!", "", 64, 1);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(162);
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str10 = livro4.getAutor();
        java.lang.String str11 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12150");
        imd.Livro livro4 = new imd.Livro("", "", 227, 120);
    }

    @Test
    public void test12151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12151");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 51, 101);
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        livro4.removerCopias(52);
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test12152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12152");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        livro4.removerCopias(101);
        livro4.adicionarCopias(153);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test12153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12153");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 52, 135);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 135 + "'", int5 == 135);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test12154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12154");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 1, 20);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(23);
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test12155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12155");
        imd.Livro livro4 = new imd.Livro("", "hi!", 113, 128);
        livro4.removerCopias(130);
    }

    @Test
    public void test12156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12156");
        imd.Livro livro4 = new imd.Livro("", "", 69, 109);
    }

    @Test
    public void test12157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12157");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 97);
        livro4.removerCopias(31);
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test12158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12158");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((-1));
        livro4.removerCopias(21);
        java.lang.String str14 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        int int17 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str21 = livro4.getAutor();
        livro4.removerCopias(45);
        java.lang.String str24 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test12159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12159");
        imd.Livro livro4 = new imd.Livro("", "hi!", 240, 90);
    }

    @Test
    public void test12160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12160");
        imd.Livro livro4 = new imd.Livro("", "", 67, 97);
        livro4.adicionarCopias(51);
        livro4.adicionarCopias(40);
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test12161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12161");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 1);
        livro4.removerCopias((int) (byte) 10);
        livro4.devolver();
        java.lang.String str16 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        livro4.adicionarCopias((int) (short) 1);
        livro4.removerCopias(0);
        int int23 = livro4.getCopiasDisponiveis();
        int int24 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 42 + "'", int23 == 42);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42 + "'", int24 == 42);
    }

    @Test
    public void test12162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12162");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 34);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias(182);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test12163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12163");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getAutor();
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test12164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12164");
        imd.Livro livro4 = new imd.Livro("hi!", "", 137, 36);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test12165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12165");
        imd.Livro livro4 = new imd.Livro("", "hi!", 62, (int) (byte) -1);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test12166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12166");
        imd.Livro livro4 = new imd.Livro("", "hi!", 127, 169);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test12167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12167");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int14 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test12168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12168");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 10, (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(127);
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 158 + "'", int8 == 158);
    }

    @Test
    public void test12169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12169");
        imd.Livro livro4 = new imd.Livro("hi!", "", 0, 4);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test12170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12170");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test12171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12171");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.devolver();
        livro4.removerCopias((int) (byte) 10);
        int int14 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test12172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12172");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 97);
        livro4.adicionarCopias(33);
        livro4.adicionarCopias(44);
        java.lang.String str9 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str11 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12173");
        imd.Livro livro4 = new imd.Livro("hi!", "", 97, (int) 'a');
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(71);
        java.lang.String str10 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test12174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12174");
        imd.Livro livro4 = new imd.Livro("", "", 11, 225);
        livro4.devolver();
    }

    @Test
    public void test12175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12175");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) (short) -1);
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test12176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12176");
        imd.Livro livro4 = new imd.Livro("hi!", "", 153, 32);
        livro4.devolver();
        livro4.adicionarCopias(195);
    }

    @Test
    public void test12177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12177");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(97);
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias(0);
        java.lang.String str16 = livro4.getAutor();
        java.lang.String str17 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 128 + "'", int11 == 128);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test12178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12178");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 1);
        livro4.removerCopias((int) (byte) 1);
        livro4.removerCopias(101);
        livro4.emprestar();
        livro4.removerCopias(254);
        java.lang.String str20 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test12179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12179");
        imd.Livro livro4 = new imd.Livro("", "hi!", 31, 101);
        livro4.devolver();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getTitulo();
        livro4.removerCopias(53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test12180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12180");
        imd.Livro livro4 = new imd.Livro("", "hi!", 285, 179);
    }

    @Test
    public void test12181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12181");
        imd.Livro livro4 = new imd.Livro("hi!", "", 166, 0);
        livro4.removerCopias(152);
        int int7 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 166 + "'", int7 == 166);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test12182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12182");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias(31);
        int int7 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        livro4.emprestar();
        int int13 = livro4.getPaginas();
        livro4.removerCopias(220);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test12183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12183");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test12184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12184");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias(41);
        livro4.adicionarCopias(0);
        livro4.adicionarCopias(217);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test12185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12185");
        imd.Livro livro4 = new imd.Livro("", "", 120, (int) (byte) 100);
    }

    @Test
    public void test12186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12186");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias(31);
        int int7 = livro4.getPaginas();
        livro4.devolver();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getPaginas();
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.String str12 = livro4.getTitulo();
        livro4.removerCopias(383);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 67 + "'", int11 == 67);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test12187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12187");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((-1));
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test12188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12188");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (byte) 10);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(21);
        int int9 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str11 = livro4.getAutor();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12189");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        livro4.adicionarCopias(20);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test12190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12190");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 0, 31);
        livro4.devolver();
        livro4.adicionarCopias((int) (short) 10);
        livro4.adicionarCopias(126);
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        livro4.adicionarCopias(126);
        livro4.adicionarCopias(201);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 168 + "'", int10 == 168);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test12191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12191");
        imd.Livro livro4 = new imd.Livro("", "", 152, 64);
        livro4.removerCopias(35);
        livro4.removerCopias(18);
    }

    @Test
    public void test12192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12192");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(10);
        livro4.removerCopias(65);
        livro4.adicionarCopias(21);
        livro4.removerCopias(134);
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test12193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12193");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias(21);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(294);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test12194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12194");
        imd.Livro livro4 = new imd.Livro("", "", 113, (int) (byte) 10);
        livro4.adicionarCopias(98);
        livro4.emprestar();
    }

    @Test
    public void test12195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12195");
        imd.Livro livro4 = new imd.Livro("", "hi!", 11, 63);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getAutor();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test12196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12196");
        imd.Livro livro4 = new imd.Livro("", "hi!", 107, 118);
    }

    @Test
    public void test12197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12197");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, (int) '4');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test12198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12198");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 128, 41);
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(106);
        int int9 = livro4.getPaginas();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 128 + "'", int9 == 128);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
    }

    @Test
    public void test12199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12199");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.removerCopias(10);
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias(32);
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test12200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12200");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(0);
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getAutor();
        livro4.devolver();
        livro4.devolver();
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12201");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 0);
        livro4.emprestar();
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test12202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12202");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        livro4.emprestar();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        livro4.removerCopias(21);
        livro4.adicionarCopias(19);
        livro4.adicionarCopias((int) 'a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test12203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12203");
        imd.Livro livro4 = new imd.Livro("", "hi!", 246, 370);
    }

    @Test
    public void test12204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12204");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str12 = livro4.getTitulo();
        livro4.removerCopias(28);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test12205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12205");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 10, (int) (byte) 10);
        livro4.adicionarCopias(1);
        livro4.removerCopias(29);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test12206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12206");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 100, 125);
    }

    @Test
    public void test12207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12207");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) ' ', 9);
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test12208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12208");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, (int) (byte) 1);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test12209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12209");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        livro4.adicionarCopias(40);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test12210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12210");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias((int) (short) 10);
        livro4.devolver();
        livro4.removerCopias(130);
        int int14 = livro4.getPaginas();
        int int15 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias(135);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40 + "'", int15 == 40);
    }

    @Test
    public void test12211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12211");
        imd.Livro livro4 = new imd.Livro("", "", 50, 177);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 177 + "'", int5 == 177);
    }

    @Test
    public void test12212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12212");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.devolver();
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        int int13 = livro4.getPaginas();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str16 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias(2);
        java.lang.String str20 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test12213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12213");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test12214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12214");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(265);
        java.lang.String str12 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test12215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12215");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 100, 0);
        livro4.emprestar();
        livro4.adicionarCopias(84);
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 84 + "'", int8 == 84);
    }

    @Test
    public void test12216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12216");
        imd.Livro livro4 = new imd.Livro("", "", 40, (int) (short) 0);
        livro4.devolver();
        livro4.removerCopias((int) (short) -1);
    }

    @Test
    public void test12217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12217");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias((int) '#');
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getTitulo();
        int int13 = livro4.getCopiasDisponiveis();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test12218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12218");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias(41);
        java.lang.String str11 = livro4.getTitulo();
        livro4.removerCopias(42);
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12219");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 32, 21);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test12220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12220");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getPaginas();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.removerCopias(0);
        livro4.emprestar();
        java.lang.String str11 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12221");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 77, 47);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 77 + "'", int5 == 77);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test12222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12222");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(67);
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getTitulo();
        int int14 = livro4.getPaginas();
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test12223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12223");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias(33);
        java.lang.String str9 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test12224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12224");
        imd.Livro livro4 = new imd.Livro("", "", 60, 100);
        livro4.removerCopias(188);
    }

    @Test
    public void test12225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12225");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) -1, 34);
        livro4.removerCopias(35);
    }

    @Test
    public void test12226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12226");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias(242);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(33);
        livro4.adicionarCopias((int) (short) 0);
        java.lang.String str16 = livro4.getAutor();
        int int17 = livro4.getCopiasDisponiveis();
        java.lang.String str18 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 274 + "'", int11 == 274);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 241 + "'", int17 == 241);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test12227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12227");
        imd.Livro livro4 = new imd.Livro("hi!", "", 10, 96);
        livro4.devolver();
    }

    @Test
    public void test12228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12228");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 38, 204);
    }

    @Test
    public void test12229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12229");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 9, 383);
        livro4.adicionarCopias(181);
    }

    @Test
    public void test12230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12230");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias(21);
        livro4.removerCopias(21);
        java.lang.String str11 = livro4.getAutor();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12231");
        imd.Livro livro4 = new imd.Livro("hi!", "", 97, 21);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(304);
        java.lang.String str8 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test12232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12232");
        imd.Livro livro4 = new imd.Livro("", "hi!", 166, 97);
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test12233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12233");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', 100);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test12234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12234");
        imd.Livro livro4 = new imd.Livro("", "", (int) '#', (int) (short) 1);
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(46);
        livro4.adicionarCopias(147);
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 148 + "'", int10 == 148);
    }

    @Test
    public void test12235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12235");
        imd.Livro livro4 = new imd.Livro("", "", 12, 34);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test12236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12236");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 10);
        livro4.adicionarCopias(97);
        livro4.adicionarCopias(62);
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test12237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12237");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias(97);
        livro4.adicionarCopias(126);
        livro4.devolver();
        java.lang.String str12 = livro4.getAutor();
        livro4.devolver();
        livro4.devolver();
        java.lang.String str15 = livro4.getAutor();
        java.lang.String str16 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test12238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12238");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias((int) 'a');
        livro4.adicionarCopias(127);
        int int12 = livro4.getPaginas();
        java.lang.String str13 = livro4.getAutor();
        livro4.adicionarCopias((int) '4');
        livro4.removerCopias(0);
        java.lang.String str18 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test12239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12239");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias(11);
        java.lang.String str18 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test12240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12240");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias(242);
        livro4.removerCopias(97);
        livro4.removerCopias((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12241");
        imd.Livro livro4 = new imd.Livro("", "", 35, 51);
        livro4.adicionarCopias((int) 'a');
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test12242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12242");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 36);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36 + "'", int5 == 36);
    }

    @Test
    public void test12243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12243");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(0);
        livro4.removerCopias(100);
        livro4.adicionarCopias((int) (short) 10);
        livro4.adicionarCopias((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
    }

    @Test
    public void test12244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12244");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 97);
        livro4.removerCopias(10);
        int int7 = livro4.getPaginas();
        livro4.removerCopias(43);
        java.lang.String str10 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test12245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12245");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 126, 141);
        livro4.adicionarCopias(0);
        java.lang.String str7 = livro4.getTitulo();
        livro4.removerCopias(266);
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 126 + "'", int10 == 126);
    }

    @Test
    public void test12246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12246");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        java.lang.String str13 = livro4.getTitulo();
        livro4.removerCopias(307);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12247");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test12248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12248");
        imd.Livro livro4 = new imd.Livro("", "", 88, 0);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 88 + "'", int6 == 88);
    }

    @Test
    public void test12249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12249");
        imd.Livro livro4 = new imd.Livro("hi!", "", 69, 273);
    }

    @Test
    public void test12250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12250");
        imd.Livro livro4 = new imd.Livro("", "", (int) '#', 122);
        livro4.devolver();
        livro4.devolver();
    }

    @Test
    public void test12251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12251");
        imd.Livro livro4 = new imd.Livro("", "hi!", 180, 224);
    }

    @Test
    public void test12252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12252");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 10, 21);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test12253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12253");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 97);
        livro4.adicionarCopias(33);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(265);
        livro4.removerCopias(80);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test12254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12254");
        imd.Livro livro4 = new imd.Livro("hi!", "", 102, 67);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 67 + "'", int6 == 67);
    }

    @Test
    public void test12255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12255");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        livro4.devolver();
        livro4.emprestar();
    }

    @Test
    public void test12256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12256");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        livro4.devolver();
        livro4.removerCopias(1);
        livro4.adicionarCopias(2);
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str19 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test12257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12257");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) ' ');
        livro4.removerCopias(0);
        java.lang.String str13 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12258");
        imd.Livro livro4 = new imd.Livro("", "hi!", 40, (int) (byte) -1);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias(52);
        int int10 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 1);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
    }

    @Test
    public void test12259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12259");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str7 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias(67);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test12260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12260");
        imd.Livro livro4 = new imd.Livro("", "hi!", 162, 12);
    }

    @Test
    public void test12261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12261");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias((int) (short) 10);
        livro4.devolver();
        livro4.removerCopias(130);
        int int14 = livro4.getPaginas();
        livro4.removerCopias(35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test12262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12262");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getAutor();
        livro4.removerCopias(0);
        java.lang.String str11 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12263");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 97);
        livro4.removerCopias(10);
        int int7 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias(12);
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test12264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12264");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 60);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        int int7 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test12265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12265");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) -1, 51);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
    }

    @Test
    public void test12266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12266");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.removerCopias(10);
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test12267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12267");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        livro4.removerCopias(29);
        livro4.removerCopias((int) (byte) 1);
        int int14 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str16 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12268");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str14 = livro4.getAutor();
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }
}

