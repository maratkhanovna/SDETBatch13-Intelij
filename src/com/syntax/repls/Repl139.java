package com.syntax.repls;
class SyntaxTechnologies {
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;
    SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;
    }
    SyntaxTechnologies(){
    }
    void displayInfo(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
    }
}
class Main {
    public static void main(String[] args) {
        SyntaxTechnologies obj1 = new SyntaxTechnologies();
        SyntaxTechnologies obj2 = new SyntaxTechnologies("Syntax", 6, 2020, "07/30/2020");
        obj1.displayInfo();
        obj2.displayInfo();
    }
}

