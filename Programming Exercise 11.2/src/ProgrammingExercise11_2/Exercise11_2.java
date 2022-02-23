package ProgrammingExercise11_2;

public class Exercise11_2 {
  public static void main(String[] args) {
    Person person = new Person("Bob");
    Student student = new Student("Jane");
    Employee employee = new Employee("Robert");
    Faculty faculty = new Faculty("John");
    Staff staff = new Staff("Sarah");

    System.out.println(person.toString());
    System.out.println(student.toString());
    System.out.println(employee.toString());
    System.out.println(faculty.toString());
    System.out.println(staff.toString());
    System.out.println(employee.getDateHired()); 
  }
}
