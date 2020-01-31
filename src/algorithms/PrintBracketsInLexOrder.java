package algorithms;

public class PrintBracketsInLexOrder {

    public static void main(String[] x){
        System.out.println("Hello PrintBracketsInLexOrder!!!");

        int n = 5;

        printBrackets(n);
        System.out.println("\n");

        for (int i = 0; i <n ; i++) {
            printBracketsRecursive(n-i, "(", 0);
            printBracketsRecursive(n-i, ")", 0);

            printBracketsRecursive(n, "(", i);
            printBracketsRecursive(n, ")", i);
            System.out.print(" ");
        }

    }

    private static void  printBracketsRecursive(int n, String symbol, int counter){


        if(counter>=n) return;

        System.out.print(symbol);
        counter = counter+1;
        printBracketsRecursive(n, symbol, counter);

    }

    private static void printBrackets(int n){

        for(int i=n; i>0; i--){

            for(int j=i; j>0; j--){
                System.out.print("(");
            }

            for(int k=i; k>0; k--){
                System.out.print(")");
            }

            for(int j=n-i; j>0; j--){
                System.out.print("(");
            }
            for(int j=n-i; j>0; j--){
                System.out.print(")");
            }
            System.out.print(" ");

            if(i==1 && n>2){
                for (int j = 0; j <n ; j++) {
                    System.out.print("()");
                }
            }
        }

    }
}
