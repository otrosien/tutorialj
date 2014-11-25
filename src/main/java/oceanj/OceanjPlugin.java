package oceanj;

import com.epages.plugin.AbstractPlugin;
import com.google.inject.Singleton;

public class OceanjPlugin extends AbstractPlugin {

	@Override
	public void configure() {
		bind(InterfaceX.class).to(InterfaceXImpl.class).in(javax.inject.Singleton.class);;
		bindToDefaultConfig("conf/oceanj-default.conf");
	}

}
