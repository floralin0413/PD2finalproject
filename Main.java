package com;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "data.txt";

        Scanner sc = new Scanner(System.in);
        //FoodDatabase foodDatabase = new FoodDatabase(path);
        List<User> users = new ArrayList<>();

        while (true) {
            User user = opening(sc, users);
            System.out.println("您好，" + user.getName());

            boolean service = true;
            while (service) {
                System.out.println("歡迎使用本服務，請按下數字鍵1、2或3來選擇您需要的功能");
                //System.out.println("<1> 查看個人資料");
                System.out.println("<1> 輸入今日所攝取的食物");
                System.out.println("<2> 結算今日營養攝取");
                System.out.println("<3> 結束本服務");
                System.out.print("您所選擇的功能：");
                int option = sc.nextInt();

                switch (option) {
                    //case 1:

                        //break;
                    case 1:
                        //System.out.print("<1> 查詢  <2> 自行輸入 ：");
                        //int choose = sc.nextInt();
                        //if (choose == 1) {
                            //Food result = foodDatabase.search(sc.next());
                            //if (result == null) {
                                //System.out.println("查無結果");
                            //} else {
                                //user.record.addFood(result);
                                //System.out.println(result.getName() + "已加入記錄\n" + result.toString());
                            //} 
                        //} else if (choose == 2) {
                            Food result = input(sc);
                            user.record.addFood(result);
                            //foodDatabase.addFood(result);
                            System.out.println(result.getName() + " 已加入記錄\n" + result.toString());
                        //} 
                        break;
                    case 2:
                        advise(user);
                        break;
                    case 3:
                        System.out.println("謝謝您的使用，祝您有愉快的一天！");
                        service = false;
                        break;
                    default:
                        System.out.println("不好意思，您的選項不在範圍內～");
                }
            }
        }
    }

    public static User opening(Scanner sc, List<User> users) {
        System.out.print("歡迎，請問要如何稱呼您：");
        String name = sc.next();

        for (User u : users) {
            if (u.getName().equals(name)) {
                return u;
            }
        }

        User user = new User();
        user.setName(name);
        setUser(sc, user);
        users.add(user);
        return user;
    }

    public static void setUser(Scanner sc, User user) {
        System.out.print("請輸入您的生理性別(1.男性 2.女性)：");
        int gender = sc.nextInt();
        user.setGender(gender);

        System.out.print("請輸入您的年齡(歲)：");
        int age = sc.nextInt();
        user.setAge(age);

        System.out.print("請輸入您的身高(公分)：");
        double height = sc.nextDouble();
        user.setHeight(height);

        System.out.print("請輸入您的體重(公斤)：");
        double weight = sc.nextDouble();
        user.setWeight(weight);

        user.calculateBMI();
        System.out.println("您的BMI值為：" + user.getBMI());

        user.calculateDailyCalorieNeeds();
        System.out.println(user.getName() + " 一日所需的熱量為" + user.getDailyCalorieNeeds() + "大卡");

        sc.nextLine();
    }

    public static Food input(Scanner sc) {
            Food food = new Food();

            System.out.println("請輸入食物資訊：");
        
            System.out.print("食物名稱: ");
            food.setName(sc.next());

            System.out.print("熱量: ");
            food.setCalories(sc.nextInt());

            System.out.print("蛋白質: ");
            food.setProtein(sc.nextInt());

            System.out.print("脂肪: ");
            food.setFat(sc.nextInt());

            System.out.print("碳水化合物: ");
            food.setCarbs(sc.nextInt());

            System.out.print("鈉: ");
            food.setSodium(sc.nextInt());

            System.out.print("鉀: ");
            food.setPotassium(sc.nextInt());

            System.out.print("鈣: ");
            food.setCalcium(sc.nextInt());

            System.out.print("鎂: ");
            food.setMagnesium(sc.nextInt());

            System.out.print("鐵: ");
            food.setIron(sc.nextInt());

            System.out.print("鋅: ");
            food.setZinc(sc.nextInt());

            System.out.print("磷: ");
            food.setPhosphorus(sc.nextInt());

            System.out.print("膽固醇: ");
            food.setCholesterol(sc.nextInt());

            return food;
    }

    public static void advise(User user) {
        if (user.record.getTotalProtein() < 1.1 * user.getWeight()) {
            System.out.println("今日攝取「蛋白質」不足");
            System.out.println("您每日蛋白質建議攝取量為：" + (1.1 * user.getWeight()) + "克");
        }

        if (user.record.getTotalFat() > 0.3 * user.record.getTotalCalories()) {
            System.out.println("今日攝取「脂肪」已過量");
            System.out.println("您每日脂肪建議攝取量為：" + (0.2 * user.getDailyCalorieNeeds() / 9) + "克");
        }

        if (user.record.getTotalCarbs() > 0.75 * user.record.getTotalCalories()) {
            System.out.println("今日攝取「碳水化合物」已過量");
        }

        if (user.record.getTotalSodium() > 2400) {
            System.out.println("今日攝取「鈉」已過量");
        }

        if (user.getGender() == 1 && user.record.getTotalPotassium() < 2500) {
            System.out.println("今日攝取「鉀」不足");
            System.out.println("您每日鉀建議攝取量為：2500毫克");
        } else if (user.getGender() == 2 && user.record.getTotalPotassium() < 2168) {
            System.out.println("今日攝取「鉀」不足");
            System.out.println("您每日鉀建議攝取量為：2168毫克");
        }

        if (user.getAge() <= 9 && user.record.getTotalCalcium() < 800) {
            System.out.println("今日攝取「鈣」不足");
            System.out.println("您每日鈣質建議攝取量為：800毫克");
        } else if (user.getAge() <= 12 && user.record.getTotalCalcium() < 1000) {
            System.out.println("今日攝取「鈣」不足");
            System.out.println("您每日鈣質建議攝取量為：1000毫克");
        } else if (user.getAge() <= 18 && user.record.getTotalCalcium() < 1200) {
            System.out.println("今日攝取「鈣」不足");
            System.out.println("您每日鈣質建議攝取量為：1200毫克");
        } else if (user.getAge() > 18 && user.record.getTotalCalcium() < 1500) {
            System.out.println("今日攝取「鈣」不足");
            System.out.println("您每日鈣質建議攝取量為：1500毫克");
        }

        if (user.getGender() == 1 && user.record.getTotalMagnesium() < 385) {
            System.out.println("今日攝取「鎂」不足");
            System.out.println("您每日鎂建議攝取量為：385毫克");
        } else if (user.getGender() == 2 && user.record.getTotalMagnesium() < 325) {
            System.out.println("今日攝取「鎂」不足");
            System.out.println("您每日鎂建議攝取量為：325毫克");
        }

        if (user.getGender() == 1 && user.record.getTotalIron() < 8) {
            System.out.println("今日攝取「鐵」不足");
            System.out.println("您每日鐵質建議攝取量為：8毫克");
        } else if (user.getGender() == 2 && user.record.getTotalIron() < 18) {
            System.out.println("今日攝取「鐵」不足");
            System.out.println("您每日鐵質建議攝取量為：18毫克");
        }

        if (user.getGender() == 1 && user.record.getTotalZinc() < 15) {
            System.out.println("今日攝取「鋅」不足");
            System.out.println("您每日鋅建議攝取量為：15毫克");
        } else if (user.getGender() == 2 && user.record.getTotalZinc() < 12) {
            System.out.println("今日攝取「鋅」不足");
            System.out.println("您每日鋅建議攝取量為：12毫克");
        }

        if (user.getGender() == 1 && user.record.getTotalPhosphorus() > 1800) {
            System.out.println("今日攝取「磷」已過量");
        } else if (user.getGender() == 2 && user.record.getTotalPhosphorus() > 1000) {
            System.out.println("今日攝取「磷」已過量");
        }

        if (user.record.getTotalCholesterol() > 3000) {
            System.out.println("今日攝取「膽固醇」已過量");
        }
    }
}
