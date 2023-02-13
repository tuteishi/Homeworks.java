package homework6InterfacesEnams;

public enum Body {
    OUTDATED_BODY("Outdated body"),
    CLASSIC_BODY("Classic body"),
    MODERN_BODY("Modern body");
    private final String namePart;
    Body(String namePart) {
        this.namePart = namePart;
    }

    @Override
    public String toString() {
        return " Body {" +
                "namePart='" + namePart + '\'' +
                '}';
    }
}
