package currencyconvertorservice;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Currency Service Started !");
		bundleContext.registerService(CurrencyService.class.getName(), new CurrencyServiceImp(), null);
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Currency Service Stopped !");
	}
	
	public static class CurrencyServiceImp implements CurrencyService{
		@Override
		public void publishCurrencyService() {
			System.out.println("Select the length Service Conversion\n"
					+ 		   "1. LKR to USD\n"
					+          "2. USD to LKR\n"
					+ 		   "3. LKR to Indian Rupee\n"
					+ 		   "4. Idian Rupee to LKR\n"
					+ 		   "5. LKR to Riyal\n"
					+ 		   "6. Riyal to LKR\n"
					+		   "7. LKR to Ruble\n"
					+		   "8. Ruble to LKR\n"
					+ 		   "9. LKR to Yen\n"
					+		   "10.Yen to LKR");
			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();
			
			if(input == 1) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new CurrencyConvertor(value).lkrToUsd());
			}else if(input == 2) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new CurrencyConvertor(value).usdToLkr());
			}else if(input == 3) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new CurrencyConvertor(value).lkrToIndianRupee());
			}else if(input == 4) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new CurrencyConvertor(value).indianRupeeToLkr());
			}else if(input == 5) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new CurrencyConvertor(value).lkrToRiyal());
			}else if(input == 6) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new CurrencyConvertor(value).riyalToLkr());
			}else if(input == 7) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new CurrencyConvertor(value).lkrToRuble());
			}else if(input == 8) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new CurrencyConvertor(value).rubleToLkr());
			}else if(input == 9) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new CurrencyConvertor(value).lkrToYen());
			}else if(input == 10) {
				System.out.print("Enter Value : ");
				double value = scanner.nextDouble();
				System.out.println(new CurrencyConvertor(value).yenToLkr());
			}else {
				System.out.println("Invalid Input !");
			}
		}	
	}
}
