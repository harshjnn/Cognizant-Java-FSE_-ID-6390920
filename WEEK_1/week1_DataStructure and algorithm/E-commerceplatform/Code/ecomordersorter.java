import java.util.Scanner;

public class ecomordersorter {
    public static void main(String[] args) {
        ecomorder[] orders = {
            new ecomorder("O1", "Harsh", 550.50),
            new ecomorder("O2", "Amber", 200.00),
            new ecomorder("O3", "Kapil", 750.25),
            new ecomorder("O4", "Vikki", 300.75)
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose sorting method:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");

        int choice = sc.nextInt();

        if (choice == 1) {
            bubbleSort(orders);
            System.out.println("Orders sorted using Bubble Sort:");
        } else if (choice == 2) {
            quickSort(orders, 0, orders.length - 1);
            System.out.println("Orders sorted using Quick Sort:");
        } else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        for (ecomorder order : orders) {
            System.out.println(order);
        }

        sc.close();
    }

    public static void bubbleSort(ecomorder[] orders) {
        int count = orders.length;
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    ecomorder temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(ecomorder[] orders, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(orders, low, high);
            quickSort(orders, low, pivotIndex - 1);
            quickSort(orders, pivotIndex + 1, high);
        }
    }

    public static int partition(ecomorder[] orders, int low, int high) {
        double pivotPrice = orders[high].totalPrice;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice < pivotPrice) {
                i++;
                ecomorder temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        ecomorder temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }
}
