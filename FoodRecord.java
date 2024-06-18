package com;

import java.util.ArrayList;
import java.util.List;

public class FoodRecord {
    private List<Food> record = new ArrayList<>();

    public void addFood(Food food) {
        record.add(food);
    }

    public List<Food> getFoodRecord() {
        return record;
    }

    public int getTotalCalories() {
        int total = 0;
        for (Food food : record) {
            total += food.getCalories();
        }
        return total;
    }

    public int getTotalProtein() {
        int total = 0;
        for (Food food : record) {
            total += food.getProtein();
        }
        return total;
    }

    public int getTotalFat() {
        int total = 0;
        for (Food food : record) {
            total += food.getFat();
        }
        return total;
    }

    public int getTotalCarbs() {
        int total = 0;
        for (Food food : record) {
            total += food.getCarbs();
        }
        return total;
    }

    public int getTotalSodium() {
        int total = 0;
        for (Food food : record) {
            total += food.getSodium();
        }
        return total;
    }

    public int getTotalPotassium() {
        int total = 0;
        for (Food food : record) {
            total += food.getPotassium();
        }
        return total;
    }

    public int getTotalCalcium() {
        int total = 0;
        for (Food food : record) {
            total += food.getCalcium();
        }
        return total;
    }

    public int getTotalMagnesium() {
        int total = 0;
        for (Food food : record) {
            total += food.getMagnesium();
        }
        return total;
    }

    public int getTotalIron() {
        int total = 0;
        for (Food food : record) {
            total += food.getIron();
        }
        return total;
    }

    public int getTotalZinc() {
        int total = 0;
        for (Food food : record) {
            total += food.getZinc();
        }
        return total;
    }

    public int getTotalPhosphorus() {
        int total = 0;
        for (Food food : record) {
            total += food.getPhosphorus();
        }
        return total;
    }

    public int getTotalCholesterol() {
        int total = 0;
        for (Food food : record) {
            total += food.getCholesterol();
        }
        return total;
    }
}
