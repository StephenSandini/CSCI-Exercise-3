package testclasses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import classes.Student;
import classes.Utils;
class UtilsTest {

  @Test
  void testCheckName() {
    assertTrue(Utils.checkName("Alice"));
    assertFalse(Utils.checkName(""));
    assertFalse(Utils.checkName(null));
  }


  @Test
  void testIsValidAge() {
    Student s1 = new Student("Alice", 20, 3.3);
    Student s2 = new Student("", 119, 0.0);
    Student s3 = new Student(null, -1, 0.0);

    assertTrue(Utils.isValidAge(20));
    assertTrue(Utils.isValidAge(119));
    assertFalse(Utils.isValidAge(-1));
    assertFalse(Utils.isValidAge(120));
    assertTrue(Utils.isValidAge(0));
  }
}
