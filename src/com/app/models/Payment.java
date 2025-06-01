package com.app.models;
import com.app.models.Student;


public class Payment{

    private int paymentID;
    private double amountPaid;
    private Student student;
    public Payment(int paymentID,double amountPaid,Student student){
        this.paymentID =paymentID;
        this.amountPaid = amountPaid;
        this.student = student;
    }

    public void setAmountPaid(double amountPaid) {

        if(amountPaid<=0){
            throw new RuntimeException("Amount cannot be zero or negative");
        }
        this.amountPaid = amountPaid;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public String toString(){
        return "\n Student Id :"+ student.getPersonID() +
               "\n Amount Paid :"+ amountPaid;
    }

}