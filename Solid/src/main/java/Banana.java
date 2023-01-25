public class Banana extends GoodsAndServices {
    //Single Responsibility Principle - предназначен исключительно для бананов.
    private final String name = "Бананы";
    private final int price = 89;
    private final String measureUnit = "кг.";

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
