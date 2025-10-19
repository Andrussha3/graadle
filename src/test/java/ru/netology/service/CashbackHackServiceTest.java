package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    public void shouldCalculateWhereAmountBiggerThanBoundaryWithReminder(){
        int amount = 2500;
        int expected = 500;

        Assert.assertEquals(service.remain(amount),expected);

    }
    @Test
    public void shouldCalculateWhereAmountBiggerThanBoundaryWithoutReminder(){
        int amount = 2000;
        int expected = 1000;

        Assert.assertEquals(service.remain(amount),expected);

    }
    @Test
    public void shouldCalculateWhereAmountLowerThanBoundary(){
        int amount = 700;
        int expected = 300;

        Assert.assertEquals(service.remain(amount),expected);
    }
    @Test
    public void shouldCalculateWhereAmountEqualsBoundary(){
        int amount = 1000;
        int expected = 0;

        Assert.assertEquals(service.remain(amount),expected);
    }

}