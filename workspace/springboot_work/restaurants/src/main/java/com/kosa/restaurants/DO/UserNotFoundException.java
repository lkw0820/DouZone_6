package com.kosa.restaurants.DO;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

    //200-> OK
    //400-> Client
    //500-> Server

    public UserNotFoundException(String m) {
        super(m);
    }
}
