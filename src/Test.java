import static org.junit.jupiter.api.Assertions.*;

class Test {
    @org.junit.jupiter.api.Test
    public void test1(){
        Network network = new VKontakte("Steve", "Jobs");
        boolean  bool = network.logIn("Steve","Jobs");
        assertEquals(true,bool);
    }
    @org.junit.jupiter.api.Test
    public void test2(){
        Network network = new Telegram("Steve", "Jobs");
        boolean  bool = network.logIn("Steve","Jobs");
        assertEquals(true,bool);
    }
    @org.junit.jupiter.api.Test
    public void test3(){
        Network network = new Odnoklassniki("Jeka", "Jobs");
        boolean  bool = network.logIn("Jeka","Jobs");
        assertEquals(true,bool);
    }
    @org.junit.jupiter.api.Test
    public void test4(){
        Network network = new VKontakte("Bill","Gates");
        boolean bool  = network.post("Hello");
        assertEquals(true,bool);
    }
}