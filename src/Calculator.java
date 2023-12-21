public class Calculator {
    public int calculation(int firstOperand, int secondOperand, char operator) {
        int result;
        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand !=0) {
                    result = firstOperand / secondOperand;
                } else throw new ArithmeticException("Делить на ноль нельзя");
                break;
            default:
                throw new IllegalStateException("Неправильный оператор" + operator);
        }
        return result;
    }
    public double calculateDiscount(double purchaseAmount, double discountAmount){
        double result;
        if (discountAmount >=0){
            result = purchaseAmount - purchaseAmount*discountAmount;
        }
        else throw new ArithmeticException("Скидка не может быть ниже нуля");
        return result;
    }
}


