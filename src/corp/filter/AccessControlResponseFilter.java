package corp.filter;
import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class AccessControlResponseFilter implements ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext containerRequestContext, 
			ContainerResponseContext containerResponseContext)throws IOException 
	{
		containerResponseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
		containerResponseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, PUT, POST, DELETE");
		containerResponseContext.getHeaders().add("Access-Control-Allow-Headers", "Content-Type");
		containerResponseContext.getHeaders().add("Access-Control-Max-Age", "10");  
	}
	
}