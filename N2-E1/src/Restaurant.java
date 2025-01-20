import java.util.Objects;

public class Restaurant {
    private final String name;
    private final int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Restaurant that = (Restaurant) o;
        return score == that.score && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + score;
        return result;
    }

    @Override
    public String toString() {
        return "Restaurant: " + name + " | Score: " + score;
    }
}
