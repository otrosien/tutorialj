package tutorial;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class GreetingResource {

	private final GreetingService service;
	private final TutorialConfiguration config;

	@Inject
	public GreetingResource(GreetingService service, TutorialConfiguration config) {
		this.service = service;
		this.config = config;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response getAppName() {
		return Response.ok(config.getAppName()).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/greeting.json")
	public Response getHelloJson() {
		return Response.ok(service.hello()).build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/greeting.txt")
	public Response getHelloString() {
		return Response.ok("Hello World!").build();
	}
	
}
