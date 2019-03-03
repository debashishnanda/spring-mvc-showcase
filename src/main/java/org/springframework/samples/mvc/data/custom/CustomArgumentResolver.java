package org.springframework.samples.mvc.data.custom;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

public class CustomArgumentResolver implements HandlerMethodArgumentResolver {

	public boolean supportsParameter(MethodParameter parameter) {
		return parameter.getParameterAnnotation(RequestAttribute.class) != null;
	}

	/*
	 * Error: CustomArgumentResolver.java:[23,47] [return.type.incompatible] incompatible types in return.
     * type of expression: @Initialized @Nullable Object
     * method return type: @Initialized @NonNull Object
     *
     * The return object might be null because object getAttribute(String var1, int var2) is nullable
	 */
	@SuppressWarnings("nullness")
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, WebDataBinderFactory binderFactory)
			throws Exception {

		RequestAttribute attr = parameter.getParameterAnnotation(RequestAttribute.class);
		return webRequest.getAttribute(attr.value(), WebRequest.SCOPE_REQUEST);
	}
	
}
