public class Cat extends Animal {
    
    private String breed;      
    private String color;      
    private boolean isDomestic; 

    public Cat(String name, int age, double weight, String breed, String color, boolean isDomestic) {
        super(name, age, weight); 
        this.breed = breed;
        this.color = color;
        this.isDomestic = isDomestic;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean domestic) {
        isDomestic = domestic;
    }

    public void purr() {
        System.out.println(getName() + " мурлычет");
    }

    public void scratch() {
        System.out.println(getName() + " царапается");
    }

    public void catchMouse() {
        System.out.println(getName() + " ловит мышь");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Мяу!");
    }
}