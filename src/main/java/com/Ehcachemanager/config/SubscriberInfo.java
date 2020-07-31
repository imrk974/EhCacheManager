package com.Ehcachemanager.config;


public class SubscriberInfo {
	private String username;
	private String topic;
	private String category;
	private String message;
	private String notificationtype;
	
	public SubscriberInfo() {
		super();
	}

	public SubscriberInfo(String username, String topic, String category, String message, String notificationtype) {
		super();
		this.username = username;
		this.topic = topic;
		this.category = category;
		this.message = message;
		this.notificationtype = notificationtype;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getNotificationtype() {
		return notificationtype;
	}

	public void setNotificationtype(String notificationtype) {
		this.notificationtype = notificationtype;
	}

	@Override
	public String toString() {
		return "SubscriberInfo [username=" + username + ", topic=" + topic + ", category=" + category + ", message="
				+ message + ", notificationtype=" + notificationtype + "]";
	}

	
}
