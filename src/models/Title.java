package models;

public abstract class Title {

    protected String title;
    protected String literatureType;
    protected int copies;
    protected double rate = 0.067574;

    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    public abstract double calculatePoints();

    public double convertLiteratureType() {
        return switch (literatureType) {
            case "BI", "TE" -> 3;
            case "LYRIK" -> 6;
            case "SKØN" -> 1.7;
            case "FAG" -> 1;
            default -> 0;
        };
    }

    public double calculateRoyalty() {
        return calculatePoints() * rate;
    }
}
