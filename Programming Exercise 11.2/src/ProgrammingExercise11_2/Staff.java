package ProgrammingExercise11_2;

public class Staff extends Employee {
  private String title;

  public Staff(String name) {
    super(name);
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getTitle() {
    return this.title;
  }

  // Credit to user MirroredFate on Stack Overflow for methods that return the name of a class
  @Override
  public String toString() {
    return this.getClass().getSimpleName() + ": " + super.getName();
  }
}
