package web.model;

public class Car {
    private String model;

    private int number;

    private String color;

    @Override
    public String toString() {
        return "CarController{" +
                "model='" + model + '\'' +
                ", number=" + number +
                ", color='" + color + '\'' +
                '}';
    }

    public Car(String model, int number, String color) {
        this.model = model;
        this.number = number;
        this.color = color;
    }

    public String getModel() {
        return model;
    }
    public int getNumber() {
        return number;
    }
    public String getColor() {
        return color;
    }

}
