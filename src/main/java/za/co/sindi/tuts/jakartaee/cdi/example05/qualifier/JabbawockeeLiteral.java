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
public final class JabbawockeeLiteral extends AnnotationLiteral<Jabbawockee> implements Jabbawockee {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4487540971760615334L;
	
	public static final Jabbawockee INSTANCE = new JabbawockeeLiteral();
	
	/**
	 * 
	 */
	private JabbawockeeLiteral() {
		super();
		// TODO Auto-generated constructor stub
	}
}
