package timeconverterservice;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;


	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Time Service Started");
		bundleContext.registerService(TimeService.class.getName(), new TimeServiceImpl(), null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Time Service Stopped");
	}
	
	private static class TimeServiceImpl implements TimeService {
		@Override
		public void publishTimeService() {
			System.out.println("Select the Time Service Conversion\n"
					+ "1.Seconds to Miliseconds\n"
					+ "2.Miliseconds to Seconds\n"
					+ "3.Minutes to Seconds\n"
					+ "4.Seconds to Minutes\n"
					+ "5.Hours to Minutes\n"
					+ "6.Minutes to Hours\nstar");
			
			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();
			
			if (input == 1) {
				System.out.println("Enter Time(seconds): ");
				double time = scanner.nextDouble();
				System.out.println(new TimeConverter(time).secToMs());
			}
			else if (input == 2) {
				System.out.println("Enter Time(miliseconds): ");
				double time = scanner.nextDouble();
				System.out.println(new TimeConverter(time).msToSec());
			}
			else if (input == 3) {
				System.out.println("Enter Time(min): ");
				double time = scanner.nextDouble();
				System.out.println(new TimeConverter(time).minToSec());
			}
			else if (input == 4) {
				System.out.println("Enter Time(seconds): ");
				double time = scanner.nextDouble();
				System.out.println(new TimeConverter(time).secToMin());
			}
			else if (input == 5) {
				System.out.println("Enter Time(hours): ");
				double time = scanner.nextDouble();
				System.out.println(new TimeConverter(time).hrsToMin());
			}
			else if (input == 6) {
				System.out.println("Enter Time(minutes): ");
				double time = scanner.nextDouble();
				System.out.println(new TimeConverter(time).minToHrs());
			}			
		}		
	}
}
