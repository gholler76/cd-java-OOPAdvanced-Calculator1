class Calculator1 implements java.io.Serializable {
    private String name;
    private Double operandOne;
    private Double operandTwo;
    private String operation;

    public Calculator1() {
    }

    public Calculator1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getOperandOne() {
        return operandOne;
    }

    public void setOperandOne(Double num) {
        this.operandOne = num;
    }

    public Double getOperandTwo() {
        return operandTwo;
    }

    public void setOperandTwo(Double num) {
        this.operandTwo = num;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operator) {
        if (operator == "+" || operator == " - ") {
            this.operation = operator;
        } else {
            System.out.println("Your operator must be a '+' or a '-'. Please re-enter.");
        }
    }

    public Double performOperation() {
        Double opOne = getOperandOne();
        Double opTwo = getOperandTwo();
        String opType = getOperation();
        Double result = 0.0;
        if (opType == "+") {
            result = opOne + opTwo;
        } else {
            result = opOne - opTwo;
        }
        return result;
    }

    public void getResults() {
        System.out.println("Your calculation was: " + getOperandOne() + " " + getOperation() + " " + getOperandTwo());
        System.out.println("The result is: " + performOperation());
    }

}
