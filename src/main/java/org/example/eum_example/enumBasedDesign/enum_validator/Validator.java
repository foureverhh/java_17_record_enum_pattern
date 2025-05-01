package org.example.eum_example.enumBasedDesign.enum_validator;

import java.util.function.Predicate;

public enum Validator {
    IS_NUMBERIC {
        @Override
        boolean validate(String input) {
            //return input.matches("\\d+");
            return numberValidator.test(input);
        }
    },
    IS_EMAIL {
        @Override
        boolean validate(String input) {
            // return input.matches("^\\w+@\\w+\\.\\w+$");
            return emailValidator.test(input);
        }
    },
    IS_NOT_EMPTY {
        @Override
        boolean validate(String input) {
            // return input != null && !input.trim().isEmpty();
            return notEmptyValidator.test(input);
        }
    };


    abstract boolean validate(String input);

    Predicate<String> emailValidator =  email -> email.matches("^\\w+@\\w+\\.\\w+$");
    Predicate<String> numberValidator = number -> number.matches("^\\d+$");
    Predicate<String> notEmptyValidator = input -> input != null && !input.trim().isEmpty();

    public static void main(String[] args) {
        boolean isEmail = Validator.IS_EMAIL.validate("foureverhh@gamil.com");
        System.out.println(isEmail? "Email is valid" : "Email is not valid");
    }
}
