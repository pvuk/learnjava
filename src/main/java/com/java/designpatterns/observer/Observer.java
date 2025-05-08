package com.java.designpatterns.observer;
/**
 * @author Pulipati Venkata UdayKiran
 * @since 31-Aug 2021 17:37
 */
public interface Observer {

    public void update(Message message);

	/**
	 * @return
	 * @author P.V. UdayKiran
	 * @since created on Thu 08-May-2025 22:13
	 */
	public String removeMessage();

	/**
	 * @return
	 * @author P.V. UdayKiran
	 * @since created on Thu 08-May-2025 22:22
	 */
	public String addingMessage();
}
