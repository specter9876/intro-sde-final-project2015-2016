package sde.endpoint;

import sde.soap.StorageImpl;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.xml.ws.Endpoint;

public class StoragePublisher {
    
	public static void main(String[] args) throws UnknownHostException {
		String PROTOCOL = "http://";
		String HOSTNAME = InetAddress.getLocalHost().getHostAddress();
		if (HOSTNAME.equals("127.0.0.1")) {
			HOSTNAME = "localhost";
		}
		String PORT = "6999";//cambiare per ogni app
		String BASE_URL = "/ws/storage";
        
		if (String.valueOf(System.getenv("PORT")) != "null") {
			PORT = String.valueOf(System.getenv("PORT"));
		}
        
		String endpointUrl = PROTOCOL + HOSTNAME + ":" + PORT + BASE_URL;
		System.out.println("Starting Storage Service...");
		System.out.println("--> Published. Check out " + endpointUrl + "?wsdl");
		Endpoint.publish(endpointUrl, new StorageImpl());
	}
    
}