package ConcreteClass.Concrete5;
//Static class cn be implemented in the concrete class
//A concrete class can contain a nested static class.

class Device {
    static class Phone{
        void use(){
            System.out.println("Phone is used for various purpose");
        }
    }
}
