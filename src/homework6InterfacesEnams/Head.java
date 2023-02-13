package homework6InterfacesEnams;

public enum Head {
    OUTDATED_HEAD("Outdated head"),
    CLASSIC_HEAD ("Classic head"),
    MODERN_HEAD("Modern head");
    private final String namePart;

    Head(String namePart) {
        this.namePart = namePart;
    }

    @Override
    public String toString() {
        return " Head {" +
                "namePart='" + namePart + '\'' +
                '}';
    }
}
