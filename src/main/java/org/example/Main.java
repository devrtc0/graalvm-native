package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {
        final Injector injector = Guice.createInjector();

        final Klass klass = injector.getInstance(Klass.class);

        klass.bar();
        System.out.println("main");
    }
}
