package ConcreteClass.Concrete21;

class Dog {
    String breed;
    int age;

    Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    void bark() {
        System.out.println(breed + " is barking!");
    }
}
