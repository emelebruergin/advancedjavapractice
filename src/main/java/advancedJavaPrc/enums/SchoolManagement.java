package advancedJavaPrc.enums;
//Task: Okul yönetimi için student ve teacher silme programını yazınız
//User için role tanımlayın(ADMIN,TEACHER, STUDENT) ve role göre silme yetkisi veriniz.
//student silme yetkisi (ADMIN,TEACHER)
//teacher silme yetkisi ADMIN
public class SchoolManagement {
    public static void main(String[] args) {

        Student student=new Student("Helen Keller");
        Teacher teacher=new Teacher("Anne Sullivan Macy");


        User user1=new User("James Gosling",Role.ROLE_ADMIN);
        User user2=new User("Mike Sheridan",Role.ROLE_TEACHER);
        User user3=new User("Patrick Naughton",Role.ROLE_STUDENT);

        deleteStudent(student,user1);
        deleteStudent(student,user2);
        deleteStudent(student,user3);

        deleteTeacher(teacher,user1);
        deleteTeacher(teacher,user2);
        deleteTeacher(teacher,user3);

    }
    public static void deleteStudent(Student std,User user){
        if (user.getRole().equals(Role.ROLE_ADMIN) || user.getRole().equals(Role.ROLE_TEACHER)){
            System.out.println("Student is deleted successfuly by "+user.getRole().getName());
        }else {
            System.out.println(user.getRole().getName()+" is not permited to delete Students");
        }
    }

    public static void deleteTeacher(Teacher teacher,User user){
        if (user.getRole().equals(Role.ROLE_ADMIN)){
            System.out.println("Teacher is deleted successfuly by "+user.getRole().getName());
        }else {
            System.out.println(user.getRole().getName()+" is not permited to delete Teacher");
        }
    }
}
