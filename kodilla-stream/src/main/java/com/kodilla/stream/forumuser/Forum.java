package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();


    public Forum() {
        theUserList.add(new ForumUser(1, "Marek", 'M', LocalDate.of(2002, 10 ,5), 1));
        theUserList.add(new ForumUser(2, "Filip", 'F', LocalDate.of(2012, 12, 15), 8));
        theUserList.add(new ForumUser(3, "Odzwierny", 'M', LocalDate.of(1992, 1, 25), 132));
        theUserList.add(new ForumUser(4, "Angelo", 'F', LocalDate.of(1999, 6, 11), 98));
        theUserList.add(new ForumUser(5, "Gabriel", 'M', LocalDate.of(1980, 3, 23), 21));
        theUserList.add(new ForumUser(6, "Krzysiek", 'M', LocalDate.of(2023, 8, 31), 3));
        theUserList.add(new ForumUser(7, "Marian", 'F', LocalDate.of(1986, 10, 1), 3378));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theUserList);
    }
}
