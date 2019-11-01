package fordring.bean;

/**
 * 
 * 本接口实现了对于登录时数据的封装，由用户提交的登录申请最终会被解析封装为一个LoginApplication对象。
 * 该对象最终会被传递给DAO层的UserManager并以此构造user对象。
 * @author fordring
 *
 * 
 */
public interface LoginApplication{
	String getPassword();
	long getID();
	
}
