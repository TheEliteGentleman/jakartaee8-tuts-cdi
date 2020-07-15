/**
 * 
 */
package za.co.sindi.tuts.jakartaee.cdi.example04;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author buhake.sindi
 * @since 2020/07/13
 *
 */
@Named
public class MainController {

	@Inject @Named("Jabbawockee")
	private Service service;
	
	public void execute() {
		service.doWork();
	}
}
