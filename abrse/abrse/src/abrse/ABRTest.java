package abrse;

import static org.junit.Assert.*;

import org.junit.Test;

public class ABRTest {

	ABR a = new ABR();

	
	public void testinsert() {
		a.insert(5);
		a.insert(2);
		a.insert(8);
		assertEquals(5,a.root.r);
		assertEquals(2,a.root.child_left_.r);
		assertEquals(8,a.root.child_right_.r);
	}
	
	public void testnbElements() {
		a.insert(5);
		a.insert(2);
		a.insert(8);
		assertEquals(3,a.nbElements());
	}

	
}
