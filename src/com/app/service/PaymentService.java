package com.app.service;
import com.app.models.*;
import java.util.List;
import java.util.ArrayList;



public class PaymentService {

          int paymentId = 0;
          List<Payment> payments = new ArrayList<>();
          public void newPayment(Student student,double paymentAmount){
              paymentId++;

              Payment newPayment = new Payment(paymentId,paymentAmount,student);
              System.out.println(newPayment.getAmountPaid());
              payments.add(newPayment);

          }
          public void updatePayment(int studentId,double amount){

              for(Payment payment:payments){
                  if(payment.getStudent().getPersonID()== studentId){

                      payment.setAmountPaid(amount);
                  }
              }
          }
          public String checkPayment(int studentId) {

              for (Payment payment : payments) {
                  if (payment.getStudent().getPersonID() == studentId) {

                      return payment.toString();

                  }
              }
              return "No Payment for the student "+ studentId;
          }

}
