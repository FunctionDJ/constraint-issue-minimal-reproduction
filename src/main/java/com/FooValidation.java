package com;

import javax.validation.Constraint;

@Constraint(validatedBy = { FooValidator.class })
public @interface FooValidation {}
