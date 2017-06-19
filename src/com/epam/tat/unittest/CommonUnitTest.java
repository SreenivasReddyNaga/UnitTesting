package com.epam.tat.unittest;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.epa.tat.BaseClass;

public class CommonUnitTest extends BaseClass {

	@Test
	public void squareRootNegativeTest() {
		double dResult;
		dResult = objCalculator.sqrt(120);
		Assert.assertNotEquals(dResult, 10);
	}

	@Test
	public void sin30NegativeTest() {
		double dResult;
		dResult = objCalculator.sin(PI / 6);
		Assert.assertNotEquals(dResult, Math.sin(1));
	}

	@Test
	public void cosNegativeTest() {
		double dResult;
		dResult = objCalculator.cos(0);
		Assert.assertNotEquals(dResult, 2);
	}

	@Test
	public void MultiplicationTest() {
		double dResult;
		dResult = objCalculator.mult(3.5, 7.8);
		Assert.assertEquals(dResult, 27.3);
	}

	@Test
	public void ExponentTest() {
		double dResult;
		dResult = objCalculator.pow(3, 3.99);
		Assert.assertEquals(dResult, Math.pow(3, 3.99));
	}

	@Test(expectedExceptions = NumberFormatException.class)
	public void divideByZeroTest() {
		objCalculator.div(3.5, 0);

	}

	@Test
	public void cos90Test() {
		double dResult;
		dResult = objCalculator.cos(Math.toRadians(90.0));
		Assert.assertEquals(dResult, 0.);
	}

	@Test
	public void tan0Test() {
		double dResult;
		dResult = objCalculator.tg(Math.toRadians(0.0));
		Assert.assertEquals(dResult, 0.);
	}

}
