package com;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public abstract class AbstractValidator implements ConstraintValidator<FooValidation, Foo> {

	@Override
	public final boolean isValid(Foo value, ConstraintValidatorContext context) {
    return true;
	}

}
