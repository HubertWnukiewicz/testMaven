import java.text.DecimalFormat;

public class Product {
    private String name;
    private double weight;
    private double value;
    private DecimalFormat df = new DecimalFormat("###0.00");

    public Product(String name, double weight, double value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", amount=" + df.format(weight) +
                ", value=" + df.format(value) +
                '}';
    }
}
