import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

  @Test
  void testCheckName() {
    Utils service = new Utils();
    
    Student s1 = new Student("Alice", 20, 3.3);
    Student s2 = new Student("", 0, 0.0);
    Student s3 = new Student(null, 0, 0.0);

    assertTrue(service.checkName(s1.getName()));
    assertFalse(service.checkName(s2.getName()));
    assertFalse(service.checkName(s3.getName()));
  }


  @Test
  /*   if (age < 0) return false;
        else return true;  // Bug: Allows age > 120
  */
  void testIsValidAge() {
   Utils service = new Utils();
    
    Student s1 = new Student("Alice", 20, 3.3);
    Student s2 = new Student("", 120, 0.0);
    Student s3 = new Student(null, -1, 0.0);

    assertTrue(service.isValidAge(s1.age));
    assertTrue(service.isValidAge(s2.age));
    assertFalse(service.isValidAge(s3.age));
  }
}
