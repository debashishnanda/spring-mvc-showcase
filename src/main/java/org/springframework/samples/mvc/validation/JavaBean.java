package org.springframework.samples.mvc.validation;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/*
 * Error: JavaBean.java:[12,8] [initialization.fields.uninitialized] the constructor does not initialize fields:
 * number, date
 *
 * Warnings of the possible nullness of this class have been suppressed because of fields in this class have
 * already been ensured to be non-null by the @NotNull annotation and are not not initialised in this class
 */
@SuppressWarnings("nullness")
public class JavaBean {
	
	@NotNull
	@Max(5)
	private Integer number;

	@NotNull
	@Future
	@DateTimeFormat(iso=ISO.DATE)
	private Date date;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
