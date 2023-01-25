public class Coffee extends GoodsAndServices {
    //Single Responsibility Principle - предназначен исключительно для Кофе.
    private final String name = "Кофе";
    private final int price = 450;
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