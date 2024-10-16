import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test05001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05001");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 0, 45);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 45 + "'", int7 == 45);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test05002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05002");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) -1, 52);
        livro4.removerCopias(52);
        livro4.adicionarCopias(204);
        int int9 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test05003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05003");
        imd.Livro livro4 = new imd.Livro("", "", 120, 208);
    }

    @Test
    public void test05004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05004");
        imd.Livro livro4 = new imd.Livro("hi!", "", 46, 11);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test05005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05005");
        imd.Livro livro4 = new imd.Livro("", "", 44, 44);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        livro4.removerCopias(111);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 44 + "'", int5 == 44);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test05006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05006");
        imd.Livro livro4 = new imd.Livro("", "hi!", 99, (int) (short) 10);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias(121);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
    }

    @Test
    public void test05007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05007");
        imd.Livro livro4 = new imd.Livro("", "hi!", 46, 109);
    }

    @Test
    public void test05008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05008");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, (int) 'a');
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        livro4.removerCopias(100);
        livro4.adicionarCopias(167);
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getTitulo();
        int int14 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 263 + "'", int14 == 263);
    }

    @Test
    public void test05009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05009");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(36);
        livro4.adicionarCopias((int) (byte) 100);
        java.lang.String str12 = livro4.getAutor();
        livro4.emprestar();
        int int14 = livro4.getPaginas();
        int int15 = livro4.getPaginas();
        livro4.adicionarCopias(54);
        int int18 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test05010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05010");
        imd.Livro livro4 = new imd.Livro("", "hi!", 76, (int) (short) 1);
    }

    @Test
    public void test05011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05011");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias((int) (short) 100);
        livro4.emprestar();
        livro4.adicionarCopias((int) ' ');
        livro4.adicionarCopias(98);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test05012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05012");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias((-1));
        int int13 = livro4.getPaginas();
        int int14 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05013");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 100, 137);
        livro4.devolver();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test05014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05014");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(2);
        int int8 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test05015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05015");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 34);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.emprestar();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
    }

    @Test
    public void test05016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05016");
        imd.Livro livro4 = new imd.Livro("", "hi!", 26, 37);
        livro4.removerCopias(12);
        java.lang.String str7 = livro4.getTitulo();
        java.lang.String str8 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test05017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05017");
        imd.Livro livro4 = new imd.Livro("", "hi!", 134, 0);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test05018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05018");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 170, 10);
    }

    @Test
    public void test05019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05019");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getPaginas();
        int int14 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 37 + "'", int14 == 37);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05020");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.removerCopias((int) (byte) 0);
        livro4.adicionarCopias(69);
        livro4.adicionarCopias(1);
        int int16 = livro4.getCopiasDisponiveis();
        java.lang.String str17 = livro4.getAutor();
        java.lang.String str18 = livro4.getAutor();
        int int19 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 69 + "'", int16 == 69);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test05021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05021");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(36);
        livro4.adicionarCopias((int) (byte) 100);
        java.lang.String str12 = livro4.getAutor();
        livro4.adicionarCopias(9);
        java.lang.String str15 = livro4.getTitulo();
        java.lang.String str16 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05022");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.devolver();
        livro4.removerCopias(135);
        livro4.emprestar();
        int int14 = livro4.getPaginas();
        livro4.adicionarCopias(11);
        livro4.removerCopias(138);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test05023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05023");
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
        java.lang.String str24 = livro4.getTitulo();
        java.lang.String str25 = livro4.getTitulo();
        int int26 = livro4.getPaginas();
        java.lang.String str27 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 69 + "'", int23 == 69);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test05024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05024");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        livro4.removerCopias(0);
        int int10 = livro4.getPaginas();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05025");
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
        java.lang.String str16 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test05026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05026");
        imd.Livro livro4 = new imd.Livro("", "hi!", 69, (int) (short) 10);
        livro4.emprestar();
    }

    @Test
    public void test05027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05027");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(167);
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test05028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05028");
        imd.Livro livro4 = new imd.Livro("", "", 69, 86);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.removerCopias(31);
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 86 + "'", int6 == 86);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 54 + "'", int10 == 54);
    }

    @Test
    public void test05029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05029");
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
        int int20 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test05030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05030");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 0);
        livro4.devolver();
        livro4.removerCopias(36);
        livro4.adicionarCopias(167);
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05031");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, 52);
        livro4.adicionarCopias(34);
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test05032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05032");
        imd.Livro livro4 = new imd.Livro("", "hi!", 135, 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(157);
        livro4.removerCopias(321);
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 135 + "'", int10 == 135);
    }

    @Test
    public void test05033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05033");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        livro4.removerCopias((int) (byte) 1);
        livro4.adicionarCopias(77);
        int int17 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test05034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05034");
        imd.Livro livro4 = new imd.Livro("", "hi!", 74, 1);
    }

    @Test
    public void test05035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05035");
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
        java.lang.String str15 = livro4.getAutor();
        livro4.removerCopias(77);
        livro4.removerCopias(59);
        livro4.removerCopias(241);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test05036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05036");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test05037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05037");
        imd.Livro livro4 = new imd.Livro("", "", 78, (int) 'a');
        livro4.removerCopias(172);
    }

    @Test
    public void test05038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05038");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) -1, 44);
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str7 = livro4.getTitulo();
        int int8 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test05039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05039");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 0);
        livro4.removerCopias((int) ' ');
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(69);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test05040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05040");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getCopiasDisponiveis();
        int int13 = livro4.getPaginas();
        int int14 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test05041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05041");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.removerCopias((int) (byte) 0);
        livro4.adicionarCopias((int) (short) 1);
        livro4.removerCopias(37);
        livro4.emprestar();
        java.lang.String str17 = livro4.getTitulo();
        int int18 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test05042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05042");
        imd.Livro livro4 = new imd.Livro("", "hi!", 84, 0);
    }

    @Test
    public void test05043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05043");
        imd.Livro livro4 = new imd.Livro("", "", (int) '#', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias(101);
        livro4.adicionarCopias(0);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 133 + "'", int11 == 133);
    }

    @Test
    public void test05044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05044");
        imd.Livro livro4 = new imd.Livro("", "hi!", 174, 143);
    }

    @Test
    public void test05045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05045");
        imd.Livro livro4 = new imd.Livro("", "", 44, 44);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test05046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05046");
        imd.Livro livro4 = new imd.Livro("", "", 126, 23);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test05047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05047");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 77, 32);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 77 + "'", int5 == 77);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test05048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05048");
        imd.Livro livro4 = new imd.Livro("", "", 44, 44);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias(157);
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias(90);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 44 + "'", int5 == 44);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
    }

    @Test
    public void test05049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05049");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.devolver();
        livro4.emprestar();
        livro4.removerCopias(43);
        livro4.devolver();
        livro4.removerCopias(100);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test05050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05050");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getAutor();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test05051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05051");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test05052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05052");
        imd.Livro livro4 = new imd.Livro("", "hi!", 137, 50);
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test05053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05053");
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
        livro4.adicionarCopias(0);
        livro4.adicionarCopias(134);
        livro4.devolver();
        java.lang.String str23 = livro4.getTitulo();
        int int24 = livro4.getPaginas();
        livro4.emprestar();
        int int26 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(42);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 168 + "'", int26 == 168);
    }

    @Test
    public void test05054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05054");
        imd.Livro livro4 = new imd.Livro("hi!", "", 44, 0);
        livro4.removerCopias((int) (byte) -1);
        livro4.devolver();
    }

    @Test
    public void test05055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05055");
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
        int int19 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test05056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05056");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.emprestar();
        livro4.adicionarCopias(107);
        int int13 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 141 + "'", int13 == 141);
    }

    @Test
    public void test05057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05057");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) -1);
        livro4.removerCopias(57);
        livro4.removerCopias(31);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test05058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05058");
        imd.Livro livro4 = new imd.Livro("", "", 13, 26);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(31);
        livro4.removerCopias(99);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 13 + "'", int5 == 13);
    }

    @Test
    public void test05059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05059");
        imd.Livro livro4 = new imd.Livro("hi!", "", 50, 84);
    }

    @Test
    public void test05060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05060");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        livro4.removerCopias(0);
        int int10 = livro4.getPaginas();
        livro4.emprestar();
        livro4.emprestar();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 33 + "'", int13 == 33);
    }

    @Test
    public void test05061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05061");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(35);
        int int13 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 0);
        livro4.emprestar();
        livro4.adicionarCopias((-1));
        java.lang.Class<?> wildcardClass19 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 69 + "'", int13 == 69);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test05062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05062");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 0);
        livro4.removerCopias((int) ' ');
        livro4.emprestar();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str10 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        livro4.removerCopias(98);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test05063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05063");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test05064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05064");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.emprestar();
        livro4.devolver();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05065");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 100, 2);
        livro4.devolver();
    }

    @Test
    public void test05066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05066");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (short) -1);
        java.lang.String str14 = livro4.getAutor();
        livro4.emprestar();
        int int16 = livro4.getCopiasDisponiveis();
        java.lang.String str17 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33 + "'", int16 == 33);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test05067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05067");
        imd.Livro livro4 = new imd.Livro("hi!", "", 36, (int) (short) 100);
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test05068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05068");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(35);
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getPaginas();
        int int16 = livro4.getPaginas();
        livro4.adicionarCopias(37);
        int int19 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 69 + "'", int13 == 69);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test05069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05069");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str7 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test05070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05070");
        imd.Livro livro4 = new imd.Livro("hi!", "", 45, 8);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test05071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05071");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(167);
        livro4.removerCopias((int) (byte) -1);
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test05072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05072");
        imd.Livro livro4 = new imd.Livro("", "", 67, 2);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 67 + "'", int5 == 67);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test05073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05073");
        imd.Livro livro4 = new imd.Livro("", "hi!", 102, 167);
    }

    @Test
    public void test05074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05074");
        imd.Livro livro4 = new imd.Livro("", "hi!", 32, 0);
        livro4.adicionarCopias(115);
        livro4.emprestar();
    }

    @Test
    public void test05075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05075");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str12 = livro4.getTitulo();
        livro4.adicionarCopias(324);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test05076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05076");
        imd.Livro livro4 = new imd.Livro("hi!", "", 109, 157);
    }

    @Test
    public void test05077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05077");
        imd.Livro livro4 = new imd.Livro("hi!", "", 156, 0);
    }

    @Test
    public void test05078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05078");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, (int) (short) 100);
        int int5 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getPaginas();
        java.lang.String str10 = livro4.getAutor();
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test05079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05079");
        imd.Livro livro4 = new imd.Livro("hi!", "", 35, (int) (short) 1);
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test05080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05080");
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
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test05081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05081");
        imd.Livro livro4 = new imd.Livro("", "", 59, 34);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test05082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05082");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(171);
        livro4.adicionarCopias(26);
        livro4.removerCopias((int) (byte) 10);
        livro4.removerCopias(151);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test05083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05083");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(33);
        int int14 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test05084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05084");
        imd.Livro livro4 = new imd.Livro("", "hi!", 4, 49);
        livro4.adicionarCopias(267);
        livro4.adicionarCopias(215);
    }

    @Test
    public void test05085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05085");
        imd.Livro livro4 = new imd.Livro("", "", 44, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) 0);
        livro4.emprestar();
        int int9 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
    }

    @Test
    public void test05086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05086");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getAutor();
        livro4.adicionarCopias(70);
        livro4.adicionarCopias(78);
        java.lang.String str14 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test05087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05087");
        imd.Livro livro4 = new imd.Livro("", "hi!", 71, 190);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias(103);
    }

    @Test
    public void test05088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05088");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 1, (int) '#');
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias(2);
    }

    @Test
    public void test05089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05089");
        imd.Livro livro4 = new imd.Livro("", "hi!", 69, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test05090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05090");
        imd.Livro livro4 = new imd.Livro("", "", 0, 167);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05091");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getPaginas();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test05092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05092");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 26);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05093");
        imd.Livro livro4 = new imd.Livro("hi!", "", 156, (int) (short) 10);
        livro4.removerCopias(45);
        int int7 = livro4.getPaginas();
        livro4.removerCopias(84);
        livro4.adicionarCopias((int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 156 + "'", int7 == 156);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test05094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05094");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        livro4.removerCopias((int) (byte) 100);
        livro4.adicionarCopias(45);
        livro4.removerCopias(0);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test05095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05095");
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
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05096");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 10, 26);
        livro4.devolver();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test05097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05097");
        imd.Livro livro4 = new imd.Livro("", "", 100, 87);
        livro4.adicionarCopias(43);
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test05098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05098");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.devolver();
        livro4.removerCopias(35);
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test05099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05099");
        imd.Livro livro4 = new imd.Livro("", "hi!", 24, 33);
    }

    @Test
    public void test05100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05100");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (short) -1);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int15 = livro4.getPaginas();
        livro4.removerCopias(3);
        livro4.devolver();
        int int19 = livro4.getPaginas();
        livro4.removerCopias(52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test05101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05101");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getCopiasDisponiveis();
        int int15 = livro4.getPaginas();
        livro4.adicionarCopias(101);
        java.lang.String str18 = livro4.getAutor();
        java.lang.Class<?> wildcardClass19 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test05102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05102");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) (short) 100);
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05103");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 87);
        livro4.emprestar();
        livro4.devolver();
    }

    @Test
    public void test05104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05104");
        imd.Livro livro4 = new imd.Livro("", "", 100, 87);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias(57);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test05105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05105");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 45, 99);
    }

    @Test
    public void test05106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05106");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, 0);
        livro4.removerCopias(35);
        livro4.emprestar();
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias(0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test05107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05107");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) -1, 135);
        livro4.adicionarCopias(41);
        livro4.removerCopias(241);
    }

    @Test
    public void test05108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05108");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test05109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05109");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '#', (int) (byte) 10);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test05110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05110");
        imd.Livro livro4 = new imd.Livro("hi!", "", 68, 2);
        livro4.devolver();
    }

    @Test
    public void test05111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05111");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, 81);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 81 + "'", int5 == 81);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test05112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05112");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(135);
        livro4.devolver();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(42);
        java.lang.String str13 = livro4.getTitulo();
        livro4.removerCopias(208);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 171 + "'", int9 == 171);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test05113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05113");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 10, 52);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(84);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test05114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05114");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 100);
        livro4.adicionarCopias((int) (short) 10);
        livro4.removerCopias(1);
        livro4.devolver();
        livro4.adicionarCopias(232);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test05115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05115");
        imd.Livro livro4 = new imd.Livro("", "hi!", 35, 35);
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 0);
        livro4.adicionarCopias(69);
        int int11 = livro4.getPaginas();
        int int12 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test05116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05116");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 0);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 10);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test05117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05117");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((-1));
        livro4.adicionarCopias((int) (short) 10);
        int int15 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(35);
        int int18 = livro4.getPaginas();
        int int19 = livro4.getPaginas();
        java.lang.String str20 = livro4.getTitulo();
        int int21 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 44 + "'", int15 == 44);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test05118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05118");
        imd.Livro livro4 = new imd.Livro("hi!", "", 36, (int) (byte) -1);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias(235);
        livro4.removerCopias(129);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test05119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05119");
        imd.Livro livro4 = new imd.Livro("", "", 100, 170);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 170 + "'", int6 == 170);
    }

    @Test
    public void test05120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05120");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 44, (int) '#');
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 44 + "'", int6 == 44);
    }

    @Test
    public void test05121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05121");
        imd.Livro livro4 = new imd.Livro("", "", 43, 49);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05122");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test05123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05123");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) 100);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(34);
        java.lang.String str14 = livro4.getAutor();
        livro4.removerCopias(35);
        int int17 = livro4.getPaginas();
        livro4.adicionarCopias(81);
        livro4.devolver();
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 135 + "'", int11 == 135);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test05124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05124");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((-1));
        int int14 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
    }

    @Test
    public void test05125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05125");
        imd.Livro livro4 = new imd.Livro("", "", 63, 153);
    }

    @Test
    public void test05126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05126");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        livro4.devolver();
        int int14 = livro4.getPaginas();
        livro4.removerCopias(120);
        livro4.emprestar();
        int int18 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass19 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test05127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05127");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) '4', 133);
        livro4.adicionarCopias(134);
    }

    @Test
    public void test05128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05128");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 120, (int) '#');
        livro4.adicionarCopias(1);
        livro4.removerCopias(121);
    }

    @Test
    public void test05129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05129");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        livro4.removerCopias(0);
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        int int14 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test05130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05130");
        imd.Livro livro4 = new imd.Livro("", "", 0, 34);
        livro4.emprestar();
        livro4.devolver();
        livro4.removerCopias(0);
        livro4.removerCopias((int) (byte) 0);
        livro4.removerCopias(131);
    }

    @Test
    public void test05131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05131");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(70);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test05132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05132");
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
        livro4.devolver();
        java.lang.String str16 = livro4.getAutor();
        livro4.removerCopias((int) 'a');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test05133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05133");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 35, 100);
        livro4.removerCopias((int) (byte) 10);
        livro4.adicionarCopias(100);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(51);
        livro4.adicionarCopias((int) (short) -1);
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 190 + "'", int9 == 190);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05134");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(35);
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getPaginas();
        int int16 = livro4.getPaginas();
        int int17 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int19 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 69 + "'", int13 == 69);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 69 + "'", int17 == 69);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 68 + "'", int19 == 68);
    }

    @Test
    public void test05135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05135");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        java.lang.String str10 = livro4.getAutor();
        java.lang.String str11 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test05136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05136");
        imd.Livro livro4 = new imd.Livro("", "hi!", 136, 224);
    }

    @Test
    public void test05137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05137");
        imd.Livro livro4 = new imd.Livro("", "", 0, 34);
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getTitulo();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test05138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05138");
        imd.Livro livro4 = new imd.Livro("", "", 120, (int) (short) 0);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 120 + "'", int7 == 120);
    }

    @Test
    public void test05139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05139");
        imd.Livro livro4 = new imd.Livro("", "", 83, 113);
    }

    @Test
    public void test05140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05140");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', 140);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05141");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getPaginas();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getAutor();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 45 + "'", int11 == 45);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test05142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05142");
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
        java.lang.String str19 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 171 + "'", int16 == 171);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test05143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05143");
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
        int int16 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test05144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05144");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05145");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        livro4.adicionarCopias(34);
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        livro4.removerCopias(132);
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass19 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test05146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05146");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        livro4.removerCopias(34);
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (short) 100);
        livro4.adicionarCopias(77);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test05147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05147");
        imd.Livro livro4 = new imd.Livro("", "hi!", 30, 63);
    }

    @Test
    public void test05148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05148");
        imd.Livro livro4 = new imd.Livro("", "hi!", 81, (int) 'a');
        livro4.removerCopias(34);
        livro4.removerCopias(109);
    }

    @Test
    public void test05149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05149");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (short) -1);
        java.lang.String str14 = livro4.getAutor();
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str17 = livro4.getAutor();
        int int18 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test05150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05150");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        livro4.devolver();
        int int12 = livro4.getPaginas();
        int int13 = livro4.getPaginas();
        livro4.adicionarCopias(51);
        livro4.devolver();
        int int17 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 98 + "'", int17 == 98);
    }

    @Test
    public void test05151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05151");
        imd.Livro livro4 = new imd.Livro("", "hi!", 36, 100);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
    }

    @Test
    public void test05152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05152");
        imd.Livro livro4 = new imd.Livro("", "hi!", 190, 169);
        livro4.removerCopias(0);
    }

    @Test
    public void test05153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05153");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.emprestar();
        int int11 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test05154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05154");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(42);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test05155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05155");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getPaginas();
        livro4.adicionarCopias(43);
        int int13 = livro4.getPaginas();
        livro4.adicionarCopias(44);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test05156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05156");
        imd.Livro livro4 = new imd.Livro("", "", 100, 87);
        livro4.adicionarCopias(43);
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05157");
        imd.Livro livro4 = new imd.Livro("hi!", "", 302, 23);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test05158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05158");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', 36);
        livro4.emprestar();
        livro4.adicionarCopias(167);
        livro4.adicionarCopias(99);
        livro4.removerCopias(91);
        java.lang.String str12 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test05159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05159");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (byte) 0);
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test05160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05160");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(33);
        livro4.removerCopias(45);
        java.lang.String str14 = livro4.getTitulo();
        int int15 = livro4.getCopiasDisponiveis();
        int int16 = livro4.getPaginas();
        java.lang.String str17 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test05161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05161");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, 0);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(0);
        livro4.emprestar();
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test05162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05162");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, (int) (short) 100);
        int int5 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05163");
        imd.Livro livro4 = new imd.Livro("hi!", "", 36, 85);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 85 + "'", int5 == 85);
    }

    @Test
    public void test05164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05164");
        imd.Livro livro4 = new imd.Livro("hi!", "", 77, 44);
        livro4.adicionarCopias(32);
    }

    @Test
    public void test05165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05165");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getPaginas();
        livro4.removerCopias(36);
        java.lang.String str15 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str17 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test05166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05166");
        imd.Livro livro4 = new imd.Livro("", "hi!", 134, 170);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test05167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05167");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '#', 27);
    }

    @Test
    public void test05168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05168");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 1, 23);
        livro4.emprestar();
    }

    @Test
    public void test05169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05169");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test05170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05170");
        imd.Livro livro4 = new imd.Livro("", "", 4, 129);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test05171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05171");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str14 = livro4.getAutor();
        livro4.removerCopias(243);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test05172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05172");
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
        livro4.removerCopias(134);
        livro4.devolver();
        int int21 = livro4.getPaginas();
        java.lang.String str22 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 167 + "'", int16 == 167);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test05173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05173");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 44);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test05174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05174");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias((int) '4');
        livro4.adicionarCopias(170);
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 257 + "'", int12 == 257);
    }

    @Test
    public void test05175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05175");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(33);
        livro4.removerCopias(45);
        java.lang.String str14 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str16 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str18 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test05176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05176");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(33);
        livro4.adicionarCopias((int) (byte) 100);
        int int16 = livro4.getPaginas();
        int int17 = livro4.getPaginas();
        int int18 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 169 + "'", int18 == 169);
    }

    @Test
    public void test05177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05177");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.adicionarCopias(61);
        java.lang.String str13 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test05178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05178");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias(0);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test05179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05179");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str7 = livro4.getAutor();
        livro4.devolver();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05180");
        imd.Livro livro4 = new imd.Livro("hi!", "", 42, 42);
        livro4.removerCopias(2);
    }

    @Test
    public void test05181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05181");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test05182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05182");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 0);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 10);
        livro4.removerCopias(76);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test05183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05183");
        imd.Livro livro4 = new imd.Livro("", "hi!", 27, 35);
    }

    @Test
    public void test05184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05184");
        imd.Livro livro4 = new imd.Livro("", "hi!", 172, 43);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test05185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05185");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) ' ');
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str15 = livro4.getTitulo();
        java.lang.String str16 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test05186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05186");
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
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test05187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05187");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 100, 35);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test05188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05188");
        imd.Livro livro4 = new imd.Livro("", "hi!", 12, 77);
    }

    @Test
    public void test05189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05189");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(33);
        int int14 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 69 + "'", int14 == 69);
    }

    @Test
    public void test05190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05190");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.adicionarCopias(0);
        int int12 = livro4.getPaginas();
        livro4.emprestar();
        livro4.removerCopias((int) (short) 10);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05191");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, 235);
        livro4.removerCopias(135);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05192");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test05193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05193");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 50);
        livro4.removerCopias(224);
    }

    @Test
    public void test05194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05194");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.emprestar();
        livro4.devolver();
        livro4.removerCopias((int) (byte) 100);
        livro4.devolver();
        livro4.adicionarCopias(321);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test05195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05195");
        imd.Livro livro4 = new imd.Livro("", "hi!", 52, 302);
        livro4.adicionarCopias(84);
    }

    @Test
    public void test05196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05196");
        imd.Livro livro4 = new imd.Livro("", "", 0, 52);
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test05197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05197");
        imd.Livro livro4 = new imd.Livro("hi!", "", 0, 267);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test05198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05198");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, 1);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test05199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05199");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test05200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05200");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '4', 4);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(44);
        livro4.removerCopias(29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test05201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05201");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, 36);
        livro4.removerCopias(45);
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test05202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05202");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.emprestar();
        livro4.devolver();
        livro4.removerCopias((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test05203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05203");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 100);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(0);
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        int int11 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str13 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test05204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05204");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getAutor();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05205");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.emprestar();
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias(33);
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str13 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test05206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05206");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        int int14 = livro4.getPaginas();
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test05207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05207");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str14 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str16 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test05208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05208");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        java.lang.String str16 = livro4.getTitulo();
        int int17 = livro4.getPaginas();
        int int18 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37 + "'", int18 == 37);
    }

    @Test
    public void test05209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05209");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) 'a', 0);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        livro4.removerCopias(134);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test05210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05210");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getTitulo();
        livro4.removerCopias(86);
        int int17 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 44 + "'", int17 == 44);
    }

    @Test
    public void test05211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05211");
        imd.Livro livro4 = new imd.Livro("hi!", "", 35, (int) (short) 1);
        livro4.devolver();
        livro4.adicionarCopias(44);
        int int8 = livro4.getPaginas();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias(81);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test05212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05212");
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
        java.lang.String str17 = livro4.getAutor();
        livro4.removerCopias(84);
        livro4.emprestar();
        livro4.adicionarCopias(151);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test05213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05213");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 35, 67);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getAutor();
        java.lang.String str7 = livro4.getTitulo();
        livro4.removerCopias(47);
        livro4.removerCopias(172);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test05214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05214");
        imd.Livro livro4 = new imd.Livro("", "", 51, (int) (short) 1);
    }

    @Test
    public void test05215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05215");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) 100);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(34);
        livro4.adicionarCopias(49);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 135 + "'", int11 == 135);
    }

    @Test
    public void test05216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05216");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        livro4.emprestar();
        livro4.devolver();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.String str14 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        java.lang.String str18 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 45 + "'", int13 == 45);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test05217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05217");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 0, 45);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test05218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05218");
        imd.Livro livro4 = new imd.Livro("", "", 143, 222);
    }

    @Test
    public void test05219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05219");
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
        livro4.adicionarCopias(70);
        java.lang.String str19 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass20 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 171 + "'", int16 == 171);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test05220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05220");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(35);
        java.lang.String str15 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test05221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05221");
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
        int int15 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(61);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test05222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05222");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 1, (int) '#');
        livro4.emprestar();
        livro4.adicionarCopias((int) 'a');
        livro4.adicionarCopias((int) (short) 10);
    }

    @Test
    public void test05223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05223");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        livro4.removerCopias((int) '4');
        livro4.emprestar();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05224");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        livro4.removerCopias(99);
        livro4.adicionarCopias(2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test05225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05225");
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
        java.lang.String str18 = livro4.getTitulo();
        java.lang.String str19 = livro4.getAutor();
        livro4.adicionarCopias(118);
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test05226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05226");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 85, 156);
    }

    @Test
    public void test05227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05227");
        imd.Livro livro4 = new imd.Livro("", "hi!", 4, 100);
        int int5 = livro4.getPaginas();
        livro4.removerCopias(224);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05228");
        imd.Livro livro4 = new imd.Livro("", "hi!", 168, 123);
    }

    @Test
    public void test05229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05229");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias(32);
        int int13 = livro4.getPaginas();
        int int14 = livro4.getPaginas();
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test05230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05230");
        imd.Livro livro4 = new imd.Livro("hi!", "", 34, (int) (short) 0);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        livro4.removerCopias(87);
        livro4.adicionarCopias((int) 'a');
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test05231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05231");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str7 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(0);
        livro4.devolver();
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test05232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05232");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        livro4.emprestar();
        livro4.devolver();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int15 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(38);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 45 + "'", int13 == 45);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 46 + "'", int15 == 46);
    }

    @Test
    public void test05233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05233");
        imd.Livro livro4 = new imd.Livro("hi!", "", 24, 222);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 222 + "'", int5 == 222);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 222 + "'", int7 == 222);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 222 + "'", int9 == 222);
    }

    @Test
    public void test05234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05234");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias(0);
        livro4.removerCopias(36);
        java.lang.String str13 = livro4.getAutor();
        livro4.adicionarCopias(57);
        livro4.removerCopias(71);
        int int18 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21 + "'", int18 == 21);
    }

    @Test
    public void test05235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05235");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(135);
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test05236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05236");
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
        int int19 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass20 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test05237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05237");
        imd.Livro livro4 = new imd.Livro("hi!", "", (-1), 31);
        livro4.adicionarCopias(48);
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test05238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05238");
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
        livro4.devolver();
        livro4.emprestar();
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
    public void test05239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05239");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 10, 59);
    }

    @Test
    public void test05240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05240");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 100);
        livro4.adicionarCopias((int) (short) 10);
        livro4.removerCopias(1);
        livro4.devolver();
        livro4.emprestar();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test05241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05241");
        imd.Livro livro4 = new imd.Livro("hi!", "", 68, 101);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(156);
        livro4.devolver();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05242");
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
        livro4.emprestar();
        livro4.removerCopias(4);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass21 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 135 + "'", int11 == 135);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 135 + "'", int16 == 135);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test05243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05243");
        imd.Livro livro4 = new imd.Livro("", "hi!", 97, (int) (byte) 0);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test05244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05244");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) -1, 135);
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias(153);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test05245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05245");
        imd.Livro livro4 = new imd.Livro("hi!", "", 10, 0);
        livro4.removerCopias(0);
        livro4.devolver();
    }

    @Test
    public void test05246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05246");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, (int) (short) 100);
        livro4.adicionarCopias(44);
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(87);
        java.lang.String str11 = livro4.getAutor();
        livro4.adicionarCopias(167);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 144 + "'", int7 == 144);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test05247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05247");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        livro4.removerCopias(0);
        livro4.adicionarCopias(135);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test05248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05248");
        imd.Livro livro4 = new imd.Livro("", "", 302, 33);
    }

    @Test
    public void test05249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05249");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 0);
        livro4.devolver();
        livro4.removerCopias(36);
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test05250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05250");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 24, 45);
        livro4.removerCopias(0);
        livro4.adicionarCopias(42);
    }

    @Test
    public void test05251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05251");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(35);
        java.lang.String str15 = livro4.getAutor();
        int int16 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 71 + "'", int16 == 71);
    }

    @Test
    public void test05252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05252");
        imd.Livro livro4 = new imd.Livro("", "hi!", 45, 134);
        livro4.adicionarCopias(24);
        livro4.removerCopias(107);
    }

    @Test
    public void test05253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05253");
        imd.Livro livro4 = new imd.Livro("", "hi!", 35, 35);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias(24);
        livro4.adicionarCopias(101);
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test05254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05254");
        imd.Livro livro4 = new imd.Livro("hi!", "", 34, (int) (short) 0);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(3);
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test05255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05255");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias((int) (short) 100);
        int int9 = livro4.getPaginas();
        livro4.removerCopias(51);
        int int12 = livro4.getPaginas();
        livro4.emprestar();
        int int14 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test05256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05256");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 100);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(0);
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test05257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05257");
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
        java.lang.String str19 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias(69);
        livro4.removerCopias(157);
        int int25 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test05258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05258");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, 36);
        livro4.removerCopias(45);
        int int7 = livro4.getPaginas();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test05259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05259");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, 171);
        livro4.removerCopias(0);
        int int7 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 171 + "'", int7 == 171);
    }

    @Test
    public void test05260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05260");
        imd.Livro livro4 = new imd.Livro("", "", 0, 34);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        livro4.emprestar();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test05261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05261");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getPaginas();
        livro4.removerCopias(26);
        livro4.adicionarCopias(67);
        int int10 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(52);
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 75 + "'", int10 == 75);
    }

    @Test
    public void test05262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05262");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 35, 235);
        java.lang.String str5 = livro4.getAutor();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test05263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05263");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        livro4.removerCopias((-1));
        livro4.devolver();
        java.lang.String str15 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test05264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05264");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(135);
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test05265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05265");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((-1));
        java.lang.String str14 = livro4.getAutor();
        java.lang.String str15 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 1);
        java.lang.String str18 = livro4.getAutor();
        livro4.removerCopias((int) (short) 100);
        livro4.adicionarCopias(43);
        livro4.removerCopias(84);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 45 + "'", int11 == 45);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test05266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05266");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(215);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test05267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05267");
        imd.Livro livro4 = new imd.Livro("", "", 100, 87);
        livro4.adicionarCopias(43);
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test05268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05268");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test05269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05269");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias(0);
        livro4.removerCopias(36);
        livro4.devolver();
        livro4.adicionarCopias(115);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test05270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05270");
        imd.Livro livro4 = new imd.Livro("", "hi!", 3, 67);
    }

    @Test
    public void test05271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05271");
        imd.Livro livro4 = new imd.Livro("", "hi!", 35, 35);
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 0);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(43);
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
    }

    @Test
    public void test05272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05272");
        imd.Livro livro4 = new imd.Livro("hi!", "", 35, 135);
        livro4.adicionarCopias(84);
    }

    @Test
    public void test05273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05273");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 10, (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias((int) (short) -1);
        livro4.removerCopias((int) (byte) 1);
    }

    @Test
    public void test05274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05274");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getPaginas();
        int int14 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 44 + "'", int14 == 44);
    }

    @Test
    public void test05275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05275");
        imd.Livro livro4 = new imd.Livro("", "", 0, (int) ' ');
    }

    @Test
    public void test05276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05276");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test05277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05277");
        imd.Livro livro4 = new imd.Livro("", "", 44, 44);
        livro4.removerCopias(57);
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05278");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 58, 53);
    }

    @Test
    public void test05279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05279");
        imd.Livro livro4 = new imd.Livro("", "", 233, (int) (byte) 100);
    }

    @Test
    public void test05280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05280");
        imd.Livro livro4 = new imd.Livro("", "hi!", 151, 88);
    }

    @Test
    public void test05281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05281");
        imd.Livro livro4 = new imd.Livro("", "", 48, 45);
    }

    @Test
    public void test05282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05282");
        imd.Livro livro4 = new imd.Livro("", "", 169, 10);
        livro4.removerCopias(32);
    }

    @Test
    public void test05283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05283");
        imd.Livro livro4 = new imd.Livro("hi!", "", 157, (int) (byte) 100);
    }

    @Test
    public void test05284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05284");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 69, 134);
        livro4.removerCopias(8);
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test05285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05285");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) -1, 33);
        livro4.devolver();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(84);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test05286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05286");
        imd.Livro livro4 = new imd.Livro("", "", 44, 35);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias(0);
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 44 + "'", int5 == 44);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 44 + "'", int10 == 44);
    }

    @Test
    public void test05287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05287");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(51);
        livro4.devolver();
        java.lang.String str11 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) 1);
        int int14 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 88 + "'", int14 == 88);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05288");
        imd.Livro livro4 = new imd.Livro("hi!", "", 74, 0);
    }

    @Test
    public void test05289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05289");
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
        java.lang.String str19 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias(69);
        livro4.devolver();
        java.lang.String str24 = livro4.getAutor();
        int int25 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test05290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05290");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) 'a', (int) (byte) 100);
        livro4.removerCopias(32);
        livro4.emprestar();
        livro4.emprestar();
        int int9 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 66 + "'", int9 == 66);
    }

    @Test
    public void test05291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05291");
        imd.Livro livro4 = new imd.Livro("", "hi!", 111, 99);
    }

    @Test
    public void test05292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05292");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias(100);
        livro4.removerCopias(190);
        livro4.emprestar();
        java.lang.String str14 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test05293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05293");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias((int) (short) 100);
        java.lang.String str9 = livro4.getAutor();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05294");
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
        livro4.emprestar();
        int int17 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass18 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05295");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.removerCopias(100);
        livro4.emprestar();
        livro4.emprestar();
        int int10 = livro4.getPaginas();
        livro4.adicionarCopias(37);
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test05296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05296");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        livro4.adicionarCopias(34);
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test05297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05297");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 10, 24);
        livro4.emprestar();
        livro4.adicionarCopias(46);
    }

    @Test
    public void test05298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05298");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 0, 45);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(135);
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 45 + "'", int7 == 45);
    }

    @Test
    public void test05299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05299");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 68);
        livro4.devolver();
    }

    @Test
    public void test05300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05300");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(135);
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias(0);
        java.lang.String str13 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 170 + "'", int9 == 170);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test05301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05301");
        imd.Livro livro4 = new imd.Livro("hi!", "", 36, (int) (short) 100);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getPaginas();
        livro4.removerCopias(44);
        livro4.adicionarCopias(2);
        livro4.emprestar();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05302");
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
        java.lang.String str15 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test05303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05303");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        livro4.removerCopias(1);
        int int15 = livro4.getCopiasDisponiveis();
        java.lang.String str16 = livro4.getTitulo();
        int int17 = livro4.getPaginas();
        livro4.removerCopias((int) (short) 10);
        java.lang.Class<?> wildcardClass20 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test05304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05304");
        imd.Livro livro4 = new imd.Livro("", "hi!", 170, 101);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test05305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05305");
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
        java.lang.String str18 = livro4.getTitulo();
        java.lang.String str19 = livro4.getAutor();
        int int20 = livro4.getCopiasDisponiveis();
        int int21 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 70 + "'", int20 == 70);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 70 + "'", int21 == 70);
    }

    @Test
    public void test05306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05306");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 0);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test05307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05307");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        livro4.removerCopias(0);
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        livro4.emprestar();
        livro4.devolver();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05308");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int14 = livro4.getPaginas();
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test05309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05309");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.removerCopias((int) (byte) 0);
        int int12 = livro4.getPaginas();
        int int13 = livro4.getPaginas();
        livro4.adicionarCopias(32);
        livro4.adicionarCopias(48);
        livro4.adicionarCopias(9);
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test05310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05310");
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
        int int18 = livro4.getPaginas();
        java.lang.String str19 = livro4.getTitulo();
        java.lang.String str20 = livro4.getAutor();
        int int21 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test05311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05311");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) 100);
        java.lang.String str11 = livro4.getTitulo();
        livro4.removerCopias(10);
        int int14 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test05312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05312");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(135);
        int int8 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05313");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05314");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test05315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05315");
        imd.Livro livro4 = new imd.Livro("", "", 50, 114);
        livro4.removerCopias(177);
    }

    @Test
    public void test05316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05316");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 34);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str7 = livro4.getTitulo();
        livro4.removerCopias(153);
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test05317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05317");
        imd.Livro livro4 = new imd.Livro("hi!", "", 132, 156);
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test05318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05318");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str11 = livro4.getAutor();
        livro4.emprestar();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 34 + "'", int13 == 34);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test05319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05319");
        imd.Livro livro4 = new imd.Livro("", "", 69, (int) (byte) 0);
        livro4.adicionarCopias((int) (byte) 0);
        livro4.removerCopias(136);
        livro4.adicionarCopias(167);
        livro4.removerCopias(24);
        int int13 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 143 + "'", int13 == 143);
    }

    @Test
    public void test05320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05320");
        imd.Livro livro4 = new imd.Livro("", "", 0, 34);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05321");
        imd.Livro livro4 = new imd.Livro("hi!", "", 113, 166);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test05322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05322");
        imd.Livro livro4 = new imd.Livro("hi!", "", 3, 85);
    }

    @Test
    public void test05323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05323");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 100, 2);
        livro4.adicionarCopias(12);
        livro4.devolver();
    }

    @Test
    public void test05324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05324");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 1, 0);
        livro4.devolver();
        livro4.emprestar();
    }

    @Test
    public void test05325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05325");
        imd.Livro livro4 = new imd.Livro("", "", 118, 144);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test05326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05326");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias((int) '4');
        livro4.adicionarCopias(33);
        java.lang.String str12 = livro4.getTitulo();
        int int13 = livro4.getPaginas();
        livro4.removerCopias(266);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test05327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05327");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) -1, 52);
        livro4.removerCopias(52);
        livro4.adicionarCopias((int) 'a');
    }

    @Test
    public void test05328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05328");
        imd.Livro livro4 = new imd.Livro("", "hi!", 144, 24);
    }

    @Test
    public void test05329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05329");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((-1));
        livro4.adicionarCopias((int) (short) 10);
        int int15 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(235);
        java.lang.String str18 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 44 + "'", int15 == 44);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test05330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05330");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.removerCopias((int) (byte) 0);
        livro4.adicionarCopias(69);
        livro4.removerCopias(10);
        livro4.emprestar();
        java.lang.String str17 = livro4.getAutor();
        livro4.adicionarCopias(114);
        livro4.removerCopias(257);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test05331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05331");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        livro4.removerCopias(34);
        int int13 = livro4.getCopiasDisponiveis();
        int int14 = livro4.getPaginas();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test05332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05332");
        imd.Livro livro4 = new imd.Livro("", "hi!", 208, 257);
    }

    @Test
    public void test05333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05333");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getAutor();
        livro4.removerCopias(1);
        livro4.adicionarCopias(68);
        livro4.removerCopias(226);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test05334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05334");
        imd.Livro livro4 = new imd.Livro("", "", 0, 52);
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(67);
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 121 + "'", int9 == 121);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test05335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05335");
        imd.Livro livro4 = new imd.Livro("", "hi!", 59, (int) '4');
    }

    @Test
    public void test05336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05336");
        imd.Livro livro4 = new imd.Livro("hi!", "", 67, 35);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test05337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05337");
        imd.Livro livro4 = new imd.Livro("hi!", "", 36, 45);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36 + "'", int5 == 36);
    }

    @Test
    public void test05338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05338");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        livro4.removerCopias(1);
        int int15 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str17 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test05339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05339");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (short) -1);
        java.lang.String str14 = livro4.getAutor();
        livro4.emprestar();
        int int16 = livro4.getPaginas();
        livro4.adicionarCopias(151);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test05340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05340");
        imd.Livro livro4 = new imd.Livro("", "", 86, 190);
        livro4.adicionarCopias(111);
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 86 + "'", int7 == 86);
    }

    @Test
    public void test05341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05341");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 9);
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05342");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) (short) 0);
        livro4.emprestar();
        livro4.devolver();
        livro4.adicionarCopias(81);
        livro4.removerCopias(47);
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05343");
        imd.Livro livro4 = new imd.Livro("", "", 167, 126);
    }

    @Test
    public void test05344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05344");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getPaginas();
        int int14 = livro4.getCopiasDisponiveis();
        int int15 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 37 + "'", int14 == 37);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37 + "'", int15 == 37);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05345");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 0, 101);
        livro4.removerCopias(37);
        livro4.adicionarCopias(0);
        int int9 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test05346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05346");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getTitulo();
        livro4.removerCopias(86);
        int int17 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test05347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05347");
        imd.Livro livro4 = new imd.Livro("hi!", "", 114, 121);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05348");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) '4');
        livro4.emprestar();
        livro4.removerCopias(32);
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test05349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05349");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, 36);
        livro4.removerCopias(45);
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) '#');
        livro4.devolver();
        livro4.devolver();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05350");
        imd.Livro livro4 = new imd.Livro("", "", 81, 97);
        livro4.removerCopias((int) '4');
        livro4.removerCopias(44);
        livro4.emprestar();
        livro4.removerCopias(271);
    }

    @Test
    public void test05351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05351");
        imd.Livro livro4 = new imd.Livro("hi!", "", 0, (int) (byte) 1);
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias(167);
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias(204);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 169 + "'", int9 == 169);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test05352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05352");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        livro4.removerCopias((int) (byte) 100);
        livro4.devolver();
        java.lang.String str12 = livro4.getTitulo();
        livro4.adicionarCopias((int) 'a');
        livro4.adicionarCopias((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test05353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05353");
        imd.Livro livro4 = new imd.Livro("", "hi!", 100, 58);
    }

    @Test
    public void test05354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05354");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str7 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(0);
        livro4.adicionarCopias(238);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test05355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05355");
        imd.Livro livro4 = new imd.Livro("", "", 81, 97);
        livro4.removerCopias((int) '4');
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(133);
        livro4.emprestar();
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 81 + "'", int7 == 81);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 177 + "'", int12 == 177);
    }

    @Test
    public void test05356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05356");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(32);
        java.lang.String str11 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test05357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05357");
        imd.Livro livro4 = new imd.Livro("hi!", "", 35, (int) (short) 1);
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test05358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05358");
        imd.Livro livro4 = new imd.Livro("", "", 4, 167);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 167 + "'", int7 == 167);
    }

    @Test
    public void test05359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05359");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 10, 174);
    }

    @Test
    public void test05360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05360");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 99, 171);
        livro4.emprestar();
    }

    @Test
    public void test05361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05361");
        imd.Livro livro4 = new imd.Livro("", "", 126, 91);
    }

    @Test
    public void test05362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05362");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test05363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05363");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test05364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05364");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) 100);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(34);
        java.lang.String str14 = livro4.getAutor();
        livro4.removerCopias(35);
        int int17 = livro4.getPaginas();
        livro4.adicionarCopias(81);
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(131);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 135 + "'", int11 == 135);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test05365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05365");
        imd.Livro livro4 = new imd.Livro("", "", 120, 32);
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str7 = livro4.getTitulo();
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120 + "'", int9 == 120);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test05366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05366");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getPaginas();
        livro4.adicionarCopias(0);
        livro4.removerCopias(41);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test05367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05367");
        imd.Livro livro4 = new imd.Livro("", "hi!", 35, 35);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias(120);
        livro4.removerCopias(111);
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test05368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05368");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getPaginas();
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test05369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05369");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str10 = livro4.getAutor();
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        java.lang.String str13 = livro4.getTitulo();
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test05370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05370");
        imd.Livro livro4 = new imd.Livro("", "", 132, 1);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05371");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        int int8 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 0);
        livro4.adicionarCopias(102);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test05372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05372");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 0, (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias(123);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test05373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05373");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 0, 35);
        livro4.removerCopias(100);
        int int7 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test05374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05374");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        livro4.adicionarCopias((int) (short) 0);
        livro4.emprestar();
        java.lang.String str12 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test05375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05375");
        imd.Livro livro4 = new imd.Livro("", "hi!", 35, 35);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias(24);
        livro4.devolver();
        livro4.adicionarCopias((int) (short) 0);
        int int12 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(84);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
    }

    @Test
    public void test05376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05376");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) 'a', 47);
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test05377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05377");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) 'a');
        livro4.emprestar();
        livro4.devolver();
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test05378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05378");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '#', (int) (byte) 10);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test05379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05379");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 140, 174);
    }

    @Test
    public void test05380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05380");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(135);
        java.lang.String str8 = livro4.getAutor();
        livro4.removerCopias(157);
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test05381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05381");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.removerCopias((int) (byte) 0);
        livro4.adicionarCopias(69);
        livro4.adicionarCopias(1);
        livro4.devolver();
        java.lang.String str17 = livro4.getTitulo();
        livro4.removerCopias(133);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test05382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05382");
        imd.Livro livro4 = new imd.Livro("", "", 46, 151);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05383");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', 10);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(67);
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test05384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05384");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, (int) (short) 10);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.devolver();
        int int9 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05385");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) -1, 135);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias(71);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test05386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05386");
        imd.Livro livro4 = new imd.Livro("", "", 59, 111);
        livro4.adicionarCopias(12);
    }

    @Test
    public void test05387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05387");
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
        int int23 = livro4.getPaginas();
        java.lang.String str24 = livro4.getTitulo();
        int int25 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test05388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05388");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias(82);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test05389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05389");
        imd.Livro livro4 = new imd.Livro("", "", (-1), (int) (short) 1);
        int int5 = livro4.getPaginas();
        livro4.removerCopias(49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test05390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05390");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(135);
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias(0);
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getAutor();
        livro4.removerCopias((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 170 + "'", int9 == 170);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test05391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05391");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        int int13 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 43 + "'", int13 == 43);
    }

    @Test
    public void test05392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05392");
        imd.Livro livro4 = new imd.Livro("", "", 37, 9);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05393");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        livro4.removerCopias(34);
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05394");
        imd.Livro livro4 = new imd.Livro("hi!", "", 95, 45);
    }

    @Test
    public void test05395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05395");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', 140);
        livro4.emprestar();
    }

    @Test
    public void test05396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05396");
        imd.Livro livro4 = new imd.Livro("hi!", "", 26, 267);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test05397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05397");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.emprestar();
        int int13 = livro4.getCopiasDisponiveis();
        int int14 = livro4.getCopiasDisponiveis();
        java.lang.String str15 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05398");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        livro4.removerCopias(235);
        int int15 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(92);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 44 + "'", int15 == 44);
    }

    @Test
    public void test05399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05399");
        imd.Livro livro4 = new imd.Livro("hi!", "", 35, (int) (short) 1);
        livro4.devolver();
        livro4.emprestar();
    }

    @Test
    public void test05400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05400");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.emprestar();
        livro4.removerCopias(33);
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getAutor();
        livro4.devolver();
        int int14 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test05401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05401");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) 'a', (int) (short) 10);
        int int5 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test05402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05402");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, 34);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(81);
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test05403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05403");
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
        livro4.adicionarCopias(0);
        java.lang.String str21 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test05404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05404");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getAutor();
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test05405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05405");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) -1, 140);
    }

    @Test
    public void test05406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05406");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(86);
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 118 + "'", int8 == 118);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 118 + "'", int9 == 118);
    }

    @Test
    public void test05407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05407");
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
        java.lang.String str20 = livro4.getTitulo();
        java.lang.String str21 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test05408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05408");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getPaginas();
        livro4.removerCopias(0);
        java.lang.String str15 = livro4.getAutor();
        livro4.removerCopias(47);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test05409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05409");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(74);
        java.lang.String str14 = livro4.getTitulo();
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test05410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05410");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, 0);
        livro4.removerCopias(1);
        java.lang.String str7 = livro4.getAutor();
        livro4.removerCopias(25);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test05411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05411");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 111, 46);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 46 + "'", int5 == 46);
    }

    @Test
    public void test05412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05412");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str15 = livro4.getTitulo();
        java.lang.String str16 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test05413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05413");
        imd.Livro livro4 = new imd.Livro("", "", 46, 151);
        livro4.removerCopias(77);
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 46 + "'", int7 == 46);
    }

    @Test
    public void test05414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05414");
        imd.Livro livro4 = new imd.Livro("", "", 257, 225);
    }

    @Test
    public void test05415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05415");
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
        java.lang.String str15 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test05416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05416");
        imd.Livro livro4 = new imd.Livro("", "hi!", 4, 100);
        livro4.devolver();
        livro4.removerCopias(136);
    }

    @Test
    public void test05417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05417");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        livro4.removerCopias((int) (byte) 100);
        livro4.devolver();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test05418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05418");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        livro4.adicionarCopias(34);
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test05419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05419");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test05420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05420");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.devolver();
        livro4.removerCopias(135);
        livro4.emprestar();
        int int14 = livro4.getPaginas();
        livro4.adicionarCopias(11);
        int int17 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test05421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05421");
        imd.Livro livro4 = new imd.Livro("", "hi!", 35, 35);
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 0);
        livro4.removerCopias((int) (short) -1);
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int14 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 45 + "'", int14 == 45);
    }

    @Test
    public void test05422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05422");
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
        livro4.adicionarCopias((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test05423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05423");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, (int) 'a');
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        livro4.adicionarCopias(238);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test05424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05424");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 135, 302);
    }

    @Test
    public void test05425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05425");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((int) 'a');
        livro4.devolver();
        int int9 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str11 = livro4.getAutor();
        livro4.removerCopias(232);
        int int14 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05426");
        imd.Livro livro4 = new imd.Livro("", "hi!", 2, 167);
        livro4.removerCopias((int) (short) -1);
        livro4.adicionarCopias(78);
        livro4.adicionarCopias(13);
    }

    @Test
    public void test05427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05427");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        java.lang.String str11 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias((int) ' ');
        livro4.removerCopias(4);
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test05428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05428");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 67, 121);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 121 + "'", int5 == 121);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test05429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05429");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(120);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 34 + "'", int13 == 34);
    }

    @Test
    public void test05430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05430");
        imd.Livro livro4 = new imd.Livro("", "", 67, 2);
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias(47);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 67 + "'", int6 == 67);
    }

    @Test
    public void test05431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05431");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(38);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test05432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05432");
        imd.Livro livro4 = new imd.Livro("", "hi!", 94, 83);
    }

    @Test
    public void test05433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05433");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', 81);
        livro4.adicionarCopias(51);
        livro4.removerCopias(26);
        livro4.emprestar();
        livro4.adicionarCopias(33);
    }

    @Test
    public void test05434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05434");
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
        int int17 = livro4.getCopiasDisponiveis();
        int int18 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test05435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05435");
        imd.Livro livro4 = new imd.Livro("", "hi!", 43, (int) '#');
        livro4.emprestar();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test05436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05436");
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
        livro4.devolver();
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
    public void test05437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05437");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) -1, (int) '4');
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test05438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05438");
        imd.Livro livro4 = new imd.Livro("hi!", "", 34, (int) (short) 0);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(3);
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str12 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test05439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05439");
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
        java.lang.String str17 = livro4.getTitulo();
        int int18 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 44 + "'", int15 == 44);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test05440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05440");
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
        int int23 = livro4.getPaginas();
        java.lang.String str24 = livro4.getTitulo();
        int int25 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 69 + "'", int25 == 69);
    }

    @Test
    public void test05441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05441");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) -1, 135);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test05442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05442");
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
        livro4.adicionarCopias(74);
        int int20 = livro4.getPaginas();
        java.lang.String str21 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test05443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05443");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        livro4.removerCopias(1);
        int int15 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(30);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
    }

    @Test
    public void test05444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05444");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, 36);
        livro4.removerCopias(45);
        livro4.removerCopias((int) (byte) 10);
        livro4.removerCopias(95);
    }

    @Test
    public void test05445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05445");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (int) (byte) 0);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05446");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 0);
        livro4.devolver();
        livro4.removerCopias(36);
        livro4.adicionarCopias(167);
        livro4.adicionarCopias((int) (short) 1);
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test05447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05447");
        imd.Livro livro4 = new imd.Livro("hi!", "", 267, 3);
        livro4.removerCopias(26);
    }

    @Test
    public void test05448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05448");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) -1, 10);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias(321);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test05449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05449");
        imd.Livro livro4 = new imd.Livro("", "hi!", 167, 34);
        livro4.removerCopias((int) (byte) 10);
        livro4.adicionarCopias(46);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 167 + "'", int10 == 167);
    }

    @Test
    public void test05450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05450");
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
        java.lang.String str22 = livro4.getTitulo();
        int int23 = livro4.getCopiasDisponiveis();
        java.lang.String str24 = livro4.getAutor();
        livro4.removerCopias(13);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 34 + "'", int23 == 34);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test05451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05451");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 69, 134);
        livro4.removerCopias(8);
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 126 + "'", int7 == 126);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test05452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05452");
        imd.Livro livro4 = new imd.Livro("hi!", "", 67, 35);
        livro4.adicionarCopias(126);
    }

    @Test
    public void test05453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05453");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.emprestar();
        livro4.removerCopias(67);
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05454");
        imd.Livro livro4 = new imd.Livro("", "", 120, (int) (short) 0);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        livro4.removerCopias(57);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 120 + "'", int6 == 120);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test05455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05455");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        livro4.removerCopias((int) (byte) 10);
        int int16 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(71);
        java.lang.String str19 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass20 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26 + "'", int16 == 26);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test05456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05456");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        int int10 = livro4.getPaginas();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        livro4.devolver();
        livro4.removerCopias((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test05457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05457");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str5 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test05458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05458");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test05459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05459");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias(52);
        livro4.devolver();
        livro4.removerCopias(24);
        livro4.adicionarCopias(76);
        java.lang.String str16 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test05460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05460");
        imd.Livro livro4 = new imd.Livro("", "", 97, 3);
    }

    @Test
    public void test05461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05461");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 45, 170);
        livro4.removerCopias(59);
    }

    @Test
    public void test05462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05462");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 100, (int) (short) 0);
        livro4.devolver();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias(0);
        int int9 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test05463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05463");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, (int) (short) 10);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test05464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05464");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 0);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.devolver();
        livro4.emprestar();
        livro4.adicionarCopias(109);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
    }

    @Test
    public void test05465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05465");
        imd.Livro livro4 = new imd.Livro("", "hi!", 35, 35);
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 0);
        livro4.devolver();
        livro4.adicionarCopias(69);
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115 + "'", int12 == 115);
    }

    @Test
    public void test05466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05466");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) 100);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str14 = livro4.getTitulo();
        livro4.adicionarCopias(34);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.adicionarCopias((int) 'a');
        java.lang.String str21 = livro4.getTitulo();
        livro4.adicionarCopias(81);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 135 + "'", int11 == 135);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test05467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05467");
        imd.Livro livro4 = new imd.Livro("", "", 0, 34);
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.emprestar();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test05468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05468");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(46);
        livro4.devolver();
        int int16 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.adicionarCopias(42);
        java.lang.String str20 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 82 + "'", int16 == 82);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test05469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05469");
        imd.Livro livro4 = new imd.Livro("", "", 224, 2);
    }

    @Test
    public void test05470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05470");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) '4');
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
    }

    @Test
    public void test05471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05471");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 135);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(69);
        livro4.removerCopias(37);
        livro4.removerCopias(27);
        java.lang.String str12 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test05472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05472");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 26);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test05473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05473");
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
        int int17 = livro4.getCopiasDisponiveis();
        int int18 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test05474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05474");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) 100);
        int int10 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(267);
        java.lang.String str14 = livro4.getTitulo();
        livro4.removerCopias(74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test05475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05475");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 1, (int) (short) 1);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(118);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test05476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05476");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias((int) (byte) 1);
        int int12 = livro4.getPaginas();
        livro4.emprestar();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(0);
        java.lang.String str17 = livro4.getTitulo();
        int int18 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test05477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05477");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        java.lang.String str16 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test05478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05478");
        imd.Livro livro4 = new imd.Livro("hi!", "", 172, 323);
    }

    @Test
    public void test05479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05479");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) -1);
        int int13 = livro4.getCopiasDisponiveis();
        int int14 = livro4.getCopiasDisponiveis();
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 33 + "'", int13 == 33);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 33 + "'", int14 == 33);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test05480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05480");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', 172);
    }

    @Test
    public void test05481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05481");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, 36);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias(105);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test05482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05482");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(35);
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getPaginas();
        int int16 = livro4.getPaginas();
        livro4.adicionarCopias(37);
        int int19 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 69 + "'", int13 == 69);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 106 + "'", int19 == 106);
    }

    @Test
    public void test05483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05483");
        imd.Livro livro4 = new imd.Livro("hi!", "", 111, 0);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test05484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05484");
        imd.Livro livro4 = new imd.Livro("", "hi!", 35, 35);
        livro4.adicionarCopias(25);
        livro4.adicionarCopias(85);
    }

    @Test
    public void test05485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05485");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 34);
        livro4.removerCopias((int) '#');
        livro4.adicionarCopias((int) (short) -1);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
    }

    @Test
    public void test05486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05486");
        imd.Livro livro4 = new imd.Livro("", "", 33, (int) (byte) 100);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
    }

    @Test
    public void test05487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05487");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.removerCopias((int) 'a');
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias((int) '4');
        livro4.adicionarCopias(33);
        livro4.adicionarCopias(36);
        livro4.adicionarCopias(1);
        java.lang.String str16 = livro4.getTitulo();
        int int17 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(1);
        livro4.devolver();
        java.lang.String str21 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 157 + "'", int17 == 157);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test05488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05488");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) -1, 135);
        livro4.devolver();
    }

    @Test
    public void test05489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05489");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', 26);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getTitulo();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 26 + "'", int6 == 26);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test05490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05490");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 10, 71);
        livro4.adicionarCopias(0);
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05491");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, 0);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test05492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05492");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.emprestar();
        livro4.removerCopias(33);
        int int10 = livro4.getPaginas();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getPaginas();
        livro4.removerCopias(224);
        livro4.devolver();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05493");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, 235);
        livro4.removerCopias(135);
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
    }

    @Test
    public void test05494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05494");
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
        java.lang.String str17 = livro4.getAutor();
        java.lang.String str18 = livro4.getTitulo();
        int int19 = livro4.getPaginas();
        int int20 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass21 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test05495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05495");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        livro4.removerCopias(235);
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05496");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) -1, 44);
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias(141);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 45 + "'", int7 == 45);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test05497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05497");
        imd.Livro livro4 = new imd.Livro("", "", 33, (int) (byte) 100);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias(54);
        int int9 = livro4.getPaginas();
        livro4.removerCopias(51);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
    }

    @Test
    public void test05498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05498");
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
        int int17 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 69 + "'", int13 == 69);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test05499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05499");
        imd.Livro livro4 = new imd.Livro("hi!", "", 0, (int) (byte) 1);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test05500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05500");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(100);
        livro4.removerCopias((int) (byte) 0);
        livro4.adicionarCopias((int) (short) 1);
        livro4.removerCopias(2);
        int int16 = livro4.getPaginas();
        int int17 = livro4.getPaginas();
        java.lang.String str18 = livro4.getTitulo();
        livro4.adicionarCopias(32);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }
}

