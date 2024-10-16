import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test03001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03001");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 21, 168);
        livro4.removerCopias(0);
        int int7 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
    }

    @Test
    public void test03002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03002");
        imd.Livro livro4 = new imd.Livro("", "", (int) '4', 0);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(66);
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test03003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03003");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(10);
        int int12 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int14 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
    }

    @Test
    public void test03004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03004");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', (int) '#');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        java.lang.String str7 = livro4.getTitulo();
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias(52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03005");
        imd.Livro livro4 = new imd.Livro("hi!", "", 66, (int) (short) 1);
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 66 + "'", int7 == 66);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03006");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 52);
        livro4.adicionarCopias(181);
    }

    @Test
    public void test03007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03007");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 66, (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03008");
        imd.Livro livro4 = new imd.Livro("hi!", "", 106, 32);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 106 + "'", int5 == 106);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test03009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03009");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(67);
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        livro4.adicionarCopias(128);
        livro4.removerCopias(262);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03010");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        livro4.removerCopias(91);
        int int14 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test03011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03011");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str12 = livro4.getTitulo();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test03012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03012");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int9 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias((-1));
        livro4.emprestar();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(127);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 31 + "'", int14 == 31);
    }

    @Test
    public void test03013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03013");
        imd.Livro livro4 = new imd.Livro("", "", 98, 141);
        livro4.emprestar();
        livro4.devolver();
    }

    @Test
    public void test03014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03014");
        imd.Livro livro4 = new imd.Livro("hi!", "", 262, 168);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 168 + "'", int5 == 168);
    }

    @Test
    public void test03015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03015");
        imd.Livro livro4 = new imd.Livro("", "", 0, 41);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03016");
        imd.Livro livro4 = new imd.Livro("", "", 173, 241);
        livro4.devolver();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03017");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(10);
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getTitulo();
        livro4.removerCopias(95);
        java.lang.String str16 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03018");
        imd.Livro livro4 = new imd.Livro("hi!", "", 100, (int) (short) 0);
    }

    @Test
    public void test03019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03019");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, (int) (short) 1);
        int int5 = livro4.getPaginas();
        livro4.removerCopias(36);
        livro4.devolver();
        livro4.adicionarCopias(102);
        java.lang.String str11 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03020");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(91);
        int int13 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03021");
        imd.Livro livro4 = new imd.Livro("", "hi!", 40, (int) (byte) -1);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        livro4.removerCopias((int) (short) 100);
        int int15 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test03022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03022");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(1);
        livro4.devolver();
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getAutor();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03023");
        imd.Livro livro4 = new imd.Livro("", "", (int) '#', (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03024");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 35, 0);
        livro4.emprestar();
    }

    @Test
    public void test03025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03025");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 51, 51);
        livro4.devolver();
        livro4.removerCopias(100);
        livro4.devolver();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03026");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 31, 36);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 36 + "'", int5 == 36);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test03027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03027");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias((int) '#');
        livro4.devolver();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.removerCopias(106);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass19 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test03028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03028");
        imd.Livro livro4 = new imd.Livro("hi!", "", 64, 40);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(106);
        java.lang.String str8 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03029");
        imd.Livro livro4 = new imd.Livro("", "", 44, 49);
    }

    @Test
    public void test03030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03030");
        imd.Livro livro4 = new imd.Livro("", "hi!", 40, (int) (short) 0);
        livro4.removerCopias((int) (byte) 100);
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40 + "'", int8 == 40);
    }

    @Test
    public void test03031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03031");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 129, (int) (byte) 10);
        livro4.removerCopias(179);
    }

    @Test
    public void test03032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03032");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        livro4.removerCopias(52);
        livro4.devolver();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03033");
        imd.Livro livro4 = new imd.Livro("hi!", "", 265, 32);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(225);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03034");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 1, 9);
        livro4.adicionarCopias(0);
    }

    @Test
    public void test03035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03035");
        imd.Livro livro4 = new imd.Livro("", "", 38, 57);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 38 + "'", int5 == 38);
    }

    @Test
    public void test03036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03036");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        livro4.removerCopias(64);
        java.lang.String str12 = livro4.getTitulo();
        int int13 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03037");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 32, 141);
        livro4.removerCopias(1);
        livro4.emprestar();
        livro4.adicionarCopias(4);
    }

    @Test
    public void test03038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03038");
        imd.Livro livro4 = new imd.Livro("hi!", "", 20, 139);
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.emprestar();
        int int8 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void test03039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03039");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        int int13 = livro4.getPaginas();
        livro4.removerCopias(93);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test03040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03040");
        imd.Livro livro4 = new imd.Livro("hi!", "", 31, 10);
        livro4.removerCopias((int) 'a');
        java.lang.String str7 = livro4.getTitulo();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(224);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test03041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03041");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (short) 100);
        livro4.devolver();
        livro4.adicionarCopias(92);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03042");
        imd.Livro livro4 = new imd.Livro("hi!", "", 31, 31);
        livro4.adicionarCopias(46);
        livro4.devolver();
        livro4.adicionarCopias(66);
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
    }

    @Test
    public void test03043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03043");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias((int) 'a');
        livro4.adicionarCopias(127);
        int int12 = livro4.getPaginas();
        livro4.emprestar();
        livro4.removerCopias(179);
        livro4.adicionarCopias(265);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test03044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03044");
        imd.Livro livro4 = new imd.Livro("hi!", "", 67, 46);
    }

    @Test
    public void test03045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03045");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 10);
        livro4.adicionarCopias(97);
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test03046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03046");
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
        int int15 = livro4.getCopiasDisponiveis();
        int int16 = livro4.getPaginas();
        livro4.devolver();
        livro4.emprestar();
        livro4.adicionarCopias(68);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test03047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03047");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(42);
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test03048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03048");
        imd.Livro livro4 = new imd.Livro("hi!", "", 69, (int) 'a');
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str7 = livro4.getTitulo();
        java.lang.String str8 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 69 + "'", int5 == 69);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03049");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 0, 98);
    }

    @Test
    public void test03050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03050");
        imd.Livro livro4 = new imd.Livro("", "", 47, 54);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03051");
        imd.Livro livro4 = new imd.Livro("", "hi!", 8, 2);
    }

    @Test
    public void test03052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03052");
        imd.Livro livro4 = new imd.Livro("", "", (int) '#', (int) ' ');
        livro4.adicionarCopias(22);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03053");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias((int) '#');
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getPaginas();
        livro4.devolver();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test03054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03054");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.devolver();
        livro4.adicionarCopias(29);
        int int14 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03055");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias(66);
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03056");
        imd.Livro livro4 = new imd.Livro("hi!", "", 68, 158);
        livro4.devolver();
    }

    @Test
    public void test03057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03057");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getAutor();
        livro4.removerCopias((int) (short) 1);
        livro4.adicionarCopias(72);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03058");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (byte) 0);
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 41 + "'", int10 == 41);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03059");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 101, 128);
        livro4.adicionarCopias(10);
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
    }

    @Test
    public void test03060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03060");
        imd.Livro livro4 = new imd.Livro("hi!", "", 0, 97);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(30);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test03061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03061");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.removerCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str10 = livro4.getAutor();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getAutor();
        java.lang.String str13 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test03062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03062");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.removerCopias((int) (short) -1);
        livro4.adicionarCopias(152);
        livro4.adicionarCopias(265);
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test03063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03063");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getAutor();
        livro4.adicionarCopias(215);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test03064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03064");
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
        int int16 = livro4.getPaginas();
        livro4.removerCopias((int) (short) 100);
        java.lang.String str19 = livro4.getAutor();
        java.lang.String str20 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass21 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test03065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03065");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(97);
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(0);
        int int15 = livro4.getPaginas();
        livro4.emprestar();
        int int17 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass18 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 126 + "'", int17 == 126);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03066");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 60, 128);
        livro4.adicionarCopias(69);
        java.lang.String str7 = livro4.getTitulo();
        livro4.removerCopias(97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test03067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03067");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test03068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03068");
        imd.Livro livro4 = new imd.Livro("", "hi!", 31, 51);
        livro4.adicionarCopias(171);
    }

    @Test
    public void test03069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03069");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        livro4.emprestar();
        livro4.devolver();
        livro4.emprestar();
        livro4.emprestar();
        int int16 = livro4.getPaginas();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test03070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03070");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(97);
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(0);
        int int15 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(1);
        livro4.emprestar();
        int int19 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str21 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 127 + "'", int15 == 127);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test03071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03071");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 31);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getAutor();
        livro4.removerCopias(30);
        java.lang.String str10 = livro4.getAutor();
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test03072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03072");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 158, 60);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03073");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getPaginas();
        java.lang.String str13 = livro4.getTitulo();
        livro4.removerCopias(129);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03074");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias((int) '#');
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test03075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03075");
        imd.Livro livro4 = new imd.Livro("", "", 241, 0);
        livro4.emprestar();
    }

    @Test
    public void test03076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03076");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int13 = livro4.getPaginas();
        livro4.removerCopias(238);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test03077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03077");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', 66);
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 65 + "'", int8 == 65);
    }

    @Test
    public void test03078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03078");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test03079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03079");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 10);
        livro4.adicionarCopias(97);
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        java.lang.String str16 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test03080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03080");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) -1, 101);
        livro4.devolver();
    }

    @Test
    public void test03081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03081");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(181);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03082");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03083");
        imd.Livro livro4 = new imd.Livro("hi!", "", 97, 21);
        livro4.removerCopias(11);
        livro4.devolver();
        int int8 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test03084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03084");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias(41);
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
    }

    @Test
    public void test03085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03085");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 60, 46);
        livro4.removerCopias(241);
        livro4.devolver();
        java.lang.String str8 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test03086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03086");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias(242);
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.String str12 = livro4.getTitulo();
        livro4.adicionarCopias(92);
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 274 + "'", int11 == 274);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test03087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03087");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), (int) (short) 0);
        livro4.adicionarCopias(127);
    }

    @Test
    public void test03088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03088");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, (int) (byte) 100);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test03089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03089");
        imd.Livro livro4 = new imd.Livro("", "", 67, 97);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test03090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03090");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias(0);
        livro4.emprestar();
        livro4.adicionarCopias(133);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test03091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03091");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 0, 41);
        livro4.removerCopias((int) (short) -1);
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test03092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03092");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(0);
        livro4.removerCopias(100);
        livro4.removerCopias(2);
        int int16 = livro4.getPaginas();
        livro4.removerCopias(32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test03093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03093");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        livro4.devolver();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03094");
        imd.Livro livro4 = new imd.Livro("", "hi!", 102, 49);
    }

    @Test
    public void test03095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03095");
        imd.Livro livro4 = new imd.Livro("", "", 21, (int) '4');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) ' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test03096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03096");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 31, 21);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test03097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03097");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 1);
        livro4.removerCopias((int) (byte) 10);
        livro4.devolver();
        livro4.removerCopias(51);
        livro4.emprestar();
        livro4.adicionarCopias(113);
        int int21 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test03098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03098");
        imd.Livro livro4 = new imd.Livro("", "hi!", 29, 12);
        livro4.devolver();
    }

    @Test
    public void test03099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03099");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias((int) ' ');
        int int9 = livro4.getPaginas();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((int) (short) 1);
        livro4.removerCopias(225);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test03100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03100");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(0);
        java.lang.String str10 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test03101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03101");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) ' ');
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
    }

    @Test
    public void test03102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03102");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(128);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(64);
        livro4.removerCopias(60);
        int int14 = livro4.getPaginas();
        java.lang.String str15 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 130 + "'", int9 == 130);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test03103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03103");
        imd.Livro livro4 = new imd.Livro("hi!", "", 33, 47);
    }

    @Test
    public void test03104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03104");
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
        int int18 = livro4.getPaginas();
        livro4.removerCopias((int) '#');
        livro4.devolver();
        java.lang.String str22 = livro4.getTitulo();
        int int23 = livro4.getCopiasDisponiveis();
        java.lang.String str24 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 31 + "'", int23 == 31);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test03105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03105");
        imd.Livro livro4 = new imd.Livro("", "", 254, 129);
    }

    @Test
    public void test03106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03106");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        livro4.adicionarCopias(22);
        java.lang.String str14 = livro4.getAutor();
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test03107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03107");
        imd.Livro livro4 = new imd.Livro("", "", 246, 137);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03108");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 1);
        livro4.removerCopias((int) (byte) 1);
        int int15 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03109");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (short) 0);
        livro4.devolver();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03110");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 102, 12);
    }

    @Test
    public void test03111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03111");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03112");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) -1, 7);
        livro4.adicionarCopias(57);
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03113");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(10);
        int int12 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int14 = livro4.getPaginas();
        int int15 = livro4.getPaginas();
        int int16 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(265);
        java.lang.Class<?> wildcardClass19 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test03114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03114");
        imd.Livro livro4 = new imd.Livro("", "hi!", 98, 62);
        livro4.adicionarCopias(63);
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 126 + "'", int8 == 126);
    }

    @Test
    public void test03115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03115");
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
        livro4.removerCopias(225);
        livro4.removerCopias(22);
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
    public void test03116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03116");
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
        livro4.adicionarCopias(106);
        java.lang.String str19 = livro4.getAutor();
        livro4.removerCopias(36);
        livro4.adicionarCopias(101);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test03117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03117");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getPaginas();
        java.lang.String str13 = livro4.getAutor();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test03118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03118");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(0);
        livro4.removerCopias(100);
        int int14 = livro4.getPaginas();
        livro4.removerCopias(63);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test03119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03119");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias(100);
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 10);
        int int12 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test03120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03120");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.adicionarCopias(65);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test03121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03121");
        imd.Livro livro4 = new imd.Livro("", "", 52, 40);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 40 + "'", int5 == 40);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test03122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03122");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        livro4.removerCopias(54);
        livro4.adicionarCopias(164);
        livro4.removerCopias(95);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test03123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03123");
        imd.Livro livro4 = new imd.Livro("hi!", "", 66, 11);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03124");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) ' ');
        livro4.adicionarCopias(32);
        livro4.removerCopias((int) (byte) 10);
        java.lang.String str13 = livro4.getTitulo();
        livro4.adicionarCopias(149);
        java.lang.String str16 = livro4.getTitulo();
        livro4.adicionarCopias(133);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test03125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03125");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias(66);
        java.lang.String str13 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(67);
        int int17 = livro4.getPaginas();
        java.lang.String str18 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test03126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03126");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, 0);
        livro4.removerCopias((int) (short) 1);
    }

    @Test
    public void test03127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03127");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias(66);
        livro4.devolver();
        int int14 = livro4.getCopiasDisponiveis();
        java.lang.String str15 = livro4.getAutor();
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias(2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test03128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03128");
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
        int int18 = livro4.getPaginas();
        livro4.removerCopias((int) '#');
        livro4.devolver();
        livro4.removerCopias(141);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test03129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03129");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test03130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03130");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getAutor();
        livro4.removerCopias(241);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test03131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03131");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.devolver();
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        livro4.removerCopias(36);
        java.lang.String str15 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03132");
        imd.Livro livro4 = new imd.Livro("", "hi!", 130, 42);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 130 + "'", int5 == 130);
    }

    @Test
    public void test03133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03133");
        imd.Livro livro4 = new imd.Livro("", "", 41, 164);
    }

    @Test
    public void test03134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03134");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03135");
        imd.Livro livro4 = new imd.Livro("hi!", "", 71, 87);
    }

    @Test
    public void test03136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03136");
        imd.Livro livro4 = new imd.Livro("hi!", "", 31, 10);
        livro4.removerCopias((int) 'a');
        java.lang.String str7 = livro4.getTitulo();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias(269);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test03137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03137");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str7 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test03138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03138");
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
        livro4.devolver();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03139");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 258, 20);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03140");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.removerCopias(10);
        livro4.emprestar();
    }

    @Test
    public void test03141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03141");
        imd.Livro livro4 = new imd.Livro("hi!", "", 11, 0);
    }

    @Test
    public void test03142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03142");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias(41);
        livro4.devolver();
        livro4.adicionarCopias(41);
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getPaginas();
        livro4.adicionarCopias(262);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test03143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03143");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test03144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03144");
        imd.Livro livro4 = new imd.Livro("hi!", "", 242, 36);
        livro4.removerCopias(139);
        int int7 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
    }

    @Test
    public void test03145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03145");
        imd.Livro livro4 = new imd.Livro("", "hi!", 101, 2);
        livro4.emprestar();
    }

    @Test
    public void test03146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03146");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getAutor();
        livro4.removerCopias(166);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test03147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03147");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 10, 246);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03148");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias(41);
        livro4.adicionarCopias(0);
        livro4.adicionarCopias(2);
        int int16 = livro4.getCopiasDisponiveis();
        java.lang.String str17 = livro4.getTitulo();
        livro4.devolver();
        int int19 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 54 + "'", int16 == 54);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test03149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03149");
        imd.Livro livro4 = new imd.Livro("", "", 96, (int) '#');
    }

    @Test
    public void test03150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03150");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test03151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03151");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str13 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03152");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        int int13 = livro4.getPaginas();
        int int14 = livro4.getPaginas();
        java.lang.String str15 = livro4.getTitulo();
        int int16 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test03153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03153");
        imd.Livro livro4 = new imd.Livro("", "", 100, 101);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        int int8 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test03154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03154");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 60);
        livro4.adicionarCopias((int) ' ');
    }

    @Test
    public void test03155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03155");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 97, (int) (byte) 1);
        livro4.removerCopias((int) (short) 1);
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(307);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03156");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(30);
        livro4.devolver();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test03157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03157");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 0);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test03158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03158");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getAutor();
        livro4.removerCopias(0);
        livro4.adicionarCopias(69);
        int int13 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 70 + "'", int13 == 70);
    }

    @Test
    public void test03159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03159");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.adicionarCopias((int) (short) 0);
        int int7 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias(66);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test03160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03160");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 106, 30);
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 106 + "'", int5 == 106);
    }

    @Test
    public void test03161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03161");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(141);
        livro4.devolver();
        int int16 = livro4.getPaginas();
        java.lang.String str17 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test03162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03162");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test03163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03163");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 101, 9);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test03164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03164");
        imd.Livro livro4 = new imd.Livro("", "hi!", 137, 168);
        livro4.adicionarCopias(106);
    }

    @Test
    public void test03165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03165");
        imd.Livro livro4 = new imd.Livro("", "hi!", 97, (int) (byte) 10);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test03166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03166");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 11, 37);
        livro4.removerCopias((int) (short) 1);
    }

    @Test
    public void test03167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03167");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 100, 54);
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias(242);
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test03168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03168");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 100, 243);
        livro4.removerCopias(126);
    }

    @Test
    public void test03169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03169");
        imd.Livro livro4 = new imd.Livro("hi!", "", 38, 304);
    }

    @Test
    public void test03170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03170");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 100, 96);
    }

    @Test
    public void test03171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03171");
        imd.Livro livro4 = new imd.Livro("", "hi!", 134, 0);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 134 + "'", int5 == 134);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 134 + "'", int6 == 134);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03172");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, (int) (short) 1);
        int int5 = livro4.getPaginas();
        livro4.removerCopias(36);
        livro4.devolver();
        livro4.adicionarCopias(102);
        livro4.emprestar();
        livro4.removerCopias(224);
        livro4.adicionarCopias(269);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test03173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03173");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (byte) 0);
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 41 + "'", int10 == 41);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test03174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03174");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 37, 63);
    }

    @Test
    public void test03175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03175");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 97, 0);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03176");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 20, 274);
        livro4.devolver();
    }

    @Test
    public void test03177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03177");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 10);
        livro4.adicionarCopias(97);
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        livro4.devolver();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(171);
        int int16 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 140 + "'", int13 == 140);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 140 + "'", int16 == 140);
    }

    @Test
    public void test03178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03178");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) (short) -1);
        livro4.adicionarCopias((int) (byte) 10);
        int int13 = livro4.getPaginas();
        livro4.removerCopias(42);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test03179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03179");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getAutor();
        livro4.emprestar();
        livro4.devolver();
        livro4.devolver();
        int int12 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test03180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03180");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 31, 30);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test03181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03181");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.devolver();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03182");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), 0);
        livro4.adicionarCopias(9);
    }

    @Test
    public void test03183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03183");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str13 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03184");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03185");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((-1));
        livro4.removerCopias(21);
        livro4.removerCopias(126);
        livro4.removerCopias(62);
        java.lang.String str18 = livro4.getTitulo();
        livro4.adicionarCopias(164);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test03186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03186");
        imd.Livro livro4 = new imd.Livro("", "", 31, 52);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
    }

    @Test
    public void test03187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03187");
        imd.Livro livro4 = new imd.Livro("hi!", "", 21, (-1));
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(54);
        java.lang.String str10 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test03188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03188");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(10);
        livro4.removerCopias((int) (byte) -1);
        livro4.removerCopias(100);
        int int16 = livro4.getCopiasDisponiveis();
        int int17 = livro4.getPaginas();
        int int18 = livro4.getPaginas();
        int int19 = livro4.getCopiasDisponiveis();
        java.lang.String str20 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 22 + "'", int19 == 22);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test03189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03189");
        imd.Livro livro4 = new imd.Livro("hi!", "", 54, 42);
        livro4.adicionarCopias(148);
    }

    @Test
    public void test03190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03190");
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
        java.lang.String str16 = livro4.getTitulo();
        livro4.adicionarCopias(2);
        livro4.adicionarCopias(148);
        livro4.removerCopias(274);
        livro4.adicionarCopias(127);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test03191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03191");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 0, (int) ' ');
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03192");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 139, 274);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03193");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 0, (int) (short) -1);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test03194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03194");
        imd.Livro livro4 = new imd.Livro("", "hi!", 101, (int) (short) 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.adicionarCopias(32);
        java.lang.String str8 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias(33);
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03195");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) ' ');
        livro4.removerCopias((-1));
        java.lang.String str13 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03196");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias(173);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test03197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03197");
        imd.Livro livro4 = new imd.Livro("", "", 100, 101);
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03198");
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
        livro4.emprestar();
        livro4.removerCopias((-1));
        livro4.devolver();
        livro4.adicionarCopias(200);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
    }

    @Test
    public void test03199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03199");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(29);
        int int12 = livro4.getPaginas();
        java.lang.String str13 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03200");
        imd.Livro livro4 = new imd.Livro("", "", 265, 167);
    }

    @Test
    public void test03201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03201");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 126, 141);
        livro4.adicionarCopias(0);
        java.lang.String str7 = livro4.getTitulo();
        livro4.removerCopias(152);
        java.lang.String str10 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test03202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03202");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test03203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03203");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias((int) (byte) 1);
        int int9 = livro4.getPaginas();
        livro4.removerCopias(102);
        int int12 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test03204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03204");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getAutor();
        livro4.emprestar();
        livro4.devolver();
        livro4.devolver();
        int int12 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03205");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getPaginas();
        java.lang.String str16 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test03206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03206");
        imd.Livro livro4 = new imd.Livro("", "hi!", 2, 40);
        livro4.adicionarCopias(171);
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 212 + "'", int8 == 212);
    }

    @Test
    public void test03207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03207");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(30);
        livro4.emprestar();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test03208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03208");
        imd.Livro livro4 = new imd.Livro("hi!", "", 168, 238);
        livro4.emprestar();
    }

    @Test
    public void test03209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03209");
        imd.Livro livro4 = new imd.Livro("hi!", "", 36, 57);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 57 + "'", int5 == 57);
    }

    @Test
    public void test03210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03210");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test03211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03211");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 31 + "'", int13 == 31);
    }

    @Test
    public void test03212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03212");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        livro4.removerCopias((int) (byte) -1);
        livro4.devolver();
        java.lang.String str17 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass19 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test03213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03213");
        imd.Livro livro4 = new imd.Livro("", "", 41, 4);
    }

    @Test
    public void test03214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03214");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 10);
        livro4.adicionarCopias(97);
        livro4.adicionarCopias(62);
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03215");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getAutor();
        java.lang.String str11 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str13 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03216");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test03217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03217");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(67);
        livro4.emprestar();
        java.lang.String str13 = livro4.getAutor();
        java.lang.String str14 = livro4.getAutor();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03218");
        imd.Livro livro4 = new imd.Livro("hi!", "", 60, 101);
    }

    @Test
    public void test03219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03219");
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
        java.lang.String str16 = livro4.getTitulo();
        java.lang.String str17 = livro4.getAutor();
        int int18 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test03220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03220");
        imd.Livro livro4 = new imd.Livro("", "hi!", 62, 167);
    }

    @Test
    public void test03221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03221");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) -1, 102);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03222");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 31);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (short) 0);
        livro4.adicionarCopias(242);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
    }

    @Test
    public void test03223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03223");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) ' ', 34);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03224");
        imd.Livro livro4 = new imd.Livro("hi!", "", 158, 137);
    }

    @Test
    public void test03225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03225");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 106, 36);
    }

    @Test
    public void test03226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03226");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) ' ');
        livro4.adicionarCopias(32);
        livro4.removerCopias((int) (byte) 10);
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getCopiasDisponiveis();
        int int16 = livro4.getCopiasDisponiveis();
        int int17 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass18 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 22 + "'", int15 == 22);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03227");
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
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40 + "'", int15 == 40);
    }

    @Test
    public void test03228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03228");
        imd.Livro livro4 = new imd.Livro("", "hi!", 12, 242);
        livro4.adicionarCopias(85);
    }

    @Test
    public void test03229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03229");
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
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test03230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03230");
        imd.Livro livro4 = new imd.Livro("", "hi!", 200, 225);
    }

    @Test
    public void test03231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03231");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str12 = livro4.getTitulo();
        int int13 = livro4.getPaginas();
        livro4.adicionarCopias(98);
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test03232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03232");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias((int) '#');
        livro4.devolver();
        livro4.adicionarCopias(171);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test03233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03233");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) ' ');
        livro4.adicionarCopias(32);
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) '4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test03234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03234");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 30, (int) (short) 1);
        java.lang.String str5 = livro4.getAutor();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03235");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 106, 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.adicionarCopias(60);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test03236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03236");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) (byte) 1);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test03237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03237");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 31);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias(8);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test03238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03238");
        imd.Livro livro4 = new imd.Livro("", "hi!", 35, 164);
    }

    @Test
    public void test03239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03239");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias(274);
        livro4.removerCopias((-1));
        int int17 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 307 + "'", int17 == 307);
    }

    @Test
    public void test03240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03240");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        livro4.devolver();
        livro4.removerCopias(39);
        java.lang.String str12 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test03241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03241");
        imd.Livro livro4 = new imd.Livro("", "", 41, 179);
    }

    @Test
    public void test03242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03242");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test03243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03243");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str10 = livro4.getAutor();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03244");
        imd.Livro livro4 = new imd.Livro("", "", 40, (int) (short) 0);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias(142);
        livro4.devolver();
        livro4.removerCopias(12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03245");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 126, 81);
    }

    @Test
    public void test03246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03246");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        livro4.removerCopias((int) (byte) -1);
        livro4.devolver();
        java.lang.String str17 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test03247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03247");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getAutor();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03248");
        imd.Livro livro4 = new imd.Livro("", "", 52, 40);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(51);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 40 + "'", int5 == 40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test03249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03249");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 29, 99);
    }

    @Test
    public void test03250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03250");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 142, 39);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 142 + "'", int5 == 142);
    }

    @Test
    public void test03251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03251");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        livro4.emprestar();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30 + "'", int9 == 30);
    }

    @Test
    public void test03252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03252");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test03253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03253");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) (byte) 0);
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        java.lang.String str13 = livro4.getTitulo();
        livro4.devolver();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03254");
        imd.Livro livro4 = new imd.Livro("", "hi!", 262, 274);
    }

    @Test
    public void test03255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03255");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, (int) (short) 1);
        livro4.removerCopias(127);
        livro4.removerCopias((int) (short) -1);
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getAutor();
        livro4.adicionarCopias(2);
        java.lang.String str13 = livro4.getTitulo();
        livro4.adicionarCopias(97);
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03256");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.removerCopias((int) (short) -1);
        livro4.adicionarCopias(152);
        livro4.adicionarCopias(137);
        java.lang.String str13 = livro4.getAutor();
        livro4.adicionarCopias(54);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03257");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03258");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 10);
        livro4.adicionarCopias(97);
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        livro4.devolver();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(171);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 140 + "'", int13 == 140);
    }

    @Test
    public void test03259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03259");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(10);
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getTitulo();
        livro4.removerCopias(95);
        java.lang.String str16 = livro4.getTitulo();
        livro4.removerCopias(126);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test03260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03260");
        imd.Livro livro4 = new imd.Livro("", "hi!", 32, 0);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias(122);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03261");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.adicionarCopias(10);
        java.lang.String str14 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 100);
        livro4.adicionarCopias(66);
        java.lang.String str19 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str21 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test03262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03262");
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
        int int15 = livro4.getCopiasDisponiveis();
        int int16 = livro4.getPaginas();
        int int17 = livro4.getCopiasDisponiveis();
        java.lang.String str18 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test03263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03263");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(97);
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str13 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03264");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias(34);
        livro4.adicionarCopias(128);
        int int13 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 162 + "'", int13 == 162);
    }

    @Test
    public void test03265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03265");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(29);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test03266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03266");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 70, 158);
    }

    @Test
    public void test03267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03267");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.adicionarCopias(32);
        livro4.adicionarCopias(52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03268");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.removerCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str10 = livro4.getAutor();
        java.lang.String str11 = livro4.getAutor();
        livro4.removerCopias(21);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03269");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) ' ');
        livro4.adicionarCopias(32);
        livro4.removerCopias((int) (byte) 10);
        java.lang.String str13 = livro4.getTitulo();
        livro4.adicionarCopias(149);
        java.lang.String str16 = livro4.getTitulo();
        java.lang.String str17 = livro4.getTitulo();
        java.lang.String str18 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test03270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03270");
        imd.Livro livro4 = new imd.Livro("", "", 29, 1);
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias(172);
        livro4.adicionarCopias(46);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03271");
        imd.Livro livro4 = new imd.Livro("", "", 23, 139);
    }

    @Test
    public void test03272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03272");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.removerCopias((int) '4');
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03273");
        imd.Livro livro4 = new imd.Livro("", "", 22, (int) (short) 10);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03274");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 31);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        livro4.removerCopias(29);
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test03275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03275");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getCopiasDisponiveis();
        int int13 = livro4.getPaginas();
        livro4.removerCopias((int) (short) 100);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test03276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03276");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias(0);
        int int11 = livro4.getPaginas();
        int int12 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test03277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03277");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((-1));
        livro4.removerCopias(21);
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getCopiasDisponiveis();
        int int16 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 0);
        java.lang.String str19 = livro4.getTitulo();
        java.lang.String str20 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test03278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03278");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (byte) 0);
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(52);
        livro4.adicionarCopias(41);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
    }

    @Test
    public void test03279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03279");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 97, (int) (byte) 1);
        livro4.removerCopias((int) (short) 1);
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test03280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03280");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 51, 51);
        livro4.devolver();
        livro4.removerCopias(100);
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias(36);
        java.lang.String str13 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03281");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) (byte) 0);
        livro4.devolver();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(42);
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.String str14 = livro4.getAutor();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 44 + "'", int13 == 44);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03282");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(30);
        int int15 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test03283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03283");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(97);
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias(0);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03284");
        imd.Livro livro4 = new imd.Livro("", "", 40, (int) (short) 0);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        livro4.removerCopias(65);
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test03285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03285");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 51, 101);
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        livro4.removerCopias(41);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test03286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03286");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias((int) '#');
        livro4.devolver();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.removerCopias((int) (byte) 0);
        int int18 = livro4.getCopiasDisponiveis();
        java.lang.String str19 = livro4.getTitulo();
        livro4.removerCopias(93);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 67 + "'", int18 == 67);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test03287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03287");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int9 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.devolver();
        int int15 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
    }

    @Test
    public void test03288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03288");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 128, 41);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(53);
        livro4.removerCopias(74);
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test03289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03289");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(37);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03290");
        imd.Livro livro4 = new imd.Livro("hi!", "", 242, 29);
        livro4.devolver();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(1);
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 242 + "'", int6 == 242);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test03291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03291");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(10);
        int int12 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias((int) (short) -1);
        livro4.devolver();
        livro4.adicionarCopias(130);
        java.lang.String str19 = livro4.getTitulo();
        livro4.adicionarCopias(130);
        int int22 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 282 + "'", int22 == 282);
    }

    @Test
    public void test03292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03292");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(137);
        int int15 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 238 + "'", int15 == 238);
    }

    @Test
    public void test03293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03293");
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
        livro4.removerCopias(101);
        int int18 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test03294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03294");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias((int) '#');
        livro4.removerCopias(0);
        livro4.emprestar();
        livro4.devolver();
        livro4.removerCopias(21);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass19 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test03295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03295");
        imd.Livro livro4 = new imd.Livro("", "", 64, 64);
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        livro4.devolver();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03296");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (short) 0);
        livro4.devolver();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getCopiasDisponiveis();
        int int13 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test03297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03297");
        imd.Livro livro4 = new imd.Livro("hi!", "", 33, 101);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03298");
        imd.Livro livro4 = new imd.Livro("", "", 11, 0);
        livro4.removerCopias(0);
        livro4.adicionarCopias(171);
    }

    @Test
    public void test03299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03299");
        imd.Livro livro4 = new imd.Livro("", "", 200, 166);
    }

    @Test
    public void test03300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03300");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getPaginas();
        livro4.removerCopias(32);
        livro4.devolver();
        livro4.devolver();
        java.lang.String str17 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test03301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03301");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test03302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03302");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 100, 54);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test03303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03303");
        imd.Livro livro4 = new imd.Livro("", "", 265, 141);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 265 + "'", int7 == 265);
    }

    @Test
    public void test03304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03304");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str13 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias(41);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03305");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(60);
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test03306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03306");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test03307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03307");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int13 = livro4.getPaginas();
        java.lang.String str14 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test03308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03308");
        imd.Livro livro4 = new imd.Livro("", "hi!", 97, (int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03309");
        imd.Livro livro4 = new imd.Livro("hi!", "", 0, (int) '#');
        livro4.devolver();
    }

    @Test
    public void test03310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03310");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getPaginas();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(146);
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03311");
        imd.Livro livro4 = new imd.Livro("", "hi!", 274, 47);
        livro4.devolver();
    }

    @Test
    public void test03312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03312");
        imd.Livro livro4 = new imd.Livro("hi!", "", 97, (int) 'a');
        livro4.emprestar();
        livro4.adicionarCopias(83);
    }

    @Test
    public void test03313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03313");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str7 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test03314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03314");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(1);
        livro4.removerCopias(30);
        livro4.emprestar();
        int int15 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(11);
        java.lang.String str18 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test03315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03315");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) -1, 217);
    }

    @Test
    public void test03316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03316");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (byte) 10);
        livro4.removerCopias(128);
    }

    @Test
    public void test03317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03317");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.devolver();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias((int) 'a');
        livro4.adicionarCopias(38);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test03318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03318");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias(53);
        livro4.removerCopias(96);
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test03319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03319");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getCopiasDisponiveis();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(164);
        java.lang.String str16 = livro4.getAutor();
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03320");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) (byte) 0);
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        java.lang.String str13 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias(166);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03321");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(10);
        livro4.removerCopias((int) (byte) -1);
        livro4.removerCopias(100);
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03322");
        imd.Livro livro4 = new imd.Livro("", "", 100, 101);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(10);
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(95);
        livro4.adicionarCopias((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test03323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03323");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) (byte) 1);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test03324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03324");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias((int) '#');
        livro4.devolver();
        livro4.removerCopias(31);
        int int15 = livro4.getPaginas();
        java.lang.String str16 = livro4.getTitulo();
        livro4.emprestar();
        int int18 = livro4.getCopiasDisponiveis();
        java.lang.String str19 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test03325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03325");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(10);
        livro4.removerCopias(65);
        livro4.removerCopias(106);
        int int16 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.removerCopias((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21 + "'", int16 == 21);
    }

    @Test
    public void test03326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03326");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str12 = livro4.getTitulo();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(153);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
    }

    @Test
    public void test03327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03327");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(100);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.adicionarCopias((int) (byte) 10);
        livro4.removerCopias(0);
        livro4.emprestar();
        int int18 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test03328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03328");
        imd.Livro livro4 = new imd.Livro("", "hi!", 269, 0);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 269 + "'", int5 == 269);
    }

    @Test
    public void test03329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03329");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        livro4.emprestar();
        java.lang.String str10 = livro4.getAutor();
        livro4.removerCopias(10);
        int int13 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 87 + "'", int13 == 87);
    }

    @Test
    public void test03330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03330");
        imd.Livro livro4 = new imd.Livro("", "", 38, 0);
    }

    @Test
    public void test03331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03331");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 10, (int) ' ');
        livro4.removerCopias(21);
        java.lang.String str7 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03332");
        imd.Livro livro4 = new imd.Livro("hi!", "", 195, 224);
    }

    @Test
    public void test03333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03333");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.emprestar();
        livro4.devolver();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
    }

    @Test
    public void test03334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03334");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        livro4.adicionarCopias(2);
        livro4.adicionarCopias(72);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test03335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03335");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, (int) (short) 1);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(0);
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03336");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias((int) '#');
        livro4.devolver();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.removerCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str20 = livro4.getTitulo();
        java.lang.String str21 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test03337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03337");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 106, 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.adicionarCopias(60);
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 106 + "'", int8 == 106);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test03338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03338");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.devolver();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03339");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(10);
        livro4.removerCopias((int) (byte) -1);
        livro4.removerCopias(100);
        livro4.adicionarCopias(149);
        livro4.devolver();
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test03340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03340");
        imd.Livro livro4 = new imd.Livro("", "", 34, 1);
        livro4.adicionarCopias(29);
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03341");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(97);
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 128 + "'", int11 == 128);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03342");
        imd.Livro livro4 = new imd.Livro("", "", (int) '4', 66);
        livro4.adicionarCopias(106);
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03343");
        imd.Livro livro4 = new imd.Livro("", "", 40, (int) (short) 0);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03344");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias(41);
        livro4.adicionarCopias(0);
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getPaginas();
        livro4.adicionarCopias(0);
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str20 = livro4.getAutor();
        int int21 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test03345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03345");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 0, 52);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias(139);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03346");
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
        livro4.adicionarCopias((int) (short) -1);
        livro4.removerCopias(258);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test03347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03347");
        imd.Livro livro4 = new imd.Livro("hi!", "", 152, 44);
    }

    @Test
    public void test03348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03348");
        imd.Livro livro4 = new imd.Livro("hi!", "", 0, 97);
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias(81);
        int int9 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 177 + "'", int9 == 177);
    }

    @Test
    public void test03349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03349");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) -1, (int) (byte) 100);
        livro4.adicionarCopias(10);
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03350");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) -1, 96);
    }

    @Test
    public void test03351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03351");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 0, 246);
    }

    @Test
    public void test03352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03352");
        imd.Livro livro4 = new imd.Livro("hi!", "", 22, 20);
    }

    @Test
    public void test03353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03353");
        imd.Livro livro4 = new imd.Livro("", "", 0, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test03354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03354");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int9 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias((int) (byte) 0);
        livro4.adicionarCopias(100);
        livro4.devolver();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03355");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getAutor();
        livro4.emprestar();
        int int14 = livro4.getPaginas();
        int int15 = livro4.getCopiasDisponiveis();
        int int16 = livro4.getCopiasDisponiveis();
        int int17 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test03356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03356");
        imd.Livro livro4 = new imd.Livro("hi!", "", 166, 132);
        livro4.devolver();
        livro4.removerCopias((int) (short) 1);
    }

    @Test
    public void test03357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03357");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        int int10 = livro4.getPaginas();
        livro4.removerCopias(0);
        int int13 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str15 = livro4.getAutor();
        java.lang.String str16 = livro4.getTitulo();
        int int17 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (short) 100);
        int int20 = livro4.getPaginas();
        java.lang.String str21 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test03358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03358");
        imd.Livro livro4 = new imd.Livro("", "", 132, 148);
    }

    @Test
    public void test03359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03359");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03360");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, (int) ' ');
        livro4.emprestar();
    }

    @Test
    public void test03361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03361");
        imd.Livro livro4 = new imd.Livro("", "", 128, 0);
        livro4.emprestar();
        livro4.emprestar();
    }

    @Test
    public void test03362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03362");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test03363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03363");
        imd.Livro livro4 = new imd.Livro("", "hi!", 127, 51);
        livro4.devolver();
        livro4.emprestar();
    }

    @Test
    public void test03364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03364");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        int int10 = livro4.getPaginas();
        livro4.removerCopias(0);
        int int13 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        int int16 = livro4.getCopiasDisponiveis();
        int int17 = livro4.getPaginas();
        int int18 = livro4.getPaginas();
        livro4.devolver();
        int int20 = livro4.getPaginas();
        int int21 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33 + "'", int21 == 33);
    }

    @Test
    public void test03365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03365");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 31);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getAutor();
        livro4.removerCopias(30);
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        livro4.adicionarCopias(173);
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03366");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getTitulo();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(97);
        livro4.adicionarCopias(21);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40 + "'", int8 == 40);
    }

    @Test
    public void test03367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03367");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), (int) '#');
        java.lang.String str5 = livro4.getTitulo();
        livro4.adicionarCopias((int) (short) 100);
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test03368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03368");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) (short) 1);
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getPaginas();
        livro4.devolver();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03369");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 0, (int) (byte) 1);
        java.lang.String str5 = livro4.getAutor();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03370");
        imd.Livro livro4 = new imd.Livro("", "hi!", 171, 261);
    }

    @Test
    public void test03371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03371");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        int int7 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03372");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str8 = livro4.getAutor();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03373");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03374");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 51, 101);
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getTitulo();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
    }

    @Test
    public void test03375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03375");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) (byte) 1);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(106);
        livro4.adicionarCopias(128);
        int int10 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(173);
        int int13 = livro4.getPaginas();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 129 + "'", int10 == 129);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03376");
        imd.Livro livro4 = new imd.Livro("hi!", "", 65, 11);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
    }

    @Test
    public void test03377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03377");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.adicionarCopias(33);
        int int14 = livro4.getPaginas();
        java.lang.String str15 = livro4.getAutor();
        int int16 = livro4.getPaginas();
        java.lang.String str17 = livro4.getAutor();
        java.lang.Class<?> wildcardClass18 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03378");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 0, 241);
        livro4.emprestar();
        livro4.adicionarCopias(243);
        livro4.adicionarCopias(54);
    }

    @Test
    public void test03379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03379");
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
        java.lang.String str15 = livro4.getTitulo();
        java.lang.String str16 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03380");
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
        livro4.removerCopias(32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 30 + "'", int12 == 30);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test03381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03381");
        imd.Livro livro4 = new imd.Livro("", "", 31, 97);
        livro4.devolver();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test03382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03382");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 41, (int) (short) 10);
        livro4.adicionarCopias((int) (short) 100);
        livro4.devolver();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03383");
        imd.Livro livro4 = new imd.Livro("", "", 158, 46);
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(67);
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03384");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 47, 243);
    }

    @Test
    public void test03385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03385");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) -1, 67);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias(141);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 67 + "'", int5 == 67);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test03386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03386");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), (int) '#');
        livro4.devolver();
        int int6 = livro4.getPaginas();
        livro4.removerCopias(282);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test03387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03387");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getAutor();
        java.lang.String str13 = livro4.getAutor();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test03388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03388");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.removerCopias(0);
        livro4.devolver();
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test03389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03389");
        imd.Livro livro4 = new imd.Livro("hi!", "", 97, 21);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
    }

    @Test
    public void test03390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03390");
        imd.Livro livro4 = new imd.Livro("hi!", "", 242, 0);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 242 + "'", int5 == 242);
    }

    @Test
    public void test03391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03391");
        imd.Livro livro4 = new imd.Livro("", "", 0, (int) (byte) 1);
        int int5 = livro4.getPaginas();
        livro4.removerCopias(91);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test03392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03392");
        imd.Livro livro4 = new imd.Livro("hi!", "", 69, (int) (byte) 0);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 69 + "'", int5 == 69);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 69 + "'", int6 == 69);
    }

    @Test
    public void test03393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03393");
        imd.Livro livro4 = new imd.Livro("", "hi!", 134, 65);
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test03394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03394");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(30);
        livro4.emprestar();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (short) 10);
        livro4.removerCopias(141);
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03395");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(10);
        livro4.removerCopias(65);
        int int14 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test03396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03396");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(29);
        int int12 = livro4.getPaginas();
        java.lang.String str13 = livro4.getTitulo();
        int int14 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test03397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03397");
        imd.Livro livro4 = new imd.Livro("", "", 3, 69);
        livro4.emprestar();
    }

    @Test
    public void test03398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03398");
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
        java.lang.String str19 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str21 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass22 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test03399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03399");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str12 = livro4.getTitulo();
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test03400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03400");
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
        int int18 = livro4.getPaginas();
        livro4.removerCopias((int) '#');
        livro4.devolver();
        int int22 = livro4.getPaginas();
        int int23 = livro4.getCopiasDisponiveis();
        java.lang.String str24 = livro4.getTitulo();
        livro4.removerCopias(41);
        livro4.adicionarCopias(97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 31 + "'", int23 == 31);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test03401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03401");
        imd.Livro livro4 = new imd.Livro("", "", (int) '#', (int) (short) 1);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getTitulo();
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03402");
        imd.Livro livro4 = new imd.Livro("", "hi!", 40, (int) (byte) -1);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) '#');
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test03403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03403");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 102);
        livro4.removerCopias(21);
    }

    @Test
    public void test03404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03404");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(51);
        java.lang.String str12 = livro4.getAutor();
        java.lang.String str13 = livro4.getAutor();
        livro4.adicionarCopias(44);
        int int16 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test03405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03405");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 42);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03406");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        livro4.adicionarCopias((int) 'a');
        livro4.emprestar();
        int int10 = livro4.getPaginas();
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test03407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03407");
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
        livro4.devolver();
        java.lang.String str19 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29 + "'", int17 == 29);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test03408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03408");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, (int) (short) 1);
        int int5 = livro4.getPaginas();
        livro4.removerCopias(36);
        livro4.devolver();
        livro4.adicionarCopias(102);
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        livro4.devolver();
        int int14 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test03409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03409");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias((int) '#');
        java.lang.String str12 = livro4.getTitulo();
        livro4.removerCopias(32);
        java.lang.String str15 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test03410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03410");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(0);
        java.lang.String str9 = livro4.getTitulo();
        livro4.emprestar();
        int int11 = livro4.getPaginas();
        livro4.devolver();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03411");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(1);
        livro4.removerCopias(30);
        java.lang.String str14 = livro4.getAutor();
        livro4.removerCopias(22);
        java.lang.String str17 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test03412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03412");
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
        livro4.removerCopias(30);
        livro4.devolver();
        int int18 = livro4.getCopiasDisponiveis();
        java.lang.String str19 = livro4.getAutor();
        livro4.adicionarCopias(262);
        livro4.adicionarCopias(141);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 30 + "'", int18 == 30);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test03413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03413");
        imd.Livro livro4 = new imd.Livro("", "hi!", 142, 126);
        livro4.emprestar();
    }

    @Test
    public void test03414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03414");
        imd.Livro livro4 = new imd.Livro("", "hi!", 129, (int) 'a');
    }

    @Test
    public void test03415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03415");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 51, 51);
        livro4.devolver();
        livro4.removerCopias((int) (short) 0);
        livro4.devolver();
    }

    @Test
    public void test03416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03416");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '#', 60);
        livro4.removerCopias(166);
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03417");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str9 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str11 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03418");
        imd.Livro livro4 = new imd.Livro("", "hi!", 128, 52);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03419");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getCopiasDisponiveis();
        int int13 = livro4.getCopiasDisponiveis();
        int int14 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test03420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03420");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 20, 262);
    }

    @Test
    public void test03421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03421");
        imd.Livro livro4 = new imd.Livro("", "hi!", 36, 265);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03422");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias(41);
        livro4.adicionarCopias(0);
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(127);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test03423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03423");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.devolver();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03424");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 68);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 68 + "'", int5 == 68);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 68 + "'", int6 == 68);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03425");
        imd.Livro livro4 = new imd.Livro("", "hi!", 143, 95);
    }

    @Test
    public void test03426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03426");
        imd.Livro livro4 = new imd.Livro("hi!", "", 10, (int) (byte) -1);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03427");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 100, 69);
    }

    @Test
    public void test03428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03428");
        imd.Livro livro4 = new imd.Livro("", "", 46, 262);
    }

    @Test
    public void test03429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03429");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 97);
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getAutor();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03430");
        imd.Livro livro4 = new imd.Livro("", "hi!", 40, (int) (byte) -1);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test03431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03431");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str9 = livro4.getAutor();
        livro4.adicionarCopias(11);
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03432");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03433");
        imd.Livro livro4 = new imd.Livro("", "", 40, (int) ' ');
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 40 + "'", int5 == 40);
    }

    @Test
    public void test03434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03434");
        imd.Livro livro4 = new imd.Livro("", "", 12, 307);
    }

    @Test
    public void test03435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03435");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        livro4.adicionarCopias(91);
        livro4.devolver();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03436");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 246, (int) (short) 0);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test03437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03437");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 0);
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test03438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03438");
        imd.Livro livro4 = new imd.Livro("", "hi!", 101, (int) (short) 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(2);
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test03439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03439");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 33);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03440");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 10, 33);
        livro4.removerCopias(11);
        livro4.removerCopias(2);
        livro4.removerCopias((int) '4');
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test03441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03441");
        imd.Livro livro4 = new imd.Livro("", "", 265, 141);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getTitulo();
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 141 + "'", int8 == 141);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test03442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03442");
        imd.Livro livro4 = new imd.Livro("", "", 262, 167);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03443");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, 22);
        livro4.adicionarCopias(41);
        livro4.removerCopias(265);
    }

    @Test
    public void test03444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03444");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 97, (int) (byte) 1);
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        livro4.emprestar();
        livro4.adicionarCopias(38);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test03445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03445");
        imd.Livro livro4 = new imd.Livro("hi!", "", 139, 166);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 166 + "'", int5 == 166);
    }

    @Test
    public void test03446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03446");
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
        java.lang.String str18 = livro4.getAutor();
        java.lang.String str19 = livro4.getTitulo();
        int int20 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test03447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03447");
        imd.Livro livro4 = new imd.Livro("", "", 100, 269);
        livro4.removerCopias(175);
    }

    @Test
    public void test03448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03448");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) '4', 0);
        livro4.adicionarCopias(1);
        java.lang.String str7 = livro4.getTitulo();
        java.lang.String str8 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test03449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03449");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 128, 41);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(53);
        livro4.removerCopias(140);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test03450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03450");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, (int) (short) 100);
        livro4.removerCopias(46);
        livro4.removerCopias(50);
        java.lang.String str9 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test03451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03451");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias((int) (short) 10);
        livro4.devolver();
        livro4.removerCopias(130);
        java.lang.String str14 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test03452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03452");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test03453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03453");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.adicionarCopias(10);
        livro4.emprestar();
        livro4.adicionarCopias(99);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
    }

    @Test
    public void test03454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03454");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias((int) (byte) 10);
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03455");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((-1));
        livro4.removerCopias(21);
        java.lang.String str14 = livro4.getAutor();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03456");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        livro4.devolver();
        livro4.removerCopias((int) (byte) -1);
        livro4.emprestar();
        int int16 = livro4.getPaginas();
        int int17 = livro4.getPaginas();
        livro4.adicionarCopias(246);
        livro4.adicionarCopias(274);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test03457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03457");
        imd.Livro livro4 = new imd.Livro("", "", 21, (int) '4');
        livro4.adicionarCopias(30);
        livro4.devolver();
        livro4.removerCopias(29);
    }

    @Test
    public void test03458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03458");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias(0);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test03459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03459");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 126, 141);
        livro4.adicionarCopias(0);
        java.lang.String str7 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test03460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03460");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 97, (int) (short) 100);
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        livro4.adicionarCopias(34);
        livro4.removerCopias(36);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test03461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03461");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 106, 30);
        livro4.removerCopias(69);
        livro4.removerCopias(50);
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30 + "'", int10 == 30);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03462");
        imd.Livro livro4 = new imd.Livro("", "", 28, 101);
        livro4.emprestar();
    }

    @Test
    public void test03463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03463");
        imd.Livro livro4 = new imd.Livro("hi!", "", 132, 134);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03464");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test03465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03465");
        imd.Livro livro4 = new imd.Livro("", "", 171, 53);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(7);
        int int8 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 171 + "'", int8 == 171);
    }

    @Test
    public void test03466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03466");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias((int) (byte) 1);
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 100);
        java.lang.String str12 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test03467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03467");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(67);
        livro4.emprestar();
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test03468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03468");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 74, 40);
    }

    @Test
    public void test03469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03469");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) ' ');
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        int int12 = livro4.getPaginas();
        int int13 = livro4.getPaginas();
        livro4.adicionarCopias(126);
        livro4.removerCopias(195);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test03470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03470");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getAutor();
        livro4.adicionarCopias(29);
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03471");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 128, 19);
    }

    @Test
    public void test03472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03472");
        imd.Livro livro4 = new imd.Livro("hi!", "", 143, 43);
    }

    @Test
    public void test03473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03473");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias(22);
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test03474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03474");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 10);
        int int15 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(134);
        int int18 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test03475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03475");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (short) 0);
        livro4.devolver();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getCopiasDisponiveis();
        int int13 = livro4.getPaginas();
        livro4.adicionarCopias(133);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test03476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03476");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 97, (int) (byte) 1);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03477");
        imd.Livro livro4 = new imd.Livro("", "hi!", 304, 93);
    }

    @Test
    public void test03478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03478");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test03479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03479");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 12, 9);
    }

    @Test
    public void test03480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03480");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(265);
        java.lang.String str12 = livro4.getAutor();
        java.lang.String str13 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03481");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(1);
        livro4.emprestar();
        java.lang.String str13 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03482");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias(51);
        int int14 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(81);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
    }

    @Test
    public void test03483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03483");
        imd.Livro livro4 = new imd.Livro("hi!", "", 31, 10);
        livro4.removerCopias((int) 'a');
        livro4.removerCopias(91);
        livro4.removerCopias(53);
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03484");
        imd.Livro livro4 = new imd.Livro("", "", (int) '#', (int) ' ');
        livro4.adicionarCopias(22);
        livro4.adicionarCopias(60);
        livro4.adicionarCopias(140);
    }

    @Test
    public void test03485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03485");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias((int) '#');
        livro4.devolver();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.adicionarCopias(36);
        int int18 = livro4.getPaginas();
        int int19 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass20 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test03486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03486");
        imd.Livro livro4 = new imd.Livro("hi!", "", 238, 71);
    }

    @Test
    public void test03487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03487");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 10, 34);
        livro4.adicionarCopias(139);
    }

    @Test
    public void test03488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03488");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', (int) '#');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        livro4.removerCopias(31);
        livro4.adicionarCopias((int) (short) -1);
        livro4.adicionarCopias(4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03489");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 0, (int) (byte) 1);
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test03490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03490");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        livro4.devolver();
        livro4.removerCopias(46);
        java.lang.String str17 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test03491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03491");
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
        livro4.removerCopias(30);
        livro4.devolver();
        int int18 = livro4.getCopiasDisponiveis();
        int int19 = livro4.getPaginas();
        livro4.adicionarCopias((-1));
        int int22 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass24 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 30 + "'", int18 == 30);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test03492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03492");
        imd.Livro livro4 = new imd.Livro("", "", 165, 40);
        livro4.adicionarCopias(2);
        int int7 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
    }

    @Test
    public void test03493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03493");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(30);
        livro4.emprestar();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(36);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test03494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03494");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias(97);
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03495");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 41, 36);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 41 + "'", int5 == 41);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 41 + "'", int7 == 41);
    }

    @Test
    public void test03496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03496");
        imd.Livro livro4 = new imd.Livro("", "", 67, 38);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03497");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(30);
        livro4.emprestar();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03498");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test03499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03499");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.removerCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        livro4.removerCopias(171);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test03500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03500");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(67);
        java.lang.String str12 = livro4.getTitulo();
        livro4.adicionarCopias(22);
        java.lang.String str15 = livro4.getAutor();
        livro4.adicionarCopias(64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }
}

