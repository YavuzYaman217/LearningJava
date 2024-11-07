package Examples;
import java.util.Arrays;

public class Classroom {
    private String className;
    private String[] students;

    public Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;
    }
    public String toString(){
        return "Class Name ->" + className + "\nStudent's Names ->"+ Arrays.toString(students);
    }
}
