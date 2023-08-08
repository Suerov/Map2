import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City(2, "City A"));
        cities.add(new City(5, "City B"));
        cities.add(new City(4, "City C"));
        cities.add(new City(7, "City D"));
        cities.add(new City(1, "City E"));
        cities.add(new City(6, "City F"));
        cities.add(new City(3, "City G"));

        Set<City> treeSet = new TreeSet<>();
        for (City city : cities) {
            if (city.getCode() % 2 == 1) {
                treeSet.add(city);
            }
        }

        for (City city : treeSet) {
            System.out.println(city);
    }
    }
}