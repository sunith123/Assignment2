public class stringBuffer2{
	public static void main(String[] args){
		StringBuffer st = new StringBuffer("It is used to_ at the specified index position. ");
		st.replace(13,14,"insert text");
		System.out.println(st);
	}
}