package com.example;

import java.util.List;

public class LionAlex extends Lion{
    public LionAlex(Predator predator) throws Exception {
        super("Самец", predator);
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йорский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
