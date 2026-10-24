class Ikea extends FurnitureFactory {
    @Override
    protected Chair createChair(ChairType type) {
        System.out.println("Собираем заказ стула в ИКЕА");
        if (type == ChairType.TABOURET) {
            System.out.println("Ваша табуретка готова!");
            return new Tabouret();
        }
        else if (type == ChairType.OFFICECHAIR) {
            System.out.println("Ваш офисный стул собран!");
            return new OfficeChair();
        }
            
        else {
            System.out.println("Ваше кресло собрано!");
            return new ArmChair();
        }
    }

    @Override
    protected Table createTable(TableType type) {
        System.out.println("Собираем заказ стола в ИКЕА");
        if (type == TableType.DINNER) {
            System.out.println("Ваша обеденный стол готов!");
            return new DinnerTable();
        }
        else if (type == TableType.JOURNAL)
            return new JournalTable();
        else 
            return new WritingTable();
    }
}