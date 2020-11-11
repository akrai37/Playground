package testingby.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class Mytest {
	
@Test
	public void meth1() {
		
		assertEquals(22, Calc.adding(11,11));
	}
}
