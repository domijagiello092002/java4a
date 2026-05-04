package com.university.techcorp.events;

import com.university.techcorp.domain.Company;

public class MarketSlowdownEvent implements GameEvent {

    @Override
    public void apply(Company company) {
        company.reduceCash(5000);
        System.out.println("Market slowdown! -5000 cash");
    }
}