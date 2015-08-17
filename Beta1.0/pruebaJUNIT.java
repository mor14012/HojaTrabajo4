import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class pruebaJUNIT {
	private stack<Double> Stack;
	calculadora<Double> Calculadora;
	
	@Before
	public void start()
	{
		Calculadora = new calculadora<Double>();
		Stack = new arraylist<Double>();
		Stack.push(1.0);
		
	}
	@Test
	public void test1() throws Exception {
		assertEquals(1.5, Stack.pop(),0);
	}
	@Test
	public void test2() throws Exception {
		assertEquals(0, Stack.size(),0);
	}

}
