import java.util.ArrayList;

 class College {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    public College(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }


     public String getName(){
         return this.name;
     }


public ArrayList<Student>getStudent(){
return this.students;
    }
     public ArrayList<Teacher> getTeachers() {
         return this.teachers;
     }


    public void addStudent(Student student){
       this.students.add(student);
    }

     public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
      }}