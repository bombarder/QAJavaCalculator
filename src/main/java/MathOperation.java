
public enum MathOperation implements Calculation{
    ADDITION{
        @Override
        public double calculate(double firstValue, double secondValue) {
            return firstValue + secondValue;
        }
    },
    SUBTRACTION{
        @Override
        public double calculate(double firstValue, double secondValue) {
            return firstValue - secondValue;
        }
    },
    MULTIPLICATION{
        @Override
        public double calculate(double firstValue, double secondValue) {
            return firstValue * secondValue;
        }
    },
    DIVISION{
        @Override
        public double calculate(double firstValue, double secondValue) {
            return firstValue / secondValue;
        }
    }
}
