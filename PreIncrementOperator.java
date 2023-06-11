public class PreIncrementOperator {
    public static void main(String[] args) {
        int variable = 8;
        System.out.println("Original Value: " + variable);

        // using pre-increment operator
        int preIncrement = ++variable;
        System.out.println("variable = " + variable);
        System.out.println("preIncrement = " + preIncrement);
        System.out.println("++preIncrement = " + ++preIncrement);
    }
}
