import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurants = new HashSet<>();

        restaurants.add(new Restaurant("Restaurante A", 5));
        restaurants.add(new Restaurant("Restaurante B", 7));
        restaurants.add(new Restaurant("Restaurante C", 8));
        restaurants.add(new Restaurant("Restaurante B", 7));
        restaurants.add(new Restaurant("Restaurante A", 5));
        restaurants.add(new Restaurant("Restaurante A", 7));
        restaurants.add(new Restaurant("Restaurante C", 8));

        System.out.println(restaurants);
        System.out.println();

        for (Restaurant restaurant : restaurants) {
            System.out.println("Nombre: " + restaurant.getName() + ", Puntuación: " + restaurant.getScore());
        }
    }
}