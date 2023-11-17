package org.lessons.java.christmas.pojo;

public class Gift {
	
	 String name;
     String receiver;
	
	public Gift(String name, String receiver) {
		// TODO Auto-generated constructor stub
		setName(name);
		setReceiver(receiver);
	}

	public  String getName() {
		return name;
	}

	public  void setName(String name) {
		this.name = name;
	}

	public  String getReceiver() {
		return receiver;
	}

	public  void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName()+ "\n"
				+ getReceiver();
	}
	

}
