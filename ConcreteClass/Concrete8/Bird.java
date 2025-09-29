package ConcreteClass.Concrete8;

class Bird {
    static class Sparrow{
        String color;

        Sparrow(String color){
            this.color = color;
        }

        void fly(){
            System.out.println("Color:" +color);
        }
    }
}
