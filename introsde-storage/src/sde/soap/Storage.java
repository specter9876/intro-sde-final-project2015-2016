package sde.soap;
import introsde.document.soap.*;
/*import introsde.document.soap.Food;
import introsde.document.soap.User;
import introsde.document.soap.Activity;
import introsde.document.soap.HealthMeasure;
import introsde.document.soap.Goal;
import introsde.document.soap.DB;
import introsde.document.soap.DBService;*/


import java.util.List;

import javax.xml.transform.TransformerException;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import javax.xml.bind.JAXBException;



import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import java.util.Date;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional
public interface Storage {
    
  
    
    ////FOOD//////////////////////////////////////////////////////
    
    //Method #1:
    @WebMethod(operationName="getFood")
    @WebResult(name="foods")
    public List<Food> getFood();
   
  //Method #2:
    @WebMethod(operationName="getFoodById")
    @WebResult(name="food")
    public Food getFoodById(@WebParam(name="idFood") Long id);

    //Method #3:
    @WebMethod(operationName="getFoodByCaloriesBound")
    @WebResult(name="foods")
    public List <Food> getFoodByCaloriesBound (@WebParam(name="calories") double calories);
    
    @WebMethod(operationName="getFoodByType")
    @WebResult(name="foods")
    public List <Food> getFoodByType (@WebParam(name="type") String type);
    
    //Method #3:
    @WebMethod(operationName="createFood")
    @WebResult(name="food")
    public Food createFood (@WebParam(name="foodIn") Food food);

    ///USER///////////////////////////////////////////////////
    
    //Method #4:
    @WebMethod(operationName="getAllUser")
    @WebResult(name="users")
    public List<User> getAllUser();
    
    
    //Method #5:
    @WebMethod(operationName="getUserById")
    @WebResult(name="user")
    public User getUserById(@WebParam(name="idUser") Long idUser);
    
    //Method #6:
    @WebMethod(operationName="getUserByUsernamePassword")
    @WebResult(name="user")
    public User getUserByUsernamePassword(@WebParam(name="username") String userName, @WebParam(name = "password") String password);
    
    //Method #7:
    @WebMethod(operationName="createUser")
    @WebResult(name="user")
    public User createUser (@WebParam(name="userIn") User user);
    
    //Method #8:
    @WebMethod(operationName="updateUser")
    @WebResult(name="user")
    public User updateUser (@WebParam(name="userIn") User user);
    
    //Method #9:
    @WebMethod(operationName="removeUser")
   // @WebResult(name="removed")
    public boolean removeUser (@WebParam(name="userIn") User user);
    
    //Methid #10:
    @WebMethod(operationName = "loginUser")
	@WebResult(name = "user")
	public User loginUser(@WebParam(name = "userName") String userName, @WebParam(name = "password") String password);

    //Method #11:
    @WebMethod(operationName = "updatePassword")
	//@WebResult(name = "updated")
	public boolean updatePassword(@WebParam(name = "idUser") long id, @WebParam(name = "firstPassword") String firstPassword, @WebParam(name = "secondPassword") String secondPassword);
    
    
    //Methid #11:
    @WebMethod(operationName = "controlUsernamePassword")
    //@WebResult(name="control")
	public boolean controlUsernamePassword(@WebParam(name = "userName") String userName, @WebParam(name = "password") String password);
    
    ///ACTIVITY//////////////////////////////////////////////////////
    
    //Method #12:
    @WebMethod(operationName="getAllActivity")
    @WebResult(name="activities")
    public List<Activity> getAllActivity();
    
    @WebMethod(operationName="getActivityByIdUser")
    @WebResult(name="activities")
    public List<Activity> getActivityByIdUser(@WebParam(name = "idUser") Long idUser);
    
    //Method #13:
    @WebMethod(operationName="getActivityById")
    @WebResult(name="activity")
    public Activity getActivityById(@WebParam(name = "idActivity") Long idActivity);
    
    //Method #14:
    @WebMethod(operationName="getActivityByType")
    @WebResult(name="activities")
    public List<Activity> getActivityByType(@WebParam(name = "type") String type);
    
