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
@Named("Jabbawockee")
public class JabbawockeeService implements Service {

	public void doWork() {
		System.out.println("Jabbawockee doing the work.");
	}
}
