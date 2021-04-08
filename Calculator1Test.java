public class Calculator1Test {
    public static void main(String[] args) {
        Calculator1 c = new Calculator1();
        c.setOperandOne(10.0);
        c.setOperation("+");
        c.setOperandTwo(5.5);
        c.performOperation();
        c.getResults();
    }

}
