package Bai4;

public class RunMain {
    public static void main(String[] args) {
        Sum<Integer> integerSum = new Sum<>(3,4);
        System.out.println("SUM INTEGER = " + (integerSum.getA() + integerSum.getB()));
        Sum<Long> longSum = new Sum<>(4L,5L);
        System.out.println("SUM LONG = " + (longSum.getA() + longSum.getB()));
        Sum<Float> floatSum = new Sum<>(3.2f,6.8f);
        System.out.println("SUM FLOAT = " + (floatSum.getA() + floatSum.getB()));
        Sum<Double> doubleSum = new Sum<>(443.43D,6.5656D);
        System.out.println("SUM DOUBLE = " + (doubleSum.getA() + doubleSum.getB()));
    }
}
