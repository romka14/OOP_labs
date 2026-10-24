public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory;
        factory = new Ikea();
        factory.takeOrderChair(ChairType.ARMCHAIR);
        factory.takeOrderTable(TableType.JOURNAL);
    }
}