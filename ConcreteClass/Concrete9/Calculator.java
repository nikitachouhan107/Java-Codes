package ConcreteClass.Concrete9;

class Calculator {
    int add(int a, int b){
        return a+b;
    }
    void run(){
        System.out.println("Sum = " + add(10, 20));
    }
}
