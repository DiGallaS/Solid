import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Liskov substitution principle - наследники класса Product полностью играют роль предка
        GoodsAndServices[] goodsAndServices = {new Bread(), new Banana(), new Coffee(), new Delivery()};
        //принцип DRY - повторяющийся вывод списка в отдельном методе
        printProucts(goodsAndServices);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер и количество или введите `end` что бы перейти к оплате.");
            String input = scanner.nextLine();
            if ("end".equals(input)) break;
            String[] parts = input.split(" ");
            int numberChoice = Integer.parseInt(parts[0]) - 1;
            goodsAndServices[numberChoice].setCount(Integer.parseInt(parts[1]));
        }
        printBasket(goodsAndServices);

    }

    private static void printProucts(GoodsAndServices[] goodsAndServices) {
        System.out.println("Доступные товары и услуги: ");
        //Magic Numbers Principle - неиспользуем числа на прямую.
        for (int i = 0; i < goodsAndServices.length; i++) {
            System.out.println((i + 1) + ". " + goodsAndServices[i].getName() + " - "
                    + goodsAndServices[i].getPrice() + " " + "руб. за 1 " + goodsAndServices[i].getMeasureUnit());
        }
    }

    private static void printBasket(GoodsAndServices[] goodsAndServices) {
        int cost = 0;
        System.out.println("Ваша корзина: ");
        for (GoodsAndServices choice : goodsAndServices) {
            if (choice.getCount() != 0) {
                cost += choice.getCount() * choice.getPrice();
                System.out.println(choice.getName() + ": Количество = " + choice.getCount() + " " + choice.getMeasureUnit()
                        + " Цена за 1 " + choice.getMeasureUnit() + " = " + choice.getPrice() + " " + "руб."
                        + " Стоимость = " + choice.getCount() * choice.getPrice() + " " + "руб.");
            }
        }
        System.out.println("Итого: " + cost + " " + "руб.\n  Спасибо за покупку!!!");
    }
}