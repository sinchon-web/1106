package lotto;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
//java.lang 패키지에 존재하는 클래스는 그냥 사용하시면됩니다.
public class LottoTest {

	public static void main(String[] args) {
		
		
		//1~45 번호 생성
		//java.util.Random random;
		int num[]=new int[3];//번호를 저장할 공간
		Random random=new Random();
		int size=num.length;
		Scanner sc=new Scanner(System.in);
		System.out.print("몇줄? ");
		int n=sc.nextInt();
		
		
		for(int l=0;l<n;l++){
			for(int i=0; i<size; i++) {
				//번호생성
				int temp=random.nextInt(15)+1;
				//중복검사
				boolean check=false;
				for(int j=0;j<i; j++) {
					if(temp==num[j]) {
						//System.out.println("중복발생");
						check=true;
						break;
					}
				}//for j
				if(check==true) {//중복숫자가 발생했다면
					i--;
					continue;
				}
				
				//번호저장
				num[i]=temp;
				
			}//for i
			//정렬
			//오름차순
			for(int c=size-1; c>0; c--){
				for(int i=0; i<c; i++) {
					if(num[i]>num[i+1]) {
						//위치변경
						int temp=num[i];
						num[i]=num[i+1];
						num[i+1]=temp;
					}
				}//for i
			}//for c
			//번호출력
			for(int i=0; i<size; i++) {
				System.out.printf("%02d  ",num[i]);
			}
			System.out.println();
			
		
		}//outer for
		
	}//main()

}
