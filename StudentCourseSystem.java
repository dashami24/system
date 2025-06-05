package programt3.program4;

// StudentCourseSystem.java

class Course {
    String name;
    int marks;

    Course(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Student {
    String name;
    String program;
    int semester;
    Course course;

    Student(String name, String program, int semester, Course course) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.course = course;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Course: " + course.name);
    }

    void checkMarks() {
        if (course.marks < 40) {
            System.out.println(name + " scored " + course.marks + " in " + course.name);
        }
    }
}

public class StudentCourseSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Dashami", "BE", 2, new Course("Math", 77));
        Student s2 = new Student("Abc", "BCA", 3, new Course("Java", 35));

        s1.showDetails();
        System.out.println();
        s2.showDetails();
        System.out.println();

        System.out.println("Students with marks < 40:");
        s1.checkMarks();
        s2.checkMarks();
    }
}
