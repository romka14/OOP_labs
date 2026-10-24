class DinnerTable implements Table {
    @Override
    public void prepareParts() {
        System.out.println("Подготовили большие ножки");
        System.out.println("Подготовили мраморную столешницу");
        System.out.println("Подготовили крепежи");
        System.out.println("Передали на сборку");
    }

    @Override
    public void assembleTable() {
        System.out.println("Разобрали детали");
        System.out.println("Присоединили к мраморной столешнице большие ножки");
        System.out.println("Закрутили гайки");
        System.out.println("Отдали на продажу");
    }

    @Override
    public void sendToBuyer() {
        System.out.println("Выставили обьявление о продаже обеденного стола");
        System.out.println("Созвонились с покупателем");
        System.out.println("Согласовали цену");
        System.out.println("Доставили покупателю");
    }
}