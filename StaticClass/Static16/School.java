package StaticClass.Static16;

class School {
    static class Student {
        private String name;
        private int grade;

        Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        void show() {
            System.out.println("Student: " + name + ", Grade: " + grade);
        }
    }
}