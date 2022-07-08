package com.syntax.class24;

public class Homework {
    public static void main(String[] args) {
        File[] files = {new JavaFile(), new PdfFile(), new WordFile()};
        // Scanner [] scanner ={new Scanner(System.in), new String()}; not possible to store the objects that don't have parent child relationship
        for (File file:files){
            file.open();
            file.close();
        }

        new JavaFile().open();
        //the same as:
        //JavaFile javaFile = new JavaFile();
        //javaFile.open();
    }
    /*
    Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
     */
}
abstract class File{
    abstract void open();

    void edit() {
        System.out.println("to edit file please follow instructions");
    }

    void close() {
        System.out.println("to close file click ESC button on keyboard");
    }
}
class JavaFile extends File{

    @Override
    void open() {
        System.out.println("to open .java file we need notepad++ or sublime text");
    }
}
class WordFile extends File{

    @Override
    void open() {
        System.out.println("to open .doc file we need Microsoft word to be installed");
    }
}
class PdfFile extends File{

    @Override
    void open() {
        System.out.println("to open .pdf file we need Adobe Acrobat Reader or Foxit reader application to be installed");
    }
}