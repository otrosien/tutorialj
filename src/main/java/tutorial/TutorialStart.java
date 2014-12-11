package tutorial;

import com.epages.plugin.PluginServiceLoaderFactory;
import com.epages.server.EmbeddedServer;
import com.google.inject.Injector;

public class TutorialStart {

	public static void main(String[] args) {
		Injector injector = PluginServiceLoaderFactory.getInjector();

		//Server
		EmbeddedServer server = injector.getInstance(EmbeddedServer.class);
		server.start();
	}

}
