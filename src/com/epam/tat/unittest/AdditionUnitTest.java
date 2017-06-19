package com.epam.tat.unittest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epa.tat.BaseClass;
import com.epa.tat.DataProviderClass;

public class AdditionUnitTest extends BaseClass{
	
    @Test(groups={"positiveTest"},dataProvider="additionDoublePositiveData",dataProviderClass=DataProviderClass.class)
	public void positiveSumDoubleTest(double inputOne,double inputTwo, double expectedResult) {
       double actualResult=objCalculator.sum(inputOne,inputTwo);
       Assert.assertEquals(actualResult, expectedResult,"Actual Result : "+actualResult+" and Expected Result: "+expectedResult+" both are not same");
	}
    
    @Test(groups={"positiveTest"},dataProvider="additionLongPositiveData",dataProviderClass=DataProviderClass.class)
	public void positiveSumLongTest(long inputOne,long inputTwo, long expectedResult) {
       long actualResult=objCalculator.sum(inputOne,inputTwo);
       Assert.assertEquals(actualResult, expectedResult,"Actual Result : "+actualResult+" and Expected Result: "+expectedResult+" both are not same");
	}

    @Test(groups={"negativeTest"},dataProvider="additionDoubleNegativeData",dataProviderClass=DataProviderClass.class)
    public void negativeSumDoubleTest(double inputOne,double inputTwo, double expectedResult) {
    	 double actualResult=objCalculator.sum(inputOne,inputTwo);
         Assert.assertNotEquals(actualResult, expectedResult,"Actual Result : "+actualResult+" and Expected Result: "+expectedResult+" both are should not same");
	}
    
    @Test(groups={"negativeTest"},dataProvider="additionLongNegativeData",dataProviderClass=DataProviderClass.class)
    public void negativeSumLongTest(long inputOne,long inputTwo, long expectedResult) {
    	 long actualResult=objCalculator.sum(inputOne,inputTwo);
         Assert.assertNotEquals(actualResult, expectedResult,"Actual Result : "+actualResult+" and Expected Result: "+expectedResult+" both are should not same");
	}

}
