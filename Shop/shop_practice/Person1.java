

public class Person1 {
    String name;
    String email;

    public Person1(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

  

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "Person1 [name=" + name + ", email=" + email + "]";
    }

}
