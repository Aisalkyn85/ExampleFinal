public class GetterSetter1 {
    String name;
    String major;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    String hobby;
    public static void main(String[] args) {
        GetterSetter1 getSetter = new GetterSetter1();
        getSetter.setName("Sam");
        getSetter.setMajor("Doctor");
        getSetter.setHobby("Drive");
        
        System.out.println(getSetter.getHobby()+" "+getSetter.getMajor()+" "+getSetter.getName());
        
    }
    
}
