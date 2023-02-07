package Streams;

import java.util.HashSet;
import java.util.Set;

public class Employee
{
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getDevices() {
		return devices;
	}

	public void setDevices(Set<String> devices) {
		this.devices = devices;
	}

	private String name;
	private Set<String> devices;

	public void addDevices(String devicenames)
	{
		if(devices == null)
		{
			this.devices=new HashSet<>();
		}
		this.devices.add(devicenames);
	}
}
