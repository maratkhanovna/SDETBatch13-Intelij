package com.syntax.reviewclass10;

public final class FinalDemo {
    final String company;
    FinalDemo(String company){
        this.company = company;
    }
    void changeCompany(){
        //company="Facebook"; --> we can not reassign it because it is final
    }
}
/*class Child extends FinalDemo{}
When used with class names no other class can inherit from that class.
 */
//we can not inherit from final class


