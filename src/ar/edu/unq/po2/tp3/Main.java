package ar.edu.unq.po2.tp3;

public class Main {
	
	public static void main(String[] args) {
		String a = "abc";
		String s = a;
		System.out.println(1+a);
		System.out.println(a.toUpperCase());
		System.out.println("Libertad".indexOf("r"));
		System.out.println("Universidad".lastIndexOf('i'));
		System.out.println("Quilmes".substring(2,4));
		System.out.println((a.length() + a).startsWith("a"));
		System.out.println(s==a);
		System.out.println(a.substring(1,3).equals("bc"));
		
	}
}
