
package Validation;

import org.primefaces.validate.bean.AbstractClientValidationConstraint;

public class EmailClienteValidationConstraint extends AbstractClientValidationConstraint {

    public static final String MESSAGE_METADATA = "data-p-email-msg";

    public EmailClienteValidationConstraint(String messageId, String messageMetadata) {
        super(messageId, messageMetadata);
    }

    public EmailClienteValidationConstraint() {
        super(null, MESSAGE_METADATA);
    }

    public String getValidatorId() {
        return Email.class.getSimpleName();
    }

}
