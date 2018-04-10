package com.kodilla.good.patterns.challenges.Food2DoorOrderingSystem;

import java.util.ArrayList;
import java.util.List;

public class Producers {
    private List<Producer> producers = new ArrayList<>();

    public void addProducer(Producer producer) {
        producers.add(producer);
    }

    public void removeProducer(Producer producer) {
        producers.remove(producer);
    }

    public boolean isProducerInBase(Producer producer) {
        if (producers.contains(producer)) {
            return true;
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
