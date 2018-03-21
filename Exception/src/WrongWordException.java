//สร้างคลาส Exception
public class WrongWordException extends Exception{
    public WrongWordException(){
        super("Invalid words!!");
    }
    public WrongWordException(String msg){
        super(msg);
    }
}
