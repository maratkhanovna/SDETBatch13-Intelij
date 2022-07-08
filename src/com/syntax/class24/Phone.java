package com.syntax.class24;

public abstract class Phone {
    abstract void unlock();
    abstract void displayPicture();
    void sendText(){
        System.out.println("Use the messaging app tp send mesg");
    }
}
class Iphone extends Phone{
    void displayPicture(){
        System.out.println("Use photos app to display the picture");
    }
    void unlock(){
        System.out.println("use FaceId to unlock the phone");
    }
}
class Samsung extends Phone{
    @Override
    void unlock() {
        System.out.println("use Gallery to display the picture");
    }

    @Override
    void displayPicture() {
        System.out.println("Use Finger print or face to unlock your phone");
    }
}
class TesterPhones {
    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        samsung.displayPicture();
    }
}
