package sde.soap;

import introsde.document.soap.*;
/*import introsde.document.soap.Food;
import introsde.document.soap.User;
import introsde.document.soap.Activity;
import introsde.document.soap.HealthMeasure;
import introsde.document.soap.Goal;
import introsde.document.soap.DB;
import introsde.document.soap.DBService;*/

import sde.model.*;

import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.UriBuilder;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.codehaus.jackson.map.*;
import org.json.*;


import org.glassfish.jersey.client.ClientConfig;

import org.xml.sax.SAXException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringReader;


import java.util.List;
import java.util.ArrayList;

import javax.jws.WebService;

//Service Implementation

@WebService(endpointInterface = "sde.soap.Storage",
	serviceName="StorageService")
public class StorageImpl implements Storage {
    
    
    ////FOOD//////////////////////////////////////////////////////
 
    //Method #1:
    @Override
    public List<Food> getFood(){
        
      
        DB db=getDB();
        List <Food> food = db.getAllFood();
        return food;
    }
   
   
    
   //Method #2:
    @Override
    public Food getFoodById(Long id){
        
       
        DB db=getDB();
        Food food=db.getFoodById(id);
        return food;
    }
 
    //Method #3:
    @Override
    public List <Food> getFoodByCaloriesBound (double calories){
        
        
        DB db=getDB();
        List <Food> food=db.getFoodByCaloriesBound(calories);
        return food;
    }
    
    @Override
    public List <Food> getFoodByType (String type){
        
        DB db=getDB();
        List<Food> food=db.getFoodByType(type);
        return food;
        
    }

    //Method #3:
    @Override
    public Food createFood (Food food){
        
        

        DB db=getDB();
        //Food f1=db.createFood(food);
        return db.createFood(food);
    
        //return null;
    }

    
    
    ///USER///////////////////////////////////////////////////
    
    //Method #4:
    @Override
    public List<User> getAllUser(){
        
        DB db=getDB();
        List <User> user=db.getAllUser();
        return user;
    }
    
    
    //Method #5:
    @Override
    public User getUserById(Long idUser){

        DB db=getDB();
        User user=db.getUserById(idUser);
        return user;
    }
    
    //Method #6:
    @Override
    public User getUserByUsernamePassword(String userName, String password){
       
        DB db=getDB();
        User user= db.getUserByUsernamePassword(userName, password);
        return user;
    }
    
    //Method #7:
    @Override
    public User createUser (User user){
       
        DB db=getDB();
        return db.createUser(user);
       
    }
    
    //Method #8:
    @Override
    public User updateUser (User user){
        
       
        DB db=getDB();
        return db.updateUser(user);
        
    }
    
    //Method #9:
    @Override
    public boolean removeUser (User user){
       
         DB db=getDB();
        db.removeUser(user);
        return true;
    }
    
    //Method #10:
   @Override
	public User loginUser(String userName, String password){
        
        
       
         DB db=getDB();
         User user=db.loginUser(userName,password);
        
        System.out.println("USer: "+user);
        return user;
    }
    
    
    //Method #11:
    @Override
	public boolean updatePassword(long id, String firstPassword, String secondPassword){
        //changePasswordc: hangePassword(User user, String unEncryptedPassword
       // return User.updatePassword(id, firstPassword,secondPassword);
        return true;
    }
    
    @Override
    public boolean controlUsernamePassword(String userName, String password){
        
        DB db=getDB();
        boolean state=db.controlUsernamePassword(userName, password);
        if(state!=false){
            
            return true;
        }
        else{
            return false;
        }
    }
    
    ///ACTIVITY//////////////////////////////////////////////////////
   
    //Method #12:
    @Override
    public List<Activity> getAllActivity(){
        
         DB db=getDB();
        List<Activity> activity=db.getAllActivity();
        return activity;
    }
    
    @Override
    public List<Activity> getActivityByIdUser(Long idUser){
        
        DB db=getDB();
        List<Activity> activity=db.getActivityByIdUser(idUser);
        return activity;
    }
    
    
    //Method #13:
    @Override
    public Activity getActivityById(Long idActivity){
        
         DB db=getDB();
        Activity activity= db.getActivityById(idActivity);
        return activity;
    }
    
