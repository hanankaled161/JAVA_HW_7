/**
 * Created by students on 25/09/22.
 */
public class Student extends Person{
    private String major;
    public Student(String name, String yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }
    public String getMajor() {return major;}
    public void setMajor(String major) {this.major = major;}
    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                "name='" + name + '\'' +
                "getYearOfBirth='" + getYearOfBirth() + '\'' +

                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return major != null ? major.equals(student.major) : student.major == null;
    }
    @Override
    public int hashCode() {return major != null ? major.hashCode() : 0;}
}



