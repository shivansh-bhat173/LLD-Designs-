package com.lti.HLD_LLD.LLDDesigns.StructuralPattern.Decorator.Decorator;

import com.lti.HLD_LLD.LLDDesigns.StructuralPattern.Decorator.Entity.Pizza;

public class ExtraCheese extends ToppingDecorator {

        public ExtraCheese(Pizza pizza){
            super(pizza);
        }

    @Override
    public double getCost() {

        return pizza.getCost()+50;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" with Extra cheese";
    }
}
