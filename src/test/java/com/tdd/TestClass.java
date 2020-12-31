package com.tdd;

import org.junit.Test;

public class TestClass {
	
	@Test
	public void getHashAndSecretNumTest() {
		String hashStr = 1+"0"+"8284";
		int openBoxNumber = AppRun.getopenBoxNumber(hashStr);
		if (openBoxNumber == 1) {
			System.out.println("开箱成功");
		}
	}

}
