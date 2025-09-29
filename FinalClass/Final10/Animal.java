package FinalClass.Final10;

final class Animal {
    String species;
    int age;

    Animal(String species, int age){
        this.species = species;
        this.age = age;
    }
     final void eat(){
         System.out.println("Species "+ "lives " + age + "years.");
     }
}
