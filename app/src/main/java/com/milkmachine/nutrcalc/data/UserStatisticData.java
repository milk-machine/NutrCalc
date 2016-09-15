package com.milkmachine.nutrcalc.data;

import java.util.ArrayList;

public class UserStatisticData {
    private float percent;
    private String nutrient;

    public UserStatisticData() {
    }

    public UserStatisticData(String nutrient, float percent) {
        this.nutrient = nutrient;
        this.percent = percent;
    }

    public ArrayList<UserStatisticData> getInfo() {
        ArrayList<UserStatisticData> info = new ArrayList<>();

        info.add(new UserStatisticData("Mg", 1f));
        info.add(new UserStatisticData("B12", 0.5f));
        info.add(new UserStatisticData("C", 0.3f));
        info.add(new UserStatisticData("A", 0.0f));

        return info;
    }

    public String getNutrient() {
        return nutrient;
    }

    public float getPercent() {
        return percent;
    }
}
