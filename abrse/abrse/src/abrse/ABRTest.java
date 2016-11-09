package abrse;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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

	public void testcontains() {
		a.insert(5);
		a.insert(2);
		a.insert(8);
		assertTrue(a.contains(5));
		assertTrue(a.contains(2));
		assertFalse(a.contains(6));
	}
	
	public void testtoList() {
		a.insert(5);
		a.insert(2);
		a.insert(8);
		List<java.lang.Integer> l = new ArrayList<java.lang.Integer>() ; 
		a.toList(l);
		assertTrue(l.contains(5));
		assertTrue(l.contains(2));
		assertFalse(l.contains(6));
		//assertEquals(l.get(0),2);
	}
	
}
