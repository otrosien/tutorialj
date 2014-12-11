package tutorial;

import javax.inject.Singleton;

import com.epages.epagesj.EPagesJServerBasePlugin;
import com.epages.plugin.ServletPlugin;
import com.epages.server.EmbeddedServer;
import com.epages.server.config.ServerConfiguration;

public class TutorialPlugin extends ServletPlugin {

	@Override
	public void configure() {
		// server config
		bind(EmbeddedServer.class).to(TutorialServer.class);
		bind(ServerConfiguration.class).to(TutorialConfiguration.class);

		// basic bindings
		install(new EPagesJServerBasePlugin());
		
		// resource + service config
		bindToJaxRs(GreetingResource.class);
		bind(GreetingService.class).to(GreetingServiceImpl.class).in(Singleton.class);
		bindToDefaultConfig("conf/tutorial-default.conf");

	}

}
