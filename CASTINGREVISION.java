package curie;

public class CASTINGREVISION {
public static void main(String[] args) {
	//byte,int,short,long
	
	//byte can go in short...short to int...int to long
	
	byte b=20;
	short s=b;
	int i =s;
	long l=i;
	
	//but now lets see reversle....not possible
	long l1=100;
	int ii =(int)l1;
	short ss= (short)ii;
	byte bb=(byte)ss;
	//even if compatible full ans is noit given chopped ans given
	
	int iii=257;
	byte bbb=(byte)iii;
	
	System.out.println(bbb);
	
}
}
