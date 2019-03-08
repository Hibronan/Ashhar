package converterservicesubscriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import converterservice.ConverterService;

//Subscriber Service
public class Activator implements BundleActivator {
	private ServiceReference serviceReference;	
	
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		serviceReference = bundleContext.getServiceReference(ConverterService.class.getName());
		ConverterService converterService = (ConverterService) bundleContext.getService(serviceReference);
		converterService.getConverterService();
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Subscriber Stopped");
	}

}
