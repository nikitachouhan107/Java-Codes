package AbstractClass.Abstract13;

class Honda extends Car{
    String brand;

    Honda(String brand){
        this.brand = brand;
    }

    void run(){
        System.out.println("Brand :"+brand);
    }
}
