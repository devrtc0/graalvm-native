package org.example;

import javax.inject.Inject;

public class Klass {

    private final Dep dep;

    @Inject
    public Klass(Dep dep) {
        this.dep = dep;
    }

    public void bar() {
        dep.foo();
        System.out.println("bar");
    }
}
