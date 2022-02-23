package ProgrammingExercise11_2;

public class Employee extends Person {
  private String office;
  private double salary;
  private MyDate dateHired = new MyDate();

  public Employee(String name) {
    super(name);
  }

  public void setOffice(String office) {
    this.office = office;
  }

  public String getOffice() {
    return office;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  public void setDateHired(MyDate dateHired) {
    this.dateHired = dateHired;
  }

  public String getDateHired() {
    return "Date hired: " + dateHired.getMonth() + "/" + dateHired.getDay() + "/" + dateHired.getYear();
  }

  // Credit to user MirroredFate on Stack Overflow for methods that return the name of a class
  @Override
  public String toString() {
    return this.getClass().getSimpleName() + ": " + super.getName();
  }
}
