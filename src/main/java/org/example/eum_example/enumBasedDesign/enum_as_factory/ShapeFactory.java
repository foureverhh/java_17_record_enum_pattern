package org.example.eum_example.enumBasedDesign.enum_as_factory;

abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}
public enum ShapeFactory {
    CIRCLE {
        @Override
        Shape createShape() {
            return new Circle();
        }
    },
    SQUARE {
        @Override
        Shape createShape() {
            return new Square();
        }
    },
    TRIANGLE {
        @Override
        Shape createShape() {
            return new Triangle();
        }
    };

    abstract Shape createShape();

    public static void main(String[] args) {
        ShapeFactory.CIRCLE.createShape().draw();
        ShapeFactory.SQUARE.createShape().draw();
        ShapeFactory.TRIANGLE.createShape().draw();
    }
}
