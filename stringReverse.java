package cmp326;

public class stringReverse {
	public static String reverse(String word){
		if(word.length()==1){
			return word;
		}else{
			return word.charAt(word.length()-1) + reverse(word.substring(0, word.length()-1));
		}
	}
	public static void main(String[]args){
		System.out.println(reverse("abcd"));
	}
}
