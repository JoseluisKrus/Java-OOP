
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<String,Student> students = new LinkedHashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] inputs = scanner.nextLine().split(" ");
       String command = inputs[0];
       while (!command.equals("Exit")){
           while (!command.equals("Show")){
               CreateStudent(inputs);
               inputs = scanner.nextLine().split(" ");
               command = inputs[0];

           }
           String name  = inputs[1];
           showStudent(name);
           inputs = scanner.nextLine().split(" ");
           command = inputs[0];
       }
    }

    private static void showStudent(String name) {
        try{
            String studentName = students.get(name).getName();
            int studentAge = students.get(name).getAge();
            double studentGrade = students.get(name).getGrade();
            String commentary = getCommentary(studentGrade);
            System.out.printf("%s is %d years old. %s\n", studentName,studentAge, commentary);
        }catch (Exception EX){

        }

    }

    private static String getCommentary(double studentGrade) {
        if (studentGrade>=5){
            return "Excellent student.";
        }else if (studentGrade>=3.50){
            return "Average student.";
        }
        return "Very nice person.";
    }

    private static void CreateStudent(String [] input) {
        String name = input[1];
        int age = Integer.parseInt(input[2]);
        double grade = Double.parseDouble(input[3]);
        Student student = new Student(name,age,grade);
        students.put(name,student);
    }
}
