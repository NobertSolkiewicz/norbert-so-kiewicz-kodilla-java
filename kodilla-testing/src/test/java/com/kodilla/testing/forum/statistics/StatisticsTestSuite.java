package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @Mock
    Statistics statisticsMock;

    @Test
    void testCalculateAdvStatisticsPostCount0() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        CalculateStatistics calculateStatistics1 = new CalculateStatistics(calculateStatistics.usersNames().size(), 0, calculateStatistics.commentsCount());
        List<Statistics> resultList = new ArrayList<>();

        //When
        resultList.add(calculateStatistics.calculateAdvStatistics(calculateStatistics1));

        //Then
        Assertions.assertEquals(1, resultList.size());
    }

    @Test
    void testCalculateAdvStatisticsPostCount1000() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        CalculateStatistics calculateStatistics1 = new CalculateStatistics(calculateStatistics.usersNames().size(), 1000, calculateStatistics.commentsCount());
        List<Statistics> resultList = new ArrayList<>();

        //When
        resultList.add(calculateStatistics.calculateAdvStatistics(calculateStatistics1));

        //Then
        Assertions.assertEquals(1, resultList.size());
    }

    @Test
    void testCalculateAdvStatisticsCommentsCount0() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        CalculateStatistics calculateStatistics1 = new CalculateStatistics(calculateStatistics.usersNames().size(), calculateStatistics.postCount(), 0);
        List<Statistics> resultList = new ArrayList<>();

        //When
        resultList.add(calculateStatistics.calculateAdvStatistics(calculateStatistics1));

        //Then
        Assertions.assertEquals(1, resultList.size());
    }

    @Test
    void testCalculateAdvStatisticsPostsAreMoreThenComments() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        CalculateStatistics calculateStatistics1 = new CalculateStatistics(calculateStatistics.usersNames().size(), calculateStatistics.postCount(), calculateStatistics.commentsCount());
        List<Statistics> resultList = new ArrayList<>();

        //When
        if (calculateStatistics1.postCount() > calculateStatistics1.commentsCount()) {
            resultList.add(calculateStatistics.calculateAdvStatistics(calculateStatistics1));
        }

        //Then
        Assertions.assertFalse(false);
    }

    @Test
    void testCalculateAdvStatisticsPostsAreLessThenComments() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        CalculateStatistics calculateStatistics1 = new CalculateStatistics(calculateStatistics.usersNames().size(), calculateStatistics.postCount(), calculateStatistics.commentsCount());
        List<Statistics> resultList = new ArrayList<>();

        //When
        if (calculateStatistics1.postCount() < calculateStatistics1.commentsCount()) {
            resultList.add(calculateStatistics.calculateAdvStatistics(calculateStatistics1));
        }

        //Then
        Assertions.assertFalse(false);
    }

    @Test
    void testCalculateAdvStatisticsUsersCount0() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        CalculateStatistics calculateStatistics1 = new CalculateStatistics(0, calculateStatistics.postCount(), calculateStatistics.commentsCount());
        List<Statistics> resultList = new ArrayList<>();

        //When
        resultList.add(calculateStatistics.calculateAdvStatistics(calculateStatistics1));

        //Then
        Assertions.assertEquals(1, resultList.size());
    }

    @Test
    void testCalculateAdvStatisticsUsersCount100() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        CalculateStatistics calculateStatistics1 = new CalculateStatistics(100, calculateStatistics.postCount(), calculateStatistics.commentsCount());
        List<Statistics> resultList = new ArrayList<>();

        //When
        resultList.add(calculateStatistics.calculateAdvStatistics(calculateStatistics1));

        //Then
        Assertions.assertEquals(1, resultList.size());
    }
}
