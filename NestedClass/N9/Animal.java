package NestedClass.N9;

class Animal {
    static class Bird{
        String color;

        Bird(String color){
            this.color = color;
        }

        void fly(){
            System.out.println("Sparrow is of "+color+" color.");
        }
    }
}
