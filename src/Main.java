import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Kebde",new int[]{89,78,77});
        Student student2 = new Student(2,"Melat",new int[]{79,90,89});
        Teacher teacher1 = new Teacher("Mr Habtamu ", "Mathematics");
        Teacher teacher2 = new Teacher("Ms. Johnson", "English");

        College college= new College("CCI");

        college.addStudent(student1);
        college.addStudent(student2);
        college.addTeacher(teacher1);
        college.addTeacher(teacher2);
        System.out.println("College Name: " + college.getName());
        System.out.println("students: ");
        for (Student s : college.getStudent()) {
            System.out.println(s.getName() + " ID: " + s.getId() + " Grade: " + s.getGrade());
        }
        System.out.println("teachers: ");
        for (Teacher t : college.getTeachers()){
            System.out.println(t.getName() + " Subject: " + t.getSubject());
        }

    }
}