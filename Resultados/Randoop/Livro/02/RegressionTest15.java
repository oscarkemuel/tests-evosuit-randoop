import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test07501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07501");
        imd.Livro livro4 = new imd.Livro("", "", 147, 91);
        livro4.removerCopias(243);
    }

    @Test
    public void test07502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07502");
        imd.Livro livro4 = new imd.Livro("", "", 0, (int) (byte) 1);
        int int5 = livro4.getPaginas();
        livro4.removerCopias(91);
        java.lang.String str8 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test07503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07503");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 261, 114);
    }

    @Test
    public void test07504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07504");
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
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(59);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test07505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07505");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) ' ');
        livro4.adicionarCopias(32);
        livro4.removerCopias((int) (byte) 10);
        java.lang.String str13 = livro4.getTitulo();
        int int14 = livro4.getCopiasDisponiveis();
        java.lang.String str15 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test07506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07506");
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
        int int19 = livro4.getCopiasDisponiveis();
        java.lang.String str20 = livro4.getTitulo();
        java.lang.String str21 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 65 + "'", int19 == 65);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test07507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07507");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 1);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test07508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07508");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(29);
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str14 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test07509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07509");
        imd.Livro livro4 = new imd.Livro("", "hi!", 40, (int) (byte) -1);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias(52);
        int int10 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(62);
        livro4.devolver();
        livro4.devolver();
        int int15 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115 + "'", int15 == 115);
    }

    @Test
    public void test07510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07510");
        imd.Livro livro4 = new imd.Livro("", "", (int) '4', 152);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test07511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07511");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 95, 96);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test07512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07512");
        imd.Livro livro4 = new imd.Livro("", "", 100, 101);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test07513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07513");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias(31);
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(93);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test07514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07514");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 100, 67);
        livro4.removerCopias(51);
        livro4.adicionarCopias(89);
    }

    @Test
    public void test07515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07515");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 238, (int) (short) 0);
    }

    @Test
    public void test07516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07516");
        imd.Livro livro4 = new imd.Livro("hi!", "", 31, 21);
        int int5 = livro4.getPaginas();
        livro4.removerCopias((int) '4');
        livro4.emprestar();
        livro4.adicionarCopias(38);
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
    }

    @Test
    public void test07517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07517");
        imd.Livro livro4 = new imd.Livro("hi!", "", 31, 10);
        livro4.removerCopias((int) 'a');
        int int7 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test07518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07518");
        imd.Livro livro4 = new imd.Livro("", "hi!", 177, 114);
    }

    @Test
    public void test07519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07519");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 31, 85);
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 84 + "'", int6 == 84);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test07520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07520");
        imd.Livro livro4 = new imd.Livro("", "hi!", 10, 130);
        livro4.adicionarCopias(47);
    }

    @Test
    public void test07521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07521");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((-1));
        livro4.removerCopias(21);
        livro4.removerCopias(126);
        livro4.removerCopias(62);
        int int18 = livro4.getPaginas();
        int int19 = livro4.getPaginas();
        java.lang.String str20 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test07522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07522");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 0);
        livro4.adicionarCopias(98);
        livro4.emprestar();
        int int13 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test07523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07523");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(29);
        int int12 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(236);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test07524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07524");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.devolver();
        int int13 = livro4.getCopiasDisponiveis();
        int int14 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 132 + "'", int13 == 132);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 132 + "'", int14 == 132);
    }

    @Test
    public void test07525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07525");
        imd.Livro livro4 = new imd.Livro("", "", 29, 1);
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        int int7 = livro4.getPaginas();
        int int8 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
    }

    @Test
    public void test07526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07526");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(97);
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(0);
        livro4.devolver();
        int int16 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str18 = livro4.getAutor();
        java.lang.Class<?> wildcardClass19 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test07527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07527");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(0);
        int int10 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias(38);
        livro4.adicionarCopias(148);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test07528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07528");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias(41);
        livro4.adicionarCopias(40);
        livro4.devolver();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test07529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07529");
        imd.Livro livro4 = new imd.Livro("", "hi!", 101, (int) (short) 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(2);
        java.lang.String str8 = livro4.getAutor();
        livro4.devolver();
        int int10 = livro4.getPaginas();
        int int11 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test07530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07530");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (byte) 0);
        livro4.removerCopias(40);
        int int12 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(36);
        livro4.devolver();
        int int17 = livro4.getPaginas();
        int int18 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test07531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07531");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        livro4.emprestar();
        java.lang.String str10 = livro4.getAutor();
        livro4.removerCopias(10);
        livro4.devolver();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(131);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 88 + "'", int14 == 88);
    }

    @Test
    public void test07532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07532");
        imd.Livro livro4 = new imd.Livro("", "", 105, 246);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test07533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07533");
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
        livro4.adicionarCopias((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 126 + "'", int17 == 126);
    }

    @Test
    public void test07534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07534");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 10, 0);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test07535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07535");
        imd.Livro livro4 = new imd.Livro("", "", 36, 242);
        livro4.adicionarCopias(0);
        livro4.emprestar();
        int int8 = livro4.getPaginas();
        livro4.removerCopias(171);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
    }

    @Test
    public void test07536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07536");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) (byte) 0);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 10);
        int int12 = livro4.getCopiasDisponiveis();
        int int13 = livro4.getPaginas();
        livro4.adicionarCopias(200);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test07537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07537");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, (int) (short) 1);
        livro4.removerCopias(127);
        livro4.removerCopias((int) (short) -1);
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getAutor();
        livro4.adicionarCopias(2);
        java.lang.String str13 = livro4.getTitulo();
        livro4.adicionarCopias(97);
        java.lang.String str16 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test07538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07538");
        imd.Livro livro4 = new imd.Livro("", "", 36, 101);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test07539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07539");
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
        livro4.devolver();
        java.lang.Class<?> wildcardClass18 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test07540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07540");
        imd.Livro livro4 = new imd.Livro("", "hi!", 102, (int) '4');
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 102 + "'", int5 == 102);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6 == 102);
    }

    @Test
    public void test07541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07541");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 21, 265);
        livro4.emprestar();
    }

    @Test
    public void test07542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07542");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        livro4.devolver();
        livro4.emprestar();
        livro4.removerCopias((int) (byte) 100);
        livro4.devolver();
        livro4.adicionarCopias(95);
        livro4.adicionarCopias(228);
    }

    @Test
    public void test07543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07543");
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
        livro4.devolver();
        int int18 = livro4.getCopiasDisponiveis();
        java.lang.String str19 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str21 = livro4.getAutor();
        int int22 = livro4.getCopiasDisponiveis();
        int int23 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 242 + "'", int18 == 242);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 241 + "'", int22 == 241);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test07544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07544");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 67, 60);
        livro4.emprestar();
    }

    @Test
    public void test07545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07545");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 97, (int) (byte) 1);
        livro4.removerCopias((int) (short) 1);
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(243);
        livro4.adicionarCopias(71);
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07546");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) '4', 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test07547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07547");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, 147);
    }

    @Test
    public void test07548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07548");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(128);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(142);
        livro4.adicionarCopias(93);
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 130 + "'", int9 == 130);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07549");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) (byte) 0);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 10);
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
    }

    @Test
    public void test07550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07550");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 29, 171);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test07551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07551");
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
        livro4.adicionarCopias(45);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
    }

    @Test
    public void test07552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07552");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 101, 128);
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 137 + "'", int8 == 137);
    }

    @Test
    public void test07553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07553");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(141);
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test07554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07554");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        int int13 = livro4.getPaginas();
        livro4.emprestar();
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test07555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07555");
        imd.Livro livro4 = new imd.Livro("", "hi!", 87, 52);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test07556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07556");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 300, 224);
    }

    @Test
    public void test07557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07557");
        imd.Livro livro4 = new imd.Livro("", "", 124, 212);
    }

    @Test
    public void test07558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07558");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        int int16 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 31 + "'", int13 == 31);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
    }

    @Test
    public void test07559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07559");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 41, (int) (short) 10);
        livro4.adicionarCopias((int) (short) 100);
        livro4.emprestar();
        livro4.adicionarCopias(91);
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test07560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07560");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (byte) 10);
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias(127);
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07561");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(97);
        livro4.adicionarCopias(41);
        livro4.devolver();
        livro4.adicionarCopias(238);
        int int16 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 408 + "'", int16 == 408);
    }

    @Test
    public void test07562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07562");
        imd.Livro livro4 = new imd.Livro("", "hi!", 127, 164);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 164 + "'", int5 == 164);
    }

    @Test
    public void test07563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07563");
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
        livro4.adicionarCopias(265);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test07564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07564");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.devolver();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(60);
        int int14 = livro4.getPaginas();
        int int15 = livro4.getCopiasDisponiveis();
        java.lang.String str16 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test07565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07565");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getAutor();
        livro4.removerCopias((int) ' ');
        int int14 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test07566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07566");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias(69);
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getAutor();
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 71 + "'", int12 == 71);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test07567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07567");
        imd.Livro livro4 = new imd.Livro("hi!", "", 53, 0);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test07568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07568");
        imd.Livro livro4 = new imd.Livro("hi!", "", 50, 34);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test07569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07569");
        imd.Livro livro4 = new imd.Livro("", "hi!", 24, 0);
    }

    @Test
    public void test07570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07570");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), 68);
        livro4.removerCopias(172);
    }

    @Test
    public void test07571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07571");
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
        int int18 = livro4.getPaginas();
        livro4.removerCopias(383);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test07572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07572");
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
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test07573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07573");
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
        livro4.devolver();
        java.lang.String str17 = livro4.getAutor();
        int int18 = livro4.getCopiasDisponiveis();
        int int19 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str21 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test07574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07574");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        livro4.removerCopias(92);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test07575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07575");
        imd.Livro livro4 = new imd.Livro("hi!", "", 50, 34);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
    }

    @Test
    public void test07576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07576");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 139, (int) (short) 100);
    }

    @Test
    public void test07577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07577");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test07578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07578");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', 67);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07579");
        imd.Livro livro4 = new imd.Livro("", "", 80, 266);
    }

    @Test
    public void test07580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07580");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((-1));
        livro4.removerCopias(21);
        int int14 = livro4.getPaginas();
        java.lang.String str15 = livro4.getTitulo();
        livro4.removerCopias(89);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test07581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07581");
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
        livro4.devolver();
        java.lang.String str18 = livro4.getTitulo();
        livro4.adicionarCopias(60);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test07582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07582");
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
        livro4.adicionarCopias(141);
        livro4.removerCopias(101);
        int int21 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(44);
        int int24 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 62 + "'", int21 == 62);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test07583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07583");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias(242);
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.String str12 = livro4.getTitulo();
        livro4.adicionarCopias(92);
        int int15 = livro4.getPaginas();
        java.lang.String str16 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 274 + "'", int11 == 274);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test07584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07584");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((-1));
        int int12 = livro4.getPaginas();
        java.lang.String str13 = livro4.getAutor();
        livro4.adicionarCopias(78);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test07585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07585");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (byte) 0);
        livro4.removerCopias(40);
        livro4.emprestar();
        java.lang.String str13 = livro4.getAutor();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test07586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07586");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        livro4.devolver();
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07587");
        imd.Livro livro4 = new imd.Livro("hi!", "", 1, 106);
        livro4.removerCopias((int) (short) 100);
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test07588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07588");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 31);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test07589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07589");
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
        livro4.emprestar();
        java.lang.String str18 = livro4.getTitulo();
        int int19 = livro4.getPaginas();
        int int20 = livro4.getPaginas();
        java.lang.String str21 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test07590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07590");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.removerCopias(24);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
    }

    @Test
    public void test07591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07591");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(32);
        livro4.adicionarCopias(132);
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07592");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(32);
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test07593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07593");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, (int) ' ');
        livro4.devolver();
        livro4.adicionarCopias(158);
        livro4.adicionarCopias((-1));
    }

    @Test
    public void test07594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07594");
        imd.Livro livro4 = new imd.Livro("hi!", "", 66, 127);
        livro4.emprestar();
        livro4.removerCopias(41);
        livro4.emprestar();
        java.lang.String str9 = livro4.getAutor();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07595");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str13 = livro4.getAutor();
        java.lang.String str14 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test07596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07596");
        imd.Livro livro4 = new imd.Livro("hi!", "", 23, 70);
    }

    @Test
    public void test07597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07597");
        imd.Livro livro4 = new imd.Livro("", "hi!", 100, 127);
        livro4.adicionarCopias(0);
    }

    @Test
    public void test07598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07598");
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
        int int21 = livro4.getPaginas();
        livro4.removerCopias(51);
        int int24 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test07599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07599");
        imd.Livro livro4 = new imd.Livro("", "", 0, 9);
        livro4.devolver();
        livro4.adicionarCopias(50);
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test07600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07600");
        imd.Livro livro4 = new imd.Livro("", "", 127, (int) (byte) 0);
        int int5 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 127 + "'", int5 == 127);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test07601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07601");
        imd.Livro livro4 = new imd.Livro("hi!", "", 130, 94);
    }

    @Test
    public void test07602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07602");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 0, (int) (byte) 1);
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(290);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test07603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07603");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(97);
        livro4.removerCopias(101);
        livro4.removerCopias(33);
        livro4.removerCopias(164);
        livro4.adicionarCopias(46);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test07604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07604");
        imd.Livro livro4 = new imd.Livro("hi!", "", 236, 370);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07605");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 10, 33);
        livro4.removerCopias(11);
        livro4.removerCopias(2);
        livro4.devolver();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str12 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 21 + "'", int10 == 21);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test07606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07606");
        imd.Livro livro4 = new imd.Livro("", "", 32, 158);
    }

    @Test
    public void test07607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07607");
        imd.Livro livro4 = new imd.Livro("hi!", "", 164, 269);
    }

    @Test
    public void test07608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07608");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) ' ');
        livro4.adicionarCopias(32);
        livro4.removerCopias((int) (byte) 10);
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test07609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07609");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.removerCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str10 = livro4.getAutor();
        livro4.removerCopias(130);
        int int13 = livro4.getPaginas();
        livro4.adicionarCopias(46);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test07610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07610");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.adicionarCopias(130);
        int int14 = livro4.getCopiasDisponiveis();
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 261 + "'", int14 == 261);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test07611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07611");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(97);
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(65);
        livro4.adicionarCopias(30);
        livro4.removerCopias(102);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test07612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07612");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias((int) '#');
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getAutor();
        livro4.removerCopias(42);
        java.lang.String str15 = livro4.getTitulo();
        int int16 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test07613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07613");
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
        int int15 = livro4.getCopiasDisponiveis();
        java.lang.String str16 = livro4.getAutor();
        livro4.adicionarCopias(101);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass20 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test07614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07614");
        imd.Livro livro4 = new imd.Livro("", "", 34, 63);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07615");
        imd.Livro livro4 = new imd.Livro("", "hi!", 32, 0);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test07616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07616");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.adicionarCopias(32);
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test07617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07617");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, (int) (short) 1);
        livro4.removerCopias(127);
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(20);
        int int11 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
    }

    @Test
    public void test07618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07618");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(97);
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        livro4.devolver();
        livro4.devolver();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test07619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07619");
        imd.Livro livro4 = new imd.Livro("hi!", "", 0, 97);
        livro4.removerCopias(36);
        livro4.adicionarCopias((int) (short) 10);
        livro4.removerCopias(39);
        livro4.removerCopias(273);
    }

    @Test
    public void test07620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07620");
        imd.Livro livro4 = new imd.Livro("", "hi!", 158, 147);
    }

    @Test
    public void test07621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07621");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 20);
        livro4.removerCopias(23);
    }

    @Test
    public void test07622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07622");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.adicionarCopias((int) (short) 0);
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test07623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07623");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 223, (int) (short) 0);
        livro4.adicionarCopias(383);
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test07624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07624");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias(31);
        int int7 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        int int10 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str12 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test07625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07625");
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
        livro4.emprestar();
        livro4.removerCopias(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test07626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07626");
        imd.Livro livro4 = new imd.Livro("", "", 60, 81);
    }

    @Test
    public void test07627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07627");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) -1, 102);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.removerCopias(30);
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 82 + "'", int10 == 82);
    }

    @Test
    public void test07628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07628");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getAutor();
        livro4.devolver();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07629");
        imd.Livro livro4 = new imd.Livro("", "", 40, (int) (short) 0);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias(51);
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 40 + "'", int5 == 40);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test07630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07630");
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
        java.lang.String str17 = livro4.getAutor();
        livro4.devolver();
        int int19 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        int int22 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(101);
        java.lang.String str25 = livro4.getAutor();
        java.lang.String str26 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 28 + "'", int22 == 28);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test07631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07631");
        imd.Livro livro4 = new imd.Livro("", "hi!", 97, (int) (byte) 10);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getAutor();
        livro4.emprestar();
        livro4.adicionarCopias(35);
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07632");
        imd.Livro livro4 = new imd.Livro("", "", 47, 119);
    }

    @Test
    public void test07633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07633");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias(269);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test07634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07634");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(0);
        java.lang.String str10 = livro4.getAutor();
        livro4.adicionarCopias(67);
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07635");
        imd.Livro livro4 = new imd.Livro("hi!", "", 1, 106);
        livro4.removerCopias(64);
        java.lang.String str7 = livro4.getTitulo();
        java.lang.String str8 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test07636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07636");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.removerCopias((int) (byte) 1);
        livro4.devolver();
        livro4.adicionarCopias(43);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test07637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07637");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 10, 10);
    }

    @Test
    public void test07638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07638");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias(21);
        int int14 = livro4.getCopiasDisponiveis();
        int int15 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.removerCopias(130);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test07639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07639");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 97, 11);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test07640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07640");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.devolver();
        livro4.emprestar();
        livro4.adicionarCopias((int) (short) 1);
        livro4.adicionarCopias(242);
        livro4.removerCopias(32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test07641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07641");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias((int) (byte) 1);
        livro4.devolver();
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test07642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07642");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.adicionarCopias((int) (byte) -1);
        livro4.adicionarCopias((int) (short) 100);
        livro4.emprestar();
        int int13 = livro4.getPaginas();
        livro4.adicionarCopias(158);
        java.lang.String str16 = livro4.getTitulo();
        livro4.adicionarCopias(52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test07643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07643");
        imd.Livro livro4 = new imd.Livro("", "", 0, 36);
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        livro4.adicionarCopias(69);
        java.lang.String str9 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test07644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07644");
        imd.Livro livro4 = new imd.Livro("", "hi!", 134, 0);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 134 + "'", int5 == 134);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test07645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07645");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 51, 51);
        livro4.devolver();
        livro4.removerCopias(100);
        livro4.devolver();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        livro4.adicionarCopias(71);
        int int14 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
    }

    @Test
    public void test07646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07646");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 97);
        livro4.emprestar();
        livro4.devolver();
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test07647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07647");
        imd.Livro livro4 = new imd.Livro("", "", 1, 41);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.adicionarCopias((int) (short) 100);
        livro4.removerCopias(63);
        livro4.adicionarCopias(240);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 41 + "'", int5 == 41);
    }

    @Test
    public void test07648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07648");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 66, (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias(65);
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 66 + "'", int11 == 66);
    }

    @Test
    public void test07649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07649");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (byte) 10);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias(128);
        livro4.removerCopias(2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test07650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07650");
        imd.Livro livro4 = new imd.Livro("", "", 32, 9);
        livro4.removerCopias((int) (byte) 0);
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test07651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07651");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 20, 274);
        livro4.emprestar();
        livro4.adicionarCopias(199);
    }

    @Test
    public void test07652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07652");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 22, 52);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
    }

    @Test
    public void test07653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07653");
        imd.Livro livro4 = new imd.Livro("", "", 130, 0);
        livro4.adicionarCopias(8);
        java.lang.String str7 = livro4.getAutor();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test07654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07654");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 93);
    }

    @Test
    public void test07655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07655");
        imd.Livro livro4 = new imd.Livro("hi!", "", 52, 0);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test07656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07656");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 0);
        java.lang.String str5 = livro4.getAutor();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test07657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07657");
        imd.Livro livro4 = new imd.Livro("", "hi!", 101, (int) (short) 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.adicionarCopias(32);
        java.lang.String str8 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias(246);
        livro4.emprestar();
        int int13 = livro4.getCopiasDisponiveis();
        int int14 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test07658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07658");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 32, 96);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getAutor();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test07659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07659");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(24);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
    }

    @Test
    public void test07660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07660");
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
        livro4.devolver();
        int int18 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(11);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass22 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 242 + "'", int18 == 242);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test07661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07661");
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
        java.lang.String str20 = livro4.getAutor();
        int int21 = livro4.getPaginas();
        int int22 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test07662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07662");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias(67);
        livro4.adicionarCopias(167);
        livro4.removerCopias(28);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test07663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07663");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int9 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias((-1));
        livro4.adicionarCopias(22);
        livro4.removerCopias(149);
        livro4.emprestar();
        livro4.removerCopias(158);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test07664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07664");
        imd.Livro livro4 = new imd.Livro("hi!", "", 0, 304);
        livro4.devolver();
    }

    @Test
    public void test07665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07665");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(137);
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias(70);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test07666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07666");
        imd.Livro livro4 = new imd.Livro("", "", 114, 39);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 114 + "'", int5 == 114);
    }

    @Test
    public void test07667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07667");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias(31);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test07668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07668");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.emprestar();
        livro4.adicionarCopias(51);
        livro4.devolver();
        livro4.removerCopias(181);
        livro4.adicionarCopias(242);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test07669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07669");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, (int) (short) 1);
        livro4.removerCopias(127);
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getAutor();
        livro4.emprestar();
        livro4.adicionarCopias(0);
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test07670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07670");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 77, 34);
    }

    @Test
    public void test07671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07671");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) '4', 0);
        livro4.devolver();
        livro4.devolver();
    }

    @Test
    public void test07672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07672");
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
        int int19 = livro4.getPaginas();
        java.lang.String str20 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test07673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07673");
        imd.Livro livro4 = new imd.Livro("", "", 246, 91);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(96);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias(158);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test07674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07674");
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
        java.lang.String str17 = livro4.getTitulo();
        livro4.adicionarCopias(84);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test07675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07675");
        imd.Livro livro4 = new imd.Livro("hi!", "", 128, (int) (short) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        livro4.removerCopias(65);
        livro4.devolver();
    }

    @Test
    public void test07676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07676");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        livro4.adicionarCopias(1);
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test07677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07677");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(10);
        livro4.devolver();
        java.lang.String str13 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test07678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07678");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 0, (int) ' ');
        livro4.emprestar();
        livro4.removerCopias(102);
    }

    @Test
    public void test07679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07679");
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
        livro4.devolver();
        livro4.removerCopias((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test07680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07680");
        imd.Livro livro4 = new imd.Livro("", "hi!", 132, (int) (byte) 10);
        livro4.adicionarCopias(49);
    }

    @Test
    public void test07681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07681");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((-1));
        livro4.devolver();
        int int13 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str15 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test07682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07682");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.emprestar();
        int int14 = livro4.getPaginas();
        java.lang.String str15 = livro4.getTitulo();
        livro4.adicionarCopias(50);
        java.lang.String str18 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test07683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07683");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 0, 110);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test07684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07684");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias(42);
        livro4.removerCopias(52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test07685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07685");
        imd.Livro livro4 = new imd.Livro("hi!", "", 215, 141);
    }

    @Test
    public void test07686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07686");
        imd.Livro livro4 = new imd.Livro("hi!", "", 65, (int) (short) 1);
        livro4.removerCopias(33);
        java.lang.String str7 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test07687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07687");
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
        livro4.emprestar();
        livro4.adicionarCopias(101);
        int int19 = livro4.getPaginas();
        java.lang.String str20 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test07688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07688");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', (int) '#');
        livro4.emprestar();
        livro4.devolver();
        livro4.devolver();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test07689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07689");
        imd.Livro livro4 = new imd.Livro("hi!", "", 19, 323);
    }

    @Test
    public void test07690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07690");
        imd.Livro livro4 = new imd.Livro("", "", (int) '#', (int) ' ');
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getAutor();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test07691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07691");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getAutor();
        livro4.devolver();
        int int9 = livro4.getPaginas();
        java.lang.String str10 = livro4.getAutor();
        livro4.adicionarCopias(39);
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07692");
        imd.Livro livro4 = new imd.Livro("hi!", "", 32, 304);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test07693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07693");
        imd.Livro livro4 = new imd.Livro("hi!", "", 0, 52);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test07694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07694");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(181);
        livro4.removerCopias(165);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test07695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07695");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.devolver();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(40);
        livro4.removerCopias(236);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test07696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07696");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias(42);
        livro4.removerCopias((int) (byte) -1);
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        java.lang.String str13 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test07697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07697");
        imd.Livro livro4 = new imd.Livro("hi!", "", 1, (int) '#');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test07698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07698");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getAutor();
        livro4.devolver();
        livro4.devolver();
        livro4.removerCopias(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test07699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07699");
        imd.Livro livro4 = new imd.Livro("hi!", "", 50, 50);
        livro4.devolver();
        livro4.emprestar();
        livro4.removerCopias(171);
    }

    @Test
    public void test07700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07700");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias(243);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test07701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07701");
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
        livro4.adicionarCopias(19);
        java.lang.String str21 = livro4.getAutor();
        int int22 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 59 + "'", int22 == 59);
    }

    @Test
    public void test07702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07702");
        imd.Livro livro4 = new imd.Livro("", "", (int) '#', 127);
        livro4.adicionarCopias(22);
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test07703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07703");
        imd.Livro livro4 = new imd.Livro("", "", 40, (int) (short) 0);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias(35);
        livro4.removerCopias((int) (short) 100);
        livro4.devolver();
        livro4.devolver();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test07704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07704");
        imd.Livro livro4 = new imd.Livro("", "", (int) '#', 22);
    }

    @Test
    public void test07705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07705");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.emprestar();
        livro4.removerCopias(84);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 30 + "'", int13 == 30);
    }

    @Test
    public void test07706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07706");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        livro4.emprestar();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        livro4.adicionarCopias(149);
        livro4.devolver();
        java.lang.String str15 = livro4.getAutor();
        int int16 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test07707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07707");
        imd.Livro livro4 = new imd.Livro("", "hi!", 131, 38);
    }

    @Test
    public void test07708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07708");
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
        int int16 = livro4.getPaginas();
        livro4.adicionarCopias(130);
        int int19 = livro4.getCopiasDisponiveis();
        java.lang.String str20 = livro4.getTitulo();
        java.lang.String str21 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 152 + "'", int19 == 152);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test07709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07709");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 126, 141);
        livro4.emprestar();
    }

    @Test
    public void test07710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07710");
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
        int int21 = livro4.getCopiasDisponiveis();
        java.lang.String str22 = livro4.getTitulo();
        java.lang.String str23 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 40 + "'", int21 == 40);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test07711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07711");
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
        int int23 = livro4.getCopiasDisponiveis();
        int int24 = livro4.getCopiasDisponiveis();
        java.lang.String str25 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 215 + "'", int23 == 215);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 215 + "'", int24 == 215);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test07712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07712");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 0, (-1));
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        livro4.removerCopias(8);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test07713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07713");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        livro4.devolver();
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getPaginas();
        livro4.adicionarCopias(171);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test07714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07714");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test07715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07715");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 51, 51);
        livro4.devolver();
        livro4.removerCopias((int) (short) 0);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test07716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07716");
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
        java.lang.String str15 = livro4.getAutor();
        livro4.removerCopias(152);
        livro4.adicionarCopias(93);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test07717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07717");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.devolver();
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) -1);
        int int15 = livro4.getCopiasDisponiveis();
        int int16 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 31 + "'", int16 == 31);
    }

    @Test
    public void test07718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07718");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(97);
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(65);
        livro4.adicionarCopias(30);
        livro4.emprestar();
        int int20 = livro4.getPaginas();
        java.lang.String str21 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test07719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07719");
        imd.Livro livro4 = new imd.Livro("", "", 60, 0);
        livro4.emprestar();
    }

    @Test
    public void test07720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07720");
        imd.Livro livro4 = new imd.Livro("", "", 246, 91);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(96);
        livro4.adicionarCopias(346);
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07721");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str12 = livro4.getTitulo();
        int int13 = livro4.getPaginas();
        livro4.adicionarCopias(30);
        int int16 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(195);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 71 + "'", int16 == 71);
    }

    @Test
    public void test07722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07722");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.adicionarCopias(51);
        livro4.emprestar();
        livro4.devolver();
        int int16 = livro4.getPaginas();
        livro4.removerCopias(0);
        int int19 = livro4.getPaginas();
        java.lang.String str20 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test07723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07723");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.removerCopias((int) (byte) 1);
        java.lang.String str14 = livro4.getTitulo();
        int int15 = livro4.getCopiasDisponiveis();
        java.lang.String str16 = livro4.getTitulo();
        livro4.adicionarCopias(34);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40 + "'", int15 == 40);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test07724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07724");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getPaginas();
        java.lang.String str13 = livro4.getAutor();
        livro4.emprestar();
        livro4.emprestar();
        int int16 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test07725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07725");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07726");
        imd.Livro livro4 = new imd.Livro("hi!", "", 408, 174);
    }

    @Test
    public void test07727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07727");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 97, (int) (byte) 1);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getTitulo();
        livro4.removerCopias(145);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test07728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07728");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 10);
        int int8 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(141);
        livro4.devolver();
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 42 + "'", int8 == 42);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test07729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07729");
        imd.Livro livro4 = new imd.Livro("hi!", "", 242, 127);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(149);
        livro4.devolver();
        livro4.adicionarCopias(246);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 127 + "'", int5 == 127);
    }

    @Test
    public void test07730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07730");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) ' ');
        livro4.adicionarCopias(32);
        livro4.removerCopias((int) (byte) 10);
        java.lang.String str13 = livro4.getTitulo();
        int int14 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str16 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test07731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07731");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(128);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(142);
        java.lang.String str12 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 130 + "'", int9 == 130);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test07732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07732");
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
        java.lang.String str20 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test07733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07733");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        livro4.removerCopias(31);
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test07734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07734");
        imd.Livro livro4 = new imd.Livro("", "hi!", 166, 35);
        livro4.devolver();
        livro4.removerCopias(97);
        livro4.emprestar();
    }

    @Test
    public void test07735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07735");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 68);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 68 + "'", int5 == 68);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test07736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07736");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 1, 134);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test07737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07737");
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
        livro4.adicionarCopias(64);
        java.lang.String str17 = livro4.getAutor();
        int int18 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(106);
        int int21 = livro4.getCopiasDisponiveis();
        java.lang.String str22 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 130 + "'", int18 == 130);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24 + "'", int21 == 24);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test07738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07738");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (byte) 10);
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str7 = livro4.getTitulo();
        livro4.removerCopias(42);
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test07739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07739");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getAutor();
        livro4.removerCopias(177);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test07740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07740");
        imd.Livro livro4 = new imd.Livro("", "hi!", 243, 96);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 243 + "'", int5 == 243);
    }

    @Test
    public void test07741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07741");
        imd.Livro livro4 = new imd.Livro("hi!", "", 285, 311);
    }

    @Test
    public void test07742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07742");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 3, 140);
    }

    @Test
    public void test07743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07743");
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
        livro4.adicionarCopias(2);
        livro4.removerCopias(224);
        livro4.adicionarCopias(45);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test07744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07744");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) -1, 67);
        livro4.devolver();
        livro4.adicionarCopias(53);
        livro4.adicionarCopias(194);
    }

    @Test
    public void test07745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07745");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 23, 87);
    }

    @Test
    public void test07746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07746");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias((int) '#');
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getTitulo();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.adicionarCopias(175);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test07747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07747");
        imd.Livro livro4 = new imd.Livro("", "hi!", 31, 101);
        livro4.devolver();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
    }

    @Test
    public void test07748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07748");
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
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str20 = livro4.getTitulo();
        int int21 = livro4.getPaginas();
        int int22 = livro4.getPaginas();
        java.lang.String str23 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test07749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07749");
        imd.Livro livro4 = new imd.Livro("", "hi!", 1, 254);
    }

    @Test
    public void test07750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07750");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getAutor();
        livro4.removerCopias((int) (short) 1);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test07751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07751");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(128);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(64);
        livro4.removerCopias(60);
        java.lang.String str14 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 130 + "'", int9 == 130);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test07752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07752");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 97);
        livro4.emprestar();
        livro4.devolver();
        livro4.removerCopias(97);
        livro4.devolver();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07753");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias(242);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(33);
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias(87);
        java.lang.String str18 = livro4.getTitulo();
        livro4.adicionarCopias(115);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 274 + "'", int11 == 274);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test07754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07754");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias(41);
        livro4.adicionarCopias(0);
        java.lang.String str14 = livro4.getAutor();
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test07755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07755");
        imd.Livro livro4 = new imd.Livro("", "", 0, 41);
        livro4.adicionarCopias((int) '4');
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test07756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07756");
        imd.Livro livro4 = new imd.Livro("", "hi!", 83, 204);
    }

    @Test
    public void test07757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07757");
        imd.Livro livro4 = new imd.Livro("hi!", "", 29, 42);
        livro4.devolver();
        livro4.emprestar();
    }

    @Test
    public void test07758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07758");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.removerCopias(47);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test07759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07759");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test07760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07760");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 100, (int) (byte) 0);
        livro4.adicionarCopias(38);
        livro4.removerCopias(35);
    }

    @Test
    public void test07761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07761");
        imd.Livro livro4 = new imd.Livro("", "hi!", 101, (int) (short) 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        livro4.removerCopias(261);
        int int9 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test07762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07762");
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
        java.lang.String str17 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test07763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07763");
        imd.Livro livro4 = new imd.Livro("", "", 95, (int) (byte) 1);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 95 + "'", int5 == 95);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 95 + "'", int6 == 95);
    }

    @Test
    public void test07764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07764");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getAutor();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        livro4.devolver();
        int int13 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test07765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07765");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 0);
        livro4.adicionarCopias(98);
        livro4.adicionarCopias(91);
        livro4.removerCopias(88);
        int int16 = livro4.getPaginas();
        java.lang.String str17 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test07766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07766");
        imd.Livro livro4 = new imd.Livro("", "hi!", 101, (int) (short) 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.adicionarCopias(32);
        livro4.removerCopias(39);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test07767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07767");
        imd.Livro livro4 = new imd.Livro("", "hi!", 84, 70);
    }

    @Test
    public void test07768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07768");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 246, 31);
    }

    @Test
    public void test07769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07769");
        imd.Livro livro4 = new imd.Livro("", "hi!", 36, (-1));
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test07770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07770");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 23, 22);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 23 + "'", int5 == 23);
    }

    @Test
    public void test07771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07771");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 31);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (short) 0);
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
    }

    @Test
    public void test07772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07772");
        imd.Livro livro4 = new imd.Livro("", "", 168, 8);
    }

    @Test
    public void test07773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07773");
        imd.Livro livro4 = new imd.Livro("", "", 72, 147);
    }

    @Test
    public void test07774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07774");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getPaginas();
        livro4.adicionarCopias(32);
        java.lang.String str13 = livro4.getAutor();
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias(39);
        int int18 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test07775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07775");
        imd.Livro livro4 = new imd.Livro("", "hi!", 146, 276);
    }

    @Test
    public void test07776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07776");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getPaginas();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.removerCopias(0);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07777");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getPaginas();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test07778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07778");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 39, 179);
    }

    @Test
    public void test07779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07779");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test07780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07780");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) '4');
        livro4.removerCopias(11);
        int int14 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.devolver();
        int int17 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test07781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07781");
        imd.Livro livro4 = new imd.Livro("", "", 99, 117);
        livro4.removerCopias(175);
    }

    @Test
    public void test07782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07782");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) (byte) 1);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test07783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07783");
        imd.Livro livro4 = new imd.Livro("hi!", "", 65, (int) (short) 1);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias(118);
        livro4.removerCopias(242);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 65 + "'", int5 == 65);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test07784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07784");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 97);
        livro4.removerCopias(31);
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getPaginas();
        livro4.removerCopias(60);
        livro4.devolver();
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test07785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07785");
        imd.Livro livro4 = new imd.Livro("hi!", "", 52, 128);
        livro4.adicionarCopias(97);
        int int7 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(99);
        livro4.adicionarCopias(133);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 225 + "'", int7 == 225);
    }

    @Test
    public void test07786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07786");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(0);
        livro4.removerCopias(100);
        int int14 = livro4.getPaginas();
        java.lang.String str15 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test07787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07787");
        imd.Livro livro4 = new imd.Livro("hi!", "", 129, 166);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test07788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07788");
        imd.Livro livro4 = new imd.Livro("", "", 158, 274);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test07789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07789");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias((int) '#');
        java.lang.String str12 = livro4.getTitulo();
        livro4.removerCopias(29);
        int int15 = livro4.getPaginas();
        java.lang.String str16 = livro4.getAutor();
        livro4.removerCopias(69);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test07790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07790");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.emprestar();
        livro4.removerCopias(51);
        livro4.devolver();
        livro4.removerCopias(132);
        java.lang.String str19 = livro4.getAutor();
        java.lang.String str20 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test07791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07791");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        livro4.emprestar();
        int int10 = livro4.getPaginas();
        livro4.adicionarCopias(98);
        livro4.adicionarCopias(11);
        java.lang.String str15 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test07792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07792");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (short) 1);
        livro4.emprestar();
        livro4.removerCopias(89);
        int int15 = livro4.getCopiasDisponiveis();
        java.lang.String str16 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test07793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07793");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), (int) (short) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias(38);
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test07794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07794");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test07795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07795");
        imd.Livro livro4 = new imd.Livro("hi!", "", 50, 34);
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str7 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test07796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07796");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.removerCopias((int) (byte) 1);
        java.lang.String str14 = livro4.getTitulo();
        int int15 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40 + "'", int15 == 40);
    }

    @Test
    public void test07797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07797");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(54);
        int int13 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(60);
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07798");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 118, 101);
        livro4.emprestar();
    }

    @Test
    public void test07799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07799");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) ' ');
        livro4.removerCopias((int) (short) -1);
        livro4.adicionarCopias(71);
        int int19 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 137 + "'", int19 == 137);
    }

    @Test
    public void test07800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07800");
        imd.Livro livro4 = new imd.Livro("", "", 1, 41);
        livro4.devolver();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(300);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 42 + "'", int6 == 42);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
    }

    @Test
    public void test07801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07801");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 145, 323);
        livro4.emprestar();
    }

    @Test
    public void test07802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07802");
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
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 128 + "'", int11 == 128);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test07803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07803");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', 66);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getAutor();
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 66 + "'", int8 == 66);
    }

    @Test
    public void test07804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07804");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', (int) '#');
        livro4.emprestar();
        livro4.devolver();
        livro4.devolver();
        livro4.removerCopias(69);
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07805");
        imd.Livro livro4 = new imd.Livro("", "", 130, 69);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 69 + "'", int5 == 69);
    }

    @Test
    public void test07806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07806");
        imd.Livro livro4 = new imd.Livro("hi!", "", 7, 22);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
    }

    @Test
    public void test07807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07807");
        imd.Livro livro4 = new imd.Livro("hi!", "", 383, 72);
    }

    @Test
    public void test07808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07808");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias(66);
        livro4.devolver();
        int int14 = livro4.getCopiasDisponiveis();
        java.lang.String str15 = livro4.getAutor();
        java.lang.String str16 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test07809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07809");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        livro4.emprestar();
        int int10 = livro4.getPaginas();
        java.lang.String str11 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test07810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07810");
        imd.Livro livro4 = new imd.Livro("hi!", "", 195, 162);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 195 + "'", int5 == 195);
    }

    @Test
    public void test07811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07811");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getAutor();
        livro4.removerCopias(106);
        livro4.devolver();
        java.lang.String str14 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test07812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07812");
        imd.Livro livro4 = new imd.Livro("hi!", "", 162, 129);
        livro4.devolver();
        livro4.removerCopias(87);
    }

    @Test
    public void test07813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07813");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(172);
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test07814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07814");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.removerCopias(171);
        livro4.adicionarCopias(130);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test07815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07815");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 53, 98);
        livro4.devolver();
    }

    @Test
    public void test07816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07816");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 0);
        livro4.emprestar();
        java.lang.String str11 = livro4.getAutor();
        livro4.removerCopias(323);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test07817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07817");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        livro4.adicionarCopias(285);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test07818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07818");
        imd.Livro livro4 = new imd.Livro("hi!", "", 127, (int) '#');
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 127 + "'", int5 == 127);
    }

    @Test
    public void test07819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07819");
        imd.Livro livro4 = new imd.Livro("", "", 57, 22);
        livro4.devolver();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test07820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07820");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias(172);
        java.lang.String str10 = livro4.getAutor();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07821");
        imd.Livro livro4 = new imd.Livro("", "hi!", 227, 133);
    }

    @Test
    public void test07822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07822");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(97);
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(65);
        livro4.adicionarCopias(30);
        livro4.emprestar();
        int int20 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(124);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 223 + "'", int20 == 223);
    }

    @Test
    public void test07823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07823");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.devolver();
        livro4.removerCopias(129);
        int int14 = livro4.getCopiasDisponiveis();
        java.lang.String str15 = livro4.getAutor();
        int int16 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test07824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07824");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        livro4.adicionarCopias(10);
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(20);
        int int14 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int16 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test07825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07825");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str11 = livro4.getAutor();
        int int12 = livro4.getPaginas();
        livro4.removerCopias(2);
        int int15 = livro4.getCopiasDisponiveis();
        int int16 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test07826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07826");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, 92);
        livro4.removerCopias(98);
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test07827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07827");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 1, (int) (byte) 10);
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test07828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07828");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test07829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07829");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), (int) '#');
        livro4.removerCopias(22);
        livro4.emprestar();
        livro4.adicionarCopias(101);
        livro4.removerCopias(126);
        java.lang.String str12 = livro4.getTitulo();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        int int16 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 113 + "'", int13 == 113);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test07830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07830");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias(29);
        livro4.devolver();
        livro4.adicionarCopias(274);
        livro4.emprestar();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test07831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07831");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias(66);
        livro4.devolver();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        livro4.removerCopias(23);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test07832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07832");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 1, 142);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test07833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07833");
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
        java.lang.String str16 = livro4.getAutor();
        java.lang.String str17 = livro4.getTitulo();
        livro4.emprestar();
        livro4.devolver();
        livro4.devolver();
        livro4.removerCopias((int) 'a');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test07834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07834");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 68);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 68 + "'", int5 == 68);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 68 + "'", int6 == 68);
    }

    @Test
    public void test07835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07835");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 83, 164);
    }

    @Test
    public void test07836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07836");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.removerCopias((int) (short) -1);
        livro4.removerCopias((-1));
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(140);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
    }

    @Test
    public void test07837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07837");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) -1, 0);
    }

    @Test
    public void test07838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07838");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 106, 0);
        livro4.emprestar();
        livro4.removerCopias(243);
    }

    @Test
    public void test07839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07839");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        java.lang.String str7 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias(50);
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test07840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07840");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 42, 242);
        livro4.removerCopias((-1));
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 243 + "'", int7 == 243);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
    }

    @Test
    public void test07841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07841");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getTitulo();
        livro4.removerCopias(53);
        livro4.adicionarCopias(19);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test07842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07842");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 64, (-1));
        livro4.removerCopias(0);
    }

    @Test
    public void test07843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07843");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.adicionarCopias(51);
        livro4.emprestar();
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str17 = livro4.getTitulo();
        java.lang.String str18 = livro4.getAutor();
        int int19 = livro4.getCopiasDisponiveis();
        java.lang.String str20 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 91 + "'", int19 == 91);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test07844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07844");
        imd.Livro livro4 = new imd.Livro("hi!", "", 113, (int) '#');
        livro4.devolver();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
    }

    @Test
    public void test07845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07845");
        imd.Livro livro4 = new imd.Livro("hi!", "", 106, 32);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test07846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07846");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        java.lang.String str10 = livro4.getAutor();
        livro4.removerCopias(1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test07847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07847");
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
        int int17 = livro4.getPaginas();
        java.lang.String str18 = livro4.getTitulo();
        java.lang.String str19 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass20 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test07848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07848");
        imd.Livro livro4 = new imd.Livro("", "", 33, 1);
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias(134);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test07849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07849");
        imd.Livro livro4 = new imd.Livro("", "hi!", 60, 30);
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test07850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07850");
        imd.Livro livro4 = new imd.Livro("", "hi!", 64, (int) (short) 0);
        livro4.removerCopias(179);
        livro4.adicionarCopias((-1));
        livro4.emprestar();
    }

    @Test
    public void test07851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07851");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias(0);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test07852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07852");
        imd.Livro livro4 = new imd.Livro("", "", 22, (int) (short) 10);
        livro4.adicionarCopias(0);
    }

    @Test
    public void test07853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07853");
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
        livro4.devolver();
        java.lang.String str20 = livro4.getTitulo();
        livro4.removerCopias(65);
        livro4.adicionarCopias(125);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test07854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07854");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(32);
        livro4.adicionarCopias((int) '4');
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test07855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07855");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.devolver();
        livro4.emprestar();
        livro4.adicionarCopias((int) (short) 1);
        java.lang.String str14 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str16 = livro4.getTitulo();
        java.lang.String str17 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test07856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07856");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias(60);
        java.lang.String str13 = livro4.getAutor();
        livro4.emprestar();
        int int15 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07857");
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
        livro4.removerCopias(179);
        java.lang.String str19 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test07858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07858");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) -1, 142);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias(164);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test07859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07859");
        imd.Livro livro4 = new imd.Livro("hi!", "", 10, (int) (byte) -1);
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test07860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07860");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias(21);
        int int9 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias((int) (short) 10);
        livro4.removerCopias((int) '4');
        java.lang.String str15 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test07861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07861");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 41);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test07862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07862");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 0);
        livro4.adicionarCopias(98);
        java.lang.String str12 = livro4.getTitulo();
        livro4.adicionarCopias(2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test07863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07863");
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
        int int16 = livro4.getCopiasDisponiveis();
        int int17 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21 + "'", int16 == 21);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 21 + "'", int17 == 21);
    }

    @Test
    public void test07864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07864");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 41, 36);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(60);
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test07865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07865");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 10);
        livro4.adicionarCopias(97);
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        livro4.adicionarCopias(92);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test07866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07866");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias((int) ' ');
        int int9 = livro4.getPaginas();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((int) (short) 1);
        java.lang.String str13 = livro4.getAutor();
        livro4.devolver();
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test07867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07867");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        livro4.removerCopias(31);
        livro4.removerCopias(67);
        livro4.adicionarCopias(172);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test07868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07868");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 51, 101);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(269);
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test07869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07869");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(0);
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        livro4.devolver();
        livro4.removerCopias(36);
        livro4.removerCopias(101);
        int int16 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test07870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07870");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.removerCopias((int) (short) -1);
        livro4.removerCopias((-1));
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(133);
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
    }

    @Test
    public void test07871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07871");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int9 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias((int) (byte) 0);
        int int13 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(110);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 33 + "'", int13 == 33);
    }

    @Test
    public void test07872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07872");
        imd.Livro livro4 = new imd.Livro("hi!", "", 166, 0);
        livro4.removerCopias(152);
        java.lang.String str7 = livro4.getAutor();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test07873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07873");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias((-1));
        int int12 = livro4.getCopiasDisponiveis();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.String str14 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test07874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07874");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) (byte) 1);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        livro4.emprestar();
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getAutor();
        livro4.adicionarCopias(162);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test07875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07875");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test07876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07876");
        imd.Livro livro4 = new imd.Livro("hi!", "", 0, 30);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test07877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07877");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.devolver();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(152);
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test07878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07878");
        imd.Livro livro4 = new imd.Livro("hi!", "", 39, (int) (byte) -1);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test07879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07879");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str10 = livro4.getAutor();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        livro4.removerCopias(141);
        livro4.removerCopias(53);
        livro4.removerCopias(87);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test07880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07880");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.emprestar();
        livro4.removerCopias(51);
        livro4.devolver();
        livro4.removerCopias(132);
        java.lang.String str19 = livro4.getAutor();
        int int20 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 47 + "'", int20 == 47);
    }

    @Test
    public void test07881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07881");
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
        java.lang.String str18 = livro4.getTitulo();
        java.lang.String str19 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 307 + "'", int17 == 307);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test07882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07882");
        imd.Livro livro4 = new imd.Livro("hi!", "", 224, 6);
        livro4.devolver();
    }

    @Test
    public void test07883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07883");
        imd.Livro livro4 = new imd.Livro("hi!", "", 51, 126);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(212);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test07884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07884");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        livro4.devolver();
        int int13 = livro4.getPaginas();
        java.lang.String str14 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test07885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07885");
        imd.Livro livro4 = new imd.Livro("", "hi!", 64, (int) (short) 0);
        livro4.removerCopias(179);
        livro4.adicionarCopias((int) (byte) 0);
        livro4.emprestar();
    }

    @Test
    public void test07886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07886");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, (int) (short) 1);
        livro4.removerCopias(127);
        livro4.removerCopias((int) (short) -1);
        livro4.adicionarCopias(127);
        int int11 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 129 + "'", int11 == 129);
    }

    @Test
    public void test07887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07887");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 97, (int) (byte) 1);
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test07888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07888");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias((int) (byte) 1);
        livro4.devolver();
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str12 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test07889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07889");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', 66);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test07890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07890");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.String str12 = livro4.getAutor();
        java.lang.String str13 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test07891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07891");
        imd.Livro livro4 = new imd.Livro("hi!", "", 82, (int) ' ');
    }

    @Test
    public void test07892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07892");
        imd.Livro livro4 = new imd.Livro("hi!", "", 97, 102);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test07893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07893");
        imd.Livro livro4 = new imd.Livro("", "hi!", 36, 84);
    }

    @Test
    public void test07894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07894");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str8 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test07895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07895");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 31);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias(0);
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getAutor();
        livro4.adicionarCopias(241);
        livro4.removerCopias(145);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test07896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07896");
        imd.Livro livro4 = new imd.Livro("hi!", "", 152, (int) '#');
        livro4.emprestar();
        livro4.devolver();
    }

    @Test
    public void test07897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07897");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias(31);
        int int7 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        livro4.devolver();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getPaginas();
        livro4.emprestar();
        livro4.emprestar();
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 69 + "'", int11 == 69);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test07898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07898");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        int int12 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        int int16 = livro4.getPaginas();
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test07899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07899");
        imd.Livro livro4 = new imd.Livro("hi!", "", 147, 117);
    }

    @Test
    public void test07900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07900");
        imd.Livro livro4 = new imd.Livro("", "", 130, 141);
        livro4.emprestar();
        livro4.removerCopias(44);
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test07901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07901");
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
        java.lang.String str21 = livro4.getTitulo();
        int int22 = livro4.getPaginas();
        java.lang.String str23 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass24 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test07902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07902");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 1);
        livro4.removerCopias((int) (byte) 10);
        livro4.devolver();
        livro4.removerCopias(51);
        int int18 = livro4.getCopiasDisponiveis();
        java.lang.String str19 = livro4.getAutor();
        livro4.adicionarCopias(88);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 41 + "'", int18 == 41);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test07903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07903");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 41, 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test07904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07904");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 67, 65);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test07905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07905");
        imd.Livro livro4 = new imd.Livro("", "", 42, 98);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.String str6 = livro4.getAutor();
        java.lang.String str7 = livro4.getAutor();
        livro4.emprestar();
        livro4.adicionarCopias((int) 'a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test07906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07906");
        imd.Livro livro4 = new imd.Livro("hi!", "", 9, 40);
        livro4.emprestar();
    }

    @Test
    public void test07907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07907");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(100);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test07908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07908");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 38, (int) (short) -1);
        livro4.emprestar();
    }

    @Test
    public void test07909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07909");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, (int) (short) 1);
        livro4.removerCopias(127);
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str11 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test07910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07910");
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
        livro4.emprestar();
        int int22 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test07911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07911");
        imd.Livro livro4 = new imd.Livro("", "", (int) '4', 0);
        livro4.adicionarCopias(41);
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test07912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07912");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 21, 168);
        livro4.removerCopias(0);
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test07913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07913");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 67, 65);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 65 + "'", int5 == 65);
    }

    @Test
    public void test07914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07914");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 52);
        livro4.emprestar();
    }

    @Test
    public void test07915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07915");
        imd.Livro livro4 = new imd.Livro("", "hi!", 31, 70);
    }

    @Test
    public void test07916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07916");
        imd.Livro livro4 = new imd.Livro("", "", 272, 115);
    }

    @Test
    public void test07917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07917");
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
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test07918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07918");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias((int) '#');
        int int12 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(126);
        livro4.removerCopias(85);
        livro4.devolver();
        livro4.adicionarCopias(254);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 65 + "'", int12 == 65);
    }

    @Test
    public void test07919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07919");
        imd.Livro livro4 = new imd.Livro("", "hi!", 168, 173);
        livro4.adicionarCopias(1);
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test07920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07920");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, (int) (short) 1);
        livro4.removerCopias(127);
        livro4.removerCopias((int) (short) -1);
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getAutor();
        livro4.adicionarCopias(2);
        java.lang.String str13 = livro4.getTitulo();
        livro4.adicionarCopias(97);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test07921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07921");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        livro4.emprestar();
        livro4.devolver();
        livro4.adicionarCopias(101);
        livro4.removerCopias(21);
        int int18 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test07922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07922");
        imd.Livro livro4 = new imd.Livro("hi!", "", 294, 254);
    }

    @Test
    public void test07923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07923");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(164);
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test07924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07924");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), (int) '#');
        livro4.removerCopias(22);
        livro4.emprestar();
        livro4.emprestar();
    }

    @Test
    public void test07925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07925");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 41, 36);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(60);
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias(162);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test07926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07926");
        imd.Livro livro4 = new imd.Livro("", "", 137, (int) (short) 1);
    }

    @Test
    public void test07927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07927");
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
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str19 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test07928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07928");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, 0);
    }

    @Test
    public void test07929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07929");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) ' ');
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias(4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test07930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07930");
        imd.Livro livro4 = new imd.Livro("hi!", "", 172, 195);
        livro4.removerCopias(194);
    }

    @Test
    public void test07931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07931");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        livro4.emprestar();
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str15 = livro4.getTitulo();
        java.lang.String str16 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test07932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07932");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) -1, (int) (byte) 1);
        livro4.devolver();
    }

    @Test
    public void test07933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07933");
        imd.Livro livro4 = new imd.Livro("hi!", "", 276, 7);
        livro4.adicionarCopias(146);
    }

    @Test
    public void test07934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07934");
        imd.Livro livro4 = new imd.Livro("", "", 63, (int) '#');
        livro4.adicionarCopias(134);
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias(99);
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07935");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (byte) 0);
        livro4.removerCopias(40);
        int int12 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(36);
        livro4.devolver();
        int int17 = livro4.getPaginas();
        livro4.adicionarCopias(262);
        java.lang.String str20 = livro4.getTitulo();
        java.lang.String str21 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test07936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07936");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), (int) '#');
        livro4.devolver();
        livro4.devolver();
        livro4.emprestar();
        livro4.emprestar();
        livro4.devolver();
        livro4.emprestar();
    }

    @Test
    public void test07937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07937");
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
        int int16 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(132);
        livro4.devolver();
        livro4.removerCopias(57);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 67 + "'", int16 == 67);
    }

    @Test
    public void test07938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07938");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 97, (int) (byte) 1);
        livro4.removerCopias((int) (short) 1);
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias(67);
        livro4.removerCopias(125);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test07939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07939");
        imd.Livro livro4 = new imd.Livro("", "hi!", 133, 3);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test07940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07940");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(0);
        livro4.removerCopias(100);
        int int14 = livro4.getPaginas();
        int int15 = livro4.getPaginas();
        int int16 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 31 + "'", int16 == 31);
    }

    @Test
    public void test07941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07941");
        imd.Livro livro4 = new imd.Livro("hi!", "", 52, 128);
        livro4.adicionarCopias(97);
        int int7 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test07942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07942");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.devolver();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getTitulo();
        livro4.removerCopias(21);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test07943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07943");
        imd.Livro livro4 = new imd.Livro("", "hi!", 34, 99);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test07944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07944");
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
        livro4.removerCopias((int) '#');
        livro4.removerCopias(0);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test07945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07945");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) (byte) 0);
        int int9 = livro4.getPaginas();
        int int10 = livro4.getPaginas();
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test07946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07946");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) -1, 67);
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        livro4.removerCopias(118);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test07947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07947");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(32);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test07948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07948");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) -1, 126);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 126 + "'", int6 == 126);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test07949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07949");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test07950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07950");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 51, 101);
        livro4.emprestar();
        livro4.adicionarCopias(32);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias(10);
        java.lang.String str11 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test07951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07951");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 55, 262);
    }

    @Test
    public void test07952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07952");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int13 = livro4.getPaginas();
        int int14 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test07953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07953");
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
        int int14 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str16 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 31 + "'", int14 == 31);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test07954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07954");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(100);
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(148);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test07955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07955");
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
        livro4.adicionarCopias(3);
        int int19 = livro4.getPaginas();
        int int20 = livro4.getPaginas();
        java.lang.String str21 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test07956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07956");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 10, 9);
        livro4.devolver();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test07957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07957");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(0);
        java.lang.String str10 = livro4.getAutor();
        livro4.adicionarCopias(67);
        java.lang.String str13 = livro4.getAutor();
        livro4.adicionarCopias(30);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test07958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07958");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '#', 126);
        livro4.removerCopias(142);
        livro4.devolver();
        livro4.removerCopias(262);
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias(83);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test07959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07959");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        livro4.removerCopias((int) (short) 100);
        livro4.devolver();
        livro4.adicionarCopias((int) (short) 0);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test07960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07960");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(0);
        livro4.adicionarCopias(65);
        livro4.removerCopias(35);
        livro4.emprestar();
        java.lang.String str13 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test07961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07961");
        imd.Livro livro4 = new imd.Livro("hi!", "", 20, 147);
        livro4.removerCopias(290);
    }

    @Test
    public void test07962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07962");
        imd.Livro livro4 = new imd.Livro("hi!", "", 0, (int) '4');
        java.lang.String str5 = livro4.getTitulo();
        livro4.devolver();
        java.lang.String str7 = livro4.getTitulo();
        livro4.devolver();
        livro4.adicionarCopias(42);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test07963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07963");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias(41);
        livro4.devolver();
        int int13 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias(39);
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test07964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07964");
        imd.Livro livro4 = new imd.Livro("hi!", "", (-1), 0);
        livro4.removerCopias(36);
    }

    @Test
    public void test07965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07965");
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
        int int19 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test07966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07966");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 10, (int) (short) 10);
        livro4.devolver();
        java.lang.String str6 = livro4.getAutor();
        java.lang.String str7 = livro4.getTitulo();
        java.lang.String str8 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test07967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07967");
        imd.Livro livro4 = new imd.Livro("", "", 179, 238);
    }

    @Test
    public void test07968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07968");
        imd.Livro livro4 = new imd.Livro("", "", 265, 141);
        livro4.devolver();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 142 + "'", int6 == 142);
    }

    @Test
    public void test07969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07969");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(0);
        livro4.adicionarCopias(29);
        int int14 = livro4.getPaginas();
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test07970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07970");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) (byte) 0);
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 100);
        int int13 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test07971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07971");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        java.lang.String str5 = livro4.getAutor();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
    }

    @Test
    public void test07972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07972");
        imd.Livro livro4 = new imd.Livro("", "", 0, (int) (byte) 1);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test07973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07973");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 1, 134);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias(127);
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test07974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07974");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), 0);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test07975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07975");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((-1));
        livro4.removerCopias(21);
        java.lang.String str14 = livro4.getAutor();
        int int15 = livro4.getCopiasDisponiveis();
        int int16 = livro4.getCopiasDisponiveis();
        java.lang.String str17 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test07976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07976");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, 40);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 40 + "'", int5 == 40);
    }

    @Test
    public void test07977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07977");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 73, 71);
    }

    @Test
    public void test07978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07978");
        imd.Livro livro4 = new imd.Livro("", "", 63, (int) '#');
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test07979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07979");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getAutor();
        livro4.emprestar();
        livro4.devolver();
        livro4.removerCopias(126);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test07980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07980");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) 'a', (int) (short) 10);
        livro4.removerCopias(52);
        livro4.adicionarCopias(408);
    }

    @Test
    public void test07981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07981");
        imd.Livro livro4 = new imd.Livro("", "", (int) '4', 100);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test07982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07982");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias(29);
        livro4.devolver();
        livro4.adicionarCopias(50);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test07983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07983");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str14 = livro4.getTitulo();
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test07984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07984");
        imd.Livro livro4 = new imd.Livro("hi!", "", 139, 147);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 147 + "'", int5 == 147);
    }

    @Test
    public void test07985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07985");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test07986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07986");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(0);
        livro4.removerCopias(1);
        livro4.devolver();
        livro4.removerCopias(98);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
    }

    @Test
    public void test07987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07987");
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
        livro4.removerCopias(242);
        java.lang.String str19 = livro4.getAutor();
        java.lang.String str20 = livro4.getAutor();
        livro4.devolver();
        int int22 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 66 + "'", int22 == 66);
    }

    @Test
    public void test07988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07988");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        livro4.emprestar();
        java.lang.String str10 = livro4.getAutor();
        livro4.devolver();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getAutor();
        livro4.emprestar();
        livro4.devolver();
        int int16 = livro4.getCopiasDisponiveis();
        int int17 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass18 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 98 + "'", int16 == 98);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test07989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07989");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07990");
        imd.Livro livro4 = new imd.Livro("", "hi!", 106, 62);
    }

    @Test
    public void test07991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07991");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 0, (int) (short) 100);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test07992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07992");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias(33);
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test07993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07993");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getAutor();
        livro4.emprestar();
        livro4.devolver();
        int int14 = livro4.getPaginas();
        int int15 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test07994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07994");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (byte) 0);
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        livro4.emprestar();
        java.lang.String str15 = livro4.getAutor();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 41 + "'", int10 == 41);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07995");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getAutor();
        livro4.devolver();
        java.lang.String str10 = livro4.getAutor();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07996");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias(21);
        livro4.adicionarCopias(11);
        int int16 = livro4.getCopiasDisponiveis();
        int int17 = livro4.getCopiasDisponiveis();
        java.lang.String str18 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test07997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07997");
        imd.Livro livro4 = new imd.Livro("", "hi!", 29, 71);
    }

    @Test
    public void test07998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07998");
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
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 127 + "'", int15 == 127);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test07999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07999");
        imd.Livro livro4 = new imd.Livro("hi!", "", 338, 30);
    }

    @Test
    public void test08000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test08000");
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
        int int18 = livro4.getPaginas();
        livro4.devolver();
        int int20 = livro4.getPaginas();
        int int21 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }
}

