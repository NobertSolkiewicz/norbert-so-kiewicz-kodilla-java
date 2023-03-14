package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD: Shape Test Suite")
 class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is beggining of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @BeforeEach
    public void before() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @DisplayName("Test for Shape")
    @Nested
    class TestShape {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector(new Triangle());
            Shape shape = new Circle();

            //When
            shapeCollector.addFigure(shape);

            //Then
            assertEquals(1, shapeCollector);
        }

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector(new Triangle());

            //When
            shapeCollector.getFigure(0);
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);

            //Then
            assertEquals(shapeCollector, retrievedShape);
        }

        @Test
        void testRemoveShapeNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector(new Triangle());
            Shape shape = new Circle();

            //When
            shapeCollector.addFigure(shape);
            boolean result = shapeCollector.removeFigure(shape);

            //Then
            assertFalse(result);
        }

        @Test
        void testRemoveShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector(new Triangle());
            Shape shape = new Circle();
            shapeCollector.addFigure(shape);

            //When
            boolean result = shapeCollector.removeFigure(shape);

            //Then
            assertTrue(result);
            assertEquals(0, shapeCollector);
        }
    }
}
