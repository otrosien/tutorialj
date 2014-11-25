package oceanj;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.component.LifeCycle;

import com.epages.commons.lifecycle.Coordinator;
import com.epages.commons.lifecycle.LifeCycleCoordinator;
import com.epages.plugin.ClassRegistration;
import com.epages.plugin.ServletPlugin;
import com.epages.server.EmbeddedServer;
import com.epages.server.config.ServerConfiguration;
import com.google.inject.Scopes;
import com.google.inject.TypeLiteral;
import com.google.inject.multibindings.Multibinder;
import com.google.inject.servlet.ServletModule;

public class OceanjPlugin extends ServletPlugin {

	@Override
	public void configure() {
		bind(EmbeddedServer.class).to(OceanjServer.class);
		bind(ServerConfiguration.class).to(OceanjConfiguration.class);
		bind(InterfaceX.class).to(InterfaceXImpl.class).in(javax.inject.Singleton.class);;
		bindToDefaultConfig("conf/oceanj-default.conf");
		
	    bind(LifeCycle.class).annotatedWith(Coordinator.class).to(LifeCycleCoordinator.class).in(Scopes.SINGLETON);

	        //Multibinder.newSetBinder(binder(), ServletHolder.class);
	        Multibinder.newSetBinder(binder(), new TypeLiteral<Class<?>>() {}, ClassRegistration.class);

		bind(Server.class).toProvider(OceanjServerProvider.class);
		install(new ServletModule());
	}

}
