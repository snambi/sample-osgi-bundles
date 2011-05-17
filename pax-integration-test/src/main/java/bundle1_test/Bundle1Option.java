package bundle1_test;

import static org.ops4j.pax.exam.Constants.START_LEVEL_SYSTEM_BUNDLES;
import static org.ops4j.pax.exam.CoreOptions.mavenBundle;

import org.ops4j.pax.exam.options.AbstractDelegateProvisionOption;
import org.ops4j.pax.exam.options.ProvisionOption;

public class Bundle1Option extends AbstractDelegateProvisionOption<Bundle1Option>{

    public Bundle1Option()
    {
        super(
            mavenBundle()
                .groupId( "com.ebay.osgi.bundles" )
                .artifactId( "bundle1" )
                .version( "1.0.0" )
        );
        noUpdate();
        startLevel( START_LEVEL_SYSTEM_BUNDLES );
    }
	protected Bundle1Option(ProvisionOption delegate) {
		super(delegate);
	}

	@Override
	protected Bundle1Option itself() {
		return this;
	}
}
