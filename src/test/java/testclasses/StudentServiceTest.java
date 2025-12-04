package testclasses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import classes.Student;
import classes.StudentService;

class StudentServiceTest {

    @Test
    void testAddStudentAndTopStudent() {
        StudentService service = new StudentService();
        Student s1 = new Student("Alice", 20, 3.5);
        Student s2 = new Student("Bob", 22, 3.9);

        service.addStudent(s1);
        service.addStudent(s2);
        //There wasn't a test to see if the list added said students.
        assertEquals(2, service.getCount());

        // Test if top student is correctly identified
        Student top = service.getTopStudent();
        assertEquals("Bob", top.getName());
    }

    @Test
    void testCalculateAverageGpa() {
        StudentService service = new StudentService();
        service.addStudent(new Student("Alice", 20, 3.5));
        service.addStudent(new Student("Bob", 22, 3.5));

        double avg = service.calculateAverageGpa();
        assertEquals(3.5, avg, 0.001);
    }

    @Test
    void testRemoveStudentbyName() {
        StudentService service = new StudentService();
        Student s1 = new Student("Alice", 20, 3.5);
        Student s2 = new Student("Bob", 22, 2.5);

        service.addStudent(s1);
        service.addStudent(s2);

        //Asserting the first removal
        service.removeStudentByName("Bob");
        assertEquals(1, service.getCount());
        //Asserting the second removal
        service.removeStudentByName(s1.getName());
        assertEquals(0, service.getCount());

        //Asserting that removing a non-existing student returns the same count
        int before = service.getCount();
        service.removeStudentByName("Danny");
        int after = service.getCount();
        assertEquals(before, after);

    }
}
