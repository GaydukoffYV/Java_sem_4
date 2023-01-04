import java.lang.reflect.Constructor;

// package OOP_Java.Sem_1;

public class People {
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String social_status;
    
    public People(int i, String string, String string2, int j, String string3) {
    }

    public void People(Integer id, String name, String gender, Integer age, String social_status){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.social_status = social_status;
    }

    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public Integer getAge(){
        return age;
    }
    public String getSocial_status(){
        return social_status;
    }

    public void setId(Integer id){
        this.id = id; 
    }
    public void setName(String name){
        this.name = name; 
    }
    public void setGender(String gender){
        this.gender = gender; 
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public void setSocial_status(String social_status){
        this.social_status = social_status; 
    }

    public void Hello(){
        System.out.println("Привет!");
    }
    public void Myperents(){
        System.out.println();
    }




}
