package com.matiaskupfer.securityaccess.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class EmailValidator implements Predicate<String> {

    @Override
    public boolean test(String s) {
        // ideally todo regex to validate email
        return true;
    }

}
