public class CaffeineBeverageDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
        System.out.println("\nMaking coffe...");
        coffee.prepareRecipe();
    }
}
