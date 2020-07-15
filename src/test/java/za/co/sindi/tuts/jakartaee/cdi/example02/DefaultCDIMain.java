/**
 * 
 */
package za.co.sindi.tuts.jakartaee.cdi.example02;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

/**
 * @author buhake.sindi
 * @since 2020/07/13
 *
 */
public class DefaultCDIMain {

	public static void main(String[] args) {
		SeContainer container = null;
		
		try {
			SeContainerInitializer containerInitializer = SeContainerInitializer.newInstance();
			container = containerInitializer.initialize();
			
			//Get bean via CDI
			MainController controller = container.select(MainController.class).get();
			controller.execute();
		} finally {
			if (container != null) {
				container.close();
			}
		}
	}
}
