package org.example.soildprinciple.InterfaceRegregationPrinciple;

import java.util.Arrays;
import java.util.List;

public class DrinkMenu implements IDrinkMenu{
    @Override
    public List<String> getDrinkItems() {
        return Arrays.asList("Beer", "Whiskey", "Rum");
    }
}
