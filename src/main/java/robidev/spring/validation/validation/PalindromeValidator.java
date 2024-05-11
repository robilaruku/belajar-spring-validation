package robidev.spring.validation.validation;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import robidev.spring.validation.helper.StringHelper;

public class PalindromeValidator implements ConstraintValidator<Palindrome, String> {

    @Autowired
    private StringHelper stringHelper;

    @Override
    public boolean isValid(String vlaue, ConstraintValidatorContext context) {
        return stringHelper.isPalindrome(vlaue);
    }

}
