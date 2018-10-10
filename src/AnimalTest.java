public class AnimalTest {

    public static void main(String[] args) {

        Dog dog1 = new Dog(300, 40, 6);
        System.out.println(dog1.Run(200));
        System.out.println(dog1.Swim(49));
        System.out.println(dog1.Jump(5));
        Dog dog2 = new Dog();
        System.out.println(dog2.Run(400));
        System.out.println(dog2.Jump(20));
        System.out.println(dog2.Swim(12));

        Cat cat1 = new Cat();
        System.out.println(cat1.Run(300));
        Cat cat2 = new Cat(1200, 300);
        System.out.println(cat2.Run(1000));
        System.out.println(cat1.Swim());
        
    }
}
