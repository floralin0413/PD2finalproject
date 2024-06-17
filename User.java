package com;

public class User {
    private String name = null;
    private int gender = -1; 
    private int age = -1; 
    private double height = -1; 
    private double weight = -1; 
    private double bmi = -1; 
    private int dailyCalorieNeeds = -1; 
    public FoodRecord record = new FoodRecord();
    private Food sum = new Food();

    public void calculateBMI() {
        this.bmi = weight / ((height / 100) * (height / 100));
    }   
    
    public double getBMI() {
        return bmi;
    }   

    public void calculateDailyCalorieNeeds() {
        if (bmi < 18.5) {
            dailyCalorieNeeds = (int) Math.round(weight * 40);
        } else if (bmi >= 24) {
            dailyCalorieNeeds = (int) Math.round(weight * 30);
        } else {
            dailyCalorieNeeds = (int) Math.round(weight * 35);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public double getBmi() {
        return bmi;
    }

    public int getDailyCalorieNeeds() {
        return dailyCalorieNeeds;
    }
}
