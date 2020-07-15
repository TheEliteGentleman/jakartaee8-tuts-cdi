/**
 * 
 */
package za.co.sindi.tuts.jakartaee.cdi.example03;

import javax.enterprise.inject.Default;

/**
 * @author buhake.sindi
 * @since 2020/07/13
 *
 */
@Default
public class DefaultService implements Service {

	public void doWork() {
		System.out.println("Default Service work.");
	}
}
