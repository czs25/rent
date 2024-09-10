package whh.sww.java;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        computers[0] = new Computer("Dell", "黑色", 3800.0);
        computers[1] = new Computer("Lenovo", "黑色", 4800.0);
        computers[2] = new Computer("Apple", "白色", 8800.0);
        computers[3] = new Computer("Lenovo", "灰色", 5800.0);
        computers[4] = new Computer("Dell", "白色", 2800.0);

        //1.求是否存在品牌为联想的电脑
        String brand="Lenovo";
        searchComputer(computers,brand);

        //2.求品牌中是否含有“Len”字
        String containBrand="len";
        searchContainBrandComputer(computers,containBrand);

        //3.查找以"Len"开头的电脑品牌
        String startname="Len";
        searchStartBrandComputer(computers,startname);


        //4.查找[3000,5000]区间电脑价格
        int maxPrice=5000;
        int minPrice=3000;
        searchPriceComputer(computers, minPrice, maxPrice);



    }


    //1.求是否存在品牌为联想的电脑
    public static String searchComputer(Computer[] computers, String brand) {
        for (Computer computer : computers) {
            if (computer.getBrand().equals(brand))
                System.out.println("存在品牌为联想的电脑");
            else
                System.out.println("不存在品牌为联想的电脑");
        }
    }


    //2.求品牌中是否含有“Len”字
    public static String searchContainBrandComputer(Computer[] computers, String containBrand) {
        System.out.println("名字包含Len的电脑是");
        for (Computer computer : computers) {
            if (computer.getBrand().contains(contains(containBrand));{
                System.out.println( computer.getBrand());
            }
        }
    }


    //3.查找以"Len"开头的电脑品牌
    public static void searchStartBrandComputer(Computer[] computers, String startName) {
        System.out.println("品牌以" + startName + "开头的电脑是:");
        for (Computer computer : computers) {
            if (computer.getBrand().startsWith(startName)) {
                System.out.println(computer.getBrand());
            }
        }
    }





    //4.查找[3000,5000]区间电脑价格
    public static String searchPriceComputer(Computer[] computers,int minPrice, int maxPrice){
        System.out.println("价格在3000-5000的电脑有:");
        for(Computer computer : computers){
            if(computer.getPrice() >= minPrice && computer.getPrice() <= maxPrice)
                System.out.println(computer.getPrice());
            else
                break;
        }

    }

}





