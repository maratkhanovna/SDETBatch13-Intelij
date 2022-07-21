package com.syntax.repls;

public class Repl181 {
    public static void main(String[] args){
        Account acc = new Account();
        acc.setAccNo(7560504000l);
        acc.setName("Sumair");
        acc.setEmail("sumair@syntax.com");
        acc.setAmount(50000.0);
        System.out.println(acc.getAccNo()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
    }
}
class Account{
    private long acc_no;
    private String name;
    private String email;
    private double amount;

    public void setAccNo(long acc_no){
        this.acc_no = acc_no;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }
    public long getAccNo() {
        return acc_no;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public double getAmount() {
        return amount;
    }
}
