package tutorial;

import javax.inject.Inject;

import org.apache.commons.configuration.Configuration;

import com.epages.configuration.file.EPagesJDirConfiguration;
import com.epages.server.config.AbstractBaseServerConfiguration;

public class TutorialConfiguration extends AbstractBaseServerConfiguration {

	@Inject
	public TutorialConfiguration(Configuration config,
			EPagesJDirConfiguration dirConfig) {
		super(config, dirConfig);
	}

	@Override
	protected String getAppName() {
		return "Tutorial";
	}

}
