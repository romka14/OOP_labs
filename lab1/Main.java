public class Main {
    public static void main(String[] args) {
        Kitten kitten = new Kitten("Барсик", 0, 0.5, "Британская", "серый", true, 2, false, "Мурка");

        kitten.eat();
        kitten.sleep();
        kitten.makeSound(); 
        kitten.purr();
        kitten.scratch();
        kitten.catchMouse();

        kitten.play();
        kitten.drinkMilk();
        kitten.grow();

        System.out.println("Порода: " + kitten.getBreed());
        System.out.println("Возраст в месяцах: " + kitten.getAgeInMonths());
    }
}