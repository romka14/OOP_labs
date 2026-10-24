class Tabouret implements Chair {
    @Override 
    public void prepareMaterials() {
        System.out.println("Подготовили ножки");
        System.out.println("Подготовили сидушку табурета");
        System.out.println("Отдаем детали на сборку");
    }

    @Override
    public void putTogether() {
        System.out.println("Читаем инструкцию...");
        System.out.println("Прикручиваем ножки к сидушке");
        System.out.println("Отдаем на продажу");
    }

    @Override
    public void giveToBuyer() {
        System.out.println("Размещаем объявлене продажи табурета");
        System.out.println("Договариваемся о сделке");
        System.out.println("Отдаем на продажу");
    }
}