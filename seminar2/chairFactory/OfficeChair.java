class OfficeChair implements Chair {
    @Override 
    public void prepareMaterials() {
        System.out.println("Подготовили колесики");
        System.out.println("Подготовили спинку стула");
        System.out.println("Подготовили сидушку стула");
        System.out.println("Отдаем детали на сборку офисного стула");

    }

    @Override
    public void putTogether() {
        System.out.println("Читаем инструкцию...");
        System.out.println("Соединяем спинку и сидушку");
        System.out.println("Прикручиваем колесики");
        System.out.println("Отдаем на продажу");
    }

    @Override
    public void giveToBuyer() {
        System.out.println("Размещаем объявлене продажи офисного стула");
        System.out.println("Договариваемся о сделке с главой отдела офиса");
        System.out.println("Отдаем офисный стул на продажу");
    }
}