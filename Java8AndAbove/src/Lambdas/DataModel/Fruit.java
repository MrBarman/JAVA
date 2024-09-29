package Lambdas.DataModel;

public class Fruit {
    String name;
    double weight;
    String colour;
    String origin;

    public Fruit(String name, double weight, String colour, String origin) {
        this.name = name;
        this.weight = weight;
        this.colour = colour;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public String getOrigin() {
        return origin;
    }

    @Override
    public String toString() {
        return "\n{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
