package tutorial7;

import tutorial7.signal.HilbertTransform;
import tutorial7.signal.Delay;

public class HtTest {

	public static void main(String[] args) {
		
		HilbertTransform ht = new HilbertTransform(48000, 30);
//		Delay delay = new Delay(2);
//		
//		double[] vals = { 1, 2, 3, 4, 5, 6 };
//		
//		for (int i=0; i< vals.length; i++) {
//			double d = delay.filter(vals[i]);
//			System.out.println(vals[i] + " : " + d);
//		}
	}
}
