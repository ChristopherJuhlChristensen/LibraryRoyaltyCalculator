package models;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public double calculateTotalPay() {
        double total = 0;
        for (Title title : titles) {
            total += title.calculateRoyalty();
        }
        return Math.round(total * 100.0) / 100.0;  // Afrundet til 2 decimaler
    }

    public String getName() {
        return name;
    }
}
