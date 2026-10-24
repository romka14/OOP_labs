public enum TableType {
    JOURNAL ("JournalTable"),
    WRITING ("WritingTable"),
    DINNER ("DinnerTable");

    private final String description;
    
    TableType(String description) {
        this.description = description;
    }
}