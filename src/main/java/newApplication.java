import java.util.ArrayList;
import java.util.List;

public class newApplication {

    public static void main(String[] args) {
        Dog fido = new Dog ("collie", "fido");
        Dog rover = new Dog("Lab", "rover");

        System.out.println(fido.getName());
        System.out.println(rover.getName());
        fido.speak();
        List<String> str = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();
        animals.add(fido);
        animals.add(rover);
        animals.add(new Cat());

        //below iterates through each animal in the list and makes that animal speak using the method
        animals.forEach(animal -> {
            animal.speak();
        });
    }
}
