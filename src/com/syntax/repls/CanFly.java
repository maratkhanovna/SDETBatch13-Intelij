package com.syntax.repls;

public interface CanFly {

    void fly();

}
interface HasWings {

    public abstract Object getWindSpan();

}

abstract class Falcon implements CanFly, HasWings {

}
