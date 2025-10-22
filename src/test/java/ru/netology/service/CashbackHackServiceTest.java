package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    public void shouldCalculateWhereAmountBiggerThanBoundaryWithReminder(){
        int amount = 2500;
        int expected = 500;

        Assert.assertEquals(expected,service.remain(amount));

    }
    @Test
    public void shouldCalculateWhereAmountBiggerThanBoundaryWithoutReminder(){
        int amount = 2000;
        int expected = 1000;

        Assert.assertEquals(expected,service.remain(amount));

    }
    @Test
    public void shouldCalculateWhereAmountLowerThanBoundary(){
        int amount = 700;
        int expected = 300;

        Assert.assertEquals(expected,service.remain(amount));
    }
    @Test
    public void shouldCalculateWhereAmountEqualsBoundary(){
        int amount = 1000;
        int expected = 0;

        Assert.assertEquals(expected,service.remain(amount));
    }
}
