import java.io.*;
/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {

  public static void testMerge() {
    Picture first = new Picture("images/temple.jpg");
    Picture sec = new Picture("images/water.jpg");
    first.merge(sec);

    first.explore();
  }

  /**
   * Main method for testing. Every class can have a main method in Java
   */
  public static void main(String[] args) throws IOException {
    testMerge();
  }
}