package itshala.throw_keyword;
// Custom Exceptions
public class InvalidAgeException extends Exception{

    public InvalidAgeException(){}

    public InvalidAgeException(String message){
        super(message);
    }
}
