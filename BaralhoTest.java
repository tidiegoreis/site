import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BaralhoTest {

	@Test
	void test0() {
		Baralho vBar = new Baralho();
		assertEquals(vBar.converteCartaParaInt("A"),1);
	}
	@Test
	void test1() {
		Baralho vBar = new Baralho();
		assertEquals(vBar.converteCartaParaInt("2"),2);
	}
	
	@Test
	void test2() {
		Baralho vBar = new Baralho();
		assertEquals(vBar.converteCartaParaInt("3"),3);
	}
	@Test
	void test3() {
		Baralho vBar = new Baralho();
		assertEquals(vBar.converteCartaParaInt("4"),4);
	}
	@Test
	void test4() {
		Baralho vBar = new Baralho();
		assertEquals(vBar.converteCartaParaInt("5"),5);
	}
	@Test
	void test5() {
		Baralho vBar = new Baralho();
		assertEquals(vBar.converteCartaParaInt("6"),6);
	}
	
	@Test
	void test6() {
		Baralho vBar = new Baralho();
		assertEquals(vBar.converteCartaParaInt("7"),7);
	}
	@Test
	void test7() {
		Baralho vBar = new Baralho();
		assertEquals(vBar.converteCartaParaInt("8"),8);
	}
	@Test
	void test8() {
		Baralho vBar = new Baralho();
		assertEquals(vBar.converteCartaParaInt("9"),9);
	}
	@Test
	void test9() {
		Baralho vBar = new Baralho();
		assertEquals(vBar.converteCartaParaInt("10"),10);
	}
	@Test
	void test10() {
		Baralho vBar = new Baralho();
		assertEquals(vBar.converteCartaParaInt("j"),11);
	}
	@Test
	void test11() {
		Baralho vBar = new Baralho();
		assertEquals(vBar.converteCartaParaInt("q"),12);
	}
	@Test
	void test12() {
		Baralho vBar = new Baralho();
		assertEquals(vBar.converteCartaParaInt("k"),13);
	}

	@Test
	void test13() {
		Baralho vBar = new Baralho();
		assertEquals(vBar.converteCartaParaInt("z"),13);
	}
	
	@Test
	void test14() {
		Baralho vBar = new Baralho();
		assertEquals(vBar.converteCartaParaInt2("k"),13);
	}
}
