package ru.netology;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void spendingLessThanThousand() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void havingSpentMoreThanThousand() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1500);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void spendZero() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void fullAmount() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}