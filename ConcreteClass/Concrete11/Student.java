package ConcreteClass.Concrete11;

class Student {
    String name;
    String address;
    int roll;

    Student(String name, String address, int roll) {
        this.name = name;
        this.address = address;
        this.roll = roll;
    }

    void details(){
        System.out.println("Name:" + name + "Address:" + address + "Roll:" + roll);
    }
}
