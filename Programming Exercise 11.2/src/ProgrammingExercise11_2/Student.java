package ProgrammingExercise11_2;

public class Student extends Person {
  private String status;
  private final String FRESHMAN = "Freshman";
  private final String SOPHOMORE = "Sophomore";
  private final String JUNIOR = "Junior";
  private final String SENIOR = "Senior";
      

  public Student(String name) {
    super(name);
  }

  public String getStatus() {
    return this.status;
  }

  public String getStatusFreshman() {
    return FRESHMAN;
  }
  
  public String getStatusSophomore() {
    return SOPHOMORE;
  }
  
  public String getStatusJunior() {
    return JUNIOR;
  }
  
  public String getStatusSenior() {
    return SENIOR;
  }
  
  @Override
  public String toString() {
    return "Student: " + super.getName();
  }
}
