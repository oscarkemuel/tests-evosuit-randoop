import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((-1));
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.removerCopias(10);
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((int) '4');
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int9 = livro4.getPaginas();
        livro4.devolver();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        livro4.emprestar();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias((int) '#');
        livro4.devolver();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        livro4.emprestar();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
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
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 97, (int) (byte) 1);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (byte) 0);
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 41 + "'", int10 == 41);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias((int) '#');
        livro4.devolver();
        livro4.devolver();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
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
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        java.lang.String str5 = livro4.getAutor();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
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
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        imd.Livro livro4 = new imd.Livro("", "", 40, (int) (short) 0);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.adicionarCopias(51);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(10);
        int int12 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
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
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 31);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        int int10 = livro4.getPaginas();
        livro4.removerCopias(0);
        int int13 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.emprestar();
        livro4.adicionarCopias(51);
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(0);
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(97);
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 128 + "'", int11 == 128);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        int int10 = livro4.getPaginas();
        livro4.devolver();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.devolver();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        java.lang.String str12 = livro4.getAutor();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
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
        java.lang.String str15 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((int) '4');
        livro4.removerCopias((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((-1));
        livro4.removerCopias(21);
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.adicionarCopias(51);
        java.lang.String str14 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        int int10 = livro4.getPaginas();
        livro4.removerCopias(0);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) '#');
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) ' ');
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), (int) '#');
        livro4.devolver();
        livro4.adicionarCopias(0);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        livro4.devolver();
        livro4.removerCopias((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 0);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
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
        livro4.adicionarCopias(51);
        java.lang.String str16 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias((int) ' ');
        int int9 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        imd.Livro livro4 = new imd.Livro("hi!", "", 32, (int) (short) 10);
        livro4.adicionarCopias((int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', (int) '#');
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias(51);
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        int int10 = livro4.getPaginas();
        livro4.removerCopias(0);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.removerCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str10 = livro4.getAutor();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.devolver();
        livro4.emprestar();
        int int12 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(0);
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias(66);
        java.lang.String str13 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 1, (int) '#');
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias(41);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias(100);
        java.lang.String str9 = livro4.getAutor();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 97, (int) (byte) 1);
        livro4.removerCopias((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.adicionarCopias(10);
        java.lang.String str14 = livro4.getAutor();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias((int) (byte) 1);
        livro4.devolver();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
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
        livro4.devolver();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.emprestar();
        livro4.adicionarCopias(51);
        int int13 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias(41);
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(0);
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
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
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias((int) (byte) 1);
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) 0);
        int int10 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(0);
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        int int8 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(128);
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getAutor();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        livro4.removerCopias(128);
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(11);
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', 66);
        int int5 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias((int) 'a');
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
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
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(97);
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias(0);
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(0);
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        imd.Livro livro4 = new imd.Livro("", "", 31, (-1));
        livro4.removerCopias(21);
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias(242);
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias(41);
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(10);
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 101, 0);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
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
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 31, 36);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        imd.Livro livro4 = new imd.Livro("", "", 67, 97);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
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
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
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
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
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
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
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
        int int16 = livro4.getPaginas();
        livro4.removerCopias(0);
        java.lang.Class<?> wildcardClass19 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getPaginas();
        int int11 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias(100);
        java.lang.String str9 = livro4.getAutor();
        livro4.devolver();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) 'a', (int) (short) 10);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', (int) '#');
        livro4.emprestar();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        livro4.devolver();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        livro4.devolver();
        livro4.removerCopias((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 31);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        java.lang.String str7 = livro4.getTitulo();
        livro4.adicionarCopias((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.devolver();
        livro4.removerCopias(106);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, (int) (short) 1);
        livro4.removerCopias(127);
        livro4.removerCopias((int) (short) -1);
        int int9 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 0, 41);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        livro4.emprestar();
        java.lang.String str10 = livro4.getAutor();
        livro4.removerCopias(10);
        int int13 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getAutor();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias(242);
        livro4.removerCopias(9);
        int int13 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 265 + "'", int13 == 265);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 97);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 97);
        livro4.removerCopias(31);
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 66 + "'", int7 == 66);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
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
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        imd.Livro livro4 = new imd.Livro("hi!", "", 31, 21);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        imd.Livro livro4 = new imd.Livro("", "", 67, 97);
        livro4.adicionarCopias(51);
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 149 + "'", int10 == 149);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.devolver();
        livro4.devolver();
        livro4.devolver();
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias((int) '#');
        java.lang.String str12 = livro4.getTitulo();
        livro4.removerCopias(29);
        java.lang.String str15 = livro4.getAutor();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        imd.Livro livro4 = new imd.Livro("", "", (int) '#', 0);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
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
        livro4.emprestar();
        java.lang.Class<?> wildcardClass20 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
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
        int int17 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(2);
        java.lang.Class<?> wildcardClass20 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (byte) 0);
        livro4.removerCopias(40);
        livro4.emprestar();
        java.lang.String str13 = livro4.getAutor();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, (int) (short) 1);
        livro4.removerCopias(127);
        livro4.removerCopias((int) (short) -1);
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        imd.Livro livro4 = new imd.Livro("hi!", "", 67, (int) '#');
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(51);
        java.lang.String str12 = livro4.getAutor();
        java.lang.String str13 = livro4.getAutor();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias(41);
        int int12 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
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
        livro4.adicionarCopias(29);
        java.lang.String str18 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
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
        java.lang.Class<?> wildcardClass19 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.removerCopias((int) 'a');
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, (int) (short) 1);
        int int5 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        imd.Livro livro4 = new imd.Livro("hi!", "", 0, (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        imd.Livro livro4 = new imd.Livro("", "", 66, 149);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias(41);
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        livro4.emprestar();
        int int13 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(10);
        livro4.removerCopias((int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(100);
        int int11 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        livro4.adicionarCopias((int) 'a');
        livro4.emprestar();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.devolver();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias(41);
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 51, 51);
        livro4.devolver();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) -1, 97);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(10);
        int int12 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias(41);
        java.lang.String str11 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(0);
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str9 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        imd.Livro livro4 = new imd.Livro("", "hi!", 101, (int) (short) 0);
        int int5 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        java.lang.String str7 = livro4.getAutor();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias(41);
        livro4.devolver();
        livro4.adicionarCopias(41);
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias(30);
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
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
        java.lang.Class<?> wildcardClass21 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
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
        livro4.adicionarCopias(51);
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        java.lang.String str12 = livro4.getTitulo();
        java.lang.String str13 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(1);
        livro4.removerCopias(30);
        java.lang.String str14 = livro4.getAutor();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getTitulo();
        livro4.removerCopias(9);
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias(41);
        livro4.adicionarCopias((-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(29);
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 97);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 10);
        livro4.adicionarCopias(97);
        livro4.devolver();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getAutor();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 10);
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 42 + "'", int8 == 42);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.adicionarCopias((int) '#');
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 65 + "'", int12 == 65);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getAutor();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str12 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.emprestar();
        livro4.removerCopias(98);
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias((int) (short) 10);
        livro4.devolver();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 128, 41);
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        imd.Livro livro4 = new imd.Livro("", "", (int) '4', 66);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
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
        int int14 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) '4');
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
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
        java.lang.Class<?> wildcardClass18 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias((int) ' ');
        livro4.removerCopias((-1));
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getAutor();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 97);
        livro4.removerCopias(31);
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        livro4.removerCopias((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        imd.Livro livro4 = new imd.Livro("", "hi!", 101, (int) (short) 0);
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(2);
        int int8 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        imd.Livro livro4 = new imd.Livro("hi!", "", 64, 21);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int9 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias((-1));
        livro4.adicionarCopias(22);
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str7 = livro4.getTitulo();
        livro4.removerCopias((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getAutor();
        livro4.removerCopias(11);
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str13 = livro4.getAutor();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (short) 1);
        int int12 = livro4.getPaginas();
        livro4.removerCopias(32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (byte) 0);
        livro4.emprestar();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        livro4.adicionarCopias((int) ' ');
        livro4.adicionarCopias((-1));
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.emprestar();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getAutor();
        livro4.devolver();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
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
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.String str9 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias(41);
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 0);
        livro4.removerCopias(67);
        int int7 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(242);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 31);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        java.lang.String str7 = livro4.getAutor();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        imd.Livro livro4 = new imd.Livro("hi!", "", 40, 130);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.removerCopias(0);
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str13 = livro4.getAutor();
        livro4.removerCopias((int) '4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        imd.Livro livro4 = new imd.Livro("", "", 29, 1);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(0);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(10);
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((-1));
        int int9 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) 'a', (int) '4');
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        imd.Livro livro4 = new imd.Livro("", "", (int) '4', 66);
        livro4.adicionarCopias(106);
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        java.lang.String str13 = livro4.getTitulo();
        java.lang.String str14 = livro4.getTitulo();
        int int15 = livro4.getPaginas();
        livro4.removerCopias((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        imd.Livro livro4 = new imd.Livro("hi!", "", 29, 30);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        livro4.emprestar();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        livro4.emprestar();
        livro4.adicionarCopias(51);
        int int13 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        imd.Livro livro4 = new imd.Livro("hi!", "", 22, 0);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getAutor();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str10 = livro4.getAutor();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 106, 130);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        livro4.devolver();
        livro4.emprestar();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) (short) 100);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
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
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 0, (int) (short) 100);
        livro4.removerCopias(21);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getPaginas();
        livro4.emprestar();
        livro4.removerCopias(32);
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str5 = livro4.getAutor();
        livro4.emprestar();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 97, (int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias(41);
        livro4.adicionarCopias(0);
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias((int) (short) -1);
        java.lang.String str10 = livro4.getAutor();
        livro4.emprestar();
        livro4.adicionarCopias(100);
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int9 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias((-1));
        livro4.emprestar();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        livro4.devolver();
        int int13 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 51, 101);
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        imd.Livro livro4 = new imd.Livro("hi!", "", 54, 52);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
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
        java.lang.Class<?> wildcardClass18 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.removerCopias(100);
        livro4.devolver();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
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
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.removerCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str10 = livro4.getAutor();
        livro4.removerCopias(65);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.removerCopias((int) (short) -1);
        livro4.devolver();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 1);
        java.lang.String str12 = livro4.getTitulo();
        int int13 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.devolver();
        livro4.devolver();
        java.lang.String str12 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', 66);
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        livro4.adicionarCopias(97);
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 137 + "'", int9 == 137);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((-1));
        java.lang.String str12 = livro4.getTitulo();
        livro4.removerCopias(106);
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int11 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias(31);
        livro4.removerCopias(242);
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) 'a', (int) ' ');
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((-1));
        java.lang.String str12 = livro4.getTitulo();
        livro4.removerCopias(106);
        livro4.devolver();
        livro4.adicionarCopias(53);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 0, (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias(137);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 97);
        livro4.removerCopias(31);
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        imd.Livro livro4 = new imd.Livro("", "", 31, 97);
        livro4.devolver();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(67);
        java.lang.String str12 = livro4.getTitulo();
        livro4.adicionarCopias(22);
        java.lang.String str15 = livro4.getAutor();
        int int16 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str9 = livro4.getAutor();
        livro4.emprestar();
        int int11 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.adicionarCopias((int) '#');
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        imd.Livro livro4 = new imd.Livro("hi!", "", 67, (int) 'a');
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getPaginas();
        livro4.emprestar();
        livro4.removerCopias(32);
        livro4.adicionarCopias(11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        imd.Livro livro4 = new imd.Livro("", "", 65, (int) (short) 1);
        livro4.emprestar();
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.adicionarCopias(97);
        livro4.emprestar();
        livro4.removerCopias((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str10 = livro4.getTitulo();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        java.lang.String str13 = livro4.getAutor();
        int int14 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        livro4.devolver();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        java.lang.String str12 = livro4.getAutor();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, (int) (byte) 100);
        int int5 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 0, 0);
        java.lang.String str5 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
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
        int int18 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 171 + "'", int18 == 171);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', (int) '#');
        livro4.devolver();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) (byte) 1);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        livro4.emprestar();
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 51, 101);
        livro4.emprestar();
        livro4.adicionarCopias(32);
        int int8 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(42);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 132 + "'", int8 == 132);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        imd.Livro livro4 = new imd.Livro("hi!", "", 66, (int) (short) 1);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 128, 41);
        int int5 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 128 + "'", int5 == 128);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
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
        java.lang.Class<?> wildcardClass17 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getAutor();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 0, 0);
        livro4.devolver();
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        livro4.emprestar();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', 30);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (byte) 0);
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str13 = livro4.getAutor();
        livro4.adicionarCopias(33);
        livro4.adicionarCopias(10);
        int int18 = livro4.getPaginas();
        java.lang.String str19 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 41 + "'", int10 == 41);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.adicionarCopias(51);
        livro4.emprestar();
        int int15 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.removerCopias((int) (short) -1);
        livro4.devolver();
        java.lang.String str10 = livro4.getAutor();
        java.lang.String str11 = livro4.getTitulo();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 0, 31);
        livro4.devolver();
        livro4.removerCopias(30);
        int int8 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 0, 31);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.adicionarCopias(65);
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias(31);
        livro4.removerCopias(106);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        livro4.removerCopias(64);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias((int) (short) 10);
        livro4.devolver();
        livro4.adicionarCopias(21);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        livro4.devolver();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        imd.Livro livro4 = new imd.Livro("", "", 67, 97);
        livro4.removerCopias((-1));
        java.lang.String str7 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        imd.Livro livro4 = new imd.Livro("hi!", "", 66, 127);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', 66);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), 31);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        livro4.removerCopias((int) (short) 10);
        livro4.devolver();
        java.lang.String str11 = livro4.getAutor();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
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
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        java.lang.String str12 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        livro4.devolver();
        int int11 = livro4.getPaginas();
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 97, (int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), (int) '#');
        livro4.removerCopias(22);
        livro4.emprestar();
        livro4.adicionarCopias(101);
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (byte) 0);
        livro4.removerCopias(40);
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 1);
        livro4.removerCopias((int) (byte) 1);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        int int10 = livro4.getPaginas();
        livro4.devolver();
        int int12 = livro4.getPaginas();
        livro4.adicionarCopias(91);
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 10);
        livro4.adicionarCopias(97);
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        livro4.devolver();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
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
        int int17 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass18 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        java.lang.String str13 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(97);
        livro4.removerCopias((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 32, 128);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        imd.Livro livro4 = new imd.Livro("hi!", "", 0, (int) (byte) -1);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        imd.Livro livro4 = new imd.Livro("", "hi!", 40, (int) (byte) -1);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getAutor();
        livro4.removerCopias(21);
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        livro4.adicionarCopias((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getPaginas();
        livro4.emprestar();
        livro4.removerCopias(32);
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        imd.Livro livro4 = new imd.Livro("hi!", "", 242, 36);
        livro4.removerCopias(139);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 10);
        livro4.adicionarCopias(97);
        java.lang.String str10 = livro4.getAutor();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        imd.Livro livro4 = new imd.Livro("", "hi!", 40, (int) (byte) -1);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        imd.Livro livro4 = new imd.Livro("", "", 69, 274);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 97);
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        int int7 = livro4.getPaginas();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getPaginas();
        int int8 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        int int13 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias((int) (byte) 100);
        livro4.devolver();
        int int13 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (byte) 1, (int) (byte) 1);
        java.lang.String str5 = livro4.getAutor();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 132, 0);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        int int7 = livro4.getPaginas();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) '4');
        livro4.removerCopias(29);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), (int) '#');
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
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
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        int int12 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str14 = livro4.getTitulo();
        int int15 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        imd.Livro livro4 = new imd.Livro("", "", 31, (-1));
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (-1), (int) (short) 100);
        java.lang.String str5 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) ' ');
        livro4.adicionarCopias(32);
        livro4.removerCopias((int) (byte) 10);
        java.lang.String str13 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
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
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), (int) '#');
        java.lang.String str5 = livro4.getTitulo();
        livro4.adicionarCopias(246);
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) -1, (int) ' ');
        livro4.removerCopias(41);
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        int int8 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        livro4.removerCopias(67);
        java.lang.String str12 = livro4.getTitulo();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        livro4.emprestar();
        java.lang.String str13 = livro4.getTitulo();
        livro4.emprestar();
        java.lang.String str15 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        imd.Livro livro4 = new imd.Livro("", "", 67, 97);
        livro4.adicionarCopias(51);
        livro4.devolver();
        livro4.adicionarCopias((int) (byte) 0);
        java.lang.String str10 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 31);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getAutor();
        livro4.removerCopias(30);
        java.lang.String str10 = livro4.getAutor();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias((int) ' ');
        int int9 = livro4.getPaginas();
        java.lang.String str10 = livro4.getTitulo();
        livro4.adicionarCopias((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getCopiasDisponiveis();
        int int9 = livro4.getPaginas();
        livro4.removerCopias(10);
        int int12 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(36);
        livro4.devolver();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 0, (int) (byte) 1);
        int int5 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.devolver();
        livro4.devolver();
        livro4.adicionarCopias(128);
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(64);
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 130 + "'", int9 == 130);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', (int) '#');
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, (int) '#');
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 64, 30);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(0);
        livro4.removerCopias(32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 0, 52);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
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
        int int18 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        imd.Livro livro4 = new imd.Livro("", "", 1, (int) (byte) 100);
        int int5 = livro4.getCopiasDisponiveis();
        int int6 = livro4.getPaginas();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) 10);
        livro4.devolver();
        livro4.devolver();
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str8 = livro4.getAutor();
        livro4.adicionarCopias(30);
        livro4.adicionarCopias(52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        imd.Livro livro4 = new imd.Livro("", "hi!", 97, (int) (byte) 10);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 97);
        livro4.removerCopias(10);
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(41);
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getTitulo();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        livro4.adicionarCopias(0);
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getAutor();
        livro4.devolver();
        int int14 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 0, 52);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias(139);
        livro4.adicionarCopias(126);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        imd.Livro livro4 = new imd.Livro("", "hi!", 0, 127);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 10, 132);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str8 = livro4.getAutor();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) -1, (int) (byte) 100);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        imd.Livro livro4 = new imd.Livro("", "", 22, (int) ' ');
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        imd.Livro livro4 = new imd.Livro("", "hi!", 127, 51);
        livro4.removerCopias(130);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (short) 100);
        int int12 = livro4.getPaginas();
        livro4.devolver();
        java.lang.String str14 = livro4.getTitulo();
        int int15 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) (byte) 0);
        livro4.adicionarCopias((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 97, (int) (byte) 1);
        int int5 = livro4.getPaginas();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        livro4.removerCopias(41);
        livro4.devolver();
        livro4.adicionarCopias(41);
        java.lang.String str12 = livro4.getAutor();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (byte) 0);
        livro4.removerCopias(40);
        int int12 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.Class<?> wildcardClass14 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.removerCopias(30);
        livro4.emprestar();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 1);
        livro4.removerCopias((int) ' ');
        livro4.removerCopias((int) (byte) 100);
        int int17 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass18 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        imd.Livro livro4 = new imd.Livro("hi!", "", 21, (-1));
        java.lang.String str5 = livro4.getAutor();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        imd.Livro livro4 = new imd.Livro("", "hi!", 64, 265);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.emprestar();
        livro4.emprestar();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (short) 0);
        livro4.devolver();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getCopiasDisponiveis();
        int int13 = livro4.getCopiasDisponiveis();
        java.lang.String str14 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 42 + "'", int13 == 42);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 1);
        livro4.removerCopias((int) (byte) 10);
        livro4.removerCopias((int) (byte) 100);
        livro4.devolver();
        int int18 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        imd.Livro livro4 = new imd.Livro("", "", (int) (short) 10, (int) (short) 1);
        livro4.removerCopias(127);
        java.lang.String str7 = livro4.getAutor();
        java.lang.String str8 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
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
        livro4.adicionarCopias(242);
        livro4.adicionarCopias(33);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 66 + "'", int13 == 66);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        imd.Livro livro4 = new imd.Livro("", "", 100, 101);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(10);
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (short) 1, 30);
        livro4.devolver();
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 42, 54);
        java.lang.String str5 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getAutor();
        java.lang.String str10 = livro4.getAutor();
        livro4.devolver();
        java.lang.Class<?> wildcardClass12 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        imd.Livro livro4 = new imd.Livro("hi!", "", 51, 126);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(101);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '#', 97);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        imd.Livro livro4 = new imd.Livro("", "", 100, 101);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(10);
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 91 + "'", int9 == 91);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias(31);
        int int7 = livro4.getPaginas();
        livro4.devolver();
        livro4.devolver();
        livro4.devolver();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 132, (int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        imd.Livro livro4 = new imd.Livro("hi!", "", 11, 40);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        imd.Livro livro4 = new imd.Livro("", "", 21, (int) '4');
        java.lang.String str5 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass6 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 0, 67);
        livro4.removerCopias((int) (byte) 100);
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        livro4.adicionarCopias(10);
        int int10 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(106);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        livro4.emprestar();
        java.lang.String str10 = livro4.getAutor();
        int int11 = livro4.getPaginas();
        java.lang.String str12 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str9 = livro4.getTitulo();
        livro4.devolver();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.adicionarCopias((int) (short) 0);
        livro4.adicionarCopias((int) (byte) -1);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '#', 98);
        livro4.removerCopias(102);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.adicionarCopias((int) 'a');
        int int9 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getCopiasDisponiveis();
        int int13 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
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
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.removerCopias((int) ' ');
        int int9 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((-1));
        java.lang.String str12 = livro4.getTitulo();
        livro4.removerCopias(106);
        livro4.devolver();
        java.lang.String str16 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        imd.Livro livro4 = new imd.Livro("", "", 21, (int) '4');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        imd.Livro livro4 = new imd.Livro("", "hi!", 21, 98);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        imd.Livro livro4 = new imd.Livro("hi!", "", 97, (int) (byte) 10);
        livro4.adicionarCopias((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        imd.Livro livro4 = new imd.Livro("hi!", "", 31, 31);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 51, 51);
        livro4.devolver();
        livro4.removerCopias(100);
        livro4.devolver();
        int int9 = livro4.getCopiasDisponiveis();
        java.lang.String str10 = livro4.getAutor();
        livro4.emprestar();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        imd.Livro livro4 = new imd.Livro("", "", (int) (byte) 0, 52);
        java.lang.String str5 = livro4.getAutor();
        java.lang.String str6 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.emprestar();
        int int9 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 1);
        livro4.removerCopias((int) (byte) 1);
        java.lang.String str14 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias(67);
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 1);
        livro4.removerCopias((int) (byte) 10);
        livro4.removerCopias((int) (byte) 100);
        livro4.devolver();
        livro4.emprestar();
        livro4.devolver();
        livro4.adicionarCopias(265);
        java.lang.Class<?> wildcardClass22 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.removerCopias((int) (byte) 0);
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 41 + "'", int10 == 41);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        imd.Livro livro4 = new imd.Livro("", "hi!", 40, (int) (byte) -1);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias(52);
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 31);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getAutor();
        livro4.adicionarCopias(0);
        int int10 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        java.lang.String str12 = livro4.getAutor();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), (int) '#');
        livro4.removerCopias(22);
        livro4.emprestar();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        java.lang.String str10 = livro4.getTitulo();
        java.lang.String str11 = livro4.getTitulo();
        int int12 = livro4.getPaginas();
        java.lang.String str13 = livro4.getTitulo();
        livro4.emprestar();
        livro4.adicionarCopias(97);
        int int17 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass18 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 126 + "'", int17 == 126);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) (byte) 1, (int) '#');
        livro4.adicionarCopias(31);
        livro4.removerCopias(242);
        livro4.removerCopias(2);
        livro4.removerCopias(242);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        imd.Livro livro4 = new imd.Livro("", "", 67, 97);
        livro4.removerCopias((-1));
        java.lang.String str7 = livro4.getTitulo();
        int int8 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 67 + "'", int8 == 67);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        imd.Livro livro4 = new imd.Livro("hi!", "", 1, 106);
        livro4.removerCopias((int) (short) 100);
        java.lang.String str7 = livro4.getAutor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        imd.Livro livro4 = new imd.Livro("", "", 101, 265);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        int int9 = livro4.getPaginas();
        int int10 = livro4.getCopiasDisponiveis();
        java.lang.String str11 = livro4.getAutor();
        java.lang.String str12 = livro4.getTitulo();
        livro4.adicionarCopias(139);
        java.lang.Class<?> wildcardClass15 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) ' ');
        livro4.emprestar();
        livro4.removerCopias(141);
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        livro4.adicionarCopias(10);
        livro4.adicionarCopias((int) (byte) 10);
        java.lang.String str10 = livro4.getTitulo();
        livro4.removerCopias((int) (short) 1);
        livro4.adicionarCopias((-1));
        livro4.removerCopias(265);
        java.lang.String str17 = livro4.getTitulo();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        imd.Livro livro4 = new imd.Livro("", "hi!", (-1), (int) '#');
        livro4.devolver();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias(42);
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) (byte) 1, 31);
        int int5 = livro4.getCopiasDisponiveis();
        java.lang.String str6 = livro4.getAutor();
        livro4.devolver();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        imd.Livro livro4 = new imd.Livro("", "", 32, 9);
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias(33);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) ' ');
        livro4.adicionarCopias(32);
        int int11 = livro4.getCopiasDisponiveis();
        java.lang.String str12 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass13 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        imd.Livro livro4 = new imd.Livro("", "hi!", (int) '4', 66);
        int int5 = livro4.getPaginas();
        livro4.emprestar();
        int int7 = livro4.getCopiasDisponiveis();
        livro4.removerCopias(66);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.removerCopias((int) ' ');
        livro4.adicionarCopias(32);
        livro4.removerCopias((int) (byte) 10);
        java.lang.String str13 = livro4.getTitulo();
        int int14 = livro4.getCopiasDisponiveis();
        int int15 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        imd.Livro livro4 = new imd.Livro("hi!", "", (int) '#', (int) '#');
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        java.lang.String str7 = livro4.getTitulo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", (int) (short) 100, 40);
        int int5 = livro4.getPaginas();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        livro4.adicionarCopias(52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        imd.Livro livro4 = new imd.Livro("", "hi!", 39, 64);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        int int5 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) (byte) 10);
        int int8 = livro4.getCopiasDisponiveis();
        livro4.emprestar();
        livro4.adicionarCopias(126);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 42 + "'", int8 == 42);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
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
        java.lang.String str16 = livro4.getTitulo();
        livro4.adicionarCopias(128);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        java.lang.String str6 = livro4.getAutor();
        int int7 = livro4.getCopiasDisponiveis();
        int int8 = livro4.getPaginas();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getPaginas();
        livro4.emprestar();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        imd.Livro livro4 = new imd.Livro("", "", 40, (int) (short) 0);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias(35);
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        imd.Livro livro4 = new imd.Livro("", "", (int) '#', (int) (short) 1);
        java.lang.String str5 = livro4.getTitulo();
        livro4.adicionarCopias(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        imd.Livro livro4 = new imd.Livro("", "hi!", 40, (int) (byte) -1);
        java.lang.String str5 = livro4.getTitulo();
        int int6 = livro4.getCopiasDisponiveis();
        livro4.adicionarCopias((int) '#');
        livro4.adicionarCopias((int) (short) -1);
        livro4.emprestar();
        livro4.adicionarCopias((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        int int6 = livro4.getPaginas();
        livro4.devolver();
        livro4.removerCopias(101);
        java.lang.Class<?> wildcardClass10 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        int int9 = livro4.getCopiasDisponiveis();
        int int10 = livro4.getPaginas();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        java.lang.String str5 = livro4.getTitulo();
        livro4.emprestar();
        livro4.devolver();
        java.lang.String str8 = livro4.getTitulo();
        java.lang.String str9 = livro4.getAutor();
        int int10 = livro4.getCopiasDisponiveis();
        int int11 = livro4.getPaginas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.devolver();
        livro4.devolver();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        imd.Livro livro4 = new imd.Livro("", "", (int) ' ', (int) (byte) 0);
        livro4.emprestar();
        java.lang.String str6 = livro4.getTitulo();
        livro4.adicionarCopias((int) ' ');
        java.lang.String str9 = livro4.getTitulo();
        livro4.removerCopias(51);
        int int12 = livro4.getCopiasDisponiveis();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        imd.Livro livro4 = new imd.Livro("hi!", "hi!", 67, 65);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) ' ');
        livro4.emprestar();
        int int6 = livro4.getCopiasDisponiveis();
        java.lang.String str7 = livro4.getAutor();
        int int8 = livro4.getCopiasDisponiveis();
        java.lang.Class<?> wildcardClass9 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
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
        livro4.removerCopias(41);
        java.lang.Class<?> wildcardClass23 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 242 + "'", int18 == 242);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
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
        java.lang.String str14 = livro4.getTitulo();
        java.lang.String str15 = livro4.getTitulo();
        java.lang.Class<?> wildcardClass16 = livro4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        imd.Livro livro4 = new imd.Livro("", "", 31, (-1));
        int int5 = livro4.getPaginas();
        livro4.adicionarCopias((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        java.lang.String str5 = livro4.getAutor();
        livro4.removerCopias((-1));
        java.lang.String str8 = livro4.getAutor();
        java.lang.String str9 = livro4.getTitulo();
        java.lang.String str10 = livro4.getAutor();
        java.lang.Class<?> wildcardClass11 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        imd.Livro livro4 = new imd.Livro("", "", (int) '#', 127);
        java.lang.Class<?> wildcardClass5 = livro4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        imd.Livro livro4 = new imd.Livro("", "", (int) 'a', (int) (byte) 0);
        livro4.devolver();
        java.lang.String str6 = livro4.getTitulo();
        livro4.devolver();
        java.lang.Class<?> wildcardClass8 = livro4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        imd.Livro livro4 = new imd.Livro("", "", 1, 41);
        int int5 = livro4.getPaginas();
        java.lang.String str6 = livro4.getAutor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }
}

