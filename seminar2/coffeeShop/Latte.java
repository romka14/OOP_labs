class Latte implements Coffee {
    @Override 
    public void makeCofee() {
        System.out.println("Варю эспрессо");
        System.out.println("Пеню молоко");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Наливаю молоко");
        System.out.println("Наливаю сверху эспрессо");
    }
}