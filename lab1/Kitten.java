public class Kitten extends Cat {
    
    private int ageInMonths;
    private boolean isWeaned;   
    private String motherName;  

    public Kitten(String name, int age, double weight, String breed, String color,
                  boolean isDomestic, int ageInMonths, boolean isWeaned, String motherName) {
        super(name, age, weight, breed, color, isDomestic); 
        this.ageInMonths = ageInMonths;
        this.isWeaned = isWeaned;
        this.motherName = motherName;
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public boolean isWeaned() {
        return isWeaned;
    }

    public void setWeaned(boolean weaned) {
        isWeaned = weaned;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public void play() {
        System.out.println(getName() + " играет с клубком ниток");
    }

    public void drinkMilk() {
        System.out.println(getName() + " пьёт молоко у мамы " + motherName);
    }

    public void grow() {
        ageInMonths++;
        System.out.println(getName() + " подрос, теперь ему " + ageInMonths + " месяцев");
    }
}