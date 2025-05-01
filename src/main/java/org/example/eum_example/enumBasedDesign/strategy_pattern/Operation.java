package org.example.eum_example.enumBasedDesign.strategy_pattern;

public enum Operation {

    ADD {
        @Override
        int apply(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT {
        @Override
        int apply(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY {
        @Override
        int apply(int a, int b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        int apply(int a, int b) {
            return a / b;
        }
    };

    abstract int apply(int a, int b);

    public static void main(String[] args) {
        int add = Operation.ADD.apply(1,2);
        System.out.println(add);
        int subtract = Operation.SUBTRACT.apply(1,2);
        System.out.println(subtract);
    }
}
