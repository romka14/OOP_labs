abstract class FurnitureFactory {
    protected abstract Chair createChair(ChairType type);
    protected abstract Table createTable(TableType type);

    public void takeOrderChair(ChairType type) {
        Chair chair = createChair(type);
        chair.prepareMaterials();
        chair.putTogether();
        chair.giveToBuyer();
    }

    public void takeOrderTable(TableType type) {
        Table table = createTable(type);
        table.prepareParts();
        table.assembleTable();
        table.sendToBuyer();
    }
}