package com.davidrobson;

import com.google.inject.servlet.ServletModule;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

import java.util.HashMap;

/**
 * Created by davidrobson on 11/12/14.
 */
public class RestModule extends ServletModule {

    @Override
    protected void configureServlets() {

        HashMap<String, String> params = new HashMap<String, String>();
        params.put(PackagesResourceConfig.PROPERTY_PACKAGES, "com.davidrobson.wsao");

        serve("/*").with(GuiceContainer.class, params);
    }
}
