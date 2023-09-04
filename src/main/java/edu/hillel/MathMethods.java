package edu.hillel;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class MathMethods
{
    public static BigDecimal Multiplication(BigDecimal a, BigDecimal b){
        return a.multiply(b);
    }

    public static BigDecimal Addition(BigDecimal a,BigDecimal b){
        return a.add(b);
    }
    public static BigDecimal Subtraction(BigDecimal a,BigDecimal b){
        return a.subtract(b);
    }

    public static int intRandomInRange(int min, int max) throws NonCorrectRangeException {
        if (min>max){
            throw new NonCorrectRangeException("Min value {"+min+"} can't be greater than max value {"+max+"}");
        }
        return (min + (int)(Math.random() * ((max - min) + 1)));
    }

    public static class NonCorrectRangeException extends Exception{
        public NonCorrectRangeException() {
            super();
        }

        public NonCorrectRangeException(String message) {
            super(message);
        }

        public NonCorrectRangeException(String message, Throwable cause) {
            super(message, cause);
        }

        public NonCorrectRangeException(Throwable cause) {
            super(cause);
        }

        protected NonCorrectRangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message,
                    cause,
                    enableSuppression,
                    writableStackTrace);
        }
    }
}
