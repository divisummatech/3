package javaoop.exercises._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        Student student = new Student();
        student.setName("Marco");
        student.setAge(22);
        student.setAddress("Via roma 2");
        student.setMajor("IT class");
        student.setStudentID(123456789);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Major: " + student.getMajor());
        System.out.println("Student ID: " + student.getStudentID());

    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        public class Student {
            private String name;
            private int age;
            private String major;
            private int studentId;
            private double gpa;
            private int coursesTaken;

            public Student(String name, int age, String major, int studentId, double gpa) {
                this.name = name;
                this.age = age;
                this.major = major;
                this.studentId = studentId;
                this.gpa = gpa;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                if (name == null || name.isEmpty()) {
                    throw new IllegalArgumentException("Name cannot be empty");
                }
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                if (age < 0) {
                    throw new IllegalArgumentException("Age cannot be negative");
                }
                this.age = age;
            }

            public String getMajor() {
                return major;
            }

            public void setMajor(String major) {
                this.major = major;
            }

            public int getStudentId() {
                coursesTaken++; 
                return studentId;
            }

            public void setStudentId(int studentId) {
                if (studentId < 0) {
                    throw new IllegalArgumentException("Student ID cannot be negative");
                }
                this.studentId = studentId;
            }

            public double getGpa() {
                return gpa;
            }

            public void setGpa(double gpa) {
                if (gpa < 0.0 || gpa > 4.0) {
                    throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
                }
                this.gpa = gpa;
            }

            public int getCoursesTaken() {
                return coursesTaken;
            }
        }

    }

}
