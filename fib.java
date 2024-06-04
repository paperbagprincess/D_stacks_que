public class fib {
    public static void main(String[] args) {
        int firstTerm = 0;
        int secondTerm = 1;
        int numberOfTerms = 10; 

        System.out.print(firstTerm + ", ");
        System.out.print(secondTerm + ", ");

        for (int i = 2; i < numberOfTerms; ++i) {
            int nextTerm = firstTerm + secondTerm;
            System.out.println(nextTerm + ", ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
