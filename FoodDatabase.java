import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class FoodDatabase {
    private List<Food> foods;

    public FoodDatabase(String path) throws IOException {
        this.foods = new ArrayList<>();
        setDatabase(path);
    }

    private void setDatabase(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = reader.readLine()) != null) {
            Food food = new Food();
            String[] splits = line.split("\\s+");
            food.setName(splits[0]);
            food.setCalories(Integer.parseInt(splits[1]));
            food.setProtein(Integer.parseInt(splits[2]));
            food.setFat(Integer.parseInt(splits[3]));
            food.setCarbs(Integer.parseInt(splits[4]));
            food.setSodium(Integer.parseInt(splits[5]));
            food.setPotassium(Integer.parseInt(splits[6]));
            food.setCalcium(Integer.parseInt(splits[7]));
            food.setMagnesium(Integer.parseInt(splits[8]));
            food.setIron(Integer.parseInt(splits[9]));
            food.setZinc(Integer.parseInt(splits[10]));
            food.setPhosphorus(Integer.parseInt(splits[11]));
            food.setCholesterol(Integer.parseInt(splits[12]));
            foods.add(food);
        }
    }

    public List<Food> getFoods() {
        return foods;
    }

    public Food search(String name) {
        for (Food food : foods) {
            if (food.getName().equals(name)) {
                return food;
            }
        }
        return null;
    }

    public void addFood(Food food) {
        foods.add(food);
    }
}
