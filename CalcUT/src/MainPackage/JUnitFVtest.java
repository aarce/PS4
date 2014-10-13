package MainPackage;

import org.junit.Test;

import junit.framework.TestCase;

public class JUnitFVtest extends TestCase{
		
		@Test
		public void testFV() {
			
			FVCalculation newtest = new FVCalculation();
			
			assertEquals("FV Must Equal $21854.54", 21854.54 ,newtest.FutureValue(20000, 3, 3));
			
			
	
	}
		FVCalculation newtest2 = new FVCalculation();
		
		@Test
		public void testFV2() {
			assertEquals("FV Must Equal $10927.27", 10927.27 ,newtest2.FutureValue(10000, 3, 3));
		}
}
