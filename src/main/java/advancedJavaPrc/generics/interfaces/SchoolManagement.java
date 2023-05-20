package advancedJavaPrc.generics.interfaces;

public class SchoolManagement {
      /*Task: Okul yönetimi için öğrenci ve öğretmen kayıtlarını
        -oluşturan
        -görüntüleyen
        -güncelleyen
        -silen
        Bir program yazınız
*/
      public static void main(String[] args) {
          Student student=new Student("Fatih");
          StudentRepo studentRepo=new StudentRepo();
          Teacher teacher=new Teacher("Akşemsettin");
          TeacherRepo teacherRepo=new TeacherRepo();

          studentRepo.add(student);
          studentRepo.update(student);
          studentRepo.get(student);
          studentRepo.delete(student);

          teacherRepo.add(teacher);
          teacherRepo.update(teacher);
          teacherRepo.get(teacher);
          teacherRepo.delete(teacher);

      }
}
