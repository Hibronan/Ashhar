package converterservice;

import lengthconverterservice.LengthService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;
import weightconverterservice.WeightService;
import currencyconvertorservice.CurrencyService;
import java.util.Scanner;

//Main Core Service
public class Activator implements BundleActivator {    
	private static ServiceReference lengthServiceReference, weightServiceReference, currencyServiceReference;	
	private static BundleContext bundleContext;
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Welcome to Universal Converter Service !");
		this.bundleContext = bundleContext;
		bundleContext.registerService(ConverterService.class.getName(), new ConverterServiceImpl(), null);     
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Universal Converter Service Stopped!");
	}

	private static class ConverterServiceImpl implements ConverterService{
		private LengthService lengthService;
		private WeightService weightService;
		private CurrencyService currencyService;
		@Override
		public void getConverterService() {
			Scanner scanner = new Scanner(System.in);
			try {
			lengthServiceReference = bundleContext.getServiceReference(LengthService.class.getName());
			lengthService = (LengthService) bundleContext.getService(lengthServiceReference);
			
			weightServiceReference = bundleContext.getServiceReference(WeightService.class.getName());
		    weightService = (WeightService) bundleContext.getService(weightServiceReference);
			
			currencyServiceReference = bundleContext.getServiceReference(CurrencyService.class.getName());
			currencyService = (CurrencyService) bundleContext.getService(currencyServiceReference);
			
			System.out.println("Select the Service");
			if(lengthService != null)
				System.out.println( "1.Length Converter Service");
			if(weightService != null)
				System.out.println( "2.Weight Converter Service");
			if(currencyService != null)
				System.out.println( "3.Currency Converter Service");
			int input = scanner.nextInt();
			if(input == 1)
				lengthService.publishLengthService();
			else if (input == 2) {
				weightService.publishWeightService();
			}else if(input == 3){
				currencyService.publishCurrencyService();
			}
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
	}
}
