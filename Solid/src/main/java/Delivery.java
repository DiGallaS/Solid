public class Delivery extends GoodsAndServices implements Сourier, Packaging {
    //Interface Segregation Principle - применяем разные интерфейсы вместо одного большого
    //Dependency Inversion Principle - разделив интерфейсы мы не зависим от их общей функциональности.

    private final String name = "Доставка";
    private final int price = 450;
    private final String measureUnit = "шт.";


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getMeasureUnit() {
        return measureUnit;
    }

    @Override
    public void tracking() {
        System.out.println("Курьер забрал заказ");
    }

    @Override
    public void packaging() {
        System.out.println("Заказ собран");
    }

}
