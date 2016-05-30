package sde.soap;

import introsde.document.soap.*;

public class SoapHandle {
	
	private static SoapHandle handle;

	private DB db;

	private SoapHandle() {

			DBService service = new DBService();
			db = service.getDBImplPort();
			

	}

	public static SoapHandle getHandle() {
		if (handle == null) {
			handle = new SoapHandle();
		}

		return handle;
	}

	public DB getDb() {
		return db;
	}
}