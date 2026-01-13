package org.example.soildprinciple.InterfaceRegregationPrinciple;

import java.util.Arrays;
import java.util.List;

public class VegeterianMenu implements IVegeterianMenu{
    @Override
    public List<String> getVegeterianMenu() {
        return Arrays.asList("Panner", "Mushroom");
    }
}
