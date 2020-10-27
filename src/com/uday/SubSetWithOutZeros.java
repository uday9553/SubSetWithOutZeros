package com.uday;

public class SubSetWithOutZeros {

	public static void main(String[] args) {
		//it returns 99 and 11
		findsubsetwithoutZero(110);		
	}
	
	public static void findsubsetwithoutZero(int N) {
		int a=0,b=0;
		boolean br=true;
			a=N-1;
			b=1;
			while(br) {
				if(!String.valueOf(a).contains("0")) {
					if(!String.valueOf(b).contains("0")) {
						br=false;
					}else {
						a=a-1;
						b=b+1;
					}
				}else {
					a=a-1;
					b=b+1;
				}
			}
				
		System.out.println("value of A "+a + "  value of b is "+ b);
				
	}

}
