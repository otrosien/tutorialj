package oceanj;

import org.apache.commons.configuration.Configuration;

import com.epages.plugin.PluginServiceLoaderFactory;
import com.epages.server.EmbeddedServer;
import com.google.inject.Injector;

public class OceanjStart {

	public static void main(String[] args) {
		Injector injector = PluginServiceLoaderFactory.getInjector();
		Configuration config = injector.getInstance(Configuration.class);
		System.out.println(config.getInt("oceanjServer.port", -1));
		
		InterfaceX x = injector.getInstance(InterfaceX.class);
		System.out.println(x.toString());
		InterfaceX x2 = injector.getInstance(InterfaceX.class);
		System.out.println(x2.toString());
		System.out.println(x.hello());
		
		
		//Server
		EmbeddedServer server = injector.getInstance(EmbeddedServer.class);
		server.start();
	}

}
