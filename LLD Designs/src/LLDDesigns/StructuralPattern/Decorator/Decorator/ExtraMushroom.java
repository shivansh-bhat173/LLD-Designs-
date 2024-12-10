package com.lti.HLD_LLD.LLDDesigns.StructuralPattern.Decorator.Decorator;

import com.lti.HLD_LLD.LLDDesigns.StructuralPattern.Decorator.Entity.Pizza;

public class ExtraMushroom extends ToppingDecorator {

        public ExtraMushroom(Pizza pizza){
            super(pizza);
        }

    @Override
    public double getCost() {
        return pizza.getCost()+30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" with Extra Mushroom";
    }
}
