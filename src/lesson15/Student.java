package lesson15;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private int course;

    public Student(int id, String name, int course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }


    @Override
    public int compareTo(Student o) {
            if (this.name.compareTo(o.name)==1){
                return this.name.compareTo(o.name);}
            else if(this.name.compareTo(o.name)==0){
                return this.course- o.course;
            }else{return this.id - o.id;}
        }
    }

