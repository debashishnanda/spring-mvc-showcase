package org.springframework.samples.mvc.views;

import javax.validation.constraints.NotNull;

/*
 * Error: JavaBean.java:[5,8] [initialization.fields.uninitialized] the constructor does not initialize fields:
 * foo, fruit
 *
 * Warnings of the possible nullness of this class have been suppressed because of fields in this class have
 * already been ensured to be non-null by the @NotNull annotation and are not not initialised in this class
 */
@SuppressWarnings("nullness")
public class JavaBean {
	
	@NotNull
	private String foo;

	@NotNull
	private String fruit;

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

}
