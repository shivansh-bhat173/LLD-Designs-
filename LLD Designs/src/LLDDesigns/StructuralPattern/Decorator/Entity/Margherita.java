package com.lti.HLD_LLD.LLDDesigns.StructuralPattern.Decorator.Entity;

public class Margherita extends Pizza {


    @Override
    public String getDescription() {
        return "Margherita";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
