package sde.model;
import introsde.document.soap.DB;
import introsde.document.soap.DBService;
import introsde.document.soap.User;



import javax.xml.bind.*;

import javax.xml.namespace.QName;

import java.io.File;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Test {



	public static void main(String[] args) throws Exception {
        
        User u=new User();
        
       /*
        JAXBContext jc = JAXBContext.newInstance("introsde.document.soap");
        System.out.println("flag000000");
		Marshaller m = jc.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        
    */
        System.out.println("flag11111");
        DBService service= new DBService();
        System.out.println("flag222222");
        DB db=service.getDBImplPort();
        System.out.println("flag33333");
        u=db.loginUser("admin","password");
         System.out.println("flag44444");
        
        /*try {
            JAXBElement<Person> personfinal = new JAXBElement<Person>(new QName(
                                                                                "http://soap.assignment.introsde/", "person"),
                                                                      Person.class, person);
            m.marshal(personfinal, System.out);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }*/
        
        
        
        
        
        System.out.println(u.getUserName());
	}

	
}
