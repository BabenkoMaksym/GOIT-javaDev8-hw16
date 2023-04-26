package ua.goit.homework16;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GroceryStoreTest {

    final GroceryStore groceryStore = new GroceryStore();


    @Test
    public void testCalculateTotalCostShouldReturnOk() {
        //given
        String input = " ABCDABA";
        //when
        Double actualResult = groceryStore.calculateTotalCost(input);
        //then
        Double expectedResult = 13.25D;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testProductsCount() {
        //given
        //when
        int actualLength = Products.values().length;
        //then
        int expectedLength = 4;
        assertEquals(actualLength, expectedLength);
    }

    @ParameterizedTest(name = "#{index} - Run test with arguments input={0} expectedResult={1}")
    @MethodSource("predefinedData")
        public void testCalculateTotalCostParametrizedShouldCompleteCorrect(String input, Double expectedResult) {
        //given
        //when
        Double actualResult = groceryStore.calculateTotalCost(input);
        //then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testProductA() {
        //given
        String strName = "A";
        Double productPrice = 1.25D;
        Integer productStockCount = 3;
        Double productStockPrice = 3.0D;

        //when

        //then
        assertEquals(strName, Products.A.getStrName());
        assertEquals(productPrice, Products.A.getProductPrice());
        assertEquals(productStockCount, Products.A.getProductStockCount());
        assertEquals(productStockPrice, Products.A.getProductStockPrice());
    }

    @Test
    public void testProductB() {
        //given
        String strName = "B";
        Double productPrice = 4.25D;
        Integer productStockCount = null;
        Double productStockPrice = null;

        //when

        //then
        assertEquals(strName, Products.B.getStrName());
        assertEquals(productPrice, Products.B.getProductPrice());
        assertEquals(productStockCount, Products.B.getProductStockCount());
        assertEquals(productStockPrice, Products.B.getProductStockPrice());
    }

    @Test
    public void testProductC() {
        //given
        String strName = "C";
        Double productPrice = 1.0D;
        Integer productStockCount = 6;
        Double productStockPrice = 5.0D;

        //when

        //then
        assertEquals(strName, Products.C.getStrName());
        assertEquals(productPrice, Products.C.getProductPrice());
        assertEquals(productStockCount, Products.C.getProductStockCount());
        assertEquals(productStockPrice, Products.C.getProductStockPrice());
    }

    @Test
    public void testProductD() {
        //given
        String strName = "D";
        Double productPrice = 0.75D;
        Integer productStockCount = null;
        Double productStockPrice = null;

        //when

        //then
        assertEquals(strName, Products.D.getStrName());
        assertEquals(productPrice, Products.D.getProductPrice());
        assertEquals(productStockCount, Products.D.getProductStockCount());
        assertEquals(productStockPrice, Products.D.getProductStockPrice());
    }

    static Stream<Arguments> predefinedData() {
        return Stream.of(
                Arguments.arguments(" ABCDABA", 13.25D),
                Arguments.arguments("AAAA", 4.25D),
                Arguments.arguments("AAA", 3D),
                Arguments.arguments("AA", 2.5D),
                Arguments.arguments("BB", 8.5D),
                Arguments.arguments("B", 4.25D),
                Arguments.arguments("CCCCCCC", 6D),
                Arguments.arguments("CCCCCC", 5D),
                Arguments.arguments("CCCCC", 5D),
                Arguments.arguments("D", 0.75D),
                Arguments.arguments("DD", 1.5D),
                Arguments.arguments("ABCD", 7.25D),
                Arguments.arguments("AAABCCCCCCCDD", 14.75D)
        );
    }
}