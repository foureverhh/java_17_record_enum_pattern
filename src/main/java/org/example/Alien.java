package org.example;

public record Alien(int age, String name) {
    public Alien {
        if (age <= 0) {
            throw new IllegalArgumentException("age must bigger than 0");
        }
    }
}

