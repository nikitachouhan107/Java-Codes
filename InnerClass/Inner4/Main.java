package InnerClass.Inner4;

public class Main {
    public static void main(String[] args) {
        University u = new University();
        University.Department d = u.new Department();
        d.showDept();
    }
}
