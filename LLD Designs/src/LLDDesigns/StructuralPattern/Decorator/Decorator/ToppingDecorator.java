package com.lti.HLD_LLD.LLDDesigns.StructuralPattern.Decorator.Decorator;

import com.lti.HLD_LLD.LLDDesigns.StructuralPattern.Decorator.Entity.Pizza;

public abstract class ToppingDecorator extends Pizza {
    Pizza pizza;

    ToppingDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
