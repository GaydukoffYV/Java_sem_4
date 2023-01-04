public interface FatherIn extends MatherIn{
    String colorEyes = "Green";
    String colorHayer = "Black";
    
    
    void getForce();
    default String Hello1(){
        return extracted();

    }
    default String extracted() {
        return "Привет, я отец!";
    }

    void main();
}
