package lec33;

public class Student {
    private String name = "Kaju";
    private int age = 17;
    public Student(String name, int age){
        this.age = age;
        this.name = name;
    }
    public void setAge(int age){
        try{
            if(age<0){
                throw new Exception("bklol age -ve nhi");
            }
            this.age = age;

        }catch(Exception e){
            e.printStackTrace();

        }finally {
            System.out.println("I am in finally blocks");
            
        }
        
    }
    // public void setAge(int age) throws Exception{
    //     if(age<0){
    //         throw new Exception("Age can't be negative"); //hum to dube sanam tumhe bhi le doobe
    //     }
    //     this.age = age;

    // }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }

}
