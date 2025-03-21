Dette projekt beregner bibliotekspenge for forfattere baseret på deres bøger ved hjælp af en Java-applikation.
Mappestruktur:
/LibraryRoyalties
│── src/
│   ├── models/
│   │   ├── Author.java
│   │   ├── Title.java
│   │   ├── AudioBook.java
│   │   ├── PrintedBook.java
│   ├── LibraryRoyaltyCalculator.java

Beskrivelse af klasser
Title.java: Abstrakt klasse, der definerer fælles egenskaber og metoder for bøger.
PrintedBook.java: Underklasse af Title, der repræsenterer en trykt bog.
AudioBook.java: Underklasse af Title, der repræsenterer en lydbog.
Author.java: Indeholder forfatteroplysninger og beregner total bibliotekspenge.
LibraryRoyaltyCalculator.java: Main-program, der tester funktionaliteten.
