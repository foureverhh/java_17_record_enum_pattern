package org.example.eum_example.enumBasedDesign.enum_validator;

public enum Validator {
    IS_NUMBERIC {
        @Override
        boolean validate(String input) {
            return input.matches("\\d+");
        }
    },
    IS_EMAIL {
        @Override
        boolean validate(String input) {
            return input.matches("^\\w+@\\w+\\.\\w+$");
        }
    },
    IS_NOT_EMPTY {
        @Override
        boolean validate(String input) {
            return input != null && !input.trim().isEmpty();
        }
    };


    abstract boolean validate(String input);

    public static void main(String[] args) {
        boolean isEmail = Validator.IS_EMAIL.validate("foureverhh@gamil.com");
        System.out.println(isEmail? "Email is valid" : "Email is not valid");
    }
}
