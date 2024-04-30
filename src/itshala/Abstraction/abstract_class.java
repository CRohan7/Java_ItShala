package itshala.Abstraction;
abstract class ab{

    int a = 110;

    void m1(){};


};
public class abstract_class extends  ab{
    public void cc(){
        System.out.println("From bb");
    }



    public static  void main(String[] args) {
        abstract_class obj = new abstract_class();
        System.out.println(obj.a);

    }
}
