/**
 * 
 */
package za.co.sindi.tuts.jakartaee.cdi.example05;

import za.co.sindi.tuts.jakartaee.cdi.example05.qualifier.LesTwins;

/**
 * @author buhake.sindi
 * @since 2020/07/13
 *
 */
@LesTwins
public class LesTwinsService implements Service {

	public void doWork() {
		System.out.println("Les Twins doing the work.");
	}
}
