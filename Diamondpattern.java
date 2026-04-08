class DiamondPattern {
    public static void main(String[] args) {

        int n = 5;

        // Top half
        for(int i = 1; i <= n; i++) {

            for(int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            for(int star = 1; star <= 2*i - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom half
        for(int i = n-1; i >= 1; i--) {

            for(int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            for(int star = 1; star <= 2*i - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}