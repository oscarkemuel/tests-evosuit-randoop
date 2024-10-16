import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

    public static boolean debug = false;

    @Test
    public void test09501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09501");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 10, 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        livro4.devolver();
        livro4.emprestar();
        livro4.removerCopias(64);
        int int11 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test09502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09502");
        imd.Livro livro4 = new imd.Livro("", "hi!", 101, 160);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09503");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) ' ', 31);
        livro4.removerCopias(34);
        livro4.adicionarCopias(130);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(229);
        int int12 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 161 + "'", int9 == 161);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09504");
        imd.Livro livro4 = new imd.Livro("hi!", "", 19, 220);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test09505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09505");
        imd.Livro livro4 = new imd.Livro("", "", 0, 7);
        livro4.devolver();
        livro4.adicionarCopias(160);
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test09506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09506");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias(0);
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getAutor();
        java.lang.String str13 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test09507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09507");
        imd.Livro livro4 = new imd.Livro("", "hi!", 10, 100);
        livro4.emprestar();
        livro4.adicionarCopias(0);
    }

    @Test
    public void test09508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09508");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.devolver();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        livro4.removerCopias(225);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test09509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09509");
        imd.Livro livro4 = new imd.Livro("hi!", "", 97, (int) (byte) 10);
        livro4.emprestar();
    }

    @Test
    public void test09510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09510");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.removerCopias(32);
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        livro4.removerCopias(10);
        int int15 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias(239);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test09511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09511");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 66, 99);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test09512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09512");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 10, 0);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(131);
        livro4.removerCopias(35);
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getTitulo();
        livro4.removerCopias(166);
        livro4.emprestar();
        int int18 = livro4.getPaginas();
        int int19 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test09513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09513");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 263, 224);
    }

    @Test
    public void test09514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09514");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '4', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias(227);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
    }

    @Test
    public void test09515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09515");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 197, 61);
    }

    @Test
    public void test09516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09516");
        imd.Livro livro4 = new imd.Livro("", "hi!", 51, 9);
    }

    @Test
    public void test09517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09517");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '4', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test09518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09518");
        imd.Livro livro4 = new imd.Livro("", "hi!", 129, (int) (byte) 1);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 129 + "'", int8 == 129);
    }

    @Test
    public void test09519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09519");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.removerCopias(32);
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str17 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test09520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09520");
        imd.Livro livro4 = new imd.Livro("", "", 373, 100);
        livro4.devolver();
        livro4.adicionarCopias(396);
    }

    @Test
    public void test09521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09521");
        imd.Livro livro4 = new imd.Livro("", "", 35, (int) '4');
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test09522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09522");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (byte) -1);
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        livro4.emprestar();
        int int13 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09523");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 265, 0);
        livro4.adicionarCopias(36);
        java.lang.String str7 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09524");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.adicionarCopias(32);
        livro4.adicionarCopias(0);
        java.lang.String str14 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.removerCopias(66);
        livro4.emprestar();
        java.lang.String str20 = livro4.getTitulo();
        livro4.adicionarCopias(102);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test09525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09525");
        imd.Livro livro4 = new imd.Livro("", "", 0, 7);
        livro4.devolver();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test09526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09526");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        livro4.emprestar();
        livro4.removerCopias(65);
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        livro4.adicionarCopias(99);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test09527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09527");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, 10);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test09528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09528");
        imd.Livro livro4 = new imd.Livro("", "", 0, 160);
        livro4.devolver();
        livro4.adicionarCopias(17);
        livro4.adicionarCopias(204);
    }

    @Test
    public void test09529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09529");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, 305);
    }

    @Test
    public void test09530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09530");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        livro4.removerCopias(10);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.adicionarCopias(100);
        int int12 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (byte) 0);
        int int15 = livro4.getPaginas();
        int int16 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
    }

    @Test
    public void test09531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09531");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test09532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09532");
        imd.Livro livro4 = new imd.Livro("hi!", "", 63, 96);
    }

    @Test
    public void test09533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09533");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 132, (int) (byte) -1);
        livro4.removerCopias(52);
        livro4.removerCopias(2);
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 132 + "'", int9 == 132);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 132 + "'", int11 == 132);
    }

    @Test
    public void test09534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09534");
        imd.Livro livro4 = new imd.Livro("hi!", "", 160, (-1));
    }

    @Test
    public void test09535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09535");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 196, 28);
        livro4.removerCopias(46);
    }

    @Test
    public void test09536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09536");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 132, (int) (byte) -1);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 1);
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias(232);
        java.lang.String str12 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 132 + "'", int9 == 132);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test09537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09537");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str12 = livro4.getAutor();
        livro4.adicionarCopias(66);
        livro4.adicionarCopias(101);
        java.lang.String str17 = livro4.getTitulo();
        int int18 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 201 + "'", int18 == 201);
    }

    @Test
    public void test09538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09538");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        livro4.removerCopias(10);
        livro4.emprestar();
        java.lang.String str8 = livro4.getAutor();
        livro4.emprestar();
        livro4.adicionarCopias(366);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test09539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09539");
        imd.Livro livro4 = new imd.Livro("", "", 5, 64);
    }

    @Test
    public void test09540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09540");
        imd.Livro livro4 = new imd.Livro("", "hi!", 130, 131);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(35);
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 131 + "'", int5 == 131);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 130 + "'", int9 == 130);
    }

    @Test
    public void test09541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09541");
        imd.Livro livro4 = new imd.Livro("", "hi!", 164, 0);
        livro4.removerCopias(66);
        int int7 = livro4.getPaginas();
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 164 + "'", int7 == 164);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test09542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09542");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 0);
        livro4.devolver();
        livro4.devolver();
        java.lang.String str7 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test09543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09543");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, (int) (byte) 1);
        livro4.adicionarCopias(31);
        livro4.emprestar();
        int int8 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(52);
        livro4.adicionarCopias(230);
        livro4.removerCopias(161);
        int int16 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 153 + "'", int16 == 153);
    }

    @Test
    public void test09544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09544");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', (int) (short) 1);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias((int) (short) 100);
        int int10 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(132);
        livro4.emprestar();
        int int14 = livro4.getCopiasDisponiveis();
        int int15 = livro4.getPaginas();
        java.lang.String str16 = livro4.getAutor();
        int int17 = livro4.getPaginas();
        java.lang.String str18 = livro4.getAutor();
        java.lang.String str19 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test09545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09545");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 0);
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.devolver();
        java.lang.String str13 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test09546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09546");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 10, 30);
        livro4.adicionarCopias(364);
        livro4.devolver();
    }

    @Test
    public void test09547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09547");
        imd.Livro livro4 = new imd.Livro("", "", 27, 17);
        livro4.removerCopias(32);
        java.lang.String str7 = livro4.getAutor();
        livro4.removerCopias(196);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test09548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09548");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        int int7 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        livro4.adicionarCopias(128);
        int int15 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(133);
        java.lang.String str18 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 128 + "'", int15 == 128);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test09549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09549");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, 10);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test09550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09550");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (short) -1);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test09551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09551");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 294, 29);
        livro4.devolver();
    }

    @Test
    public void test09552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09552");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 0);
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        livro4.removerCopias(110);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test09553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09553");
        imd.Livro livro4 = new imd.Livro("", "", 130, (-1));
        livro4.removerCopias(10);
        java.lang.String str7 = livro4.getAutor();
        livro4.removerCopias(33);
        java.lang.String str10 = livro4.getAutor();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 130 + "'", int13 == 130);
    }

    @Test
    public void test09554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09554");
        imd.Livro livro4 = new imd.Livro("", "", 0, 101);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test09555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09555");
        imd.Livro livro4 = new imd.Livro("", "", 0, 130);
    }

    @Test
    public void test09556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09556");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(101);
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str19 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 65 + "'", int14 == 65);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test09557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09557");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 132, (int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 100);
        livro4.adicionarCopias(241);
        livro4.adicionarCopias(68);
        java.lang.String str11 = livro4.getAutor();
        livro4.adicionarCopias(262);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test09558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09558");
        imd.Livro livro4 = new imd.Livro("", "", (int) '4', (int) (short) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias(122);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test09559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09559");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        livro4.removerCopias(128);
        java.lang.String str9 = livro4.getAutor();
        livro4.removerCopias(171);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test09560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09560");
        imd.Livro livro4 = new imd.Livro("hi!", "", 0, (int) (byte) 10);
        livro4.adicionarCopias(332);
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test09561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09561");
        imd.Livro livro4 = new imd.Livro("", "", 224, 425);
    }

    @Test
    public void test09562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09562");
        imd.Livro livro4 = new imd.Livro("hi!", "", 133, 164);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 164 + "'", int5 == 164);
    }

    @Test
    public void test09563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09563");
        imd.Livro livro4 = new imd.Livro("hi!", "", 161, 127);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(147);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test09564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09564");
        imd.Livro livro4 = new imd.Livro("", "", 94, 2);
    }

    @Test
    public void test09565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09565");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str12 = livro4.getTitulo();
        livro4.emprestar();
        livro4.devolver();
        livro4.devolver();
        livro4.emprestar();
        int int17 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 65 + "'", int17 == 65);
    }

    @Test
    public void test09566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09566");
        imd.Livro livro4 = new imd.Livro("", "hi!", 253, 201);
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test09567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09567");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 69, (int) ' ');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 69 + "'", int5 == 69);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test09568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09568");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 100, 33);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(195);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
    }

    @Test
    public void test09569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09569");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        int int7 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test09570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09570");
        imd.Livro livro4 = new imd.Livro("", "hi!", 366, 237);
    }

    @Test
    public void test09571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09571");
        imd.Livro livro4 = new imd.Livro("hi!", "", 127, (int) (short) 10);
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 127 + "'", int5 == 127);
    }

    @Test
    public void test09572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09572");
        imd.Livro livro4 = new imd.Livro("", "", 331, 179);
    }

    @Test
    public void test09573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09573");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (short) 0);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias((-1));
        livro4.adicionarCopias(3);
        java.lang.String str11 = livro4.getAutor();
        livro4.adicionarCopias(0);
        java.lang.String str14 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 100);
        livro4.emprestar();
        int int18 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
    }

    @Test
    public void test09574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09574");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) (byte) 1);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test09575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09575");
        imd.Livro livro4 = new imd.Livro("", "hi!", 156, 29);
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test09576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09576");
        imd.Livro livro4 = new imd.Livro("", "", 156, (int) (byte) 100);
        livro4.removerCopias(86);
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 156 + "'", int7 == 156);
    }

    @Test
    public void test09577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09577");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(132);
        livro4.devolver();
        livro4.removerCopias(31);
        livro4.devolver();
        int int15 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test09578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09578");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str15 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09579");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 100, (int) (short) -1);
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias((int) (short) 100);
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test09580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09580");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test09581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09581");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, (int) (byte) 1);
        livro4.adicionarCopias(31);
        livro4.removerCopias(1);
        livro4.devolver();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 31 + "'", int14 == 31);
    }

    @Test
    public void test09582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09582");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.devolver();
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getAutor();
        livro4.removerCopias(33);
        livro4.adicionarCopias(122);
        int int16 = livro4.getPaginas();
        int int17 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 122 + "'", int17 == 122);
    }

    @Test
    public void test09583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09583");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test09584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09584");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 100, 63);
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09585");
        imd.Livro livro4 = new imd.Livro("hi!", "", (-1), 128);
        livro4.removerCopias((int) (short) -1);
        livro4.devolver();
        int int8 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test09586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09586");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09587");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias(0);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        livro4.emprestar();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int14 = livro4.getPaginas();
        java.lang.String str15 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09588");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.adicionarCopias(32);
        livro4.removerCopias((int) (byte) 100);
        int int14 = livro4.getCopiasDisponiveis();
        int int15 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(0);
        int int18 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(9);
        java.lang.Class<?> wildcardClass22 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test09589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09589");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 0);
        int int9 = livro4.getPaginas();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getAutor();
        livro4.emprestar();
        livro4.removerCopias(355);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test09590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09590");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.adicionarCopias(32);
        livro4.adicionarCopias(0);
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getPaginas();
        java.lang.String str16 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test09591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09591");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str10 = livro4.getAutor();
        livro4.devolver();
        int int12 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09592");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        livro4.emprestar();
        livro4.removerCopias(65);
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        livro4.adicionarCopias(101);
        java.lang.String str14 = livro4.getTitulo();
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test09593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09593");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 10, 2);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test09594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09594");
        imd.Livro livro4 = new imd.Livro("hi!", "", 261, (int) (byte) 10);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09595");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) '4');
        livro4.adicionarCopias((int) 'a');
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(0);
        livro4.emprestar();
        int int19 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 129 + "'", int12 == 129);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test09596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09596");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.adicionarCopias((int) 'a');
        livro4.removerCopias(31);
        livro4.removerCopias((int) (short) 0);
        livro4.removerCopias((int) (short) 0);
        livro4.devolver();
        livro4.emprestar();
        livro4.emprestar();
        int int23 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 99 + "'", int23 == 99);
    }

    @Test
    public void test09597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09597");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.removerCopias(32);
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test09598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09598");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.emprestar();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getPaginas();
        int int15 = livro4.getCopiasDisponiveis();
        int int16 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(297);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 131 + "'", int10 == 131);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 132 + "'", int15 == 132);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 132 + "'", int16 == 132);
    }

    @Test
    public void test09599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09599");
        imd.Livro livro4 = new imd.Livro("hi!", "", 291, 25);
        livro4.removerCopias(47);
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test09600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09600");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str11 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test09601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09601");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(132);
        livro4.devolver();
        livro4.emprestar();
        int int13 = livro4.getPaginas();
        livro4.adicionarCopias(287);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test09602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09602");
        imd.Livro livro4 = new imd.Livro("", "", 33, 132);
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str11 = livro4.getAutor();
        livro4.removerCopias(74);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test09603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09603");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, (int) 'a');
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test09604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09604");
        imd.Livro livro4 = new imd.Livro("", "", 17, 262);
    }

    @Test
    public void test09605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09605");
        imd.Livro livro4 = new imd.Livro("hi!", "", 97, 102);
        livro4.devolver();
        livro4.adicionarCopias(7);
        livro4.devolver();
    }

    @Test
    public void test09606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09606");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 100);
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getPaginas();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(54);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 132 + "'", int9 == 132);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 132 + "'", int11 == 132);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 132 + "'", int13 == 132);
    }

    @Test
    public void test09607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09607");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getPaginas();
        livro4.removerCopias((int) (short) -1);
        livro4.adicionarCopias(33);
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 66 + "'", int11 == 66);
    }

    @Test
    public void test09608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09608");
        imd.Livro livro4 = new imd.Livro("", "hi!", 35, (int) (short) -1);
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(86);
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 85 + "'", int10 == 85);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test09609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09609");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, (-1));
        livro4.adicionarCopias(132);
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        livro4.removerCopias(480);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test09610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09610");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 10, 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias(129);
        int int10 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 10);
        int int14 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 130 + "'", int10 == 130);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test09611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09611");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', (int) (short) 1);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test09612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09612");
        imd.Livro livro4 = new imd.Livro("", "", (int) '4', (int) (short) 0);
        livro4.emprestar();
        livro4.adicionarCopias(0);
        livro4.emprestar();
        livro4.devolver();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(64);
        livro4.devolver();
        int int16 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 68 + "'", int16 == 68);
    }

    @Test
    public void test09613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09613");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        java.lang.String str10 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 10);
        livro4.devolver();
        java.lang.String str14 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test09614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09614");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias(0);
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(10);
        java.lang.String str13 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str15 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test09615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09615");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 32, (int) (byte) -1);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(144);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test09616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09616");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 100, 100);
        livro4.emprestar();
        livro4.devolver();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test09617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09617");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 100);
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getAutor();
        livro4.removerCopias(0);
        livro4.emprestar();
        livro4.adicionarCopias(0);
        livro4.removerCopias(132);
        livro4.adicionarCopias(35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 132 + "'", int9 == 132);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test09618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09618");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        java.lang.String str13 = livro4.getAutor();
        livro4.removerCopias(165);
        livro4.emprestar();
        livro4.adicionarCopias(373);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test09619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09619");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, (-1));
        livro4.adicionarCopias(132);
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str10 = livro4.getAutor();
        livro4.adicionarCopias(17);
        livro4.removerCopias(88);
        int int15 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
    }

    @Test
    public void test09620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09620");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 0);
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias(172);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test09621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09621");
        imd.Livro livro4 = new imd.Livro("", "", 0, 32);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(122);
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test09622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09622");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 100, (int) (short) -1);
        livro4.devolver();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test09623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09623");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 0, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        livro4.adicionarCopias(34);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test09624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09624");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (short) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09625");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str10 = livro4.getAutor();
        livro4.adicionarCopias(100);
        java.lang.String str13 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str15 = livro4.getAutor();
        livro4.removerCopias(135);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test09626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09626");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        int int7 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str9 = livro4.getTitulo();
        livro4.adicionarCopias(66);
        livro4.removerCopias(8);
        int int14 = livro4.getPaginas();
        livro4.removerCopias(100);
        livro4.adicionarCopias(360);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test09627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09627");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) '4');
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias(87);
        livro4.emprestar();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(167);
        java.lang.String str17 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 118 + "'", int14 == 118);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test09628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09628");
        imd.Livro livro4 = new imd.Livro("", "hi!", 134, 33);
        livro4.emprestar();
        livro4.removerCopias(12);
        livro4.adicionarCopias(65);
        livro4.adicionarCopias(28);
    }

    @Test
    public void test09629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09629");
        imd.Livro livro4 = new imd.Livro("", "", 0, 7);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test09630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09630");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 1, 165);
        livro4.removerCopias(89);
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09631");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.removerCopias(32);
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getPaginas();
        livro4.removerCopias(33);
        livro4.adicionarCopias((int) ' ');
        java.lang.String str18 = livro4.getAutor();
        int int19 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(253);
        java.lang.String str22 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33 + "'", int19 == 33);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test09632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09632");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getTitulo();
        livro4.devolver();
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test09633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09633");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        int int5 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 100);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.adicionarCopias(67);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test09634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09634");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 60, 295);
        livro4.devolver();
    }

    @Test
    public void test09635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09635");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test09636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09636");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getPaginas();
        livro4.removerCopias(396);
        int int15 = livro4.getCopiasDisponiveis();
        int int16 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test09637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09637");
        imd.Livro livro4 = new imd.Livro("", "", 67, 94);
    }

    @Test
    public void test09638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09638");
        imd.Livro livro4 = new imd.Livro("", "", 265, 30);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(354);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 265 + "'", int5 == 265);
    }

    @Test
    public void test09639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09639");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 1);
        int int12 = livro4.getPaginas();
        java.lang.String str13 = livro4.getAutor();
        livro4.adicionarCopias(100);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test09640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09640");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 10, 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(0);
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test09641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09641");
        imd.Livro livro4 = new imd.Livro("", "", 0, 101);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test09642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09642");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        livro4.removerCopias(1);
        livro4.adicionarCopias(14);
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test09643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09643");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 96);
        livro4.devolver();
    }

    @Test
    public void test09644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09644");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias(172);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test09645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09645");
        imd.Livro livro4 = new imd.Livro("", "", 0, 101);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
    }

    @Test
    public void test09646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09646");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        livro4.emprestar();
        int int8 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09647");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 100);
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias(10);
        int int13 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(0);
        java.lang.String str16 = livro4.getTitulo();
        java.lang.String str17 = livro4.getTitulo();
        livro4.adicionarCopias(51);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 132 + "'", int9 == 132);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 122 + "'", int13 == 122);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test09648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09648");
        imd.Livro livro4 = new imd.Livro("", "", (int) '#', 33);
        livro4.adicionarCopias(4);
        livro4.devolver();
    }

    @Test
    public void test09649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09649");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getAutor();
        livro4.devolver();
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.String str12 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 133 + "'", int11 == 133);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09650");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 255, 127);
    }

    @Test
    public void test09651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09651");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        livro4.removerCopias(10);
        livro4.emprestar();
        livro4.adicionarCopias(35);
        livro4.emprestar();
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(332);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test09652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09652");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 132, (int) (byte) -1);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test09653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09653");
        imd.Livro livro4 = new imd.Livro("", "", 63, 231);
        livro4.removerCopias(66);
        livro4.devolver();
    }

    @Test
    public void test09654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09654");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 0, (int) (byte) -1);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        livro4.removerCopias(321);
        int int9 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test09655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09655");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.removerCopias(32);
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getAutor();
        livro4.adicionarCopias((int) '4');
        livro4.emprestar();
        livro4.adicionarCopias(101);
        java.lang.String str18 = livro4.getAutor();
        java.lang.String str19 = livro4.getAutor();
        int int20 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 153 + "'", int20 == 153);
    }

    @Test
    public void test09656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09656");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 165, 161);
        livro4.removerCopias((int) (byte) 10);
        int int7 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 151 + "'", int7 == 151);
    }

    @Test
    public void test09657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09657");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '4', (int) (byte) 100);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test09658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09658");
        imd.Livro livro4 = new imd.Livro("hi!", "", 88, 143);
    }

    @Test
    public void test09659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09659");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.adicionarCopias(32);
        livro4.adicionarCopias(0);
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getCopiasDisponiveis();
        int int16 = livro4.getPaginas();
        livro4.removerCopias((int) (short) 1);
        livro4.emprestar();
        livro4.removerCopias(4);
        int int22 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test09660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09660");
        imd.Livro livro4 = new imd.Livro("hi!", "", (-1), 32);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test09661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09661");
        imd.Livro livro4 = new imd.Livro("hi!", "", 181, 48);
    }

    @Test
    public void test09662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09662");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) '4');
        livro4.adicionarCopias((int) 'a');
        livro4.removerCopias((int) (byte) 0);
        livro4.removerCopias(1);
        java.lang.String str16 = livro4.getTitulo();
        livro4.removerCopias(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test09663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09663");
        imd.Livro livro4 = new imd.Livro("", "hi!", 265, 1);
        livro4.adicionarCopias(66);
        livro4.removerCopias(414);
        java.lang.String str9 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test09664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09664");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        livro4.removerCopias(10);
        livro4.emprestar();
        java.lang.String str8 = livro4.getAutor();
        livro4.emprestar();
        livro4.removerCopias(0);
        java.lang.String str12 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09665");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 10, 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias(129);
        int int10 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(20);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 130 + "'", int10 == 130);
    }

    @Test
    public void test09666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09666");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) -1, 103);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 103 + "'", int5 == 103);
    }

    @Test
    public void test09667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09667");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias((int) (short) 10);
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        livro4.emprestar();
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 41 + "'", int12 == 41);
    }

    @Test
    public void test09668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09668");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        livro4.devolver();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str12 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str14 = livro4.getAutor();
        java.lang.String str15 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test09669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09669");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 0);
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        livro4.emprestar();
        int int12 = livro4.getCopiasDisponiveis();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 31 + "'", int13 == 31);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
    }

    @Test
    public void test09670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09670");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getTitulo();
        livro4.devolver();
        int int10 = livro4.getPaginas();
        int int11 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test09671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09671");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias((int) (short) 100);
        int int18 = livro4.getPaginas();
        java.lang.String str19 = livro4.getTitulo();
        livro4.removerCopias(66);
        int int22 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(33);
        java.lang.String str25 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test09672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09672");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 0, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        int int7 = livro4.getPaginas();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test09673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09673");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) '4');
        livro4.adicionarCopias((int) 'a');
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getTitulo();
        livro4.emprestar();
        int int16 = livro4.getCopiasDisponiveis();
        java.lang.String str17 = livro4.getAutor();
        livro4.adicionarCopias(330);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 129 + "'", int12 == 129);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 128 + "'", int16 == 128);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test09674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09674");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str12 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09675");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test09676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09676");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        livro4.removerCopias(10);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.adicionarCopias(100);
        livro4.emprestar();
        java.lang.String str13 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test09677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09677");
        imd.Livro livro4 = new imd.Livro("", "", 285, 253);
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test09678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09678");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        livro4.removerCopias(17);
        livro4.removerCopias((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09679");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias(18);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test09680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09680");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 127, 590);
    }

    @Test
    public void test09681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09681");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.adicionarCopias((int) 'a');
        livro4.emprestar();
        livro4.devolver();
        livro4.removerCopias(36);
        livro4.adicionarCopias(65);
        livro4.removerCopias(3);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test09682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09682");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        livro4.removerCopias(10);
        livro4.emprestar();
        java.lang.String str8 = livro4.getAutor();
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias(225);
        int int13 = livro4.getCopiasDisponiveis();
        int int14 = livro4.getPaginas();
        java.lang.String str15 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09683");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias(0);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias(1);
        java.lang.String str14 = livro4.getAutor();
        java.lang.String str15 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test09684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09684");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 100);
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str13 = livro4.getTitulo();
        livro4.adicionarCopias(161);
        int int16 = livro4.getPaginas();
        int int17 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 132 + "'", int9 == 132);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test09685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09685");
        imd.Livro livro4 = new imd.Livro("", "hi!", 31, 31);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
    }

    @Test
    public void test09686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09686");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias((-1));
        livro4.emprestar();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getTitulo();
        livro4.removerCopias(195);
        int int16 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test09687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09687");
        imd.Livro livro4 = new imd.Livro("", "", 33, 132);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(366);
        livro4.adicionarCopias(130);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
    }

    @Test
    public void test09688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09688");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getAutor();
        livro4.removerCopias((int) (short) -1);
        java.lang.String str12 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str14 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test09689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09689");
        imd.Livro livro4 = new imd.Livro("hi!", "", 599, 93);
    }

    @Test
    public void test09690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09690");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 0);
        livro4.devolver();
        java.lang.String str10 = livro4.getAutor();
        java.lang.String str11 = livro4.getAutor();
        livro4.emprestar();
        livro4.removerCopias(1);
        int int15 = livro4.getPaginas();
        java.lang.String str16 = livro4.getAutor();
        java.lang.String str17 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test09691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09691");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias((int) (byte) 100);
        java.lang.String str9 = livro4.getTitulo();
        livro4.adicionarCopias(47);
        java.lang.String str12 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09692");
        imd.Livro livro4 = new imd.Livro("", "hi!", 1, 10);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias((int) 'a');
        livro4.removerCopias(18);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test09693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09693");
        imd.Livro livro4 = new imd.Livro("", "hi!", 306, 61);
    }

    @Test
    public void test09694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09694");
        imd.Livro livro4 = new imd.Livro("", "", 231, 294);
    }

    @Test
    public void test09695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09695");
        imd.Livro livro4 = new imd.Livro("", "", 227, 0);
    }

    @Test
    public void test09696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09696");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 131, (int) (short) 0);
        livro4.adicionarCopias(99);
        livro4.removerCopias(4);
        livro4.removerCopias(227);
    }

    @Test
    public void test09697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09697");
        imd.Livro livro4 = new imd.Livro("hi!", "", 3, (int) '4');
        livro4.devolver();
        int int6 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09698");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.adicionarCopias(32);
        livro4.adicionarCopias(0);
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getCopiasDisponiveis();
        int int16 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        int int19 = livro4.getCopiasDisponiveis();
        java.lang.String str20 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 66 + "'", int19 == 66);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test09699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09699");
        imd.Livro livro4 = new imd.Livro("", "", 52, 265);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 265 + "'", int5 == 265);
    }

    @Test
    public void test09700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09700");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.removerCopias(32);
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getAutor();
        livro4.adicionarCopias((int) '4');
        livro4.emprestar();
        livro4.adicionarCopias(101);
        livro4.devolver();
        int int19 = livro4.getPaginas();
        int int20 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test09701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09701");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str7 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getAutor();
        livro4.removerCopias(201);
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getAutor();
        livro4.adicionarCopias(201);
        livro4.adicionarCopias(134);
        java.lang.Class<?> wildcardClass19 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test09702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09702");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, 10);
        livro4.adicionarCopias(34);
        java.lang.String str7 = livro4.getTitulo();
        livro4.devolver();
        int int9 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
    }

    @Test
    public void test09703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09703");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 46, 599);
    }

    @Test
    public void test09704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09704");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias(0);
        java.lang.String str9 = livro4.getAutor();
        livro4.removerCopias(32);
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test09705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09705");
        imd.Livro livro4 = new imd.Livro("", "hi!", 30, 65);
        livro4.emprestar();
        livro4.adicionarCopias((int) ' ');
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test09706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09706");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 100);
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getAutor();
        livro4.removerCopias(0);
        int int13 = livro4.getPaginas();
        livro4.adicionarCopias(166);
        livro4.emprestar();
        livro4.adicionarCopias(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 132 + "'", int9 == 132);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test09707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09707");
        imd.Livro livro4 = new imd.Livro("", "hi!", 131, 129);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 131 + "'", int5 == 131);
    }

    @Test
    public void test09708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09708");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 100);
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getAutor();
        livro4.emprestar();
        livro4.adicionarCopias(296);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 132 + "'", int9 == 132);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test09709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09709");
        imd.Livro livro4 = new imd.Livro("", "hi!", 253, 7);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09710");
        imd.Livro livro4 = new imd.Livro("", "", 33, 132);
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias(122);
        java.lang.String str11 = livro4.getAutor();
        livro4.removerCopias(2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test09711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09711");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) '4');
        livro4.devolver();
        java.lang.String str13 = livro4.getAutor();
        java.lang.String str14 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test09712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09712");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 10, 0);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(0);
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias(26);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test09713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09713");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.devolver();
        livro4.removerCopias(101);
        livro4.removerCopias((-1));
        int int14 = livro4.getPaginas();
        livro4.removerCopias(19);
        livro4.adicionarCopias(296);
        int int19 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test09714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09714");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str10 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str12 = livro4.getTitulo();
        livro4.adicionarCopias(62);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09715");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 231, 128);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test09716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09716");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getPaginas();
        livro4.removerCopias(131);
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str19 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test09717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09717");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias(52);
        int int11 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test09718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09718");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias((int) (short) 100);
        java.lang.String str18 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test09719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09719");
        imd.Livro livro4 = new imd.Livro("hi!", "", 19, 134);
    }

    @Test
    public void test09720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09720");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 0, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias(162);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.adicionarCopias(144);
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test09721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09721");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(132);
        livro4.devolver();
        livro4.emprestar();
        int int13 = livro4.getPaginas();
        java.lang.String str14 = livro4.getAutor();
        java.lang.String str15 = livro4.getAutor();
        java.lang.String str16 = livro4.getAutor();
        int int17 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(172);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 166 + "'", int17 == 166);
    }

    @Test
    public void test09722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09722");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 48, 256);
    }

    @Test
    public void test09723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09723");
        imd.Livro livro4 = new imd.Livro("hi!", "", 225, 3);
        livro4.emprestar();
        livro4.emprestar();
    }

    @Test
    public void test09724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09724");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias(66);
        java.lang.String str11 = livro4.getAutor();
        livro4.adicionarCopias(296);
        java.lang.String str14 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test09725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09725");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 3);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(425);
        int int8 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test09726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09726");
        imd.Livro livro4 = new imd.Livro("hi!", "", 17, 87);
        java.lang.String str5 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test09727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09727");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.removerCopias(32);
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getAutor();
        livro4.adicionarCopias((int) '4');
        int int15 = livro4.getPaginas();
        java.lang.String str16 = livro4.getTitulo();
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str19 = livro4.getTitulo();
        livro4.emprestar();
        int int21 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test09728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09728");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', 34);
    }

    @Test
    public void test09729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09729");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.emprestar();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test09730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09730");
        imd.Livro livro4 = new imd.Livro("", "", 414, 133);
    }

    @Test
    public void test09731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09731");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        livro4.devolver();
        livro4.devolver();
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.String str12 = livro4.getAutor();
        livro4.devolver();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (byte) 10);
        livro4.adicionarCopias(29);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36 + "'", int14 == 36);
    }

    @Test
    public void test09732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09732");
        imd.Livro livro4 = new imd.Livro("hi!", "", 366, 241);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test09733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09733");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str12 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09734");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        livro4.removerCopias(165);
        livro4.devolver();
        int int14 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 135 + "'", int14 == 135);
    }

    @Test
    public void test09735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09735");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 66, 29);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test09736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09736");
        imd.Livro livro4 = new imd.Livro("", "", 138, 201);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09737");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias((int) 'a');
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getTitulo();
        livro4.removerCopias(161);
        int int16 = livro4.getPaginas();
        java.lang.String str17 = livro4.getAutor();
        java.lang.String str18 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test09738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09738");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias(33);
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test09739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09739");
        imd.Livro livro4 = new imd.Livro("", "", 55, 96);
    }

    @Test
    public void test09740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09740");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 49);
    }

    @Test
    public void test09741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09741");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test09742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09742");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 100);
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        livro4.adicionarCopias(0);
        livro4.removerCopias(64);
        java.lang.String str17 = livro4.getAutor();
        java.lang.String str18 = livro4.getAutor();
        livro4.removerCopias(46);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test09743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09743");
        imd.Livro livro4 = new imd.Livro("hi!", "", 35, 19);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test09744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09744");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        int int5 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 100);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(20);
        int int12 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09745");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) -1, 0);
        livro4.devolver();
    }

    @Test
    public void test09746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09746");
        imd.Livro livro4 = new imd.Livro("", "", 87, (int) '4');
        livro4.emprestar();
    }

    @Test
    public void test09747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09747");
        imd.Livro livro4 = new imd.Livro("", "hi!", 363, 112);
    }

    @Test
    public void test09748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09748");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.adicionarCopias(160);
        int int11 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(52);
        livro4.devolver();
        livro4.removerCopias(83);
        int int18 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test09749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09749");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getTitulo();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.removerCopias(12);
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09750");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) '4');
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str14 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test09751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09751");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 0, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias(162);
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test09752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09752");
        imd.Livro livro4 = new imd.Livro("", "", (-1), (int) (byte) 0);
        livro4.removerCopias((int) (short) 10);
        livro4.removerCopias((int) (short) 10);
        livro4.adicionarCopias(100);
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getTitulo();
        int int14 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09753");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 18, 227);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(189);
        livro4.removerCopias(256);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 227 + "'", int5 == 227);
    }

    @Test
    public void test09754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09754");
        imd.Livro livro4 = new imd.Livro("hi!", "", 239, 151);
    }

    @Test
    public void test09755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09755");
        imd.Livro livro4 = new imd.Livro("", "", 321, 162);
    }

    @Test
    public void test09756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09756");
        imd.Livro livro4 = new imd.Livro("", "hi!", 70, 480);
        livro4.devolver();
    }

    @Test
    public void test09757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09757");
        imd.Livro livro4 = new imd.Livro("", "hi!", 33, 1);
        livro4.removerCopias((int) (byte) 0);
        int int7 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test09758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09758");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 306, 18);
        livro4.removerCopias((int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09759");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias(0);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        livro4.removerCopias(122);
        livro4.removerCopias(151);
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09760");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        livro4.removerCopias(232);
        int int13 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test09761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09761");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 10, 599);
        livro4.emprestar();
    }

    @Test
    public void test09762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09762");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.emprestar();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
    }

    @Test
    public void test09763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09763");
        imd.Livro livro4 = new imd.Livro("", "", 127, 0);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 127 + "'", int5 == 127);
    }

    @Test
    public void test09764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09764");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 0);
        livro4.devolver();
        java.lang.String str10 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias(411);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test09765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09765");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) '4', (-1));
        livro4.removerCopias(9);
        livro4.adicionarCopias(364);
        livro4.removerCopias(299);
        livro4.emprestar();
    }

    @Test
    public void test09766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09766");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(132);
        livro4.devolver();
        livro4.emprestar();
        livro4.adicionarCopias(100);
        livro4.emprestar();
        livro4.adicionarCopias((int) (byte) 0);
        java.lang.String str18 = livro4.getAutor();
        livro4.devolver();
        java.lang.Class<?> wildcardClass20 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test09767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09767");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias((-1));
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.String str12 = livro4.getTitulo();
        livro4.adicionarCopias(52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09768");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(132);
        livro4.devolver();
        livro4.emprestar();
        livro4.adicionarCopias(100);
        livro4.emprestar();
        livro4.devolver();
        int int17 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 266 + "'", int17 == 266);
    }

    @Test
    public void test09769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09769");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str9 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test09770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09770");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 100);
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.devolver();
        java.lang.String str15 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 132 + "'", int9 == 132);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 132 + "'", int10 == 132);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 132 + "'", int11 == 132);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 132 + "'", int12 == 132);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test09771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09771");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) '4');
        livro4.adicionarCopias((int) 'a');
        livro4.removerCopias((int) (byte) 0);
        livro4.removerCopias(1);
        java.lang.String str16 = livro4.getTitulo();
        livro4.removerCopias((int) ' ');
        livro4.devolver();
        java.lang.String str20 = livro4.getTitulo();
        livro4.removerCopias(68);
        java.lang.Class<?> wildcardClass23 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test09772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09772");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias(0);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str12 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09773");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '4', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test09774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09774");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(262);
        java.lang.String str15 = livro4.getAutor();
        livro4.adicionarCopias(60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 132 + "'", int12 == 132);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test09775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09775");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', (int) (short) 1);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str7 = livro4.getTitulo();
        livro4.removerCopias(354);
        livro4.removerCopias((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test09776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09776");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, (-1));
        livro4.adicionarCopias(132);
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str10 = livro4.getAutor();
        livro4.adicionarCopias(17);
        int int13 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test09777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09777");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) ' ', (int) (short) 1);
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test09778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09778");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 63);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 63 + "'", int5 == 63);
    }

    @Test
    public void test09779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09779");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09780");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        livro4.removerCopias(10);
        livro4.devolver();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test09781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09781");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        livro4.removerCopias(10);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.adicionarCopias(100);
        int int12 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (byte) 0);
        int int15 = livro4.getPaginas();
        int int16 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09782");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.emprestar();
        livro4.removerCopias(132);
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        livro4.removerCopias(30);
        livro4.removerCopias(0);
        int int18 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 102 + "'", int18 == 102);
    }

    @Test
    public void test09783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09783");
        imd.Livro livro4 = new imd.Livro("hi!", "", 64, 101);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        int int8 = livro4.getPaginas();
        livro4.removerCopias(26);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test09784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09784");
        imd.Livro livro4 = new imd.Livro("hi!", "", 1, (int) '4');
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str7 = livro4.getTitulo();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(4);
        livro4.removerCopias(73);
        livro4.removerCopias(298);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test09785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09785");
        imd.Livro livro4 = new imd.Livro("", "", (-1), (int) (byte) 0);
        livro4.adicionarCopias(122);
        livro4.adicionarCopias(241);
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test09786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09786");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test09787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09787");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', (int) (short) 1);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.devolver();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.devolver();
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getPaginas();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test09788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09788");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(132);
        livro4.devolver();
        livro4.emprestar();
        int int13 = livro4.getPaginas();
        java.lang.String str14 = livro4.getAutor();
        java.lang.String str15 = livro4.getAutor();
        java.lang.String str16 = livro4.getAutor();
        livro4.removerCopias(299);
        java.lang.String str19 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test09789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09789");
        imd.Livro livro4 = new imd.Livro("", "", 0, 160);
        livro4.devolver();
        livro4.emprestar();
    }

    @Test
    public void test09790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09790");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) '4');
        livro4.adicionarCopias((int) 'a');
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getTitulo();
        livro4.removerCopias((-1));
        java.lang.String str16 = livro4.getAutor();
        java.lang.String str17 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 129 + "'", int12 == 129);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test09791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09791");
        imd.Livro livro4 = new imd.Livro("hi!", "", 112, 81);
    }

    @Test
    public void test09792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09792");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 162);
    }

    @Test
    public void test09793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09793");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 0, 1);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) '4');
        livro4.emprestar();
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test09794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09794");
        imd.Livro livro4 = new imd.Livro("hi!", "", 15, 4);
    }

    @Test
    public void test09795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09795");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 32, (int) (byte) -1);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test09796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09796");
        imd.Livro livro4 = new imd.Livro("", "", 19, 285);
    }

    @Test
    public void test09797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09797");
        imd.Livro livro4 = new imd.Livro("", "hi!", 141, 131);
    }

    @Test
    public void test09798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09798");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        livro4.adicionarCopias(247);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test09799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09799");
        imd.Livro livro4 = new imd.Livro("", "", 17, 122);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int7 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 122 + "'", int5 == 122);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 121 + "'", int7 == 121);
    }

    @Test
    public void test09800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09800");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) 'a', (int) (short) 100);
        livro4.adicionarCopias(164);
        livro4.emprestar();
    }

    @Test
    public void test09801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09801");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', (int) (short) 1);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test09802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09802");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) '4');
        livro4.adicionarCopias((int) 'a');
        livro4.removerCopias((int) (byte) 0);
        livro4.removerCopias(1);
        java.lang.String str16 = livro4.getTitulo();
        livro4.removerCopias((int) ' ');
        livro4.devolver();
        livro4.removerCopias((int) '4');
        livro4.adicionarCopias(233);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test09803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09803");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        livro4.adicionarCopias((int) (byte) 10);
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getPaginas();
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getPaginas();
        livro4.adicionarCopias(200);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test09804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09804");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 132, (int) (byte) -1);
        livro4.emprestar();
        livro4.adicionarCopias(132);
        java.lang.String str8 = livro4.getAutor();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09805");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias(131);
        livro4.adicionarCopias(160);
        livro4.adicionarCopias(230);
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test09806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09806");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.devolver();
        livro4.removerCopias(101);
        livro4.adicionarCopias(32);
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test09807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09807");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 22, 492);
    }

    @Test
    public void test09808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09808");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.adicionarCopias((int) 'a');
        livro4.removerCopias(31);
        livro4.removerCopias((int) (short) 0);
        java.lang.String str18 = livro4.getAutor();
        livro4.devolver();
        int int20 = livro4.getPaginas();
        livro4.adicionarCopias(43);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test09809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09809");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 100, 33);
        livro4.devolver();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getTitulo();
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test09810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09810");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) '4');
        livro4.adicionarCopias((int) 'a');
        int int12 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(129);
        livro4.emprestar();
        livro4.emprestar();
        int int17 = livro4.getPaginas();
        int int18 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 129 + "'", int12 == 129);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test09811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09811");
        imd.Livro livro4 = new imd.Livro("", "hi!", 469, 121);
    }

    @Test
    public void test09812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09812");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.removerCopias(32);
        java.lang.String str11 = livro4.getAutor();
        livro4.removerCopias((int) '4');
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getAutor();
        livro4.adicionarCopias(66);
        livro4.devolver();
        java.lang.String str19 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test09813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09813");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 1, 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test09814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09814");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias((int) (short) 100);
        java.lang.String str18 = livro4.getAutor();
        livro4.devolver();
        int int20 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 67 + "'", int20 == 67);
    }

    @Test
    public void test09815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09815");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 0, (-1));
        livro4.removerCopias(10);
        livro4.removerCopias((int) ' ');
        java.lang.String str9 = livro4.getTitulo();
        livro4.adicionarCopias(89);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test09816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09816");
        imd.Livro livro4 = new imd.Livro("hi!", "", 83, 220);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 220 + "'", int5 == 220);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test09817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09817");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 10, (-1));
        livro4.emprestar();
        livro4.devolver();
        livro4.removerCopias((int) (byte) -1);
        java.lang.String str9 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test09818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09818");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) (byte) 1);
        livro4.removerCopias((int) 'a');
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09819");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.removerCopias((int) (byte) 0);
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09820");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.removerCopias(32);
        livro4.adicionarCopias(33);
        int int13 = livro4.getPaginas();
        livro4.adicionarCopias(122);
        livro4.adicionarCopias(18);
        livro4.emprestar();
        livro4.devolver();
        livro4.emprestar();
        int int21 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test09821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09821");
        imd.Livro livro4 = new imd.Livro("hi!", "", 35, 19);
        livro4.devolver();
        livro4.emprestar();
        livro4.adicionarCopias(354);
    }

    @Test
    public void test09822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09822");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, (-1));
        livro4.adicionarCopias(132);
        livro4.emprestar();
        livro4.devolver();
        livro4.removerCopias(96);
    }

    @Test
    public void test09823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09823");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test09824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09824");
        imd.Livro livro4 = new imd.Livro("", "", 4, 10);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09825");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 34, 196);
    }

    @Test
    public void test09826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09826");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        livro4.removerCopias(29);
        livro4.adicionarCopias(63);
        java.lang.String str11 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        int int14 = livro4.getPaginas();
        java.lang.String str15 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str17 = livro4.getAutor();
        java.lang.String str18 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test09827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09827");
        imd.Livro livro4 = new imd.Livro("", "", 33, 132);
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test09828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09828");
        imd.Livro livro4 = new imd.Livro("hi!", "", 265, 18);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 265 + "'", int5 == 265);
    }

    @Test
    public void test09829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09829");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 100);
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(34);
        int int13 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str15 = livro4.getAutor();
        int int16 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int18 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 132 + "'", int9 == 132);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 132 + "'", int10 == 132);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 167 + "'", int16 == 167);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test09830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09830");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias(34);
        int int13 = livro4.getPaginas();
        livro4.adicionarCopias(225);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test09831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09831");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.removerCopias(32);
        livro4.adicionarCopias(33);
        java.lang.String str13 = livro4.getTitulo();
        livro4.removerCopias(42);
        java.lang.String str16 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test09832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09832");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getAutor();
        livro4.adicionarCopias(0);
        java.lang.String str12 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09833");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) ' ');
        int int12 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(127);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 65 + "'", int12 == 65);
    }

    @Test
    public void test09834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09834");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (short) 0);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getAutor();
        livro4.adicionarCopias(263);
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 263 + "'", int12 == 263);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test09835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09835");
        imd.Livro livro4 = new imd.Livro("", "hi!", 56, 360);
    }

    @Test
    public void test09836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09836");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        int int7 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        livro4.adicionarCopias(65);
        livro4.removerCopias(66);
        java.lang.String str15 = livro4.getTitulo();
        livro4.devolver();
        int int17 = livro4.getPaginas();
        livro4.adicionarCopias(110);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test09837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09837");
        imd.Livro livro4 = new imd.Livro("", "hi!", 31, 32);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(305);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test09838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09838");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        livro4.removerCopias(29);
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias(11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test09839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09839");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        livro4.emprestar();
        livro4.removerCopias(65);
        livro4.emprestar();
        livro4.removerCopias((int) (byte) 10);
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test09840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09840");
        imd.Livro livro4 = new imd.Livro("", "", 0, 246);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test09841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09841");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 7, 63);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test09842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09842");
        imd.Livro livro4 = new imd.Livro("", "hi!", 6, 126);
    }

    @Test
    public void test09843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09843");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), 64);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test09844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09844");
        imd.Livro livro4 = new imd.Livro("hi!", "", 1, (int) '4');
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str7 = livro4.getTitulo();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(4);
        livro4.removerCopias(73);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test09845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09845");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(132);
        livro4.devolver();
        livro4.emprestar();
        int int13 = livro4.getPaginas();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getAutor();
        livro4.emprestar();
        int int17 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 165 + "'", int17 == 165);
    }

    @Test
    public void test09846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09846");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.devolver();
        livro4.removerCopias(101);
        livro4.removerCopias((-1));
        int int14 = livro4.getPaginas();
        livro4.removerCopias(19);
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str19 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test09847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09847");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.removerCopias(32);
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getAutor();
        livro4.emprestar();
        livro4.removerCopias(425);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09848");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 1, 3);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test09849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09849");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) ' ', 31);
        livro4.adicionarCopias((int) (byte) -1);
        livro4.emprestar();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 30 + "'", int12 == 30);
    }

    @Test
    public void test09850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09850");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 227, 396);
    }

    @Test
    public void test09851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09851");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 0);
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getPaginas();
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.String str12 = livro4.getAutor();
        livro4.emprestar();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(141);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 31 + "'", int14 == 31);
    }

    @Test
    public void test09852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09852");
        imd.Livro livro4 = new imd.Livro("", "", 0, 160);
        livro4.devolver();
        livro4.adicionarCopias(17);
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 178 + "'", int8 == 178);
    }

    @Test
    public void test09853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09853");
        imd.Livro livro4 = new imd.Livro("", "", (-1), (int) (byte) 0);
        livro4.removerCopias((int) (short) 10);
        livro4.removerCopias((int) (short) 10);
        livro4.adicionarCopias(100);
        java.lang.String str11 = livro4.getAutor();
        livro4.removerCopias((int) (short) 100);
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test09854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09854");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', (int) (byte) 100);
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
    }

    @Test
    public void test09855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09855");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str12 = livro4.getAutor();
        livro4.adicionarCopias(66);
        livro4.adicionarCopias(101);
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09856");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 66, 29);
        livro4.removerCopias(64);
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 66 + "'", int7 == 66);
    }

    @Test
    public void test09857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09857");
        imd.Livro livro4 = new imd.Livro("hi!", "", 6, 87);
    }

    @Test
    public void test09858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09858");
        imd.Livro livro4 = new imd.Livro("", "hi!", 265, 1);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test09859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09859");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias(0);
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(10);
        java.lang.String str13 = livro4.getAutor();
        java.lang.String str14 = livro4.getTitulo();
        livro4.removerCopias(83);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test09860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09860");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 1, (int) (byte) 1);
        livro4.adicionarCopias(17);
        livro4.adicionarCopias(14);
        livro4.removerCopias(172);
    }

    @Test
    public void test09861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09861");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        int int10 = livro4.getPaginas();
        livro4.adicionarCopias(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test09862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09862");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(132);
        java.lang.String str11 = livro4.getAutor();
        livro4.removerCopias(2);
        int int14 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(93);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test09863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09863");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 0);
        int int9 = livro4.getPaginas();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test09864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09864");
        imd.Livro livro4 = new imd.Livro("", "", 156, 0);
        livro4.removerCopias(241);
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test09865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09865");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 0, 16);
    }

    @Test
    public void test09866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09866");
        imd.Livro livro4 = new imd.Livro("", "", (int) '#', 33);
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09867");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 7, 63);
        int int5 = livro4.getPaginas();
        livro4.removerCopias(10);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
    }

    @Test
    public void test09868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09868");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) '4');
        livro4.adicionarCopias((int) 'a');
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(0);
        livro4.removerCopias((int) 'a');
        livro4.adicionarCopias(69);
        java.lang.String str22 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 129 + "'", int12 == 129);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test09869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09869");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 19, 66);
        livro4.adicionarCopias(0);
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
    }

    @Test
    public void test09870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09870");
        imd.Livro livro4 = new imd.Livro("hi!", "", 129, 31);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test09871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09871");
        imd.Livro livro4 = new imd.Livro("hi!", "", 197, 12);
    }

    @Test
    public void test09872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09872");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 0, (-1));
        livro4.emprestar();
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
    }

    @Test
    public void test09873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09873");
        imd.Livro livro4 = new imd.Livro("", "hi!", 32, 16);
    }

    @Test
    public void test09874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09874");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) (byte) 1);
        livro4.devolver();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getTitulo();
        int int14 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test09875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09875");
        imd.Livro livro4 = new imd.Livro("", "", 296, 36);
        livro4.adicionarCopias(227);
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 263 + "'", int8 == 263);
    }

    @Test
    public void test09876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09876");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 1, 255);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09877");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 100);
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getAutor();
        java.lang.String str15 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias(373);
        java.lang.Class<?> wildcardClass20 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 132 + "'", int9 == 132);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test09878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09878");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 18, 227);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(189);
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 227 + "'", int5 == 227);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 38 + "'", int8 == 38);
    }

    @Test
    public void test09879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09879");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test09880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09880");
        imd.Livro livro4 = new imd.Livro("hi!", "", 135, 48);
    }

    @Test
    public void test09881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09881");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 71, 147);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 71 + "'", int5 == 71);
    }

    @Test
    public void test09882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09882");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) ' ');
        int int12 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(0);
        livro4.devolver();
        java.lang.String str16 = livro4.getTitulo();
        livro4.devolver();
        livro4.removerCopias(230);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 65 + "'", int12 == 65);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test09883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09883");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias(0);
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(19);
        java.lang.String str13 = livro4.getTitulo();
        livro4.adicionarCopias(42);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test09884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09884");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test09885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09885");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 100);
        int int8 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(9);
        livro4.adicionarCopias(262);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
    }

    @Test
    public void test09886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09886");
        imd.Livro livro4 = new imd.Livro("hi!", "", 11, 28);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09887");
        imd.Livro livro4 = new imd.Livro("", "hi!", 68, 89);
        livro4.adicionarCopias(95);
    }

    @Test
    public void test09888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09888");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 264, 200);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test09889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09889");
        imd.Livro livro4 = new imd.Livro("", "", 373, 100);
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 373 + "'", int7 == 373);
    }

    @Test
    public void test09890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09890");
        imd.Livro livro4 = new imd.Livro("", "hi!", 164, 33);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test09891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09891");
        imd.Livro livro4 = new imd.Livro("hi!", "", 60, 0);
    }

    @Test
    public void test09892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09892");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 10, 100);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test09893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09893");
        imd.Livro livro4 = new imd.Livro("", "", 34, 373);
        livro4.devolver();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test09894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09894");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 33, 65);
        livro4.removerCopias(265);
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(122);
        livro4.adicionarCopias(0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
    }

    @Test
    public void test09895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09895");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) ' ');
        livro4.adicionarCopias((int) (byte) 0);
        livro4.adicionarCopias((int) 'a');
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test09896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09896");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 100);
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int10 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str12 = livro4.getTitulo();
        livro4.adicionarCopias(262);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09897");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 0, 33);
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        int int7 = livro4.getPaginas();
        livro4.removerCopias(11);
        livro4.adicionarCopias(360);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test09898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09898");
        imd.Livro livro4 = new imd.Livro("hi!", "", 459, (int) (byte) 100);
        livro4.devolver();
    }

    @Test
    public void test09899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09899");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias(172);
        livro4.removerCopias(1);
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09900");
        imd.Livro livro4 = new imd.Livro("hi!", "", 147, 103);
        livro4.emprestar();
    }

    @Test
    public void test09901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09901");
        imd.Livro livro4 = new imd.Livro("", "", 89, 82);
    }

    @Test
    public void test09902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09902");
        imd.Livro livro4 = new imd.Livro("", "", 131, 97);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str7 = livro4.getTitulo();
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias(54);
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test09903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09903");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) -1, 557);
    }

    @Test
    public void test09904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09904");
        imd.Livro livro4 = new imd.Livro("", "hi!", 20, 220);
    }

    @Test
    public void test09905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09905");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 100, 63);
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.removerCopias(29);
        java.lang.String str9 = livro4.getAutor();
        livro4.adicionarCopias(84);
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test09906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09906");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, 132);
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(164);
        livro4.devolver();
        java.lang.String str10 = livro4.getAutor();
        java.lang.String str11 = livro4.getTitulo();
        livro4.emprestar();
        int int13 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 298 + "'", int13 == 298);
    }

    @Test
    public void test09907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09907");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 0);
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 0);
        int int12 = livro4.getPaginas();
        int int13 = livro4.getPaginas();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test09908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09908");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 0);
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.String str12 = livro4.getTitulo();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        java.lang.String str16 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test09909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09909");
        imd.Livro livro4 = new imd.Livro("hi!", "", 0, 100);
        livro4.adicionarCopias(44);
    }

    @Test
    public void test09910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09910");
        imd.Livro livro4 = new imd.Livro("hi!", "", 147, 215);
    }

    @Test
    public void test09911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09911");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 100);
        int int8 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(0);
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09912");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str7 = livro4.getTitulo();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str13 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test09913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09913");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 0, (-1));
        livro4.removerCopias(10);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias(86);
        livro4.adicionarCopias(0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test09914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09914");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias((int) 'a');
        java.lang.String str12 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str14 = livro4.getAutor();
        livro4.adicionarCopias(100);
        java.lang.String str17 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test09915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09915");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, 10);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias(52);
        livro4.devolver();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(3);
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 62 + "'", int11 == 62);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09916");
        imd.Livro livro4 = new imd.Livro("", "hi!", 225, 160);
        livro4.emprestar();
        livro4.emprestar();
        livro4.devolver();
        livro4.emprestar();
        livro4.adicionarCopias(360);
    }

    @Test
    public void test09917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09917");
        imd.Livro livro4 = new imd.Livro("", "hi!", 265, 156);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 265 + "'", int5 == 265);
    }

    @Test
    public void test09918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09918");
        imd.Livro livro4 = new imd.Livro("", "hi!", 253, 166);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test09919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09919");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 10, (int) (byte) -1);
        livro4.removerCopias(61);
    }

    @Test
    public void test09920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09920");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 0, (int) (short) 1);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test09921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09921");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) '4');
        livro4.devolver();
        livro4.emprestar();
        livro4.removerCopias(227);
        java.lang.String str14 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test09922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09922");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(132);
        int int10 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test09923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09923");
        imd.Livro livro4 = new imd.Livro("", "hi!", 97, (int) (byte) 100);
    }

    @Test
    public void test09924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09924");
        imd.Livro livro4 = new imd.Livro("", "", 122, 86);
        int int5 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 122 + "'", int5 == 122);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test09925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09925");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 131, 7);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test09926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09926");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, 10);
        livro4.devolver();
        livro4.adicionarCopias(33);
        livro4.removerCopias(366);
    }

    @Test
    public void test09927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09927");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.adicionarCopias(32);
        livro4.removerCopias((int) (byte) 100);
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias(80);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test09928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09928");
        imd.Livro livro4 = new imd.Livro("hi!", "", 225, 297);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test09929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09929");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 67, 131);
    }

    @Test
    public void test09930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09930");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, 129);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 129 + "'", int7 == 129);
    }

    @Test
    public void test09931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09931");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) '4');
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias(87);
        livro4.emprestar();
        int int14 = livro4.getCopiasDisponiveis();
        int int15 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 118 + "'", int14 == 118);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 118 + "'", int15 == 118);
    }

    @Test
    public void test09932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09932");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str7 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.devolver();
        livro4.adicionarCopias(9);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test09933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09933");
        imd.Livro livro4 = new imd.Livro("", "", (int) '4', (int) (short) 0);
        livro4.emprestar();
        livro4.adicionarCopias(0);
        livro4.adicionarCopias(0);
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias(35);
        livro4.emprestar();
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getCopiasDisponiveis();
        int int16 = livro4.getCopiasDisponiveis();
        java.lang.String str17 = livro4.getAutor();
        livro4.removerCopias(9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test09934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09934");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test09935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09935");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        int int7 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getPaginas();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(4);
        java.lang.String str16 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 10);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test09936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09936");
        imd.Livro livro4 = new imd.Livro("", "", (int) '4', (int) (short) 100);
        livro4.removerCopias(132);
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test09937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09937");
        imd.Livro livro4 = new imd.Livro("hi!", "", 263, 19);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
    }

    @Test
    public void test09938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09938");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.removerCopias(156);
        livro4.emprestar();
        livro4.adicionarCopias(133);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test09939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09939");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 0, (-1));
        livro4.removerCopias(10);
        livro4.removerCopias((int) ' ');
        livro4.removerCopias(44);
    }

    @Test
    public void test09940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09940");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 0);
        livro4.devolver();
        java.lang.String str10 = livro4.getAutor();
        livro4.removerCopias((int) (byte) 1);
        livro4.removerCopias((int) (byte) 0);
        int int15 = livro4.getCopiasDisponiveis();
        int int16 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test09941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09941");
        imd.Livro livro4 = new imd.Livro("", "hi!", 135, 414);
    }

    @Test
    public void test09942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09942");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) '4');
        livro4.adicionarCopias((int) 'a');
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getAutor();
        livro4.devolver();
        livro4.devolver();
        livro4.removerCopias(60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 129 + "'", int12 == 129);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test09943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09943");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) (short) 100);
        java.lang.String str13 = livro4.getAutor();
        livro4.adicionarCopias(66);
        java.lang.String str16 = livro4.getTitulo();
        livro4.adicionarCopias(480);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test09944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09944");
        imd.Livro livro4 = new imd.Livro("hi!", "", (-1), 132);
        livro4.removerCopias(168);
    }

    @Test
    public void test09945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09945");
        imd.Livro livro4 = new imd.Livro("", "hi!", 30, 65);
        livro4.emprestar();
        livro4.adicionarCopias(146);
        livro4.emprestar();
    }

    @Test
    public void test09946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09946");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias(131);
        livro4.emprestar();
        livro4.adicionarCopias(35);
        livro4.removerCopias(63);
        java.lang.String str14 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test09947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09947");
        imd.Livro livro4 = new imd.Livro("", "hi!", 426, 46);
    }

    @Test
    public void test09948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09948");
        imd.Livro livro4 = new imd.Livro("", "", 33, 101);
        livro4.devolver();
        livro4.devolver();
        livro4.devolver();
    }

    @Test
    public void test09949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09949");
        imd.Livro livro4 = new imd.Livro("", "", (-1), (int) (byte) 0);
        livro4.adicionarCopias(122);
        livro4.devolver();
        livro4.adicionarCopias(49);
    }

    @Test
    public void test09950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09950");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 132, (int) (byte) -1);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getAutor();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 132 + "'", int7 == 132);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09951");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 67, 281);
    }

    @Test
    public void test09952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09952");
        imd.Livro livro4 = new imd.Livro("hi!", "", 131, 164);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 131 + "'", int5 == 131);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 164 + "'", int6 == 164);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 164 + "'", int7 == 164);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09953");
        imd.Livro livro4 = new imd.Livro("", "hi!", 30, 132);
        livro4.removerCopias(27);
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
    }

    @Test
    public void test09954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09954");
        imd.Livro livro4 = new imd.Livro("", "", 33, 101);
        livro4.adicionarCopias(265);
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 366 + "'", int7 == 366);
    }

    @Test
    public void test09955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09955");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        int int7 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        livro4.adicionarCopias(65);
        int int13 = livro4.getPaginas();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test09956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09956");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        livro4.removerCopias(103);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09957");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias((-1));
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getTitulo();
        int int14 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09958");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 10, 0);
        livro4.devolver();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test09959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09959");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) -1, 7);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(101);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test09960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09960");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(141);
        livro4.removerCopias(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09961");
        imd.Livro livro4 = new imd.Livro("", "", 33, 101);
        livro4.devolver();
        livro4.devolver();
        livro4.emprestar();
    }

    @Test
    public void test09962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09962");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (short) 0);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias((-1));
        livro4.adicionarCopias(3);
        java.lang.String str11 = livro4.getAutor();
        livro4.adicionarCopias(0);
        java.lang.String str14 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 100);
        livro4.removerCopias(305);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test09963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09963");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias(138);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test09964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09964");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 10, 0);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(17);
        livro4.adicionarCopias(29);
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (short) 1);
        livro4.emprestar();
        livro4.removerCopias(11);
        int int19 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test09965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09965");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.emprestar();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        livro4.devolver();
        int int13 = livro4.getPaginas();
        livro4.removerCopias(25);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 131 + "'", int10 == 131);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test09966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09966");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 100);
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getAutor();
        livro4.removerCopias(0);
        livro4.devolver();
        java.lang.String str14 = livro4.getAutor();
        java.lang.String str15 = livro4.getAutor();
        int int16 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 132 + "'", int9 == 132);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 133 + "'", int16 == 133);
    }

    @Test
    public void test09967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09967");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias(0);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        livro4.adicionarCopias(265);
        int int14 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(67);
        livro4.removerCopias(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 297 + "'", int14 == 297);
    }

    @Test
    public void test09968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09968");
        imd.Livro livro4 = new imd.Livro("hi!", "", 331, 343);
    }

    @Test
    public void test09969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09969");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str12 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int15 = livro4.getCopiasDisponiveis();
        int int16 = livro4.getCopiasDisponiveis();
        java.lang.String str17 = livro4.getTitulo();
        livro4.devolver();
        int int19 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 63 + "'", int15 == 63);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 63 + "'", int16 == 63);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test09970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09970");
        imd.Livro livro4 = new imd.Livro("hi!", "", 2, 83);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test09971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09971");
        imd.Livro livro4 = new imd.Livro("", "", 68, 29);
    }

    @Test
    public void test09972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09972");
        imd.Livro livro4 = new imd.Livro("", "", 33, 132);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        livro4.removerCopias(165);
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 132 + "'", int6 == 132);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 131 + "'", int11 == 131);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 131 + "'", int12 == 131);
    }

    @Test
    public void test09973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09973");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getPaginas();
        livro4.devolver();
        livro4.emprestar();
        livro4.removerCopias(52);
        livro4.removerCopias(458);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test09974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09974");
        imd.Livro livro4 = new imd.Livro("hi!", "", 36, 241);
        livro4.devolver();
    }

    @Test
    public void test09975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09975");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) ' ', (int) (short) 1);
        livro4.adicionarCopias(29);
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30 + "'", int10 == 30);
    }

    @Test
    public void test09976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09976");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 100, (int) (short) -1);
        livro4.devolver();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test09977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09977");
        imd.Livro livro4 = new imd.Livro("", "", 122, 86);
        livro4.devolver();
    }

    @Test
    public void test09978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09978");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        int int7 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str9 = livro4.getTitulo();
        livro4.adicionarCopias(66);
        livro4.removerCopias(8);
        int int14 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09979");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 34, 32);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test09980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09980");
        imd.Livro livro4 = new imd.Livro("hi!", "", 34, 10);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(29);
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test09981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09981");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        livro4.devolver();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(0);
        livro4.removerCopias((int) '4');
        java.lang.String str15 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test09982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09982");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.adicionarCopias(32);
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getAutor();
        livro4.emprestar();
        livro4.removerCopias(29);
        livro4.adicionarCopias(64);
        java.lang.String str20 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test09983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09983");
        imd.Livro livro4 = new imd.Livro("", "", 0, 30);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getAutor();
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test09984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09984");
        imd.Livro livro4 = new imd.Livro("", "", 1, 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str7 = livro4.getAutor();
        livro4.removerCopias(161);
        livro4.devolver();
        livro4.adicionarCopias(364);
        java.lang.String str13 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test09985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09985");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias(1);
        livro4.removerCopias(232);
        livro4.devolver();
        java.lang.String str21 = livro4.getTitulo();
        int int22 = livro4.getPaginas();
        int int23 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 66 + "'", int23 == 66);
    }

    @Test
    public void test09986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09986");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 0, 68);
    }

    @Test
    public void test09987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09987");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, 10);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str7 = livro4.getTitulo();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test09988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09988");
        imd.Livro livro4 = new imd.Livro("", "", 32, 34);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getTitulo();
        livro4.adicionarCopias(166);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test09989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09989");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.removerCopias(32);
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09990");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 10, 0);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(131);
        livro4.removerCopias(35);
        java.lang.String str12 = livro4.getTitulo();
        livro4.removerCopias(0);
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test09991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09991");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.removerCopias(32);
        livro4.adicionarCopias(33);
        int int13 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 34 + "'", int13 == 34);
    }

    @Test
    public void test09992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09992");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 146, 87);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09993");
        imd.Livro livro4 = new imd.Livro("", "", (-1), (int) (byte) 0);
        livro4.removerCopias((int) (short) 10);
        livro4.removerCopias((int) (short) 10);
        livro4.adicionarCopias(100);
        int int11 = livro4.getPaginas();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(64);
        livro4.removerCopias(11);
        int int17 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 153 + "'", int17 == 153);
    }

    @Test
    public void test09994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09994");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getAutor();
        livro4.emprestar();
        livro4.adicionarCopias(35);
        livro4.emprestar();
        livro4.removerCopias(227);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test09995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09995");
        imd.Livro livro4 = new imd.Livro("hi!", "", 17, 5);
    }

    @Test
    public void test09996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09996");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, 130);
        int int5 = livro4.getPaginas();
        livro4.removerCopias((int) 'a');
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(294);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
    }

    @Test
    public void test09997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09997");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getAutor();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        livro4.removerCopias(19);
        livro4.removerCopias(261);
        livro4.adicionarCopias(20);
        int int18 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass19 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test09998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09998");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 10, 0);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test09999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09999");
        imd.Livro livro4 = new imd.Livro("hi!", "", 100, (int) '4');
        livro4.devolver();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        livro4.removerCopias(155);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test10000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test10000");
        imd.Livro livro4 = new imd.Livro("", "", 10, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias(33);
        livro4.devolver();
        livro4.emprestar();
        int int15 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
    }
}

