package com.kodilla.paterns.strategy.social;

import com.kodilla.patterns.strategy.*;
import com.kodilla.patterns.strategy.social.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User marcin = new Millenials("Marcin, Kowalski");
        User anna = new YGeneration("Anna Nowak");
        User brian = new ZGeneration("Brian Jeżycki");

        //When
        String maricinShare = marcin.sharePost();
        System.out.println("Marcin share: " + maricinShare);
        String annaShare = anna.sharePost();
        System.out.println("Anna share: " + annaShare);
        String brianShare = brian.sharePost();
        System.out.println("Brian share: " + brianShare);

        //Then
        assertEquals("Facebook", maricinShare);
        assertEquals("Twitter", annaShare);
        assertEquals("Snapchat", brianShare);

    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User marcin = new Millenials("Marcin, Kowalski");

        //When
        String maricinShare = marcin.sharePost();
        System.out.println("Marcin share: " + maricinShare);
        marcin.setSocialPublisher(new SnapchatPublisher());
        maricinShare = marcin.sharePost();
        System.out.println("Marcin share: " + maricinShare);

        //Then
        assertEquals("Snapchat", maricinShare);

    }
}
