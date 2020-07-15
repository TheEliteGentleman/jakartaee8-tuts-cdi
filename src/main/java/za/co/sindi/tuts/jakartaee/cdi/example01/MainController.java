/**
 * 
 */
package za.co.sindi.tuts.jakartaee.cdi.example01;

import javax.inject.Inject;

/**
 * @author buhake.sindi
 * @since 2020/07/13
 *
 */
public class MainController {

	@Inject
	private DefaultService service;
	
	public void execute() {
		service.doWork();
	}
}
