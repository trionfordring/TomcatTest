package fordring.bean;

/**
 * 
 * ���ڱ���DAO����Ӧ�ò㴫�ݵ���Ϣ,�䱾�ʿ�����Ϊ��һ��map��
 * @author fordring
 * 
 */
public interface Message <K,V> {
	/**
	 * ��ȡkey����Ӧ��ֵ
	 * @param key
	 * @return V
	 */
	V get(K key);
	/**
	 * ��Message�м����Ϊkey��ֵΪvalue�����ݡ�
	 * ��key�Ѿ�����ʱ�����Ḳ����ǰ��value��
	 * @param key
	 * @param value
	 * @return �����Ƿ�ɹ�
	 */
	boolean put(K key,V value);
	/**
	 * ���ݵ���
	 * @return size of map
	 */
	int size();
}
