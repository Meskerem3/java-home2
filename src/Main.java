import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(7, "Kebde", new int[]{89, 78, 77});
        Student student2 = new Student(9, "Melat", new int[]{79, 90, 89});
        Teacher teacher1 = new Teacher("Mr Habtamu ", "Sport");
        Teacher teacher2 = new Teacher("Mr Ermiyas ", "OOP");
        College college = new College("SEC");

        college.addStudent(student1);
        college.addTeacher(teacher1);
        college.addStudent(student2);
        college.addTeacher(teacher2);
        System.out.println("College Name: " + college.getName());
        System.out.println("Student 1 name: " + student1.getName());
        System.out.println("Student 1 id: " + student1.getId());
        System.out.println("Student 1 Grades:");
        for (int grade : student1.getGrade()) {
            System.out.println(grade);

        }
        System.out.println("Student 2 name: " + student2.getName());
        System.out.println("Student 2 id: " + student2.getId());
        System.out.println("Student 2 Grades:");
        for (int grade : student2.getGrade()) {
            System.out.println(grade);


        }
        System.out.println("Teacher 1 name: " + teacher1.getName());
        System.out.println("Teacher 1 subject: " + teacher1.getSubject());
        System.out.println("Teacher 2 name: " + teacher2.getName());
        System.out.println("Teacher 2 subject: " + teacher2.getSubject());

    }
}