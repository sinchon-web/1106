package lotto;

import java.util.Arrays;

public class SortTest01 {

	public static void main(String[] args) {
		
		int num[]= {45, 33, 10, 40, 5, 20};
		System.out.println(Arrays.toString(num));
		for(int i=0; i<5; i++) {
			if(num[i]>num[i+1]) {
				//위치변경
				int temp=num[i];
				num[i]=num[i+1];
				num[i+1]=temp;
			}
		}
		
		//출력
		for(int i=0; i<6; i++) {
			System.out.printf("%02d ",num[i] );
		}
		System.out.println();
		
		for(int i=0; i<4; i++) {
			if(num[i]>num[i+1]) {
				//위치변경
				int temp=num[i];
				num[i]=num[i+1];
				num[i+1]=temp;
			}
		}
		
		//출력
		for(int i=0; i<6; i++) {
			System.out.printf("%02d ",num[i] );
		}
		System.out.println();
		
		for(int i=0; i<3; i++) {
			if(num[i]>num[i+1]) {
				//위치변경
				int temp=num[i];
				num[i]=num[i+1];
				num[i+1]=temp;
			}
		}
		
		//출력
		for(int i=0; i<6; i++) {
			System.out.printf("%02d ",num[i] );
		}
		System.out.println();
		
		
		for(int i=0; i<2; i++) {
			if(num[i]>num[i+1]) {
				//위치변경
				int temp=num[i];
				num[i]=num[i+1];
				num[i+1]=temp;
			}
		}
		
		//출력
		for(int i=0; i<6; i++) {
			System.out.printf("%02d ",num[i] );
		}
		System.out.println();
		
		for(int i=0; i<1; i++) {
			if(num[i]>num[i+1]) {
				//위치변경
				int temp=num[i];
				num[i]=num[i+1];
				num[i+1]=temp;
			}
		}
		
		//출력
		for(int i=0; i<6; i++) {
			System.out.printf("%02d ",num[i] );
		}
		System.out.println();
		
		

	}

}
