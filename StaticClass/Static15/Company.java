package StaticClass.Static15;

class Company {
    static class Employee {
        private String empName;
        private double salary;

        Employee(String empName, double salary) {
            this.empName = empName;
            this.salary = salary;
        }

        void showDetails() {
            System.out.println("Employee: " + empName + ", Salary: " + salary);
        }
    }
}