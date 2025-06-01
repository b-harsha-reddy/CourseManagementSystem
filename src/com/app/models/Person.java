package com.app.models;

abstract class Person {

   private int personID;
   private String personFullName;
   private  String personEmailId;
   private int phoneNumber;
   private String personRole;

    public Person(int personID,String personFullName,String personEmailId,int phoneNumber,String personRole){
        this.personID = personID;
        this.personFullName = personFullName;
        this.personEmailId = personEmailId;
        this.phoneNumber = phoneNumber;
        this.personRole = personRole;
    }

    public int getPersonID() {
        return personID;
    }
    public String getPersonFullName(){
        return personFullName;
    }
    public String getPersonEmailId(){
        return  personEmailId;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPersonEmailId(String personEmailId) {
        this.personEmailId = personEmailId;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPersonRole() {
        return personRole;
    }

    public void setPersonRole(String personRole) {

        this.personRole = personRole;
    }

    @Override
    public String toString(){

        return "\n Person Details:" +
                "\n ID           : " + personID +
                "\n Name         : " + personFullName +
                "\n Email ID     : " + personFullName +
                "\n Phone Number  : " + phoneNumber ;
    }

}


