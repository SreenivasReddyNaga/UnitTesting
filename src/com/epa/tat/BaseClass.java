package com.epa.tat;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;

import com.epam.tat.module4.Calculator;

public class BaseClass {
	
	public  final double PI =Math.PI;
	public Calculator objCalculator;

	@BeforeClass
	public void setUp() {
		objCalculator = new Calculator();		
		System.out.println("Before Class : Calculator Object intilaized");
	}
	
	@BeforeGroups(value="positiveTest")
	public void beforePositiveGroup() {
		System.out.println("Possitive Tests Group got intilaized");
	}
	
	@BeforeMethod
    public void beforeMethod(Method method)
    {
        System.out.println("Starting the Execution of method : "+method.getName());
    }
	
	
	@AfterMethod
    public void afterMethod(Method method)
    {
        System.out.println("Completed Execution of method : "+method.getName());
    }
	
	@AfterGroups(value="positiveTest")
	public void afterPositiveGroup() {
		System.out.println("Possitive Tests Group got Closed");
	}
	
	@BeforeGroups(value="negativeTest")
	public void beforeNegativeGroup() {
		System.out.println("Negative Tests Group got intilaized");
	}
	
	
	@AfterGroups(value="negativeTest")
	public void afterNegativeGroup() {
		System.out.println("Negative Tests Group got Closed");
	}	

	@AfterClass
	public void tearDown() {
		objCalculator = null;
		System.out.println("After Class : Calculator Object destroyed");
	}

}
