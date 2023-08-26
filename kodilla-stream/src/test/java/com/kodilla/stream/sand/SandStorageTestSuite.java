package com.kodilla.stream.sand;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SandStorageTestSuite {

    @Test
    void testGetSandBeansQuantity() {
        //Given
//        List<SandStorage> continents = new ArrayList<>();
//        continents.add(new Europe());
//        continents.add(new Africa());
//        continents.add(new Asia());
//
//        //When
//        BigDecimal totalSand = BigDecimal.ZERO;
//        for (SandStorage continent : continents) {
//            totalSand.add(continent.getSandBeansQuantity());
//        }
//
//        //Then
//        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
//        assertEquals(expectedSand, totalSand);
    }

    @Test
    void testGetSandBeansQuantityWithReduce() {
        //Given
        List<SandStorage> continent = new ArrayList<>();
        continent.add(new Europe());
        continent.add(new Africa());
        continent.add(new Asia());

        //When
        BigDecimal totalSand = continent.stream()
                .map(SandStorage::getSandBeansQuantity)
                .reduce(BigDecimal.ZERO, (sum, cuurent) -> sum = sum.add(cuurent));

        //Then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        assertEquals(expectedSand, totalSand);
    }
}
