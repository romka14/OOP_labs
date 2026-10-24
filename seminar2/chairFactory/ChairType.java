public enum ChairType {
    TABOURET ("Tabouret"),
    OFFICECHAIR ("OfficeChair"),
    ARMCHAIR ("ArmChair");

    private final String description;

    ChairType(String description) {
        this.description = description;
    }
}