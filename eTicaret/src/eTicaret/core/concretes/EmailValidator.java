package eTicaret.core.concretes;

import java.util.regex.Pattern;

import eTicaret.core.abstracts.EmailValidatorService;

public class EmailValidator implements EmailValidatorService{
	private static final String emailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";

    public boolean isEmailValid(String emailInput) {
        Pattern pattern = Pattern.compile(emailPattern,
                Pattern.CASE_INSENSITIVE);
        return pattern.matcher(emailInput).find();
    }

}
