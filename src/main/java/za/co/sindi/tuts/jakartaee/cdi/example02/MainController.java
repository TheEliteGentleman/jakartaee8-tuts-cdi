/**
 * 
 */
package za.co.sindi.tuts.jakartaee.cdi.example02;

import javax.inject.Inject;

/**
 * @author buhake.sindi
 * @since 2020/07/13
 *
 */
public class MainController {

	@Inject
	private Service service;
	
	public void execute() {
		service.doWork();
	}
}
