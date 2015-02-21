package com.davidrobson;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

/**
 * Created by davidrobson on 11/12/14.
 */
public class AppServlet extends GuiceServletContextListener {
    @Override
    protected Injector getInjector() {
        return Guice.createInjector(new RestModule());
    }
}
