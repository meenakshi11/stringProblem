
public class StringManItr {
public static StringBuilder remove(String word, char b){

	
	StringBuilder sb = new StringBuilder();
if(!word.isEmpty()&&!word.trim().isEmpty()){
	for (int i = 0; i < word.length(); i++){
	    if (word.charAt(i) != b){
	        sb.append(word.charAt(i));
	    }
	}
}
	return sb;
}
	
	public static void main(String[] args) {
	
		System.out.println(StringManItr.remove("Hello World", 'l'));
	}
}
