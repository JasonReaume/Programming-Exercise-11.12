package ProgrammingExercise11_2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestExercise11_2 {

  @Test
  public void testPersonToString() {
    Person testPerson = new Person("person");
    
    String expected = "Person: person";
    String actual = testPerson.toString();
    
    assertEquals(expected, actual);
  }
  
  @Test
  public void testStudentToString() {
    Student testStudent = new Student("student");
    
    String expected = "Student: student";
    String actual = testStudent.toString();
    
    assertEquals(expected, actual);
  }
  
  @Test
  public void testEmployeeToString() {
    Employee testEmployee = new Employee("employee");
    
    String expected = "Employee: employee";
    String actual = testEmployee.toString();
    
    assertEquals(expected, actual);
  }
  
  @Test
  public void testStaffToString() {
    Staff testStaff = new Staff("staff");
    
    String expected = "Staff: staff";
    String actual = testStaff.toString();

    assertEquals(expected, actual);
  }
  
  @Test
  public void testFacultyToString() {
    Faculty testFaculty = new Faculty("faculty");
    
    String expected = "Faculty: faculty";
    String actual = testFaculty.toString();

    assertEquals(expected, actual);
  }
  
  @Test
  public void testEmployeeGetDateHired() {
    Employee testEmployee = new Employee("name");
    MyDate testDateHired = new MyDate(2, 2, 22);
    testEmployee.setDateHired(testDateHired);
    
    String expected = "Date hired: 2/2/22";
    String actual = testEmployee.getDateHired();
    
    assertEquals(expected, actual);
  }
}
