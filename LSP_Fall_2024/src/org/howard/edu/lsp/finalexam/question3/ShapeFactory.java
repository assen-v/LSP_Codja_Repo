package org.howard.edu.lsp.finalexam.question3;

public class ShapeFactory {
    // single instance
    private static ShapeFactory instance;

    // private constructor to prevent instantiation
    private ShapeFactory() {}

    // static method to get the single instance
    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    // factory method
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        shapeType = shapeType.trim().toLowerCase();
        switch (shapeType) {
            case "circle": return new Circle();
            case "rectangle": return new Rectangle();
            case "triangle": return new Triangle();
            default: return null;
        }
    }
}
