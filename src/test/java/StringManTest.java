import static org.junit.Assert.*;

import org.junit.Test;


public class StringManTest {

	@Test
	public void testMan() {
		String TestNegative1 = "";
		String TestNegative2 = "   ";
		String Test = "Hello to the hell world";
		char ch = 'l';
		String expected =  "Heo to the he word";


		assertEquals(expected, StringManipulation.remove(Test, ch));
		assertEquals("", StringManipulation.remove(TestNegative1, ch));
		assertEquals("", StringManipulation.remove(TestNegative2, ch));
	}
@Test
public void testManItr(){
	String TestNegative1 = "";
	String TestNegative2 = "   ";
	String Test ="she is my sister";
	char ch = 's';
	String expected =  "he i my iter";


	assertEquals(expected, StringManipulation.remove(Test, ch));
	assertEquals("", StringManipulation.remove(TestNegative1, ch));
	assertEquals("", StringManipulation.remove(TestNegative2, ch));
}
}
