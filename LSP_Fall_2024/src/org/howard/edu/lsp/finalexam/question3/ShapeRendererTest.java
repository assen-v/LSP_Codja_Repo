package org.howard.edu.lsp.finalexam.question3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Test cases for verifying the ShapeFactory and ShapeRenderer classes.
 */
public class ShapeRendererTest {

    /**
     * Test that ShapeFactory returns a Circle instance when asked for "circle".
     */
    @Test
    public void testFactoryReturnsCircle() {
        Shape shape = ShapeFactory.getInstance().getShape("circle");
        assertNotNull(shape, "Factory should return a shape instance for 'circle'");
        assertTrue(shape instanceof Circle, "Factory should return a Circle object");
    }

    /**
     * Test that ShapeFactory returns a Rectangle instance when asked for "rectangle".
     */
    @Test
    public void testFactoryReturnsRectangle() {
        Shape shape = ShapeFactory.getInstance().getShape("rectangle");
        assertNotNull(shape, "Factory should return a shape instance for 'rectangle'");
        assertTrue(shape instanceof Rectangle, "Factory should return a Rectangle object");
    }

    /**
     * Test that ShapeFactory returns a Triangle instance when asked for "triangle".
     */
    @Test
    public void testFactoryReturnsTriangle() {
        Shape shape = ShapeFactory.getInstance().getShape("triangle");
        assertNotNull(shape, "Factory should return a shape instance for 'triangle'");
        assertTrue(shape instanceof Triangle, "Factory should return a Triangle object");
    }

    /**
     * Test that ShapeFactory returns null for an unknown shape type.
     */
    @Test
    public void testFactoryReturnsNullForUnknownShape() {
        Shape shape = ShapeFactory.getInstance().getShape("hexagon");
        assertNull(shape, "Factory should return null for an unknown shape type");
    }

    /**
     * Test that ShapeRenderer can handle a known shape without errors.
     * We aren't capturing console output here, but we ensure no exceptions are thrown.
     */
    @Test
    public void testRendererWithKnownShape() {
        ShapeRenderer renderer = new ShapeRenderer();
        assertDoesNotThrow(() -> renderer.renderShape("circle"), 
            "Renderer should not throw an exception for a known shape 'circle'");
    }

    /**
     * Test that ShapeRenderer can handle an unknown shape without throwing an exception.
     */
    @Test
    public void testRendererWithUnknownShape() {
        ShapeRenderer renderer = new ShapeRenderer();
        assertDoesNotThrow(() -> renderer.renderShape("hexagon"), 
            "Renderer should not throw an exception for an unknown shape 'hexagon'");
    }
}
