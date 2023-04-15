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

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        clearConsole();
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%-30s%-60s%s", "|", "WELCOME TO TAX CALCULATOR SYSTEM", "|\n");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%10s%s", "", "[1] Withholding Tax\n");
        System.out.printf("%10s%s", "", "[2] Payable Tax\n");
        System.out.printf("%10s%s", "", "[3] Income Tax\n");
        System.out.printf("%10s%s", "", "[4] Social Security Contribution Levy (SSCL) Tax\n");
        System.out.printf("%10s%s", "", "[5] Leasing Payment\n");
        System.out.printf("%10s%s", "", "[6] Exit Application\n");
        System.out.println();
        System.out.print("Enter and option to continue > ");
        System.out.print("New Line ");
    }
}
