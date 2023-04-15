import java.util.*;

public class iHungryBurgerShop {
    public static void clearConsole() {
        try {
            String var0 = System.getProperty("os.name");
            if (var0.contains("Windows")) {
                (new ProcessBuilder(new String[]{"cmd", "/c", "cls"})).inheritIO().start().waitFor();
            } else {
                System.out.print("\u001b[H\u001b[2J");
                System.out.flush();
            }
        } catch (Exception var1) {
            var1.printStackTrace();
        }

    }

    public static int invalidInputCheck(int input, int minValue, int maxValue) {
        
        return input;

    }
    
    public static int mainWindow() {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-30s%-50s%s", "|", "iHungry Burger", "|\n");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-45s%s","[1] Add New Customer","[2] Place Order\n");
        System.out.printf("%-45s%s","[3] Search Best Customer","[4] Search Order\n");
        System.out.printf("%-45s%s","[5] Search Customer","[6] View Order\n");
        System.out.printf("%-45s%s","[7] Update Order Details","[8] Exit\n");
        System.out.println();
        System.out.print("Enter and option to continue > ");
        return input.nextInt();
    }

    public static void main(String[] args) throws Exception {
        clearConsole();
        int x = mainWindow();
        System.out.println(x);
        
        
    }
}
