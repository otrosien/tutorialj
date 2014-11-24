package com.epages.oceanj;

import javax.inject.Inject;

import org.apache.commons.configuration.Configuration;

import com.epages.configuration.file.EPagesJDirConfiguration;
import com.epages.server.config.AbstractBaseServerConfiguration;

public class OceanjServerConfig extends AbstractBaseServerConfiguration {

    @Inject
    public OceanjServerConfig(Configuration config, EPagesJDirConfiguration dirConfig) {
        super(config, dirConfig);
    }

    @Override
    protected String getAppName() {
        return "Oceanj";
    }


}
