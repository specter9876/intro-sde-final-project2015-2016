
package introsde.document.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.document.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetActivityByCalories_QNAME = new QName("http://soap.document.introsde/", "getActivityByCalories");
    private final static QName _GetUserByUsernamePassword_QNAME = new QName("http://soap.document.introsde/", "getUserByUsernamePassword");
    private final static QName _UpdateUser_QNAME = new QName("http://soap.document.introsde/", "updateUser");
    private final static QName _CreateFood_QNAME = new QName("http://soap.document.introsde/", "createFood");
    private final static QName _UpdateHealthMeasure_QNAME = new QName("http://soap.document.introsde/", "updateHealthMeasure");
    private final static QName _Food_QNAME = new QName("http://soap.document.introsde/", "food");
    private final static QName _GetHealthMeasureByIdUserResponse_QNAME = new QName("http://soap.document.introsde/", "getHealthMeasureByIdUserResponse");
    private final static QName _ControlUsernamePasswordResponse_QNAME = new QName("http://soap.document.introsde/", "controlUsernamePasswordResponse");
    private final static QName _GetGoalNotAchievedResponse_QNAME = new QName("http://soap.document.introsde/", "getGoalNotAchievedResponse");
    private final static QName _ControlGoalResponse_QNAME = new QName("http://soap.document.introsde/", "controlGoalResponse");
    private final static QName _CreateActivity_QNAME = new QName("http://soap.document.introsde/", "createActivity");
    private final static QName _UpdatePassword_QNAME = new QName("http://soap.document.introsde/", "updatePassword");
    private final static QName _CreateUserResponse_QNAME = new QName("http://soap.document.introsde/", "createUserResponse");
    private final static QName _GetAllActivity_QNAME = new QName("http://soap.document.introsde/", "getAllActivity");
    private final static QName _CreateUser_QNAME = new QName("http://soap.document.introsde/", "createUser");
    private final static QName _GetActivityByIdUser_QNAME = new QName("http://soap.document.introsde/", "getActivityByIdUser");
    private final static QName _User_QNAME = new QName("http://soap.document.introsde/", "user");
    private final static QName _GetAllGoalResponse_QNAME = new QName("http://soap.document.introsde/", "getAllGoalResponse");
    private final static QName _GetGoalEndAtResponse_QNAME = new QName("http://soap.document.introsde/", "getGoalEndAtResponse");
    private final static QName _GetAllFoodResponse_QNAME = new QName("http://soap.document.introsde/", "getAllFoodResponse");
    private final static QName _GetAllHealthMeasureResponse_QNAME = new QName("http://soap.document.introsde/", "getAllHealthMeasureResponse");
    private final static QName _HealthMeasure_QNAME = new QName("http://soap.document.introsde/", "healthMeasure");
    private final static QName _GetAllGoal_QNAME = new QName("http://soap.document.introsde/", "getAllGoal");
    private final static QName _GetActivityById_QNAME = new QName("http://soap.document.introsde/", "getActivityById");
    private final static QName _GetHealthMeasureByIdUserTypeResponse_QNAME = new QName("http://soap.document.introsde/", "getHealthMeasureByIdUserTypeResponse");
    private final static QName _GetActivityByIdResponse_QNAME = new QName("http://soap.document.introsde/", "getActivityByIdResponse");
    private final static QName _GetFoodByTypeResponse_QNAME = new QName("http://soap.document.introsde/", "getFoodByTypeResponse");
    private final static QName _GetHealthMeasureByIdUser_QNAME = new QName("http://soap.document.introsde/", "getHealthMeasureByIdUser");
    private final static QName _GetAllHealthMeasure_QNAME = new QName("http://soap.document.introsde/", "getAllHealthMeasure");
    private final static QName _GetActivityByIdUserResponse_QNAME = new QName("http://soap.document.introsde/", "getActivityByIdUserResponse");
    private final static QName _GetGoalByIdResponse_QNAME = new QName("http://soap.document.introsde/", "getGoalByIdResponse");
    private final static QName _GetUserById_QNAME = new QName("http://soap.document.introsde/", "getUserById");
    private final static QName _Activity_QNAME = new QName("http://soap.document.introsde/", "activity");
    private final static QName _GetGoalEndAt_QNAME = new QName("http://soap.document.introsde/", "getGoalEndAt");
    private final static QName _GetGoalNotAchieved_QNAME = new QName("http://soap.document.introsde/", "getGoalNotAchieved");
    private final static QName _GetGoalByTypeResponse_QNAME = new QName("http://soap.document.introsde/", "getGoalByTypeResponse");
    private final static QName _GetGoalByType_QNAME = new QName("http://soap.document.introsde/", "getGoalByType");
    private final static QName _GetUserByUsernamePasswordResponse_QNAME = new QName("http://soap.document.introsde/", "getUserByUsernamePasswordResponse");
    private final static QName _GetActivityByType_QNAME = new QName("http://soap.document.introsde/", "getActivityByType");
    private final static QName _CreateActivityResponse_QNAME = new QName("http://soap.document.introsde/", "createActivityResponse");
    private final static QName _LoginUser_QNAME = new QName("http://soap.document.introsde/", "loginUser");
    private final static QName _CreateHealthMeasureResponse_QNAME = new QName("http://soap.document.introsde/", "createHealthMeasureResponse");
    private final static QName _UpdateGoal_QNAME = new QName("http://soap.document.introsde/", "updateGoal");
    private final static QName _GetActivityByName_QNAME = new QName("http://soap.document.introsde/", "getActivityByName");
    private final static QName _ControlGoal_QNAME = new QName("http://soap.document.introsde/", "controlGoal");
    private final static QName _GetAllUserResponse_QNAME = new QName("http://soap.document.introsde/", "getAllUserResponse");
    private final static QName _Goal_QNAME = new QName("http://soap.document.introsde/", "goal");
    private final static QName _UpdateGoalResponse_QNAME = new QName("http://soap.document.introsde/", "updateGoalResponse");
    private final static QName _GetGoalById_QNAME = new QName("http://soap.document.introsde/", "getGoalById");
    private final static QName _CreateGoal_QNAME = new QName("http://soap.document.introsde/", "createGoal");
    private final static QName _GetAllUser_QNAME = new QName("http://soap.document.introsde/", "getAllUser");
    private final static QName _UpdateHealthMeasureResponse_QNAME = new QName("http://soap.document.introsde/", "updateHealthMeasureResponse");
    private final static QName _GetGoalAchieved_QNAME = new QName("http://soap.document.introsde/", "getGoalAchieved");
    private final static QName _GetFoodByIdResponse_QNAME = new QName("http://soap.document.introsde/", "getFoodByIdResponse");
    private final static QName _CreateGoalResponse_QNAME = new QName("http://soap.document.introsde/", "createGoalResponse");
    private final static QName _RemoveUserResponse_QNAME = new QName("http://soap.document.introsde/", "removeUserResponse");
    private final static QName _GetActivityByTypeResponse_QNAME = new QName("http://soap.document.introsde/", "getActivityByTypeResponse");
    private final static QName _GetFoodById_QNAME = new QName("http://soap.document.introsde/", "getFoodById");
    private final static QName _CreateFoodResponse_QNAME = new QName("http://soap.document.introsde/", "createFoodResponse");
    private final static QName _GetFoodByCaloriesBound_QNAME = new QName("http://soap.document.introsde/", "getFoodByCaloriesBound");
    private final static QName _GetActivityByCaloriesResponse_QNAME = new QName("http://soap.document.introsde/", "getActivityByCaloriesResponse");
    private final static QName _GetAllActivityResponse_QNAME = new QName("http://soap.document.introsde/", "getAllActivityResponse");
    private final static QName _ControlUsernamePassword_QNAME = new QName("http://soap.document.introsde/", "controlUsernamePassword");
    private final static QName _CreateHealthMeasure_QNAME = new QName("http://soap.document.introsde/", "createHealthMeasure");
    private final static QName _GetAllFood_QNAME = new QName("http://soap.document.introsde/", "getAllFood");
    private final static QName _UpdatePasswordResponse_QNAME = new QName("http://soap.document.introsde/", "updatePasswordResponse");
    private final static QName _GetActivityByNameResponse_QNAME = new QName("http://soap.document.introsde/", "getActivityByNameResponse");
    private final static QName _GetUserByIdResponse_QNAME = new QName("http://soap.document.introsde/", "getUserByIdResponse");
    private final static QName _LoginUserResponse_QNAME = new QName("http://soap.document.introsde/", "loginUserResponse");
    private final static QName _GetGoalAchievedResponse_QNAME = new QName("http://soap.document.introsde/", "getGoalAchievedResponse");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://soap.document.introsde/", "updateUserResponse");
    private final static QName _GetHealthMeasureByIdUserType_QNAME = new QName("http://soap.document.introsde/", "getHealthMeasureByIdUserType");
    private final static QName _GetFoodByCaloriesBoundResponse_QNAME = new QName("http://soap.document.introsde/", "getFoodByCaloriesBoundResponse");
    private final static QName _RemoveUser_QNAME = new QName("http://soap.document.introsde/", "removeUser");
    private final static QName _GetFoodByType_QNAME = new QName("http://soap.document.introsde/", "getFoodByType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.document.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateHealthMeasure }
     * 
     */
    public CreateHealthMeasure createCreateHealthMeasure() {
        return new CreateHealthMeasure();
    }

    /**
     * Create an instance of {@link GetAllFood }
     * 
     */
    public GetAllFood createGetAllFood() {
        return new GetAllFood();
    }

    /**
     * Create an instance of {@link UpdatePasswordResponse }
     * 
     */
    public UpdatePasswordResponse createUpdatePasswordResponse() {
        return new UpdatePasswordResponse();
    }

    /**
     * Create an instance of {@link GetActivityByNameResponse }
     * 
     */
    public GetActivityByNameResponse createGetActivityByNameResponse() {
        return new GetActivityByNameResponse();
    }

    /**
     * Create an instance of {@link GetUserByIdResponse }
     * 
     */
    public GetUserByIdResponse createGetUserByIdResponse() {
        return new GetUserByIdResponse();
    }

    /**
     * Create an instance of {@link LoginUserResponse }
     * 
     */
    public LoginUserResponse createLoginUserResponse() {
        return new LoginUserResponse();
    }

    /**
     * Create an instance of {@link GetGoalAchievedResponse }
     * 
     */
    public GetGoalAchievedResponse createGetGoalAchievedResponse() {
        return new GetGoalAchievedResponse();
    }

    /**
     * Create an instance of {@link CreateFoodResponse }
     * 
     */
    public CreateFoodResponse createCreateFoodResponse() {
        return new CreateFoodResponse();
    }

    /**
     * Create an instance of {@link GetFoodByCaloriesBound }
     * 
     */
    public GetFoodByCaloriesBound createGetFoodByCaloriesBound() {
        return new GetFoodByCaloriesBound();
    }

    /**
     * Create an instance of {@link GetActivityByCaloriesResponse }
     * 
     */
    public GetActivityByCaloriesResponse createGetActivityByCaloriesResponse() {
        return new GetActivityByCaloriesResponse();
    }

    /**
     * Create an instance of {@link GetAllActivityResponse }
     * 
     */
    public GetAllActivityResponse createGetAllActivityResponse() {
        return new GetAllActivityResponse();
    }

    /**
     * Create an instance of {@link ControlUsernamePassword }
     * 
     */
    public ControlUsernamePassword createControlUsernamePassword() {
        return new ControlUsernamePassword();
    }

    /**
     * Create an instance of {@link GetFoodByCaloriesBoundResponse }
     * 
     */
    public GetFoodByCaloriesBoundResponse createGetFoodByCaloriesBoundResponse() {
        return new GetFoodByCaloriesBoundResponse();
    }

    /**
     * Create an instance of {@link RemoveUser }
     * 
     */
    public RemoveUser createRemoveUser() {
        return new RemoveUser();
    }

    /**
     * Create an instance of {@link GetFoodByType }
     * 
     */
    public GetFoodByType createGetFoodByType() {
        return new GetFoodByType();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link GetHealthMeasureByIdUserType }
     * 
     */
    public GetHealthMeasureByIdUserType createGetHealthMeasureByIdUserType() {
        return new GetHealthMeasureByIdUserType();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link UpdateGoalResponse }
     * 
     */
    public UpdateGoalResponse createUpdateGoalResponse() {
        return new UpdateGoalResponse();
    }

    /**
     * Create an instance of {@link GetGoalById }
     * 
     */
    public GetGoalById createGetGoalById() {
        return new GetGoalById();
    }

    /**
     * Create an instance of {@link UpdateGoal }
     * 
     */
    public UpdateGoal createUpdateGoal() {
        return new UpdateGoal();
    }

    /**
     * Create an instance of {@link GetActivityByName }
     * 
     */
    public GetActivityByName createGetActivityByName() {
        return new GetActivityByName();
    }

    /**
     * Create an instance of {@link ControlGoal }
     * 
     */
    public ControlGoal createControlGoal() {
        return new ControlGoal();
    }

    /**
     * Create an instance of {@link GetAllUserResponse }
     * 
     */
    public GetAllUserResponse createGetAllUserResponse() {
        return new GetAllUserResponse();
    }

    /**
     * Create an instance of {@link GetGoalAchieved }
     * 
     */
    public GetGoalAchieved createGetGoalAchieved() {
        return new GetGoalAchieved();
    }

    /**
     * Create an instance of {@link GetFoodByIdResponse }
     * 
     */
    public GetFoodByIdResponse createGetFoodByIdResponse() {
        return new GetFoodByIdResponse();
    }

    /**
     * Create an instance of {@link CreateGoalResponse }
     * 
     */
    public CreateGoalResponse createCreateGoalResponse() {
        return new CreateGoalResponse();
    }

    /**
     * Create an instance of {@link RemoveUserResponse }
     * 
     */
    public RemoveUserResponse createRemoveUserResponse() {
        return new RemoveUserResponse();
    }

    /**
     * Create an instance of {@link GetActivityByTypeResponse }
     * 
     */
    public GetActivityByTypeResponse createGetActivityByTypeResponse() {
        return new GetActivityByTypeResponse();
    }

    /**
     * Create an instance of {@link GetFoodById }
     * 
     */
    public GetFoodById createGetFoodById() {
        return new GetFoodById();
    }

    /**
     * Create an instance of {@link CreateGoal }
     * 
     */
    public CreateGoal createCreateGoal() {
        return new CreateGoal();
    }

    /**
     * Create an instance of {@link GetAllUser }
     * 
     */
    public GetAllUser createGetAllUser() {
        return new GetAllUser();
    }

    /**
     * Create an instance of {@link UpdateHealthMeasureResponse }
     * 
     */
    public UpdateHealthMeasureResponse createUpdateHealthMeasureResponse() {
        return new UpdateHealthMeasureResponse();
    }

    /**
     * Create an instance of {@link GetAllHealthMeasure }
     * 
     */
    public GetAllHealthMeasure createGetAllHealthMeasure() {
        return new GetAllHealthMeasure();
    }

    /**
     * Create an instance of {@link GetActivityByIdUserResponse }
     * 
     */
    public GetActivityByIdUserResponse createGetActivityByIdUserResponse() {
        return new GetActivityByIdUserResponse();
    }

    /**
     * Create an instance of {@link GetGoalByIdResponse }
     * 
     */
    public GetGoalByIdResponse createGetGoalByIdResponse() {
        return new GetGoalByIdResponse();
    }

    /**
     * Create an instance of {@link GetUserById }
     * 
     */
    public GetUserById createGetUserById() {
        return new GetUserById();
    }

    /**
     * Create an instance of {@link Activity }
     * 
     */
    public Activity createActivity() {
        return new Activity();
    }

    /**
     * Create an instance of {@link GetGoalEndAt }
     * 
     */
    public GetGoalEndAt createGetGoalEndAt() {
        return new GetGoalEndAt();
    }

    /**
     * Create an instance of {@link GetGoalNotAchieved }
     * 
     */
    public GetGoalNotAchieved createGetGoalNotAchieved() {
        return new GetGoalNotAchieved();
    }

    /**
     * Create an instance of {@link GetGoalByTypeResponse }
     * 
     */
    public GetGoalByTypeResponse createGetGoalByTypeResponse() {
        return new GetGoalByTypeResponse();
    }

    /**
     * Create an instance of {@link GetGoalByType }
     * 
     */
    public GetGoalByType createGetGoalByType() {
        return new GetGoalByType();
    }

    /**
     * Create an instance of {@link GetHealthMeasureByIdUserTypeResponse }
     * 
     */
    public GetHealthMeasureByIdUserTypeResponse createGetHealthMeasureByIdUserTypeResponse() {
        return new GetHealthMeasureByIdUserTypeResponse();
    }

    /**
     * Create an instance of {@link GetActivityByIdResponse }
     * 
     */
    public GetActivityByIdResponse createGetActivityByIdResponse() {
        return new GetActivityByIdResponse();
    }

    /**
     * Create an instance of {@link GetFoodByTypeResponse }
     * 
     */
    public GetFoodByTypeResponse createGetFoodByTypeResponse() {
        return new GetFoodByTypeResponse();
    }

    /**
     * Create an instance of {@link GetHealthMeasureByIdUser }
     * 
     */
    public GetHealthMeasureByIdUser createGetHealthMeasureByIdUser() {
        return new GetHealthMeasureByIdUser();
    }

    /**
     * Create an instance of {@link CreateActivityResponse }
     * 
     */
    public CreateActivityResponse createCreateActivityResponse() {
        return new CreateActivityResponse();
    }

    /**
     * Create an instance of {@link LoginUser }
     * 
     */
    public LoginUser createLoginUser() {
        return new LoginUser();
    }

    /**
     * Create an instance of {@link CreateHealthMeasureResponse }
     * 
     */
    public CreateHealthMeasureResponse createCreateHealthMeasureResponse() {
        return new CreateHealthMeasureResponse();
    }

    /**
     * Create an instance of {@link GetUserByUsernamePasswordResponse }
     * 
     */
    public GetUserByUsernamePasswordResponse createGetUserByUsernamePasswordResponse() {
        return new GetUserByUsernamePasswordResponse();
    }

    /**
     * Create an instance of {@link GetActivityByType }
     * 
     */
    public GetActivityByType createGetActivityByType() {
        return new GetActivityByType();
    }

    /**
     * Create an instance of {@link ControlGoalResponse }
     * 
     */
    public ControlGoalResponse createControlGoalResponse() {
        return new ControlGoalResponse();
    }

    /**
     * Create an instance of {@link CreateActivity }
     * 
     */
    public CreateActivity createCreateActivity() {
        return new CreateActivity();
    }

    /**
     * Create an instance of {@link UpdatePassword }
     * 
     */
    public UpdatePassword createUpdatePassword() {
        return new UpdatePassword();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link GetAllActivity }
     * 
     */
    public GetAllActivity createGetAllActivity() {
        return new GetAllActivity();
    }

    /**
     * Create an instance of {@link GetActivityByCalories }
     * 
     */
    public GetActivityByCalories createGetActivityByCalories() {
        return new GetActivityByCalories();
    }

    /**
     * Create an instance of {@link GetUserByUsernamePassword }
     * 
     */
    public GetUserByUsernamePassword createGetUserByUsernamePassword() {
        return new GetUserByUsernamePassword();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link CreateFood }
     * 
     */
    public CreateFood createCreateFood() {
        return new CreateFood();
    }

    /**
     * Create an instance of {@link UpdateHealthMeasure }
     * 
     */
    public UpdateHealthMeasure createUpdateHealthMeasure() {
        return new UpdateHealthMeasure();
    }

    /**
     * Create an instance of {@link Food }
     * 
     */
    public Food createFood() {
        return new Food();
    }

    /**
     * Create an instance of {@link GetHealthMeasureByIdUserResponse }
     * 
     */
    public GetHealthMeasureByIdUserResponse createGetHealthMeasureByIdUserResponse() {
        return new GetHealthMeasureByIdUserResponse();
    }

    /**
     * Create an instance of {@link ControlUsernamePasswordResponse }
     * 
     */
    public ControlUsernamePasswordResponse createControlUsernamePasswordResponse() {
        return new ControlUsernamePasswordResponse();
    }

    /**
     * Create an instance of {@link GetGoalNotAchievedResponse }
     * 
     */
    public GetGoalNotAchievedResponse createGetGoalNotAchievedResponse() {
        return new GetGoalNotAchievedResponse();
    }

    /**
     * Create an instance of {@link GetAllGoalResponse }
     * 
     */
    public GetAllGoalResponse createGetAllGoalResponse() {
        return new GetAllGoalResponse();
    }

    /**
     * Create an instance of {@link GetGoalEndAtResponse }
     * 
     */
    public GetGoalEndAtResponse createGetGoalEndAtResponse() {
        return new GetGoalEndAtResponse();
    }

    /**
     * Create an instance of {@link GetAllFoodResponse }
     * 
     */
    public GetAllFoodResponse createGetAllFoodResponse() {
        return new GetAllFoodResponse();
    }

    /**
     * Create an instance of {@link GetAllHealthMeasureResponse }
     * 
     */
    public GetAllHealthMeasureResponse createGetAllHealthMeasureResponse() {
        return new GetAllHealthMeasureResponse();
    }

    /**
     * Create an instance of {@link HealthMeasure }
     * 
     */
    public HealthMeasure createHealthMeasure() {
        return new HealthMeasure();
    }

    /**
     * Create an instance of {@link GetAllGoal }
     * 
     */
    public GetAllGoal createGetAllGoal() {
        return new GetAllGoal();
    }

    /**
     * Create an instance of {@link GetActivityById }
     * 
     */
    public GetActivityById createGetActivityById() {
        return new GetActivityById();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link GetActivityByIdUser }
     * 
     */
    public GetActivityByIdUser createGetActivityByIdUser() {
        return new GetActivityByIdUser();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivityByCalories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getActivityByCalories")
    public JAXBElement<GetActivityByCalories> createGetActivityByCalories(GetActivityByCalories value) {
        return new JAXBElement<GetActivityByCalories>(_GetActivityByCalories_QNAME, GetActivityByCalories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByUsernamePassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getUserByUsernamePassword")
    public JAXBElement<GetUserByUsernamePassword> createGetUserByUsernamePassword(GetUserByUsernamePassword value) {
        return new JAXBElement<GetUserByUsernamePassword>(_GetUserByUsernamePassword_QNAME, GetUserByUsernamePassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "updateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFood }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "createFood")
    public JAXBElement<CreateFood> createCreateFood(CreateFood value) {
        return new JAXBElement<CreateFood>(_CreateFood_QNAME, CreateFood.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHealthMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "updateHealthMeasure")
    public JAXBElement<UpdateHealthMeasure> createUpdateHealthMeasure(UpdateHealthMeasure value) {
        return new JAXBElement<UpdateHealthMeasure>(_UpdateHealthMeasure_QNAME, UpdateHealthMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Food }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "food")
    public JAXBElement<Food> createFood(Food value) {
        return new JAXBElement<Food>(_Food_QNAME, Food.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHealthMeasureByIdUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getHealthMeasureByIdUserResponse")
    public JAXBElement<GetHealthMeasureByIdUserResponse> createGetHealthMeasureByIdUserResponse(GetHealthMeasureByIdUserResponse value) {
        return new JAXBElement<GetHealthMeasureByIdUserResponse>(_GetHealthMeasureByIdUserResponse_QNAME, GetHealthMeasureByIdUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlUsernamePasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "controlUsernamePasswordResponse")
    public JAXBElement<ControlUsernamePasswordResponse> createControlUsernamePasswordResponse(ControlUsernamePasswordResponse value) {
        return new JAXBElement<ControlUsernamePasswordResponse>(_ControlUsernamePasswordResponse_QNAME, ControlUsernamePasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalNotAchievedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getGoalNotAchievedResponse")
    public JAXBElement<GetGoalNotAchievedResponse> createGetGoalNotAchievedResponse(GetGoalNotAchievedResponse value) {
        return new JAXBElement<GetGoalNotAchievedResponse>(_GetGoalNotAchievedResponse_QNAME, GetGoalNotAchievedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "controlGoalResponse")
    public JAXBElement<ControlGoalResponse> createControlGoalResponse(ControlGoalResponse value) {
        return new JAXBElement<ControlGoalResponse>(_ControlGoalResponse_QNAME, ControlGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "createActivity")
    public JAXBElement<CreateActivity> createCreateActivity(CreateActivity value) {
        return new JAXBElement<CreateActivity>(_CreateActivity_QNAME, CreateActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "updatePassword")
    public JAXBElement<UpdatePassword> createUpdatePassword(UpdatePassword value) {
        return new JAXBElement<UpdatePassword>(_UpdatePassword_QNAME, UpdatePassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getAllActivity")
    public JAXBElement<GetAllActivity> createGetAllActivity(GetAllActivity value) {
        return new JAXBElement<GetAllActivity>(_GetAllActivity_QNAME, GetAllActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivityByIdUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getActivityByIdUser")
    public JAXBElement<GetActivityByIdUser> createGetActivityByIdUser(GetActivityByIdUser value) {
        return new JAXBElement<GetActivityByIdUser>(_GetActivityByIdUser_QNAME, GetActivityByIdUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getAllGoalResponse")
    public JAXBElement<GetAllGoalResponse> createGetAllGoalResponse(GetAllGoalResponse value) {
        return new JAXBElement<GetAllGoalResponse>(_GetAllGoalResponse_QNAME, GetAllGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalEndAtResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getGoalEndAtResponse")
    public JAXBElement<GetGoalEndAtResponse> createGetGoalEndAtResponse(GetGoalEndAtResponse value) {
        return new JAXBElement<GetGoalEndAtResponse>(_GetGoalEndAtResponse_QNAME, GetGoalEndAtResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFoodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getAllFoodResponse")
    public JAXBElement<GetAllFoodResponse> createGetAllFoodResponse(GetAllFoodResponse value) {
        return new JAXBElement<GetAllFoodResponse>(_GetAllFoodResponse_QNAME, GetAllFoodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllHealthMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getAllHealthMeasureResponse")
    public JAXBElement<GetAllHealthMeasureResponse> createGetAllHealthMeasureResponse(GetAllHealthMeasureResponse value) {
        return new JAXBElement<GetAllHealthMeasureResponse>(_GetAllHealthMeasureResponse_QNAME, GetAllHealthMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HealthMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "healthMeasure")
    public JAXBElement<HealthMeasure> createHealthMeasure(HealthMeasure value) {
        return new JAXBElement<HealthMeasure>(_HealthMeasure_QNAME, HealthMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getAllGoal")
    public JAXBElement<GetAllGoal> createGetAllGoal(GetAllGoal value) {
        return new JAXBElement<GetAllGoal>(_GetAllGoal_QNAME, GetAllGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivityById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getActivityById")
    public JAXBElement<GetActivityById> createGetActivityById(GetActivityById value) {
        return new JAXBElement<GetActivityById>(_GetActivityById_QNAME, GetActivityById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHealthMeasureByIdUserTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getHealthMeasureByIdUserTypeResponse")
    public JAXBElement<GetHealthMeasureByIdUserTypeResponse> createGetHealthMeasureByIdUserTypeResponse(GetHealthMeasureByIdUserTypeResponse value) {
        return new JAXBElement<GetHealthMeasureByIdUserTypeResponse>(_GetHealthMeasureByIdUserTypeResponse_QNAME, GetHealthMeasureByIdUserTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivityByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getActivityByIdResponse")
    public JAXBElement<GetActivityByIdResponse> createGetActivityByIdResponse(GetActivityByIdResponse value) {
        return new JAXBElement<GetActivityByIdResponse>(_GetActivityByIdResponse_QNAME, GetActivityByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getFoodByTypeResponse")
    public JAXBElement<GetFoodByTypeResponse> createGetFoodByTypeResponse(GetFoodByTypeResponse value) {
        return new JAXBElement<GetFoodByTypeResponse>(_GetFoodByTypeResponse_QNAME, GetFoodByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHealthMeasureByIdUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getHealthMeasureByIdUser")
    public JAXBElement<GetHealthMeasureByIdUser> createGetHealthMeasureByIdUser(GetHealthMeasureByIdUser value) {
        return new JAXBElement<GetHealthMeasureByIdUser>(_GetHealthMeasureByIdUser_QNAME, GetHealthMeasureByIdUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllHealthMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getAllHealthMeasure")
    public JAXBElement<GetAllHealthMeasure> createGetAllHealthMeasure(GetAllHealthMeasure value) {
        return new JAXBElement<GetAllHealthMeasure>(_GetAllHealthMeasure_QNAME, GetAllHealthMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivityByIdUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getActivityByIdUserResponse")
    public JAXBElement<GetActivityByIdUserResponse> createGetActivityByIdUserResponse(GetActivityByIdUserResponse value) {
        return new JAXBElement<GetActivityByIdUserResponse>(_GetActivityByIdUserResponse_QNAME, GetActivityByIdUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getGoalByIdResponse")
    public JAXBElement<GetGoalByIdResponse> createGetGoalByIdResponse(GetGoalByIdResponse value) {
        return new JAXBElement<GetGoalByIdResponse>(_GetGoalByIdResponse_QNAME, GetGoalByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getUserById")
    public JAXBElement<GetUserById> createGetUserById(GetUserById value) {
        return new JAXBElement<GetUserById>(_GetUserById_QNAME, GetUserById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Activity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "activity")
    public JAXBElement<Activity> createActivity(Activity value) {
        return new JAXBElement<Activity>(_Activity_QNAME, Activity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalEndAt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getGoalEndAt")
    public JAXBElement<GetGoalEndAt> createGetGoalEndAt(GetGoalEndAt value) {
        return new JAXBElement<GetGoalEndAt>(_GetGoalEndAt_QNAME, GetGoalEndAt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalNotAchieved }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getGoalNotAchieved")
    public JAXBElement<GetGoalNotAchieved> createGetGoalNotAchieved(GetGoalNotAchieved value) {
        return new JAXBElement<GetGoalNotAchieved>(_GetGoalNotAchieved_QNAME, GetGoalNotAchieved.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getGoalByTypeResponse")
    public JAXBElement<GetGoalByTypeResponse> createGetGoalByTypeResponse(GetGoalByTypeResponse value) {
        return new JAXBElement<GetGoalByTypeResponse>(_GetGoalByTypeResponse_QNAME, GetGoalByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getGoalByType")
    public JAXBElement<GetGoalByType> createGetGoalByType(GetGoalByType value) {
        return new JAXBElement<GetGoalByType>(_GetGoalByType_QNAME, GetGoalByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByUsernamePasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getUserByUsernamePasswordResponse")
    public JAXBElement<GetUserByUsernamePasswordResponse> createGetUserByUsernamePasswordResponse(GetUserByUsernamePasswordResponse value) {
        return new JAXBElement<GetUserByUsernamePasswordResponse>(_GetUserByUsernamePasswordResponse_QNAME, GetUserByUsernamePasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivityByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getActivityByType")
    public JAXBElement<GetActivityByType> createGetActivityByType(GetActivityByType value) {
        return new JAXBElement<GetActivityByType>(_GetActivityByType_QNAME, GetActivityByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "createActivityResponse")
    public JAXBElement<CreateActivityResponse> createCreateActivityResponse(CreateActivityResponse value) {
        return new JAXBElement<CreateActivityResponse>(_CreateActivityResponse_QNAME, CreateActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "loginUser")
    public JAXBElement<LoginUser> createLoginUser(LoginUser value) {
        return new JAXBElement<LoginUser>(_LoginUser_QNAME, LoginUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateHealthMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "createHealthMeasureResponse")
    public JAXBElement<CreateHealthMeasureResponse> createCreateHealthMeasureResponse(CreateHealthMeasureResponse value) {
        return new JAXBElement<CreateHealthMeasureResponse>(_CreateHealthMeasureResponse_QNAME, CreateHealthMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "updateGoal")
    public JAXBElement<UpdateGoal> createUpdateGoal(UpdateGoal value) {
        return new JAXBElement<UpdateGoal>(_UpdateGoal_QNAME, UpdateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivityByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getActivityByName")
    public JAXBElement<GetActivityByName> createGetActivityByName(GetActivityByName value) {
        return new JAXBElement<GetActivityByName>(_GetActivityByName_QNAME, GetActivityByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "controlGoal")
    public JAXBElement<ControlGoal> createControlGoal(ControlGoal value) {
        return new JAXBElement<ControlGoal>(_ControlGoal_QNAME, ControlGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getAllUserResponse")
    public JAXBElement<GetAllUserResponse> createGetAllUserResponse(GetAllUserResponse value) {
        return new JAXBElement<GetAllUserResponse>(_GetAllUserResponse_QNAME, GetAllUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Goal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "goal")
    public JAXBElement<Goal> createGoal(Goal value) {
        return new JAXBElement<Goal>(_Goal_QNAME, Goal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "updateGoalResponse")
    public JAXBElement<UpdateGoalResponse> createUpdateGoalResponse(UpdateGoalResponse value) {
        return new JAXBElement<UpdateGoalResponse>(_UpdateGoalResponse_QNAME, UpdateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getGoalById")
    public JAXBElement<GetGoalById> createGetGoalById(GetGoalById value) {
        return new JAXBElement<GetGoalById>(_GetGoalById_QNAME, GetGoalById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "createGoal")
    public JAXBElement<CreateGoal> createCreateGoal(CreateGoal value) {
        return new JAXBElement<CreateGoal>(_CreateGoal_QNAME, CreateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getAllUser")
    public JAXBElement<GetAllUser> createGetAllUser(GetAllUser value) {
        return new JAXBElement<GetAllUser>(_GetAllUser_QNAME, GetAllUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHealthMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "updateHealthMeasureResponse")
    public JAXBElement<UpdateHealthMeasureResponse> createUpdateHealthMeasureResponse(UpdateHealthMeasureResponse value) {
        return new JAXBElement<UpdateHealthMeasureResponse>(_UpdateHealthMeasureResponse_QNAME, UpdateHealthMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalAchieved }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getGoalAchieved")
    public JAXBElement<GetGoalAchieved> createGetGoalAchieved(GetGoalAchieved value) {
        return new JAXBElement<GetGoalAchieved>(_GetGoalAchieved_QNAME, GetGoalAchieved.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getFoodByIdResponse")
    public JAXBElement<GetFoodByIdResponse> createGetFoodByIdResponse(GetFoodByIdResponse value) {
        return new JAXBElement<GetFoodByIdResponse>(_GetFoodByIdResponse_QNAME, GetFoodByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "createGoalResponse")
    public JAXBElement<CreateGoalResponse> createCreateGoalResponse(CreateGoalResponse value) {
        return new JAXBElement<CreateGoalResponse>(_CreateGoalResponse_QNAME, CreateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "removeUserResponse")
    public JAXBElement<RemoveUserResponse> createRemoveUserResponse(RemoveUserResponse value) {
        return new JAXBElement<RemoveUserResponse>(_RemoveUserResponse_QNAME, RemoveUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivityByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getActivityByTypeResponse")
    public JAXBElement<GetActivityByTypeResponse> createGetActivityByTypeResponse(GetActivityByTypeResponse value) {
        return new JAXBElement<GetActivityByTypeResponse>(_GetActivityByTypeResponse_QNAME, GetActivityByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getFoodById")
    public JAXBElement<GetFoodById> createGetFoodById(GetFoodById value) {
        return new JAXBElement<GetFoodById>(_GetFoodById_QNAME, GetFoodById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFoodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "createFoodResponse")
    public JAXBElement<CreateFoodResponse> createCreateFoodResponse(CreateFoodResponse value) {
        return new JAXBElement<CreateFoodResponse>(_CreateFoodResponse_QNAME, CreateFoodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodByCaloriesBound }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getFoodByCaloriesBound")
    public JAXBElement<GetFoodByCaloriesBound> createGetFoodByCaloriesBound(GetFoodByCaloriesBound value) {
        return new JAXBElement<GetFoodByCaloriesBound>(_GetFoodByCaloriesBound_QNAME, GetFoodByCaloriesBound.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivityByCaloriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getActivityByCaloriesResponse")
    public JAXBElement<GetActivityByCaloriesResponse> createGetActivityByCaloriesResponse(GetActivityByCaloriesResponse value) {
        return new JAXBElement<GetActivityByCaloriesResponse>(_GetActivityByCaloriesResponse_QNAME, GetActivityByCaloriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getAllActivityResponse")
    public JAXBElement<GetAllActivityResponse> createGetAllActivityResponse(GetAllActivityResponse value) {
        return new JAXBElement<GetAllActivityResponse>(_GetAllActivityResponse_QNAME, GetAllActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlUsernamePassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "controlUsernamePassword")
    public JAXBElement<ControlUsernamePassword> createControlUsernamePassword(ControlUsernamePassword value) {
        return new JAXBElement<ControlUsernamePassword>(_ControlUsernamePassword_QNAME, ControlUsernamePassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateHealthMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "createHealthMeasure")
    public JAXBElement<CreateHealthMeasure> createCreateHealthMeasure(CreateHealthMeasure value) {
        return new JAXBElement<CreateHealthMeasure>(_CreateHealthMeasure_QNAME, CreateHealthMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFood }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getAllFood")
    public JAXBElement<GetAllFood> createGetAllFood(GetAllFood value) {
        return new JAXBElement<GetAllFood>(_GetAllFood_QNAME, GetAllFood.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "updatePasswordResponse")
    public JAXBElement<UpdatePasswordResponse> createUpdatePasswordResponse(UpdatePasswordResponse value) {
        return new JAXBElement<UpdatePasswordResponse>(_UpdatePasswordResponse_QNAME, UpdatePasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivityByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getActivityByNameResponse")
    public JAXBElement<GetActivityByNameResponse> createGetActivityByNameResponse(GetActivityByNameResponse value) {
        return new JAXBElement<GetActivityByNameResponse>(_GetActivityByNameResponse_QNAME, GetActivityByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getUserByIdResponse")
    public JAXBElement<GetUserByIdResponse> createGetUserByIdResponse(GetUserByIdResponse value) {
        return new JAXBElement<GetUserByIdResponse>(_GetUserByIdResponse_QNAME, GetUserByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "loginUserResponse")
    public JAXBElement<LoginUserResponse> createLoginUserResponse(LoginUserResponse value) {
        return new JAXBElement<LoginUserResponse>(_LoginUserResponse_QNAME, LoginUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalAchievedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getGoalAchievedResponse")
    public JAXBElement<GetGoalAchievedResponse> createGetGoalAchievedResponse(GetGoalAchievedResponse value) {
        return new JAXBElement<GetGoalAchievedResponse>(_GetGoalAchievedResponse_QNAME, GetGoalAchievedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "updateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHealthMeasureByIdUserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getHealthMeasureByIdUserType")
    public JAXBElement<GetHealthMeasureByIdUserType> createGetHealthMeasureByIdUserType(GetHealthMeasureByIdUserType value) {
        return new JAXBElement<GetHealthMeasureByIdUserType>(_GetHealthMeasureByIdUserType_QNAME, GetHealthMeasureByIdUserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodByCaloriesBoundResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getFoodByCaloriesBoundResponse")
    public JAXBElement<GetFoodByCaloriesBoundResponse> createGetFoodByCaloriesBoundResponse(GetFoodByCaloriesBoundResponse value) {
        return new JAXBElement<GetFoodByCaloriesBoundResponse>(_GetFoodByCaloriesBoundResponse_QNAME, GetFoodByCaloriesBoundResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "removeUser")
    public JAXBElement<RemoveUser> createRemoveUser(RemoveUser value) {
        return new JAXBElement<RemoveUser>(_RemoveUser_QNAME, RemoveUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.document.introsde/", name = "getFoodByType")
    public JAXBElement<GetFoodByType> createGetFoodByType(GetFoodByType value) {
        return new JAXBElement<GetFoodByType>(_GetFoodByType_QNAME, GetFoodByType.class, null, value);
    }

}
