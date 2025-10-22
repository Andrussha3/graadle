package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    
    @Test
    public void shouldCalculateWhereAmountBiggerThanBoundaryWithReminder(){
        int amount = 2500;
        int expected = 500;
        assertEquals(expected, service.remain(amount));
    }
    
    @Test
    public void shouldCalculateWhereAmountBiggerThanBoundaryWithoutReminder(){
        int amount = 2000;
        int expected = 1000;
        assertEquals(expected, service.remain(amount));
    }
    
    @Test
    public void shouldCalculateWhereAmountLowerThanBoundary(){
        int amount = 700;
        int expected = 300;
        assertEquals(expected, service.remain(amount));
    }
    
    @Test
    public void shouldCalculateWhereAmountEqualsBoundary(){
        int amount = 1000;
        int expected = 0;
        assertEquals(expected, service.remain(amount));
    }
}
