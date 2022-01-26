public class Dog implements Animal {

    private String name;
    //generally you want to keep attributes of a class private, if you need to access that outside the class, create a method that allows that access, rather then making the attribute public
    private String breed;

    public Dog(String breedName, String name) {
        this.breed = breedName;
        this.name = name;
        //'this' refers to the instance of this class
    }

    public String getName(){
        return name;
    }

    public void speak(){
        System.out.println("Woof!");
    }



}
