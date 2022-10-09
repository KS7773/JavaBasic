/**
 *
 * Java Basic. Home Work #8
 * @autor Sergej Kel
 * @todo 28.9.2022
 * @date 9.10.2022
 */
public class JavaBasic8Lesson {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "red", 2, 1);
        System.out.println(cat);
        System.out.println("Try to play:" + cat.play());
        cat.feed();
        System.out.println("Try to play: " + cat.play());
        System.out.println("Try to palay: " + cat.play());
        cat.feed();
        System.out.println("Try to Jump: " +cat.jump(1));
        cat.feed();
        System.out.println("Try to jump: " + cat.jump(2));
    }
}