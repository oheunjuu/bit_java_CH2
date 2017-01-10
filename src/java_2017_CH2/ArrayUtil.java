package java_2017_CH2;

public class ArrayUtil {
	public static double[] intToDouble(int[] source){
		if(source == null){
			return null;
		}
		
		double[] result=new double[source.length];
		
		for(int i=0;i<source.length;i++){
			
			result[i]=source[i]; //오른쪽 배열 크기가 더 작기 때문에 잘릴 일이 없음 캐스팅할 필요 X
			
		}
		return result;
	}

	public static int[] doubleToInt(double[] source){
		if(source==null){
			return null;
		}
		
		int[] result=new int[source.length];
		
		for(int i=0;i<source.length; i++){
			result[i]=(int)source[i]; //오른쪽 배열 크기가 더 크기 때문에 캐스팅 해줘서 뒷부분 잘라줘야 함.
		}
		return result;
	}
	
	public static int[] concat(int[] a,int[] b){
		if(a ==null || b ==null){
			return null;
		}
		
		int[] result=new int[a.length+b.length];
		int index=0;
		
		for(int i=0;i<a.length; i++){
			result[index]=a[i];
			index++;
		}
		
		
		for(int i=0;i<b.length; i++){
			result[index]=b[i];
			index++;
		}
		
//		for(int i=0; i<b.length;i++,index++){ //for문 안에 index++ 써도 된다. 
//			result[index++]=b[i]; //배열 안에 해도 된다. 
//			index++; //그냥 해도 된다.
//		}
		
		return null;
	}
}


