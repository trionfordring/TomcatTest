package fordring.bean;
/**
 * 
 * 本接口实现了对于注册时数据的封装，由用户递交的数据会被解析并构造出RegiserApplication对象。
 * 该对象会被递交给DAO层的UserManager，userManager会以提交数据为准，向数据库插入user。
 * 注意：DAO层不会检查Application的准确性，请确保传入DAO层的Application对象的准确性。
 * @author fordring
 * 
 */
public interface RegisterApplication extends Message {
	
}