    //Method #14:
    @Override
    public List<Activity> getActivityByType( String type){
        
         DB db=getDB();
        List<Activity> activity= db.getActivityByType(type);
        return activity;
    }
    
    //Method #15:
    @Override
    public List<Activity> getActivityByName(String name){
       
        DB db=getDB();
       List<Activity> activity=db.getActivityByName(name);
       return activity;
    }
    
    //Method #16:
    @Override
    public List<Activity> getActivityByCalories( double calories){
        
         DB db=getDB();
        List<Activity> activity= db.getActivityByCalories(calories);
        return activity;
    }
    
    
    //Method #17:
    @Override
    public Activity createActivity (Activity activity){
        
        DB db=getDB();
        Activity activity2= db.createActivity(activity);
        return activity2;
        
    }
    
    ///GOAL//////////////////////////////////////////////////////
    
    //Method #18:
    @Override
    public List<Goal> getAllGoal(){
        //to do
         DB db=getDB();
        List <Goal> goal= db.getAllGoal();
        return goal;
    }
    
    //Method #19:
    @Override
    public Goal getGoalById(Long idGoal){
        
         DB db=getDB();
        Goal goal= db.getGoalById(idGoal);
        return goal;
    }
    
    //Method #20:
    @Override
    public List<Goal> getGoalByType(String type, long id ){
        
        
        DB db=getDB();
        List <Goal> goal= db.getGoalByType(type,id);
        return goal;
    }
    
    //Method #21:
    @Override
    public List<Goal> getGoalNotAchieved(long id){
        
        DB db=getDB();
        List<Goal> goal=db.getGoalNotAchieved(id);
        return goal;
    }
    
    //Method #21:
    @Override
    public List<Goal> getGoalAchieved(long id){
        
        
        DB db=getDB();
        List<Goal> goal=db.getGoalAchieved(id);
        return goal;
    }
 
    ///////////mancaaaaaa su database  query////////////////////////
    //Method #22:
    @Override
    public List<Goal> getGoalEndAt(Date endAt){
        
        //to do
        return null;
    }
    
    //Method #23:
    @Override
    public List<Goal> controlGoal(String type){
        //to do
        return null;
    }
    
    @Override
    public Goal createGoal(Goal goal){
        
        DB db=getDB();
        return db.createGoal(goal);
    }
    
    @Override
    public Goal updateGoal(Goal goal){
        
        DB db=getDB();
        return db.updateGoal(goal);
        
    }

    
    
    ///HEALTHMEASURE///////////////////////////////////////////////////////
    
    
    //Method #24:
    @Override
    public List<HealthMeasure> getAllHealthMeasure(){
        DB db=getDB();
        List<HealthMeasure> healthMeasure= db.getAllHealthMeasure();
        return healthMeasure;
    }
    
    //Method #25:
    @Override
    public List<HealthMeasure> getHealthMeasureByIdUser(Long idUser){
        
        DB db=getDB();
        List <HealthMeasure> healthMeasure=db.getHealthMeasureByIdUser(idUser);
        return healthMeasure;
    }

    //Method #26:
    @Override
    public List<HealthMeasure> getHealthMeasureByIdUserType(Long idUser, String type){
        
        DB db=getDB();
        List <HealthMeasure> healthMeasure=db.getHealthMeasureByIdUserType( idUser,type);
    
        return healthMeasure;
    }
    
    //Method #27:
    @Override
    public HealthMeasure createHealthMeasure(HealthMeasure healthMeasure){
        
        DB db=getDB();
        //System.out.println(HealthMeasure)
               
        return  db.createHealthMeasure(healthMeasure);

    }
    
    //Method #28:
    @Override
    public HealthMeasure updateHealthMeasure(HealthMeasure healthMeasure){
       
 
        DB db=getDB();
        return db.updateHealthMeasure(healthMeasure);
        //return null;
        
    }

