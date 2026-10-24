class ArmChair implements Chair {
    @Override 
    public void prepareMaterials() {
        System.out.println("Подготовили ножки");
        System.out.println("Подготовили спинку кресла");
        System.out.println("Подготовили сидушку кресла");
        System.out.println("Подготовили кожаную обивку кресла");
        System.out.println("Отдаем детали на сборку кресла");

    }

    @Override
    public void putTogether() {
        System.out.println("Читаем инструкцию...");
        System.out.println("Соединяем спинку и сидушку");
        System.out.println("Добавляем обивку");
        System.out.println("Прикручиваем колесики");
        System.out.println("Отдаем на продажу");
    }

    @Override
    public void giveToBuyer() {
        System.out.println("Размещаем объявлене продажи кресла");
        System.out.println("Созваниваемся с покупателем");
        System.out.println("Доставляем кресло покупателю");
    }
}