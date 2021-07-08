package curie;

public class casting {
	public static void main(String[] args) {

		float f=121.032f;
				int ii=(int)f;
		System.out.println(ii);
		
		byte b=10;
		byte c=2;
		byte d=(byte)(b*c);
		int i=b*c;
		System.out.println("byte value=..."+d);
		System.out.println("int value......"+i);
		int myint=280;
		byte mybyte=(byte)myint;
		
		
		System.out.println(mybyte);
		
		char ch='a';
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println((char)169);
		
		
		
		
	}

	
}
