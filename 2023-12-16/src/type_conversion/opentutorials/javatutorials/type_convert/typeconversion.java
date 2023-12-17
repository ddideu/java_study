package type_conversion.opentutorials.javatutorials.type_convert;

public class typeconversion {

	public static void main(String[] args) {
//		double a = 3.0F;
//		System.out.println(a);
////		float b = 3.0;
//		System.out.println(b);
		int a = 3;
		float b = 1.0F;
		double c = a + b;
		System.out.println(c);
		float d = (float)100.0;
		int e = (int)100.0F;
		System.out.println(d);
		System.out.println(e);
	}

}
