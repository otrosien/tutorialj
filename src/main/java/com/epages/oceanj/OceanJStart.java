package com.epages.oceanj;

import com.epages.plugin.PluginServiceLoader;
import com.epages.plugin.PluginServiceLoaderFactory;
import com.epages.server.config.ServerConfiguration;

public class OceanJStart {

    public static void main(String[] args) {
        PluginServiceLoader psl = PluginServiceLoaderFactory.getInjector();
        ServerConfiguration config = psl.getInstance(ServerConfiguration.class);
        System.out.println(config.getPort());
    }

}