    //Method #15:
    @WebMethod(operationName="getActivityByName")
    @WebResult(name="activities")
    public List<Activity> getActivityByName(@WebParam(name = "name") String name);
    
    //Method #16:
    @WebMethod(operationName="getActivityByCalories")
    @WebResult(name="activities")
    public List<Activity> getActivityByCalories(@WebParam(name = "calories") double calories);
    
    
    //Method #17:
    @WebMethod(operationName="createActivity")
    @WebResult(name="activity")
    public Activity createActivity(@WebParam(name = "activityIn") Activity activity);
    
    ///GOAL//////////////////////////////////////////////////////

    //Method #18:
    @WebMethod(operationName="getAllGoal")
    @WebResult(name="goals")
    public List<Goal> getAllGoal();
    
    //Method #19:
    @WebMethod(operationName="getGoalById")
    @WebResult(name="goal")
    public Goal getGoalById(@WebParam(name = "idGoal") Long idGoal);
    
    //Method #20:
    @WebMethod(operationName="getGoalByType")
    @WebResult(name="goals")
    public List<Goal> getGoalByType(@WebParam(name = "type") String type, @WebParam(name = "userId") long userId);
    
    //Method #21:
    @WebMethod(operationName="getGoalNotAchieved")
    @WebResult(name="goals")
    public List<Goal> getGoalNotAchieved(@WebParam(name = "userId") long userId);
    
    //Method #21:
    @WebMethod(operationName="getGoalAchieved")
    @WebResult(name="goals")
    public List<Goal> getGoalAchieved(@WebParam(name = "userId") long userId);
    
    //Method #22:
    @WebMethod(operationName="getGoalEndAt")
    @WebResult(name="goals")
    public List<Goal> getGoalEndAt(@WebParam(name = "endAt") Date endAt);
    
    //Method #23:
    @WebMethod(operationName="controlGoal")
    @WebResult(name="goals")
    public List<Goal> controlGoal(@WebParam(name = "type") String type);
    
    
    @WebMethod(operationName="createGoal")
    @WebResult(name="goal")
    public Goal createGoal(@WebParam(name = "goalIn") Goal goal);
    
    @WebMethod(operationName="updateGoal")
    @WebResult(name="goal")
    public Goal updateGoal(@WebParam(name = "goalIn") Goal goal);


   ///HEALTHMEASURE///////////////////////////////////////////////////////
    
    
    //Method #24:
    @WebMethod(operationName="getAllHealthMeasure")
    @WebResult(name="healthMeasures")
    public List<HealthMeasure> getAllHealthMeasure();
    
    //Method #25:
    @WebMethod(operationName="getHealthMeasureByIdUser")
    @WebResult(name="healthMeasures")
    public List<HealthMeasure> getHealthMeasureByIdUser(@WebParam(name = "idUser") Long idUser);

    //Method #26:
    @WebMethod(operationName="getHealthMeasureByIdUserType")
    @WebResult(name="healthMeasures")
    public List<HealthMeasure> getHealthMeasureByIdUserType(@WebParam(name = "idUser") Long idUser,@WebParam(name = "type") String type);
    
    //Method #27:
    @WebMethod(operationName="createHealthMeasure")
    @WebResult(name="healthMeasure")
    public HealthMeasure createHealthMeasure(@WebParam(name = "healthMeasureIn") HealthMeasure healthMeasure);
    
    //Method #28:
    @WebMethod(operationName="updateHealthMeasure")
    @WebResult(name="healthMeasure")
    public HealthMeasure updateHealthMeasure(@WebParam(name = "healthMeasureIn") HealthMeasure healthMeasure);

    //////////////////QUOTEADAPTER////////////////////////////////////////////////
    //Method #29:
    @WebMethod(operationName="getQuote")
    //@WebResult(name="quotedaily")
    public String getQuote();//throws IOException, JAXBException, SAXException,TransformerException, ParserConfigurationException;

    ////////////////////////FOODADAPETR///////////////////////////////////////////

    //Method #29:
    @WebMethod(operationName="getAdapterFood")
    @WebResult(name="foods")
    public List<Food> getAdapterFood(@WebParam(name = "type") String type);//throws IOException, JAXBException, SAXException,TransformerException, ParserConfigurationException;
    

}
