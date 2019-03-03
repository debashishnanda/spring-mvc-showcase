package org.springframework.samples.mvc.convert;

import java.util.List;
import java.util.Map;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.framework.qual.DefaultQualifier;

/*
 * Error: NestedBean.java:[6,8] [initialization.fields.uninitialized] the constructor does not initialize fields:
 * foo, list, map
 *
 * Once a new NestedBean() has been initialized, it would always have its fields set to be null and these fields are
 * not initialised in this class
 */
@DefaultQualifier(Nullable.class)
public class NestedBean {

	private String foo;

	private List<NestedBean> list;

	private Map<String, NestedBean> map;

	public String getFoo() {
		return foo;
	}

	public void setFoo(String foo) {
		this.foo = foo;
	}

	public List<NestedBean> getList() {
		return list;
	}

	public void setList(List<NestedBean> list) {
		this.list = list;
	}

	public Map<String, NestedBean> getMap() {
		return map;
	}

	public void setMap(Map<String, NestedBean> map) {
		this.map = map;
	}

	/*
	 * Error: NestedBean.java:[48,16] [override.return.invalid] Incompatible return type.
	 * Method
	 * @Initialized @Nullable String toString(@Initialized @Nullable NestedBean this) in
	 * org.springframework.samples.mvc.convert.NestedBean cannot override
	 *
	 * @Initialized @NonNull String toString(@Initialized @NonNull Object this) in java.lang.Object
	 * found   : @Initialized @Nullable String
	 * required: @Initialized @NonNull String
	 *
	 * Warnings for possible nullness of variables in toString() have been suppressed, because they are already
	 * ensured to be non-null by if statement
	 */
	@SuppressWarnings("nullness")
	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NestedBean");
        if (foo != null) {
        	sb.append(" foo=").append(foo);
        }
        if (list != null) {
        	sb.append(" list=").append(list);
        }
        if (map != null) {
        	sb.append(" map=").append(map);
        }
        return sb.toString();
    }
}