interface camera{

    void click();
}

interface microphone{

    void speak();
}

class phone{

    void type(){

        System.out.println("type the number");
    }

    void call(){

        System.out.println("call the customer");
    }
}

class iphone extends phone implements camera,microphone{

    public void click(){

        System.out.println("clcik the photo");
    }

    public void speak(){

        System.out.println("Speak to record");
    }
}


public class interfa2 {

    public static void main(String[] args){

        iphone ip = new iphone();

        ip.click();
        ip.speak();
        ip.type();
        ip.call();
        ip.click();
        ip.speak();
    }
    
}
