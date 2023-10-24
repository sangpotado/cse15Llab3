import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

class SDStringChecker implements StringChecker {

  public boolean checkString(String s) {
    return s.length > 4;
  }
}

public class ListTests {
	@Test 
	public void SDfilter() {
    String[] array = {"hello", "blah", "blah", "cse15l"};
    List<String> input1 = new ArrayList<String>();
    for (String i:array) {
        input1.add(i);
    }
    List<String> expected = new ArrayList<String>();
    expected.add("hello");

    SDStringChecker sc = new SDStringChecker();

    assertArrayEquals(expected, ListExamples.filter(input1, sc));
	}
}