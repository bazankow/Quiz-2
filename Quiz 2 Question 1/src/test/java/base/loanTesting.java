package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class loanTesting {
	
	static loanPayment test1;
	static loanPayment test2;
	static loanPayment test3;
	static loanPayment test4;
	static double tuition;
	static double[] tuitionChange = new double[3];
	static double apr;
	static double repayYears;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		tuitionChange[0] = 0.05;
		tuitionChange[1] = 0.05;
		tuitionChange[2] = 0.05;
		test1 = new loanPayment(10000,tuitionChange,0.05,15);
		assertTrue(test1.calcCost()==43101.25);
		assertTrue(test1.calcPayment()==340.84);
		
		tuitionChange[0] = 0.06;
		tuitionChange[1] = 0.05;
		tuitionChange[2] = 0.04;
		test1 = new loanPayment(15000,tuitionChange,0.04,20);
		assertTrue(test1.calcCost()==64957.8);
		assertTrue(test1.calcPayment()==393.63);
		
		tuitionChange[0] = 0.08;
		tuitionChange[1] = 0.02;
		tuitionChange[2] = 0.04;
		test1 = new loanPayment(25000,tuitionChange,0.1,35);
		assertTrue(test1.calcCost()==108181.6);
		assertTrue(test1.calcPayment()==930.01);
		
		tuitionChange[0] = 0.02;
		tuitionChange[1] = 0.04;
		tuitionChange[2] = 0.02;
		test1 = new loanPayment(26500,tuitionChange,0.01,10);
		assertTrue(test1.calcCost()==110314.62);
		assertTrue(test1.calcPayment()==966.4);
	}

}
