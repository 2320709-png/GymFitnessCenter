package com.group8.gymfitnesscenter.Nutritionist;

import java.time.LocalDate;

public class comparisonTable {
    private String Dietplan;
    private String Food;
    private String Matchorunmatch;

    public comparisonTable(String food, String dietplan, String matchorunmatch) {
        Food = food;
        Dietplan = dietplan;
        Matchorunmatch = matchorunmatch;
    }

    public String getDietplan() {
        return Dietplan;
    }

    public void setDietplan(String dietplan) {
        Dietplan = dietplan;
    }

    public String getFood() {
        return Food;
    }

    public void setFood(String food) {
        Food = food;
    }

    public String getMatchorunmatch() {
        return Matchorunmatch;
    }

    public void setMatchorunmatch(String matchorunmatch) {
        Matchorunmatch = matchorunmatch;
    }

    @Override
    public String toString() {
        return "comparisonTable{" +
                "Dietplan='" + Dietplan + '\'' +
                ", Food='" + Food + '\'' +
                ", Matchorunmatch='" + Matchorunmatch + '\'' +
                '}';
    }
}
