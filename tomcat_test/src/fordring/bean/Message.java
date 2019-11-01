package fordring.bean;

/**
 * 
 * 用于保存DAO层与应用层传递的信息,其本质可以认为是一个map。
 * @author fordring
 * 
 */
public interface Message <K,V> {
	/**
	 * 获取key所对应的值
	 * @param key
	 * @return V
	 */
	V get(K key);
	/**
	 * 向Message中加入键为key，值为value的数据。
	 * 当key已经存在时，将会覆盖以前的value。
	 * @param key
	 * @param value
	 * @return 插入是否成功
	 */
	boolean put(K key,V value);
	/**
	 * 数据的量
	 * @return size of map
	 */
	int size();
}
