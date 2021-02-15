package web.model;

/**
 * @author pavelsmirnov
 */
public class Car {

    private String model;
    private String color;
    private int number;

    public Car() {
    }

    public Car(String model, String color, int number) {
        this.model = model;
        this.color = color;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }
}
