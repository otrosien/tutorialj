package oceanj;

import javax.inject.Inject;

import org.eclipse.jetty.server.Server;

import com.epages.server.BaseEmbeddedServer;
import com.epages.server.config.ServerConfiguration;

public class OceanjServer extends BaseEmbeddedServer {

	@Inject
	public OceanjServer(Server server, ServerConfiguration config) {
		super(server, config);
		// TODO Auto-generated constructor stub
	}

}
