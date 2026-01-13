package org.example.soildprinciple.InterfaceRegregationPrinciple;

import java.util.Arrays;
import java.util.List;

public class NonVegeterianMenu implements INonVegeterianMenu{
    @Override
    public List<String> getNonVegeterianMenu() {
        return Arrays.asList("Chicken", "Masala Chicken", "Butter Chicken");
    }
}
