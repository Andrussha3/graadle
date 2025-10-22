package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    
    @Test
    public void shouldCalculateWhereAmountBiggerThanBoundaryWithReminder(){
        int amount = 2500;
        int expected = 500;
        Assert.assertEquals(expected, service.remain(amount));
    }
    
    @Test
    public void shouldCalculateWhereAmountBiggerThanBoundaryWithoutReminder(){
        int amount = 2000;
        int expected = 0;  // Исправлено: 2000 % 1000 = 0
        Assert.assertEquals(expected, service.remain(amount));
    }
    
    @Test
    public void shouldCalculateWhereAmountLowerThanBoundary(){
        int amount = 700;
        int expected = 300;
        Assert.assertEquals(expected, service.remain(amount));
    }
    
    @Test
    public void shouldCalculateWhereAmountEqualsBoundary(){
        int amount = 1000;
        int expected = 0;  // Исправлено: 1000 % 1000 = 0
        Assert.assertEquals(expected, service.remain(amount));
    }
    
    // Дополнительные тесты для проверки граничных случаев
    @Test
    public void shouldReturnZeroWhenAmountIsZero(){
        int amount = 0;
        int expected = 0;  // 0 % 1000 = 0
        Assert.assertEquals(expected, service.remain(amount));
    }
    
    @Test
    public void shouldCalculateWhenAmountIsJustAboveBoundary(){
        int amount = 1001;
        int expected = 999;  // 1000 - (1001 % 1000) = 1000 - 1 = 999
        Assert.assertEquals(expected, service.remain(amount));
    }
    
    @Test
    public void shouldCalculateWhenAmountIsJustBelowBoundary(){
        int amount = 999;
        int expected = 1;  // 1000 - 999 = 1
        Assert.assertEquals(expected, service.remain(amount));
    }
}
