/**
 * 
 */
package za.co.sindi.tuts.jakartaee.cdi.example04;

import javax.inject.Named;

/**
 * @author buhake.sindi
 * @since 2020/07/13
 *
 */
@Named("LesTwins")
public class LesTwinsService implements Service {

	public void doWork() {
		System.out.println("Les Twins doing the work.");
	}
}
