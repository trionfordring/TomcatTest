package fordring.bean;
/**
 * 
 * 该接口实现了对用户信息的整合，在访问过程中，将user实现类的实例保存在session中，以便实现用户的持久化访问。
 * User实例应该由dao层构造，在登录或注册操作中，外层将登录或注册的操作保存为LoginApplication对象(或ReginterApplication对象)
 * 将application对象提交给DAO层的UserManager,并获得UserManager构造出的User对象。
 * @author fordring
 * 
 */
public interface User {
	
}
