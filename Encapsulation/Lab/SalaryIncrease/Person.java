public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    void increaseSalary(double bonus){
        if(this.getAge() <30){
            setSalary(getSalary()+(getSalary()*(bonus/200)));
        }else {
            setSalary(getSalary()+(getSalary()*bonus/100));
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.2f leva.",this.getFirstName(),this.getLastName(),getSalary());
    }
}
