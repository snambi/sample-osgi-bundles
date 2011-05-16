package bundle1;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	
	public void start(BundleContext context) throws Exception {
		System.out.println("bundle1 started");
	}

	public void stop( BundleContext context) throws Exception {
		System.out.println("bundle1 stopped");
	}

}
