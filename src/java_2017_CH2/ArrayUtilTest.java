package java_2017_CH2;

public class ArrayUtilTest {

	public static void main(String[] args) {
		int[] a={10,20,30,40,50};
		
		double[] d=ArrayUtil.intToDouble(a);
		
		for(double value: d){
			System.out.println(value);
		}
		
		System.out.println();
		
		double[] d1={3.14 ,3.166, 4.5 , 6.7};
		
		int[] a1=ArrayUtil.doubleToInt(d1);
		
		for(int value1:a1){
			System.out.println(value1);
		}
		
		System.out.println();
		
		int[] a2={1,2,3,4,5};
		int[] a3={6,7,8,9,10};
		int[] a4=ArrayUtil.concat(a2, a3);
		for(int v:a4){
			System.out.println(a4);
		}
	}
}
