package org.springframework.samples.mvc.messageconverters;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * Error: JavaBean.java:[15,16] [initialization.fields.uninitialized] the constructor does not initialize fields:
 * foo, fruit
 *
 * Warnings of the possible nullness of this class have been suppressed because of fields in this class have
 * already been ensured to be non-null by the @NotNull annotation and are not not initialised in this class
 */
@SuppressWarnings("nullness")
@XmlRootElement
public class JavaBean {
	
	@NotNull
	private String foo;

	@NotNull
	private String fruit;

	public JavaBean() {
	}

	public JavaBean(String foo, String fruit) {
		this.foo = foo;
		this.fruit = fruit;
	}

	public String getFoo() {
		return foo;
	}

	public void setFoo(String foo) {
		this.foo = foo;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	
	@Override
	public String toString() {
		return "JavaBean {foo=[" + foo + "], fruit=[" + fruit + "]}";
	}

}
