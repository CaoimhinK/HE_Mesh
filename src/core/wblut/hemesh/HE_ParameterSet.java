package wblut.hemesh;

import java.util.Map;

import org.eclipse.collections.impl.map.mutable.UnifiedMap;

public class HE_ParameterSet {
	Map<String, Object> values;
	String name;

	public HE_ParameterSet(String name) {
		this.name = name;
		values = new UnifiedMap<String, Object>();
	}

	public HE_ParameterSet set(String name, Object value) {
		values.put(name.toLowerCase(), value);
		return this;
	}

	public Object get(String name, Object ifEmpty) {
		Object value = values.get(name.toLowerCase());
		if (value == null)
			return ifEmpty;
		return value;
	}

	public HE_ParameterSet set(String name, int value) {
		values.put(name.toLowerCase(), value);
		return this;
	}

	public int get(String name, int ifEmpty) {
		Object value = values.get(name.toLowerCase());
		if (value == null)
			return ifEmpty;
		return (Integer) value;
	}

	public HE_ParameterSet set(String name, double value) {
		values.put(name.toLowerCase(), value);
		return this;
	}

	public double get(String name, double ifEmpty) {
		Object value = values.get(name.toLowerCase());
		if (value == null)
			return ifEmpty;
		return (Double) value;
	}
	
	public HE_ParameterSet set(String name, boolean value) {
		values.put(name.toLowerCase(), value);
		return this;
	}

	public boolean get(String name, boolean ifEmpty) {
		Object value = values.get(name.toLowerCase());
		if (value == null)
			return ifEmpty;
		return (Boolean) value;
	}
	
	public String[] getNames(){
		return (String[])values.keySet().toArray();
		
	}
	
	public HE_ParameterSet remove(String name) {
		values.remove(name.toLowerCase());
		return this;
	}

}
