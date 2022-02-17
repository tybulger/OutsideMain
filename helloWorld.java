//name of the class
public class helloWorld {

    //Outside of main; printing Hello World
    static void newLine(){
        System.out.print("Hello World");
    }
   //The main function that will call from newLine
    public static void main(String[] args){

        //called from outside of main
        newLine();
    }
}
