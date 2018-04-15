package com.kodilla.knights;

public class Knight {
    private Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void checkQuest() {
        quest.process();
    }
}
