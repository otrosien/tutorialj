package com.epages.oceanj;

import org.apache.commons.configuration.Configuration;

import com.epages.plugin.PluginServiceLoader;
import com.epages.plugin.PluginServiceLoaderFactory;

public class OceanJStart {

    public static void main(String[] args) {
        PluginServiceLoader psl = PluginServiceLoaderFactory.getInjector();
        Configuration config = psl.getInstance(Configuration.class);
        System.out.println(config.getString("OceanjServer.port"));
    }

}
