package lotto;

import java.util.Arrays;

public class SortTest02 {

	public static void main(String[] args) {
		
		int num[]= {45, 33, 10, 40, 5, 20};
		System.out.println(Arrays.toString(num));
		/////////////////////////////////////////////
		//오름차순
		for(int c=5; c>0; c--){
			for(int i=0; i<c; i++) {
				if(num[i]>num[i+1]) {
					//위치변경
					int temp=num[i];
					num[i]=num[i+1];
					num[i+1]=temp;
				}
			}
		}
		
		////////////////////////////////////////////
		//출력
		for(int i=0; i<6; i++) {
			System.out.printf("%02d ",num[i] );
		}
		System.out.println();
		
		

	}

}
