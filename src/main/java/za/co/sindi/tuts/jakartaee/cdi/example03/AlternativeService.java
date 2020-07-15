/**
 * 
 */
package za.co.sindi.tuts.jakartaee.cdi.example03;

import javax.enterprise.inject.Alternative;

/**
 * @author buhake.sindi
 * @since 2020/07/13
 *
 */
@Alternative
public class AlternativeService implements Service {

	public void doWork() {
		System.out.println("Alternative Service work.");
	}
}
