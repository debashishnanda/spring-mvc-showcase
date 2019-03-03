package org.springframework.samples.mvc.form;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import javax.validation.constraints.Min;
import javax.validation.constraints.Past;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.samples.mvc.convert.MaskFormat;

/*
 * Error: FormBean.java:[17,8] [initialization.fields.uninitialized] the constructor does not initialize fields:
 * name, birthDate, phone, currency, percent, inquiry, inquiryDetails, additionalInfo
 *
 * Once a new FormBean() has been initialized, it would always have its fields set to be null and some fields in this
 * class have already to be ensured to be non-null by the annotations
 */
@DefaultQualifier(Nullable.class)
public class FormBean {

	@NotEmpty
	private String name;

	@Min(21)
	private int age;

	@DateTimeFormat(iso=ISO.DATE)
	@Past
	private Date birthDate;

	@MaskFormat("(###) ###-####")
	private String phone;

	@NumberFormat(pattern="$###,###.00")
	private BigDecimal currency;

	@NumberFormat(style=Style.PERCENT)
	private BigDecimal percent;

	private InquiryType inquiry;

	private String inquiryDetails;

	private boolean subscribeNewsletter;

	private Map<String, String> additionalInfo;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public BigDecimal getCurrency() {
		return currency;
	}

	public void setCurrency(BigDecimal currency) {
		this.currency = currency;
	}

	public BigDecimal getPercent() {
		return percent;
	}

	public void setPercent(BigDecimal percent) {
		this.percent = percent;
	}

	public InquiryType getInquiry() {
		return inquiry;
	}

	public void setInquiry(InquiryType inquiry) {
		this.inquiry = inquiry;
	}

	public String getInquiryDetails() {
		return inquiryDetails;
	}

	public void setInquiryDetails(String inquiryDetails) {
		this.inquiryDetails = inquiryDetails;
	}

	public boolean isSubscribeNewsletter() {
		return subscribeNewsletter;
	}

	public void setSubscribeNewsletter(boolean subscribeNewsletter) {
		this.subscribeNewsletter = subscribeNewsletter;
	}

	public Map<String, String> getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(Map<String, String> additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	/*
	 * Error: FormBean.java:[136,16] [override.return.invalid] Incompatible return type.
	 * Method
     * @Initialized @Nullable String toString(@Initialized @Nullable FormBean this) in org.springframework.samples.mvc.form.FormBean
     * cannot override
     * @Initialized @NonNull String toString(@Initialized @NonNull Object this) in java.lang.Object
     * found   : @Initialized @Nullable String
     * required: @Initialized @NonNull String
     *
     * Warnings for possible nullness of variables in toString() have been suppressed, because they are already
	 * ensured to be non-null by if statement.
	 */
	@SuppressWarnings("nullness")
	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("properties name=");
        if (name != null) {
        	sb.append("'").append(name).append("', ");
        } else {
        	sb.append(name).append(", ");
        }
        sb.append("age=").append(age).append(", ");
        sb.append("birthDate=").append(birthDate).append(", ");
        sb.append("phone=");
        if (phone != null) {
        	sb.append("'").append(phone).append("', ");
        } else {
        	sb.append(phone).append(", ");
        }
        sb.append("currency=").append(currency).append(", ");
        sb.append("percent=").append(percent).append(", ");
        sb.append("inquiry=").append(inquiry).append(", ");
        sb.append("inquiryDetails=");
        if (inquiryDetails != null) {
        	sb.append("'").append(inquiryDetails).append("', ");
        } else {
        	sb.append(inquiryDetails).append(", ");
        }
        sb.append("subscribeNewsletter=").append(subscribeNewsletter).append(", ");
        sb.append("additionalInfo=").append(additionalInfo);
        return sb.toString();
    }
}
