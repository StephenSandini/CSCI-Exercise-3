package testclasses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import classes.Student;
import classes.Utils;
class UtilsTest {

  @Test
  void testCheckName() {
    Student s1 = new Student("Alice", 20, 3.3);
    Student s2 = new Student("", 0, 0.0);
    Student s3 = new Student(null, 0, 0.0);

    assertTrue(Utils.checkName(s1.getName()));
    assertFalse(Utils.checkName(s2.getName()));
    assertFalse(Utils.checkName(s3.getName()));
  }


  @Test
  /*   if (age < 0) return false;
        else return true;  // Bug: Allows age > 120
  */
  void testIsValidAge() {
    Student s1 = new Student("Alice", 20, 3.3);
    Student s2 = new Student("", 120, 0.0);
    Student s3 = new Student(null, -1, 0.0);

    assertTrue(Utils.isValidAge(s1.age));
    assertTrue(Utils.isValidAge(s2.age));
    assertFalse(Utils.isValidAge(s3.age));
  }
}
