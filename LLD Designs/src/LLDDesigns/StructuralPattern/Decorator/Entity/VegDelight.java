package com.lti.HLD_LLD.LLDDesigns.StructuralPattern.Decorator.Entity;

public class VegDelight extends Pizza {
    @Override
    public String getDescription() {
        return "vegDelight";
    }

    @Override
    public double getCost() {
        return 150;
    }
}
