// Teacher Sınıfı Özellikleri :

//     Nitelikler : name,mpno,branch
//     Metotlar : Teacher(),print
public class Teacher {
   public String name;
   public String mpno;
   public String branch;

    public Teacher(String name,String mpno,String branch)
    {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print(){
        System.out.println("Adı : "+this.name);
        System.out.println("Telefonu : "+this.mpno);
        System.out.println("Bölümü : "+this.branch);
    }

}
