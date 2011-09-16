package ${package}.client;

import org.urish.gwtit.client.GwtTitaniumBootstrap;
import org.urish.gwtit.client.util.Javascript;
import org.urish.gwtit.titanium.API;

/**
 * ${artifactId} entry point.
 */
public class ${artifactId}Module extends GwtTitaniumBootstrap
{
	@Override
	public void main() {
		API.info("Application Started !");
		Javascript.alert("Application is running !");
		
		// TODO put your code here. You can start by calling
		// UI.createWindow() and then calling the open() method to display the new window
		// on the screen.
	
		// See https://github.com/urish/iphonejava-hello-world for an example.
	}
}
