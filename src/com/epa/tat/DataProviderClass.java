package com.epa.tat;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name = "additionDoublePositiveData",parallel = true)
	public static Object[][]  additionDoublePositiveData() {
		return new Object[][] { { 3.5,7.5, 11}, { 4.6, 6.8, 11.4 }, { 7.5, 7.4, 14.9 } };
	}

	@DataProvider(name = "additionDoubleNegativeData",parallel = true)
	public static Object[][] additionDoubleNegativeData() {
		return new Object[][] { { 1.56, 2.58, 3.25 }, { 2.89, 6.12, 8.2 }, { 5.54, 7.258, 12.32 } };
	}
	
	@DataProvider(name = "additionLongPositiveData",parallel = true)
	public static Object[][] additionLongPositiveData() {
		return new Object[][] { { 14527422l, 245333l, 14772755l }, { 225757l, 78586l, 304343l } };
	}

	@DataProvider(name = "additionLongNegativeData",parallel = true)
	public static Object[][] additionLongNegativeData() {
		return new Object[][] { { 145254274l, 24257452577l, 345247324736l }, { 2586868675l, 678575785l, 875785785785l } };
	}

}
