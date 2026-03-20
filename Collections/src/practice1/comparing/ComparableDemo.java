package practice1.comparing;

import java.util.TreeSet;

class Student implements Comparable<Student>{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        TreeSet<Student> studentTreeSet = new TreeSet<>();

        Student s1 = new Student(4,"Kashmira");
        Student s2 = new Student(3,"Nachiket");
        Student s3 = new Student(1,"Samira");
        Student s4 = new Student(2,"Aayansh");

        studentTreeSet.add(s1);
        studentTreeSet.add(s2);
        studentTreeSet.add(s3);
        studentTreeSet.add(s4);
    }
}
