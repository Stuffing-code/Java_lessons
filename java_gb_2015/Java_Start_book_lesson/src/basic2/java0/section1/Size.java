package basic2.java0.section1;

public enum Size {
    VERY_SMALL("XS"),SMALL("S"), AVERAGE("M"), BIG("L"), VERY_BIG("XL");

    private String abbreviation;

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
