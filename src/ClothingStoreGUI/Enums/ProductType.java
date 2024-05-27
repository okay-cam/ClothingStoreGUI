package ClothingStoreGUI.Enums;

public enum ProductType {
    CLOTHING("Clothing"), SHOES("Shoes");
    
    private static final ProductType[] VALUES = values();
    private final String displayName;

    ProductType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static String[] toStringArray() {
        String[] array = new String[VALUES.length];
        for (int i = 0; i < VALUES.length; ++i) {
            array[i] = VALUES[i].displayName;
        }
        return array; // {"Clothing", "Shoes"};
    }
    
    // convert int to enum
    public static ProductType intToType(int value) {
        if (value >= 0 && value < VALUES.length) {
            return VALUES[value];
        }
        return CLOTHING;
    }
}
