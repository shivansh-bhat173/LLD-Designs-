package com.lti.HLD_LLD.LLDDesigns.StructuralPattern.Decorator;

import com.lti.HLD_LLD.LLDDesigns.StructuralPattern.Decorator.Decorator.ExtraCheese;
import com.lti.HLD_LLD.LLDDesigns.StructuralPattern.Decorator.Decorator.ExtraMushroom;
import com.lti.HLD_LLD.LLDDesigns.StructuralPattern.Decorator.Entity.Margherita;
import com.lti.HLD_LLD.LLDDesigns.StructuralPattern.Decorator.Entity.Pizza;
import com.lti.HLD_LLD.LLDDesigns.StructuralPattern.Decorator.Entity.VegDelight;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new ExtraCheese(new Margherita());
        System.out.println(pizza.getDescription() + " costs " + pizza.getCost());

        Pizza pizza2  = new ExtraMushroom(new VegDelight());
        System.out.println(pizza2.getDescription() + " costs " + pizza2.getCost());
    }
}
