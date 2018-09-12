package codegym;

public class a4_5 {

	public static void main(String[] args) {

		// Cast
		int i = 10;
		long l = (int)i;
		
		System.out.println("l:" + l);
		
		// Compiler default type
		long ll = 2147483648L;
		float f = 3.14f;
		System.out.println("ll:" + ll);
		System.out.println("f:" + f);
		
		// Wrapper Types
		Double d = new Double(3.14);
		System.out.println("Value:" + d);
		System.out.println("Double size:" + d.SIZE);
		System.out.println("Double int value:" + d.intValue());
		
		// Transfer
		double d1 = 3.14;
		Double d2 = Double.valueOf(d1);
		System.out.println("d2:"+d2);
		
		// Autoboxing
		double d3 = 3.14;
		double d4 = d3;
		System.out.print("d4:"+d4);
		
		// Unboxing
		Double d5 = new Double(3.14);
		double d6 = d5;
		System.out.println(d6);
		
		// Autoboxing Error
		//Double d7 = null;
		//double d8 = d7;
		//System.out.println(d8);
		
		// String transfer to Primitive data type
		String s = "3.14";
		double d10 = Double.parseDouble(s);
		System.out.println(d10);
		
		// Primitive data type transfer to String
		double d9 = 3.14;
		String d9s = String.valueOf(d9);
		System.out.println(d9s);

		/*
		// Part 1
		double d = 3.14;
		String s = String.valueOf(d);
		float f = Float.parseFloat(s);
		
		// Part 2
		Float ff = new Float(f);
		int i = ff.intValue();
		System.out.println(i);
		*/		

	}

}
