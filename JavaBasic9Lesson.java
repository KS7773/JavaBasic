/**
 *
 * Java Basic. Home Work #9
 * @autor Sergej Kel
 * @todo 5.9.2022
 * @date 9.10.2022
 */
public class JavaBasic9Lesson {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "red", 2);
        Dog dog = new Dog("Polkan", "black", 5);
        IAnimal[] animals = {cat, dog};

        for (IAnimal animal : animals) {
             System.out.println(animal);
             System.out.println(animal.voice());
        }
    }
}