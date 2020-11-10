package charater;

public class CharTest04 {

	public static void main(String[] args) {
		
		
		//char ch[]=new char[10];
		//char ch[]= {'a','b','c','\0'};
		String str=new String("abc");
		String s=new String("abc");
		
		//System.out.println(ch.length);
		
		System.out.printf("%s\n",str);
		System.out.printf("%s\n",s);
		//System.out.println(ch);
		
		if(str == s) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다름니다.");
		}
		
		if(str.equals(s)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다름니다.");
		}
		
		
		

	}

}
