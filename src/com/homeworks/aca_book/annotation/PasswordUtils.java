package com.homeworks.aca_book.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/**
 * Created by home on 11/20/2018.
 */
public class PasswordUtils {
    @UseCase(id = 47, description =
            "Passwords must contain at least one numeric")
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }
    @UseCase(id = 48)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }
    @UseCase(id = 49, description =
            "New passwords can’t equal previously used ones")
    public boolean checkForNewPassword(
            List<String> prevPasswords, String password) {
        return !prevPasswords.contains(password);
    }
}
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
 @interface UseCase {
    public int id();
    public String description() default "no description";
}