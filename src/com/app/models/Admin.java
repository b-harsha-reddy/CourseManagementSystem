package com.app.models;

import com.app.models.Person;

public class Admin extends Person {
    public Admin(int personID, String personFullName, String personEmailID, int phoneNumber, String personRole) {
        super(personID, personFullName, personEmailID, phoneNumber, personRole);
    }
}
