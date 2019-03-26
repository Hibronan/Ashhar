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
		try {
		serviceReference = bundleContext.getServiceReference(ConverterService.class.getName());
		ConverterService converterService = (ConverterService) bundleContext.getService(serviceReference);
		if(converterService != null)
			converterService.getConverterService();
		else
			System.out.println("Converter Service is not available");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Subscriber Stopped");
	}
}
