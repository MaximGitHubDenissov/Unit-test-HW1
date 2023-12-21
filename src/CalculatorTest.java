import static org.assertj.core.api.Assertions.*;


public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        assertThat(calc.calculateDiscount(1000.0,0.1)).isEqualTo(900.0);
        assertThat(calc.calculation(10,8,'-')).isEqualTo(2);



    }

}
