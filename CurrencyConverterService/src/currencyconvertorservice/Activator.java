package currencyconvertorservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

//	private static BundleContext context;

	/*
	 * static BundleContext getContext() { return context; }
	 */
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Currency Service Started !");
		bundleContext.registerService(CurrencyService.class.getName(), new CurrencyServiceImp(), null);
		//Activator.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
//		Activator.context = null;
	}
	
	public static class CurrencyServiceImp implements CurrencyService{

		@Override
		public void publishCurrencyService() {
			// TODO Auto-generated method stub
			
		}
		
		
		
	}

}
