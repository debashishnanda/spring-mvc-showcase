package org.springframework.samples.mvc.data;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.framework.qual.DefaultQualifier;

/*
 * Error: JavaBean.java:[3,8] [initialization.fields.uninitialized] the constructor does not initialize fields:
 * param1, param2, param3
 *
 * Once a new JavaBean() has been initialized, it would always have its fields set to be null and these fields are
 * not initialised in this class
 */
@DefaultQualifier(Nullable.class)
public class JavaBean {

	private String param1;
	
	private String param2;
	
	private String param3;

	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	public String getParam2() {
		return param2;
	}

	public void setParam2(String param2) {
		this.param2 = param2;
	}

	public String getParam3() {
		return param3;
	}

	public void setParam3(String param3) {
		this.param3 = param3;
	}

}