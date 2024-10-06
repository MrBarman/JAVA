package Streams.TraderTransactionUsingStream;

public class TraderModel {
    private final String name;
    private final String city;

    public TraderModel(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "{" +
                "name: '" + name + '\'' +
                ", city: '" + city + '\'' +
                '}';
    }
}
