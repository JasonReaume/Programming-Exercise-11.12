package ProgrammingExercise11_2;

public class Person {

  private String name;
  private String address;
  private String phoneNumber;
  private String email;
  
  public Person(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAddress() {
    return this.address;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return this.email;
  }
  
  // Credit to user MirroredFate on Stack Overflow for methods that return the name of a class
  @Override
  public String toString() {
    return this.getClass().getSimpleName() + ": " + this.getName();
  }
}
