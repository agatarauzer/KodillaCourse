package com.kodilla.good.patterns.challenges.Food2DoorShopOrderingSystem;

import java.util.ArrayList;
import java.util.List;

public class Producers {

    private List<Producer> producers = new ArrayList<>();

    public void addProducer(Producer producer) {
        producers.add(producer);
    }

    public void showProducers() {
        for (Producer producer : producers) {
            System.out.println(producer);
        }
    }
}
