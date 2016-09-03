
public class StringManipulation {
	public static String remove(String a, char b)
	{
	   String newString = "";
	   if(!a.isEmpty()&&!a.trim().isEmpty()){
	   newString = a.substring(0, a.indexOf(b))+""+a.substring(a.indexOf(b)+1);
	   if(newString.indexOf(b)!=-1) {
	     newString= remove(newString,b);
	   }
	   }
	   return newString;
	}

	public static void main(String[] args) {
		System.out.println(StringManipulation.remove("She is my Sister", 's'));
	}
	

}
