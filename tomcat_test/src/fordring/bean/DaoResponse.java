package fordring.bean;
/**
 * 
 * 该接口实现了对于DAO处理数据后的响应的封装。
 * @author fordring
 * 
 */
public interface DaoResponse extends Message{
	/**
	 * 本次操作是否成功。
	 * @return boolean
	 */
	boolean success();
	
}
