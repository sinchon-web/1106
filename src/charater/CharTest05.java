package charater;

import java.util.Random;

public class CharTest05 {

	public static void main(String[] args) {
		//문자열은 문자열1.equals(문자열2)
		
		String str1="안녕하세요";//문자열 상수
		String str2="안녕하세요";
		String str3="안녕하세요";
		String str4=new String("안녕하세요");
		String str5=str4;
		//Random r;
		
		if( str4==str5 ) {
			System.out.println("같다");
		}else {
			System.out.println("다름");
		}

		
		
		System.out.println(str4);
		System.out.println(str5);
		str4=new String("안녕");
		System.out.println(str4);
		System.out.println(str5);
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str4));
	}

}
