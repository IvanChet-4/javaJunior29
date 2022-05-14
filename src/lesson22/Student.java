package lesson22;

public class Student {
    private int id;
    private String firstName;
    private String secondName;
    private int course;
    private double markAvg;
    private int age;

    public Student(int id, String firstName, String secondName, int course, double markAvg, int age) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.course = course;
        this.markAvg = markAvg;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getMarkAvg() {
        return markAvg;
    }

    public void setMarkAvg(double markAvg) {
        this.markAvg = markAvg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", course=" + course +
                ", markAvg=" + markAvg +
                ", age=" + age +
                '}';
    }


}
