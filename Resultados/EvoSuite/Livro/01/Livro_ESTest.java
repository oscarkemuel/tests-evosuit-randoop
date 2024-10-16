/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 12 17:38:51 GMT 2024
 */

package imd;

import org.junit.Test;
import static org.junit.Assert.*;
import imd.Livro;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Livro_ESTest extends Livro_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Livro livro0 = new Livro((String) null, (String) null, (-1677), 2952);
      livro0.adicionarCopias(2952);
      livro0.removerCopias(2952);
      assertEquals(2952, livro0.getCopiasDisponiveis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Livro livro0 = new Livro("N@TZW.d", "N@TZW.d", 0, (-1));
      livro0.devolver();
      livro0.emprestar();
      assertEquals(0, livro0.getCopiasDisponiveis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Livro livro0 = new Livro((String) null, (String) null, (-1677), 2952);
      livro0.getTitulo();
      assertEquals(2952, livro0.getCopiasDisponiveis());
      assertEquals((-1677), livro0.getPaginas());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Livro livro0 = new Livro("", "B<.|&#[@!hL&", 0, 0);
      String string0 = livro0.getTitulo();
      assertEquals("B<.|&#[@!hL&", livro0.getAutor());
      assertEquals("", string0);
      assertEquals(0, livro0.getCopiasDisponiveis());
      assertEquals(0, livro0.getPaginas());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Livro livro0 = new Livro("", "", 2013, 0);
      int int0 = livro0.getPaginas();
      assertEquals(0, livro0.getCopiasDisponiveis());
      assertEquals(2013, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Livro livro0 = new Livro("0pV?uL1D]O~8P${U}ko", "dLMEa*.g)%", (-462), (-462));
      int int0 = livro0.getPaginas();
      assertEquals("dLMEa*.g)%", livro0.getAutor());
      assertEquals((-462), int0);
      assertEquals("0pV?uL1D]O~8P${U}ko", livro0.getTitulo());
      assertEquals((-462), livro0.getCopiasDisponiveis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Livro livro0 = new Livro("", "", (-802), 0);
      int int0 = livro0.getCopiasDisponiveis();
      assertEquals(0, int0);
      assertEquals((-802), livro0.getPaginas());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Livro livro0 = new Livro("0pV?uL1D]O~8P${U}ko", "dLMEa*.g)%", (-462), (-462));
      int int0 = livro0.getCopiasDisponiveis();
      assertEquals((-462), int0);
      assertEquals("dLMEa*.g)%", livro0.getAutor());
      assertEquals("0pV?uL1D]O~8P${U}ko", livro0.getTitulo());
      assertEquals((-462), livro0.getPaginas());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Livro livro0 = new Livro("4M[P;y0:e$\"eMG2\"o", "4M[P;y0:e$\"eMG2\"o", 1, 1);
      livro0.getAutor();
      assertEquals(1, livro0.getPaginas());
      assertEquals(1, livro0.getCopiasDisponiveis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Livro livro0 = new Livro("^H@a", "", (-1), 0);
      livro0.getAutor();
      assertEquals((-1), livro0.getPaginas());
      assertEquals(0, livro0.getCopiasDisponiveis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Livro livro0 = new Livro((String) null, (String) null, (-1677), 2952);
      livro0.removerCopias(2952);
      assertEquals(0, livro0.getCopiasDisponiveis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Livro livro0 = new Livro("N@TZW.d", "N@TZW.d", 0, (-1));
      livro0.adicionarCopias((-1519));
      livro0.removerCopias((-1));
      assertEquals((-1520), livro0.getCopiasDisponiveis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Livro livro0 = new Livro("N@TZW.d", "N@TZW.d", 0, (-1));
      livro0.emprestar();
      assertEquals(0, livro0.getPaginas());
      assertEquals((-1), livro0.getCopiasDisponiveis());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Livro livro0 = new Livro((String) null, (String) null, (-1677), 2952);
      livro0.getAutor();
      assertEquals(2952, livro0.getCopiasDisponiveis());
      assertEquals((-1677), livro0.getPaginas());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Livro livro0 = new Livro(",lkjJP4AIjp7f", "", 228, 558);
      int int0 = livro0.getCopiasDisponiveis();
      assertEquals(558, int0);
      assertEquals("", livro0.getAutor());
      assertEquals(",lkjJP4AIjp7f", livro0.getTitulo());
      assertEquals(228, livro0.getPaginas());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Livro livro0 = new Livro("N@TZW.d", "N@TZW.d", 0, (-1));
      livro0.getTitulo();
      assertEquals((-1), livro0.getCopiasDisponiveis());
      assertEquals(0, livro0.getPaginas());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Livro livro0 = new Livro("N@TZW.d", "N@TZW.d", 0, (-1));
      livro0.devolver();
      livro0.devolver();
      livro0.emprestar();
      assertEquals(0, livro0.getCopiasDisponiveis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Livro livro0 = new Livro("N@TZW.d", "N@TZW.d", 0, (-1));
      int int0 = livro0.getPaginas();
      assertEquals(0, int0);
      assertEquals((-1), livro0.getCopiasDisponiveis());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Livro livro0 = new Livro("N@TZW.d", "N@TZW.d", 0, (-1));
      livro0.adicionarCopias(89);
      livro0.emprestar();
      assertEquals(87, livro0.getCopiasDisponiveis());
  }
}
