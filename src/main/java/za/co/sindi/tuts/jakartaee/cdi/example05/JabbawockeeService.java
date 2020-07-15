/**
 * 
 */
package za.co.sindi.tuts.jakartaee.cdi.example05;

import za.co.sindi.tuts.jakartaee.cdi.example05.qualifier.Jabbawockee;

/**
 * @author buhake.sindi
 * @since 2020/07/13
 *
 */
@Jabbawockee
public class JabbawockeeService implements Service {

	public void doWork() {
		System.out.println("Jabbawockee doing the work.");
	}
}
