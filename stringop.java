public class stringop{
	public static void main(String[] args){
String str="Java String pool refers to collection of Strings which are stored in heap memory";
String str1;
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace('a', '$'));
		boolean result = str.contains("collection");
		System.out.println(result);
		str1="java string pool refers to collection of strings which are stored in heap memory";
		System.out.println(str1.matches(str));
		System.out.println(str1.equals(str));

	}
}