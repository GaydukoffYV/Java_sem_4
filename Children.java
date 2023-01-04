import java.util.function.Function;

class Children extends People implements FatherIn {
    private Integer motherId;
    private Integer fatherId;
    private Integer grandmotherId;
    private Integer grandfatherId;

    public Integer getMotherId(){
        return motherId;
    }
    public Integer getFatherId(){
        return fatherId;
    }
    public Integer getGrandmotherId(){
        return grandmotherId;
    }
    public Integer getGrandfatherId(){
        return grandfatherId;
    }
    public void setMotherId(){
        this.motherId = motherId;
    }
    public void setFatherId(){
        this.fatherId = fatherId;
    }
    public void setGrandmotherId(){
        this.grandmotherId = grandmotherId;
    }
    public void setGrandfatherId(){
        this.grandfatherId = grandfatherId;
    }

    public Children(int i, String string, String string2, int j, String string3) {
        super(i, string, string2, j, string3);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void Hello(){
        System.out.println("Пока!");
    }
    @Override
    public void getFlexibility() {
      System.out.println("Гибкий");
        
    }
    @Override
    public void getForce() {
        System.out.println("Сильный");
        
    }
    @Override
    public void main() {
        Function <Integer, String> function = (x) -> String.valueOf(x) + "Мой возраст";
        System.out.println(function.apply(15));        
    }

    public void setMotherId(Integer motherId) {
        this.motherId = motherId;
    }
    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }
    public void setGrandmotherId(Integer grandmotherId) {
        this.grandmotherId = grandmotherId;
    }
    public void setGrandfatherId(Integer grandfatherId) {
        this.grandfatherId = grandfatherId;
    }
//     @Override
//     Public void getHello();
// }
}