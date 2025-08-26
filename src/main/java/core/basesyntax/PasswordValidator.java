package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String rP) throws PasswordValidationException {
        if (password.equals(rP) && password.length() >= 10) {
            throw new PasswordValidationException("Wrong passowrds");
        }
    }
}