    //////////////////QUOTEADATER////////////////////////////////
    //Method #28:
    @Override
    public String getQuote() {//throws IOException, JAXBException, SAXException,TransformerException, ParserConfigurationException{
        
        
        ClientConfig clientConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(clientConfig);
		WebTarget service = client.target(UriBuilder.fromUri("https://infinite-garden-2438.herokuapp.com/sdelab").build());
        int responseCode = -1;
		String resp = "";
		String accept = "";
		String contentType = "";
		String result = "";
		int count = 0;
        
        StringBuffer response=null;
        
        String url = "https://infinite-garden-2438.herokuapp.com/sdelab/quote";
		try{
        URL obj = new URL(url);
		HttpURLConnection  con = (HttpURLConnection) obj.openConnection();
        
        
        
        
		con.setRequestMethod("GET");
		accept = "application/json";
		con.setRequestProperty("Accept", accept);
		contentType = "application/json";
		con.setRequestProperty("Content-Type", contentType);
        
		System.out.println("Request #3.1: GET " + url + " Accept: " + accept + "Content-type: " + contentType);
        ;
        
        
		
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        response = new StringBuffer();
            
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
    
        
        responseCode = con.getResponseCode();
        System.out.println("=> Result: " + con.getResponseCode());
		
		System.out.println("=> HTTP Status: " + responseCode);
		System.out.println(response.toString());
        }
        catch (IOException e) {
            
        }
        
     return response.toString();
     
        
    }
    
    //////////////////FOODADATER////////////////////////////////

    @Override
    public List<Food> getAdapterFood(String type){
        
        ClientConfig clientConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(clientConfig);
		WebTarget service = client.target(UriBuilder.fromUri("https://infinite-garden-2438.herokuapp.com/sdelab").build());
        int responseCode = -1;
		String resp = "";
		String accept = "";
		String contentType = "";
		String result = "";
		int count = 0;
        List <Food> foodlist=new ArrayList<Food> ();
        List <FoodAdapter> adapterFoodList=new ArrayList<FoodAdapter> ();
        
        
        
        String url = "https://infinite-garden-2438.herokuapp.com/sdelab/food/"+type;
		try{
            URL obj = new URL(url);
            HttpURLConnection  con = (HttpURLConnection) obj.openConnection();
            
            
            
            
            con.setRequestMethod("GET");
            accept = "application/json";
            con.setRequestProperty("Accept", accept);
            contentType = "application/json";
            con.setRequestProperty("Content-Type", contentType);
            
            System.out.println("Request #3.1: GET " + url + " Accept: " + accept + "Content-type: " + contentType);
            ;
            
            
            resp = getConnectionOutputJSON(con);
           
            responseCode = con.getResponseCode();
            System.out.println("=> Result: " + con.getResponseCode());
            
            System.out.println("=> HTTP Status: " + responseCode);
            System.out.println(resp);
            
            
            
            
            System.out.println("flag123");
            JSONArray array= new JSONArray(resp);
            System.out.println("flag123456");
            System.out.println("length:" +array.length());
            
            //System.out.println("test:" +array.getJSONObject(2).getString("name"));
            //System.out.println("test:" +array.getJSONObject(9).getString("name"));

            
            for(int i = 0; i < array.length(); i++){
                 JSONObject object = array.getJSONObject(i);
                Food foodadapter=new Food();

  
                foodadapter.setName(array.getJSONObject(i).getString("name"));
                foodadapter.setType(array.getJSONObject(i).getString("type"));
                foodadapter.setCalories(array.getJSONObject(i).getDouble("calories"));
                foodadapter.setDescription(array.getJSONObject(i).getString("description"));
               
                foodlist.add(foodadapter);
                
                
                
            }
            
            
           
            
        }
        catch (IOException e) {
            
        }
        
        
        
        return foodlist;

        
        
    }
  
    
    /////////////handle///////////////////////////////////////
  
    public static DB getDB(){
       
        DBService service= new DBService();
        DB db=service.getDBImplPort();
        return db;
    }
   
    public static String getConnectionOutputJSON(HttpURLConnection con)
    {//throws IOException, JAXBException, SAXException,TransformerException, ParserConfigurationException {
        String retval="";
        try{
		PrintWriter writer = new PrintWriter("out.json", "UTF-8");
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
        
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		retval = new GsonBuilder().setPrettyPrinting().create()
        .toJson(new JsonParser().parse(response.toString()));
		writer.write(retval);
		writer.close();
            
        }
        catch(IOException e){
            
        }
		return retval;
	}
   ///ma poi questa anche se non @ovverride c è quando faccio wimport?

 
    
    
}
