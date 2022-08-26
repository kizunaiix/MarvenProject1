package org.example;

import org.junit.Test;

public class TestDog1 {

    @Test
    public void testX1(){
        Dog d1 = new Dog();
        d1.setColor("black");
        d1.color = "blue";
        System.out.println(d1.showColor());
    }
}
