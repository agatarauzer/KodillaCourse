package com.kodilla.good.patterns.challenges.Food2DoorOrderingSystem;

import java.util.ArrayList;
import java.util.List;

public class Producers {

    private List<Producer> producers = new ArrayList<>();

    public void addProducer(Producer producer) {
        producers.add(producer);
    }

    public Producer getProducer(Producer producer) {
        if (producers.contains(producer)) {
            return producer;
        }
        else {
            throw new IllegalArgumentException("Producer is not in base!");
        }
    }

    public void showProducers() {
        for (Producer producer : producers) {
            System.out.println(producer);
        }
    }
}
