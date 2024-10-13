import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");

        String[] shoppingList = new String[8];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Отобразить список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить работу");

            int actionNumber = scanner.nextInt();

            if (actionNumber == 1) {
                System.out.println("Введите название товара:");
                if (productCount < shoppingList.length) {
                    String productName = scanner.next();
                    shoppingList[productCount] = productName;
                    productCount++;
                    System.out.println("Товар " + productName + " добавлен в список под номером " + (productCount));
                } else {
                    System.out.println("Список товаров заполнен. Бользе завести товаров нельзя.");
                }
            } else if (actionNumber == 2) {
                if (productCount == 0) {
                    System.out.println("Список товаров пуст!");
                } else {
                    System.out.println("Список товаров:");
                    for (int i = 0; i < productCount; i++) {
                        System.out.println((i + 1) + ". " + shoppingList[i]);
                    }
                }
            } else if (actionNumber == 3) {
                while (productCount != 0) {
                    shoppingList[productCount - 1] = null;
                    productCount--;
                }
                System.out.println("Список товаров очищен");


            } else if (actionNumber == 4) {
                System.out.println("До скорых встреч!");
                break;
            } else {
                System.out.println("Неизвестная команда!");
            }
        }
    }
}