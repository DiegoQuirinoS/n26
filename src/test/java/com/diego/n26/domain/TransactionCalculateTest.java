package com.diego.n26.domain;

import org.junit.Test;

import java.util.ArrayList;

public class TransactionCalculateTest {

    Calculate calculate = new TransactionCalculate();

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWithStaticsNull(){
        calculate.calculate(null, new ArrayList<>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWithTransactionsListNull(){
        Statistics statistics = new Statistics(1, new CustomOperations());
        calculate.calculate(null, null);
    }
}
