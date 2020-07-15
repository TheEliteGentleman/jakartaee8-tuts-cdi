/**
 * 
 */
package za.co.sindi.tuts.jakartaee.cdi.example05;

import javax.inject.Inject;
import javax.inject.Named;

import za.co.sindi.tuts.jakartaee.cdi.example05.qualifier.Jabbawockee;

/**
 * @author buhake.sindi
 * @since 2020/07/13
 *
 */
@Named("example05")
public class MainController {

	@Inject @Jabbawockee
	private Service service;
	
	public void execute() {
		service.doWork();
	}
}
