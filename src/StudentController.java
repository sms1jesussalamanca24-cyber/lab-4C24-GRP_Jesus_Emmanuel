public class StudentController {
    
    private StudentModel model;
    
    public StudentController(StudentModel model) {
        this.model = model;
    }
    
    public void getStudents() {
        System.out.println("Listando estudiantes...");
    }
    
    public void addStudent(String name) {
        System.out.println("Agregando estudiante: " + name);
    }
    
    public void deleteStudent(int id) {
        System.out.println("Eliminando estudiante con ID: " + id);
    }
    
    public void updateStudent(int id, String name) {
        System.out.println("Actualizando estudiante ID: " + id + " - Nombre: " + name);
    }
}