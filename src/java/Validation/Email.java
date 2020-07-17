
package Validation;

import java.lang.annotation.Documented;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import org.primefaces.validate.bean.ClientConstraint;
import org.primefaces.validate.bean.EmailClientValidationConstraint;

@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = EmailConstrainValidator.class)
@ClientConstraint(resolvedBy = EmailClientValidationConstraint.class)
@Documented
public @interface Email {

    String message() default "{org.primefaces.examples.primefaces}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
