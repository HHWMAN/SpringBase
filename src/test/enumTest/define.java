package enumTest;

public enum  define {

    FIRST("test first"), //调用构造方法，所以必须有单字符参数的构造函数
    //TEST(1),
        SECONDARY("test secondary"),
            THIRD("test third"),
    FOUR("test four" , 4);


    private String description;
    private int  intvalue;

    private define(String description){
        this.description = description;
    }

    private define(String description,int a){
        this.intvalue = a;
    }

    public String getString(){
        //name();
        return "getString()";
    }

}
