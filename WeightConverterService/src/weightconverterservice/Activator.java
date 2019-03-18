package weightconverterservice;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


//Weight Service
public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Weight Service Started !");
		bundleContext.registerService(WeightService.class.getName(), new WeightServiceImpl(), null);	
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Weight Service Stopped !");
	}
	
	private static class WeightServiceImpl implements WeightService{
		@Override
		public void publishWeightService() {
			System.out.println("Select the weight Service Conversion\n"
					+ 		   "1. g to Kg\n"
					+          "2. Kg to t\n"
					+ 		   "3. g to Ounce\n"
					+ 		   "4. Ounce to g\n"
					+ 		   "5. Kg to pound\n"
					+ 		   "6. Pound to Kg\n"
					+		   "7. Pound to Ounce\n"
					+		   "8. Ounce to Pound\n"
					+ 		   "9. Tonne to Kg\n"
					+		   "10.Kg to Tonne");	
			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();
			
			if(input == 1) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new WeightConverter(value).gToKg());
			}else if(input == 2) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new WeightConverter(value).KgTog());
			}else if(input == 3) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new WeightConverter(value).gToOunce());
			}else if(input == 4) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new WeightConverter(value).OunceToGram());
			}else if(input == 5) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new WeightConverter(value).KgToPounds());
			}else if(input == 6) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new WeightConverter(value).PoundstoKg());
			}else if(input == 7) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new WeightConverter(value).PoundsToOunce());
			}else if(input == 8) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new WeightConverter(value).OunceToPounds());
			}else if(input == 9) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new WeightConverter(value).TonneToKg());
			}else if(input == 10) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new WeightConverter(value).KgToTonne());
			}else {
				System.out.println("Invalid Input !");
			}
		}
	}

}
