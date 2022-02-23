package ProgrammingExercise11_2;

public class Faculty extends Employee {
  private String officeHours;
  private String rank;

  public Faculty(String name) {
    super(name);
  }

  public void setOfficeHours(String officeHours) {
    this.officeHours = officeHours;
  }

  public String getOfficeHours() {
    return this.officeHours;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  public String getRank() {
    return this.rank;
  }

  // Credit to user MirroredFate on Stack Overflow for methods that return the name of a class
  @Override
  public String toString() {
    return this.getClass().getSimpleName() + ": " + super.getName();
  }
}
