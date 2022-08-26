package org.example;

import org.junit.Test;

public class TestDog1 {

    @Test
    public void testX1(){
        Dog d1 = new Dog();
        d1.setColor("black");
        System.out.println(d1.showColor());
    }
}
