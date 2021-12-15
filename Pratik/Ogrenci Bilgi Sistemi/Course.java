// Course Sınıfı Özellikleri :

//     Nitelikler : name,code,prefix,note,Teacher
//     Metotlar : Course() , addTeacher() , printTeacher()


public class Course {
    Teacher teacher;
    public String name;
    public String code;
    public String prefix;
    public int noteSinav;
    public int noteSozlu;

    Course(String name,String code,String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        noteSinav = 0;
        noteSozlu = 0;
    }    

    void addTeacher(Teacher teacher)
    {
        if(teacher.branch.equals(this.prefix))
        {
            this.teacher = teacher;
        }
        else
        {
            System.out.println("Ogretmen ve Ders bölümleri uyuşmuyor.");
        }
        
    }

    public void printTeacher()
    {
        this.teacher.print();
    }
}
