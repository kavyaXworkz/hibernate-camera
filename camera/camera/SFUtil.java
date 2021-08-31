package java.util.camera;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SFUtil {
	private static SessionFactory factory;
	public static SessionFactory getFactory() {
		if(factory !=null && factory.isClosed()) {
			throw new IllegalStateException("some one closed SessionFactory, please correct code");
		}
		return factory;
		}
	static {
		try {
		    System.out.println("sf started");
		    Configuration configure=new Configuration().configure();
		    factory=configure.buildSessionFactory();
		    System.out.println("sf complete");
		}
		catch(HibernateException e) {
			System.err.println("error in static block");
			e.printStackTrace();
		}
	}
	

}
