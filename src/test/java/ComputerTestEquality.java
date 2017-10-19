
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ComputerTestEquality {
		
	@Test //Test that objects are Aliases (or Equals)
	public void assertThatTwoObjsAreAliases() {
		Computer underTest = new Computer("make", "model", 0.0);
		Computer underTest2 = new Computer("make", "model", 0.0);
		underTest = underTest2; //Creates an alias
		boolean check = (underTest == underTest2);
		assertEquals(check, true);
	}
	
	@Test //Test that objects are Aliases (or Equals)
	public void assertThatObjEqualsIsOverridden() {
		Computer underTest = new Computer("make", "model", 0.0);
		Computer underTest2 = new Computer("make", "model", 0.0);
		underTest = underTest2;
		boolean check = (underTest.equals(underTest2));
		assertEquals(check, true);
	}
	@Test //Test that objects are Aliases (or Equals)
	public void assertThatStringEqualsIsOverridden() {
		Computer underTest = new Computer("make", "model", 0.0);
		Computer underTest2 = new Computer("make", "model", 0.0);
		
		boolean check = underTest.getMake().equals(underTest2.getMake());
		assertEquals(check, true);
	}
	@Test //Test that objects are Aliases (or Equals)
	public void assertThatObjectEqualsIsOverridden() {
		Computer underTest = new Computer("make", "model", 0.0);
		Computer underTest2 = new Computer("make", "model", 0.0);
		boolean check = (underTest.equals(underTest2));
		assertEquals(check, true);
	}
	
	
}
