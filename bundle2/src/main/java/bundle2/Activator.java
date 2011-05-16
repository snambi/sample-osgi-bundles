package bundle2;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("started bundle2");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("stopped bundle2");
	}

}
