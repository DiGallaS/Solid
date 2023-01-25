public class Bread extends GoodsAndServices {
    //Single Responsibility Principle - предназначен исключительно для хлеба.
    private final String name = "Хлеб";
    private final int price = 50;
    private final String measureUnit = "шт.";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMeasureUnit() {
        return measureUnit;
    }

    @Override
    public int getPrice() {
        return price;
    }

}
