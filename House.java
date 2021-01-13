import java.util.ArrayList;
import java.util.Scanner;

public class House {

    public static int gen_id = 0;
    public int id;
    public String name;
    public int useable_space;
    public double price;

    public House(String name, int useable_space, double price) {
        gen_id++;
        id = gen_id;
        this.name = name;
        this.useable_space = useable_space;
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<House> list = new ArrayList<>();
        list.add(new House("Central luxurious apartment", 120, 150));
        list.add(new House("Suburban 2-story house", 80, 20));
        list.add(new House("Old apartment near city center", 45, 35));
        list.add(new House("Newly built 5-story house, wide alley", 250, 170));
        System.out.println("Input Minimum Space: ");
        int min_space = sc.nextInt();
        System.out.println("Input Maximum Price: ");
        double max_price = sc.nextDouble();
        System.out.println("Suitable House: ");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).useable_space >= min_space && list.get(i).price <= max_price) {
                House house = list.get(i);
                System.out.println(house.id + " Name: " + house.name + " Useable space: " + house.useable_space + " Price: " + house.price);
            }
        }
    }
}
