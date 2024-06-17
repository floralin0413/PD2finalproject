class Food {
    private String name = null;
    private int calories = 0;
    private int protein = 0;
    private int fat = 0;
    private int carbs = 0;
    private int sodium = 0;
    private int potassium = 0;
    private int calcium = 0;
    private int magnesium = 0;
    private int iron = 0;
    private int zinc = 0;
    private int phosphorus = 0;
    private int cholesterol = 0;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getProtein() {
        return protein;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getFat() {
        return fat;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public int getSodium() {
        return sodium;
    }

    public void setPotassium(int potassium) {
        this.potassium = potassium;
    }

    public int getPotassium() {
        return potassium;
    }

    public void setCalcium(int calcium) {
        this.calcium = calcium;
    }

    public int getCalcium() {
        return calcium;
    }

    public void setMagnesium(int magnesium) {
        this.magnesium = magnesium;
    }

    public int getMagnesium() {
        return magnesium;
    }

    public void setIron(int iron) {
        this.iron = iron;
    }

    public int getIron() {
        return iron;
    }

    public void setZinc(int zinc) {
        this.zinc = zinc;
    }

    public int getZinc() {
        return zinc;
    }

    public void setPhosphorus(int phosphorus) {
        this.phosphorus = phosphorus;
    }

    public int getPhosphorus() {
        return phosphorus;
    }

    public void setCholesterol(int cholesterol) {
        this.cholesterol = cholesterol;
    }

    public int getCholesterol() {
        return cholesterol;
    }


    public String toString() {
        return "食物: " + name + " 熱量: " + calories + " 蛋白質: " + protein + " 脂肪: " + fat + " 碳水化合物: " + carbs + " 鈉: " + sodium
            + " 鉀: " + potassium + " 鈣: " + calcium + " 鎂: " + magnesium + " 鐵: " + iron + " 鋅: " + zinc + " 磷: " + phosphorus + " 膽固醇: " + cholesterol;
    }
}
