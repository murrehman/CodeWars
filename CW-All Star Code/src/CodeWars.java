import java.util.*;

//Create a function called that accepts 2 string arguments and returns an integer of the count of occurrences the 2nd argument is found in the first one.
//strCount("Hello", 'o') // => 1
//strCount("", 'z')      // => 0





//---------CODE-WARS ONE LINERSSS----------------------------


public class CodeWars {
  public static int strCount(String str, char letter) {
    return Collections.frequency(Arrays.asList(str.split("")), ""+letter);
  }
}


