package bundle1_test;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Probe {

    @SuppressWarnings( "unused" )
    public void probe1()
    {
        System.out.println( "----- > Inside OSGi. No Bundle Context :( " );
    }

    @SuppressWarnings( "unused" )
    public void probe2( BundleContext ctx )
    {
    	ServiceReference ref = ctx.getServiceReference("test");
    	
        System.out.println( "----- > This Bundles name is " + ctx.getBundle().getSymbolicName() );
        for( Bundle b : ctx.getBundles() ) {
            System.out.println( "Bundle : " + b.getSymbolicName() );
        }
    }
}
