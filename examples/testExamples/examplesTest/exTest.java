package examplesTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import example1.ex1;
import example2.ex2;
import example3.ex3;

import java.util.*;

public class exTest {

	List<String> aList;
	ex1 e1;
	ex2 e2;
	ex3 e3;
	int a;
	int b;
	
	@Before
	public void oppretteNyGrafUtenKanter() {
		e1 = new ex1();
		e2 = new ex2();
		e3 = new ex3();
		aList = new ArrayList<>();
		a = 3;
		b = 4;
	}

	@Test
	public void testAdd() {
		assertEquals(7, e1.add(a, b));
	}

	@Test
	public void testSub() {
		assertEquals(-1, e2.sub(a, b));
	}

	@Test
	public void testMul() {
		assertEquals(12, e3.mul(a, b));
	}

}
