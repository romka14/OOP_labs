class WritingTable implements Table{
    @Override
    public void prepareParts() {
        System.out.println("Подготовили средние ножки");
        System.out.println("Подготовили ДСП");
        System.out.println("Подготовили крепежи");
        System.out.println("Передали на сборку");
    }

    @Override
    public void assembleTable() {
        System.out.println("Разобрали детали");
        System.out.println("Присоединили к ДСП средние ножки");
        System.out.println("Закрутили гайки");
        System.out.println("Отдали на продажу");
    }

    @Override
    public void sendToBuyer() {
        System.out.println("Выставили обьявление о продаже письменного стола");
        System.out.println("Созвонились с покупателем");
        System.out.println("Согласовали цену");
        System.out.println("Доставили покупателю");
    }
}