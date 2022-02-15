
public class main {

	public static void main(String[] args) {
		
//----UPPERCASE TO LOWER CASE LETTERS AND VICE VERSA----------------		
//-------COULD BE DONE WITH CHARACTER ARRAY METHOD--------------------		
		String string = "OkokOKOKok";
		StringBuffer sb = new StringBuffer(string); 
		for(int i=0;i<string.length();i++) {
			if(Character.isLowerCase(string.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(string.charAt(i)));
			}
			if(Character.isUpperCase(string.charAt(i))) {
				sb.setCharAt(i, Character.toLowerCase(string.charAt(i)));
			}
			
		}
		System.out.println(sb);
	    

	}

}
