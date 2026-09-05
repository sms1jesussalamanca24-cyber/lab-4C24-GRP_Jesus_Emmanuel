public class StudentController {
    
    public void getStudents() {
        System.out.println("Listando estudiantes...");
    }
    
    public void addStudent(String name) {
        System.out.println("Agregando estudiante: " + name);
    }
    
    public void deleteStudent(int id) {
        System.out.println("Eliminando estudiante con ID: " + id);
    }
}