package lengthconverterservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import java.util.*;

//Length Service
public class Activator implements BundleActivator {
	
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Length Service Started !");
		bundleContext.registerService(LengthService.class.getName(), new LengthServiceImpl(), null);
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Length Service Stopped !");
	}
	
	private static class LengthServiceImpl implements LengthService{
		@Override
		public void publishLengthService() {
			System.out.println("Select the length Service Conversion\n"
					+ 		   "1. m to Km\n"
					+          "2. Km to m\n"
					+ 		   "3. m to Feet\n"
					+ 		   "4. Feet to m\n"
					+ 		   "5. Inches to cm\n"
					+ 		   "6. cm to Inches\n"
					+		   "7. Inches to mm\n"
					+		   "8. mm to Inches\n"
					+ 		   "9. Km to Miles\n"
					+		   "10.Miles to Km");	
			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();
			
			if(input == 1) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new LengthConverter(value).mToKm());
			}else if(input == 2) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new LengthConverter(value).KmTom());
			}else if(input == 3) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new LengthConverter(value).mToFeet());
			}else if(input == 4) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new LengthConverter(value).feetTom());
			}else if(input == 5) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new LengthConverter(value).inchesTocm());
			}else if(input == 6) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new LengthConverter(value).cmtoInches());
			}else if(input == 7) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new LengthConverter(value).inchesTomm());
			}else if(input == 8) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new LengthConverter(value).mmToInches());
			}else if(input == 9) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new LengthConverter(value).KmToMile());
			}else if(input == 10) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new LengthConverter(value).MileToKm());
			}else {
				System.out.println("Invalid Input !");
			}
		}
	}
}
