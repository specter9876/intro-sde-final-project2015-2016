
package introsde;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Storage", targetNamespace = "http://soap.sde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Storage {


    /**
     * 
     * @return
     *     returns java.util.List<introsde.Food>
     */
    @WebMethod
    @WebResult(name = "foods", targetNamespace = "")
    @RequestWrapper(localName = "getFood", targetNamespace = "http://soap.sde/", className = "introsde.GetFood")
    @ResponseWrapper(localName = "getFoodResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetFoodResponse")
    @Action(input = "http://soap.sde/Storage/getFoodRequest", output = "http://soap.sde/Storage/getFoodResponse")
    public List<Food> getFood();

    /**
     * 
     * @param idFood
     * @return
     *     returns introsde.Food
     */
    @WebMethod
    @WebResult(name = "food", targetNamespace = "")
    @RequestWrapper(localName = "getFoodById", targetNamespace = "http://soap.sde/", className = "introsde.GetFoodById")
    @ResponseWrapper(localName = "getFoodByIdResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetFoodByIdResponse")
    @Action(input = "http://soap.sde/Storage/getFoodByIdRequest", output = "http://soap.sde/Storage/getFoodByIdResponse")
    public Food getFoodById(
        @WebParam(name = "idFood", targetNamespace = "")
        Long idFood);

    /**
     * 
     * @param type
     * @return
     *     returns java.util.List<introsde.Food>
     */
    @WebMethod
    @WebResult(name = "foods", targetNamespace = "")
    @RequestWrapper(localName = "getFoodByType", targetNamespace = "http://soap.sde/", className = "introsde.GetFoodByType")
    @ResponseWrapper(localName = "getFoodByTypeResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetFoodByTypeResponse")
    @Action(input = "http://soap.sde/Storage/getFoodByTypeRequest", output = "http://soap.sde/Storage/getFoodByTypeResponse")
    public List<Food> getFoodByType(
        @WebParam(name = "type", targetNamespace = "")
        String type);

    /**
     * 
     * @param calories
     * @return
     *     returns java.util.List<introsde.Food>
     */
    @WebMethod
    @WebResult(name = "foods", targetNamespace = "")
    @RequestWrapper(localName = "getFoodByCaloriesBound", targetNamespace = "http://soap.sde/", className = "introsde.GetFoodByCaloriesBound")
    @ResponseWrapper(localName = "getFoodByCaloriesBoundResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetFoodByCaloriesBoundResponse")
    @Action(input = "http://soap.sde/Storage/getFoodByCaloriesBoundRequest", output = "http://soap.sde/Storage/getFoodByCaloriesBoundResponse")
    public List<Food> getFoodByCaloriesBound(
        @WebParam(name = "calories", targetNamespace = "")
        double calories);

    /**
     * 
     * @param foodIn
     * @return
     *     returns introsde.Food
     */
    @WebMethod
    @WebResult(name = "food", targetNamespace = "")
    @RequestWrapper(localName = "createFood", targetNamespace = "http://soap.sde/", className = "introsde.CreateFood")
    @ResponseWrapper(localName = "createFoodResponse", targetNamespace = "http://soap.sde/", className = "introsde.CreateFoodResponse")
    @Action(input = "http://soap.sde/Storage/createFoodRequest", output = "http://soap.sde/Storage/createFoodResponse")
    public Food createFood(
        @WebParam(name = "foodIn", targetNamespace = "")
        Food foodIn);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.User>
     */
    @WebMethod
    @WebResult(name = "users", targetNamespace = "")
    @RequestWrapper(localName = "getAllUser", targetNamespace = "http://soap.sde/", className = "introsde.GetAllUser")
    @ResponseWrapper(localName = "getAllUserResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetAllUserResponse")
    @Action(input = "http://soap.sde/Storage/getAllUserRequest", output = "http://soap.sde/Storage/getAllUserResponse")
    public List<User> getAllUser();

    /**
     * 
     * @param idUser
     * @return
     *     returns introsde.User
     */
    @WebMethod
    @WebResult(name = "user", targetNamespace = "")
    @RequestWrapper(localName = "getUserById", targetNamespace = "http://soap.sde/", className = "introsde.GetUserById")
    @ResponseWrapper(localName = "getUserByIdResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetUserByIdResponse")
    @Action(input = "http://soap.sde/Storage/getUserByIdRequest", output = "http://soap.sde/Storage/getUserByIdResponse")
    public User getUserById(
        @WebParam(name = "idUser", targetNamespace = "")
        Long idUser);

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns introsde.User
     */
    @WebMethod
    @WebResult(name = "user", targetNamespace = "")
    @RequestWrapper(localName = "getUserByUsernamePassword", targetNamespace = "http://soap.sde/", className = "introsde.GetUserByUsernamePassword")
    @ResponseWrapper(localName = "getUserByUsernamePasswordResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetUserByUsernamePasswordResponse")
    @Action(input = "http://soap.sde/Storage/getUserByUsernamePasswordRequest", output = "http://soap.sde/Storage/getUserByUsernamePasswordResponse")
    public User getUserByUsernamePassword(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param userIn
     * @return
     *     returns introsde.User
     */
    @WebMethod
    @WebResult(name = "user", targetNamespace = "")
    @RequestWrapper(localName = "createUser", targetNamespace = "http://soap.sde/", className = "introsde.CreateUser")
    @ResponseWrapper(localName = "createUserResponse", targetNamespace = "http://soap.sde/", className = "introsde.CreateUserResponse")
    @Action(input = "http://soap.sde/Storage/createUserRequest", output = "http://soap.sde/Storage/createUserResponse")
    public User createUser(
        @WebParam(name = "userIn", targetNamespace = "")
        User userIn);

    /**
     * 
     * @param userIn
     * @return
     *     returns introsde.User
     */
    @WebMethod
    @WebResult(name = "user", targetNamespace = "")
    @RequestWrapper(localName = "updateUser", targetNamespace = "http://soap.sde/", className = "introsde.UpdateUser")
    @ResponseWrapper(localName = "updateUserResponse", targetNamespace = "http://soap.sde/", className = "introsde.UpdateUserResponse")
    @Action(input = "http://soap.sde/Storage/updateUserRequest", output = "http://soap.sde/Storage/updateUserResponse")
    public User updateUser(
        @WebParam(name = "userIn", targetNamespace = "")
        User userIn);

    /**
     * 
     * @param userIn
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "removeUser", targetNamespace = "http://soap.sde/", className = "introsde.RemoveUser")
    @ResponseWrapper(localName = "removeUserResponse", targetNamespace = "http://soap.sde/", className = "introsde.RemoveUserResponse")
    @Action(input = "http://soap.sde/Storage/removeUserRequest", output = "http://soap.sde/Storage/removeUserResponse")
    public boolean removeUser(
        @WebParam(name = "userIn", targetNamespace = "")
        User userIn);

    /**
     * 
     * @param password
     * @param userName
     * @return
     *     returns introsde.User
     */
    @WebMethod
    @WebResult(name = "user", targetNamespace = "")
    @RequestWrapper(localName = "loginUser", targetNamespace = "http://soap.sde/", className = "introsde.LoginUser")
    @ResponseWrapper(localName = "loginUserResponse", targetNamespace = "http://soap.sde/", className = "introsde.LoginUserResponse")
    @Action(input = "http://soap.sde/Storage/loginUserRequest", output = "http://soap.sde/Storage/loginUserResponse")
    public User loginUser(
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param idUser
     * @param secondPassword
     * @param firstPassword
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updatePassword", targetNamespace = "http://soap.sde/", className = "introsde.UpdatePassword")
    @ResponseWrapper(localName = "updatePasswordResponse", targetNamespace = "http://soap.sde/", className = "introsde.UpdatePasswordResponse")
    @Action(input = "http://soap.sde/Storage/updatePasswordRequest", output = "http://soap.sde/Storage/updatePasswordResponse")
    public boolean updatePassword(
        @WebParam(name = "idUser", targetNamespace = "")
        long idUser,
        @WebParam(name = "firstPassword", targetNamespace = "")
        String firstPassword,
        @WebParam(name = "secondPassword", targetNamespace = "")
        String secondPassword);

    /**
     * 
     * @param password
     * @param userName
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "controlUsernamePassword", targetNamespace = "http://soap.sde/", className = "introsde.ControlUsernamePassword")
    @ResponseWrapper(localName = "controlUsernamePasswordResponse", targetNamespace = "http://soap.sde/", className = "introsde.ControlUsernamePasswordResponse")
    @Action(input = "http://soap.sde/Storage/controlUsernamePasswordRequest", output = "http://soap.sde/Storage/controlUsernamePasswordResponse")
    public boolean controlUsernamePassword(
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.Activity>
     */
    @WebMethod
    @WebResult(name = "activities", targetNamespace = "")
    @RequestWrapper(localName = "getAllActivity", targetNamespace = "http://soap.sde/", className = "introsde.GetAllActivity")
    @ResponseWrapper(localName = "getAllActivityResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetAllActivityResponse")
    @Action(input = "http://soap.sde/Storage/getAllActivityRequest", output = "http://soap.sde/Storage/getAllActivityResponse")
    public List<Activity> getAllActivity();

    /**
     * 
     * @param idUser
     * @return
     *     returns java.util.List<introsde.Activity>
     */
    @WebMethod
    @WebResult(name = "activities", targetNamespace = "")
    @RequestWrapper(localName = "getActivityByIdUser", targetNamespace = "http://soap.sde/", className = "introsde.GetActivityByIdUser")
    @ResponseWrapper(localName = "getActivityByIdUserResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetActivityByIdUserResponse")
    @Action(input = "http://soap.sde/Storage/getActivityByIdUserRequest", output = "http://soap.sde/Storage/getActivityByIdUserResponse")
    public List<Activity> getActivityByIdUser(
        @WebParam(name = "idUser", targetNamespace = "")
        Long idUser);

    /**
     * 
     * @param idActivity
     * @return
     *     returns introsde.Activity
     */
    @WebMethod
    @WebResult(name = "activity", targetNamespace = "")
    @RequestWrapper(localName = "getActivityById", targetNamespace = "http://soap.sde/", className = "introsde.GetActivityById")
    @ResponseWrapper(localName = "getActivityByIdResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetActivityByIdResponse")
    @Action(input = "http://soap.sde/Storage/getActivityByIdRequest", output = "http://soap.sde/Storage/getActivityByIdResponse")
    public Activity getActivityById(
        @WebParam(name = "idActivity", targetNamespace = "")
        Long idActivity);

    /**
     * 
     * @param type
     * @return
     *     returns java.util.List<introsde.Activity>
     */
    @WebMethod
    @WebResult(name = "activities", targetNamespace = "")
    @RequestWrapper(localName = "getActivityByType", targetNamespace = "http://soap.sde/", className = "introsde.GetActivityByType")
    @ResponseWrapper(localName = "getActivityByTypeResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetActivityByTypeResponse")
    @Action(input = "http://soap.sde/Storage/getActivityByTypeRequest", output = "http://soap.sde/Storage/getActivityByTypeResponse")
    public List<Activity> getActivityByType(
        @WebParam(name = "type", targetNamespace = "")
        String type);

    /**
     * 
     * @param name
     * @return
     *     returns java.util.List<introsde.Activity>
     */
    @WebMethod
    @WebResult(name = "activities", targetNamespace = "")
    @RequestWrapper(localName = "getActivityByName", targetNamespace = "http://soap.sde/", className = "introsde.GetActivityByName")
    @ResponseWrapper(localName = "getActivityByNameResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetActivityByNameResponse")
    @Action(input = "http://soap.sde/Storage/getActivityByNameRequest", output = "http://soap.sde/Storage/getActivityByNameResponse")
    public List<Activity> getActivityByName(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param calories
     * @return
     *     returns java.util.List<introsde.Activity>
     */
    @WebMethod
    @WebResult(name = "activities", targetNamespace = "")
    @RequestWrapper(localName = "getActivityByCalories", targetNamespace = "http://soap.sde/", className = "introsde.GetActivityByCalories")
    @ResponseWrapper(localName = "getActivityByCaloriesResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetActivityByCaloriesResponse")
    @Action(input = "http://soap.sde/Storage/getActivityByCaloriesRequest", output = "http://soap.sde/Storage/getActivityByCaloriesResponse")
    public List<Activity> getActivityByCalories(
        @WebParam(name = "calories", targetNamespace = "")
        double calories);

    /**
     * 
     * @param activityIn
     * @return
     *     returns introsde.Activity
     */
    @WebMethod
    @WebResult(name = "activity", targetNamespace = "")
    @RequestWrapper(localName = "createActivity", targetNamespace = "http://soap.sde/", className = "introsde.CreateActivity")
    @ResponseWrapper(localName = "createActivityResponse", targetNamespace = "http://soap.sde/", className = "introsde.CreateActivityResponse")
    @Action(input = "http://soap.sde/Storage/createActivityRequest", output = "http://soap.sde/Storage/createActivityResponse")
    public Activity createActivity(
        @WebParam(name = "activityIn", targetNamespace = "")
        Activity activityIn);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.Goal>
     */
    @WebMethod
    @WebResult(name = "goals", targetNamespace = "")
    @RequestWrapper(localName = "getAllGoal", targetNamespace = "http://soap.sde/", className = "introsde.GetAllGoal")
    @ResponseWrapper(localName = "getAllGoalResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetAllGoalResponse")
    @Action(input = "http://soap.sde/Storage/getAllGoalRequest", output = "http://soap.sde/Storage/getAllGoalResponse")
    public List<Goal> getAllGoal();

    /**
     * 
     * @param idGoal
     * @return
     *     returns introsde.Goal
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "getGoalById", targetNamespace = "http://soap.sde/", className = "introsde.GetGoalById")
    @ResponseWrapper(localName = "getGoalByIdResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetGoalByIdResponse")
    @Action(input = "http://soap.sde/Storage/getGoalByIdRequest", output = "http://soap.sde/Storage/getGoalByIdResponse")
    public Goal getGoalById(
        @WebParam(name = "idGoal", targetNamespace = "")
        Long idGoal);

    /**
     * 
     * @param type
     * @param userId
     * @return
     *     returns java.util.List<introsde.Goal>
     */
    @WebMethod
    @WebResult(name = "goals", targetNamespace = "")
    @RequestWrapper(localName = "getGoalByType", targetNamespace = "http://soap.sde/", className = "introsde.GetGoalByType")
    @ResponseWrapper(localName = "getGoalByTypeResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetGoalByTypeResponse")
    @Action(input = "http://soap.sde/Storage/getGoalByTypeRequest", output = "http://soap.sde/Storage/getGoalByTypeResponse")
    public List<Goal> getGoalByType(
        @WebParam(name = "type", targetNamespace = "")
        String type,
        @WebParam(name = "userId", targetNamespace = "")
        long userId);

    /**
     * 
     * @param userId
     * @return
     *     returns java.util.List<introsde.Goal>
     */
    @WebMethod
    @WebResult(name = "goals", targetNamespace = "")
    @RequestWrapper(localName = "getGoalNotAchieved", targetNamespace = "http://soap.sde/", className = "introsde.GetGoalNotAchieved")
    @ResponseWrapper(localName = "getGoalNotAchievedResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetGoalNotAchievedResponse")
    @Action(input = "http://soap.sde/Storage/getGoalNotAchievedRequest", output = "http://soap.sde/Storage/getGoalNotAchievedResponse")
    public List<Goal> getGoalNotAchieved(
        @WebParam(name = "userId", targetNamespace = "")
        long userId);

    /**
     * 
     * @param userId
     * @return
     *     returns java.util.List<introsde.Goal>
     */
    @WebMethod
    @WebResult(name = "goals", targetNamespace = "")
    @RequestWrapper(localName = "getGoalAchieved", targetNamespace = "http://soap.sde/", className = "introsde.GetGoalAchieved")
    @ResponseWrapper(localName = "getGoalAchievedResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetGoalAchievedResponse")
    @Action(input = "http://soap.sde/Storage/getGoalAchievedRequest", output = "http://soap.sde/Storage/getGoalAchievedResponse")
    public List<Goal> getGoalAchieved(
        @WebParam(name = "userId", targetNamespace = "")
        long userId);

    /**
     * 
     * @param endAt
     * @return
     *     returns java.util.List<introsde.Goal>
     */
    @WebMethod
    @WebResult(name = "goals", targetNamespace = "")
    @RequestWrapper(localName = "getGoalEndAt", targetNamespace = "http://soap.sde/", className = "introsde.GetGoalEndAt")
    @ResponseWrapper(localName = "getGoalEndAtResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetGoalEndAtResponse")
    @Action(input = "http://soap.sde/Storage/getGoalEndAtRequest", output = "http://soap.sde/Storage/getGoalEndAtResponse")
    public List<Goal> getGoalEndAt(
        @WebParam(name = "endAt", targetNamespace = "")
        XMLGregorianCalendar endAt);

    /**
     * 
     * @param type
     * @return
     *     returns java.util.List<introsde.Goal>
     */
    @WebMethod
    @WebResult(name = "goals", targetNamespace = "")
    @RequestWrapper(localName = "controlGoal", targetNamespace = "http://soap.sde/", className = "introsde.ControlGoal")
    @ResponseWrapper(localName = "controlGoalResponse", targetNamespace = "http://soap.sde/", className = "introsde.ControlGoalResponse")
    @Action(input = "http://soap.sde/Storage/controlGoalRequest", output = "http://soap.sde/Storage/controlGoalResponse")
    public List<Goal> controlGoal(
        @WebParam(name = "type", targetNamespace = "")
        String type);

    /**
     * 
     * @param goalIn
     * @return
     *     returns introsde.Goal
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "createGoal", targetNamespace = "http://soap.sde/", className = "introsde.CreateGoal")
    @ResponseWrapper(localName = "createGoalResponse", targetNamespace = "http://soap.sde/", className = "introsde.CreateGoalResponse")
    @Action(input = "http://soap.sde/Storage/createGoalRequest", output = "http://soap.sde/Storage/createGoalResponse")
    public Goal createGoal(
        @WebParam(name = "goalIn", targetNamespace = "")
        Goal goalIn);

    /**
     * 
     * @param goalIn
     * @return
     *     returns introsde.Goal
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "updateGoal", targetNamespace = "http://soap.sde/", className = "introsde.UpdateGoal")
    @ResponseWrapper(localName = "updateGoalResponse", targetNamespace = "http://soap.sde/", className = "introsde.UpdateGoalResponse")
    @Action(input = "http://soap.sde/Storage/updateGoalRequest", output = "http://soap.sde/Storage/updateGoalResponse")
    public Goal updateGoal(
        @WebParam(name = "goalIn", targetNamespace = "")
        Goal goalIn);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.HealthMeasure>
     */
    @WebMethod
    @WebResult(name = "healthMeasures", targetNamespace = "")
    @RequestWrapper(localName = "getAllHealthMeasure", targetNamespace = "http://soap.sde/", className = "introsde.GetAllHealthMeasure")
    @ResponseWrapper(localName = "getAllHealthMeasureResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetAllHealthMeasureResponse")
    @Action(input = "http://soap.sde/Storage/getAllHealthMeasureRequest", output = "http://soap.sde/Storage/getAllHealthMeasureResponse")
    public List<HealthMeasure> getAllHealthMeasure();

    /**
     * 
     * @param idUser
     * @return
     *     returns java.util.List<introsde.HealthMeasure>
     */
    @WebMethod
    @WebResult(name = "healthMeasures", targetNamespace = "")
    @RequestWrapper(localName = "getHealthMeasureByIdUser", targetNamespace = "http://soap.sde/", className = "introsde.GetHealthMeasureByIdUser")
    @ResponseWrapper(localName = "getHealthMeasureByIdUserResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetHealthMeasureByIdUserResponse")
    @Action(input = "http://soap.sde/Storage/getHealthMeasureByIdUserRequest", output = "http://soap.sde/Storage/getHealthMeasureByIdUserResponse")
    public List<HealthMeasure> getHealthMeasureByIdUser(
        @WebParam(name = "idUser", targetNamespace = "")
        Long idUser);

    /**
     * 
     * @param idUser
     * @param type
     * @return
     *     returns java.util.List<introsde.HealthMeasure>
     */
    @WebMethod
    @WebResult(name = "healthMeasures", targetNamespace = "")
    @RequestWrapper(localName = "getHealthMeasureByIdUserType", targetNamespace = "http://soap.sde/", className = "introsde.GetHealthMeasureByIdUserType")
    @ResponseWrapper(localName = "getHealthMeasureByIdUserTypeResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetHealthMeasureByIdUserTypeResponse")
    @Action(input = "http://soap.sde/Storage/getHealthMeasureByIdUserTypeRequest", output = "http://soap.sde/Storage/getHealthMeasureByIdUserTypeResponse")
    public List<HealthMeasure> getHealthMeasureByIdUserType(
        @WebParam(name = "idUser", targetNamespace = "")
        Long idUser,
        @WebParam(name = "type", targetNamespace = "")
        String type);

    /**
     * 
     * @param healthMeasureIn
     * @return
     *     returns introsde.HealthMeasure
     */
    @WebMethod
    @WebResult(name = "healthMeasure", targetNamespace = "")
    @RequestWrapper(localName = "createHealthMeasure", targetNamespace = "http://soap.sde/", className = "introsde.CreateHealthMeasure")
    @ResponseWrapper(localName = "createHealthMeasureResponse", targetNamespace = "http://soap.sde/", className = "introsde.CreateHealthMeasureResponse")
    @Action(input = "http://soap.sde/Storage/createHealthMeasureRequest", output = "http://soap.sde/Storage/createHealthMeasureResponse")
    public HealthMeasure createHealthMeasure(
        @WebParam(name = "healthMeasureIn", targetNamespace = "")
        HealthMeasure healthMeasureIn);

    /**
     * 
     * @param healthMeasureIn
     * @return
     *     returns introsde.HealthMeasure
     */
    @WebMethod
    @WebResult(name = "healthMeasure", targetNamespace = "")
    @RequestWrapper(localName = "updateHealthMeasure", targetNamespace = "http://soap.sde/", className = "introsde.UpdateHealthMeasure")
    @ResponseWrapper(localName = "updateHealthMeasureResponse", targetNamespace = "http://soap.sde/", className = "introsde.UpdateHealthMeasureResponse")
    @Action(input = "http://soap.sde/Storage/updateHealthMeasureRequest", output = "http://soap.sde/Storage/updateHealthMeasureResponse")
    public HealthMeasure updateHealthMeasure(
        @WebParam(name = "healthMeasureIn", targetNamespace = "")
        HealthMeasure healthMeasureIn);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getQuote", targetNamespace = "http://soap.sde/", className = "introsde.GetQuote")
    @ResponseWrapper(localName = "getQuoteResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetQuoteResponse")
    @Action(input = "http://soap.sde/Storage/getQuoteRequest", output = "http://soap.sde/Storage/getQuoteResponse")
    public String getQuote();

    /**
     * 
     * @param type
     * @return
     *     returns java.util.List<introsde.Food>
     */
    @WebMethod
    @WebResult(name = "foods", targetNamespace = "")
    @RequestWrapper(localName = "getAdapterFood", targetNamespace = "http://soap.sde/", className = "introsde.GetAdapterFood")
    @ResponseWrapper(localName = "getAdapterFoodResponse", targetNamespace = "http://soap.sde/", className = "introsde.GetAdapterFoodResponse")
    @Action(input = "http://soap.sde/Storage/getAdapterFoodRequest", output = "http://soap.sde/Storage/getAdapterFoodResponse")
    public List<Food> getAdapterFood(
        @WebParam(name = "type", targetNamespace = "")
        String type);

}
