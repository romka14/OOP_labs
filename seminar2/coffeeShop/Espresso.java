
class Espresso implements Coffee {
    @Override
    public void makeCofee() {
        System.out.println("Варю эспрессо");
        System.out.println("Только кофе и почти никакой воды");

    }

    @Override
    public void pourIntoCup() {
        System.out.println("Наливаю в маленькую чашку");
    }

}


