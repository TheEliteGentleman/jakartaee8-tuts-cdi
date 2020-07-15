/**
 * 
 */
package za.co.sindi.tuts.jakartaee.cdi.example05.qualifier;

import javax.enterprise.util.AnnotationLiteral;

/**
 * @author buhake.sindi
 * @since 2020/07/15
 *
 */
public final class LesTwinsLiteral extends AnnotationLiteral<LesTwins> implements LesTwins {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7903527453620748735L;
	
	public static final LesTwins INSTANCE = new LesTwinsLiteral();

	/**
	 * 
	 */
	private LesTwinsLiteral() {
		super();
		// TODO Auto-generated constructor stub
	}
}
