import java.lang.reflect.Method;

// Student Sınıfı Özellikleri :

//     Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
//     Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    public Student(String name, String stuNo, String classes,Course c1,Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;

        this.avarage = 0.0;
        this.isPass = false;
    }
    void addBulkExamNote(int c1NoteSinav ,int c1NoteSozlu,int c2NoteSinav,int c2NoteSozlu, int c3NoteSinav,int c3NoteSozlu)
    {
        if(c1NoteSinav>=0 && c1NoteSinav<=100 && c1NoteSozlu>=0 && c1NoteSozlu<=100)
        {
            this.c1.noteSinav = c1NoteSinav;
            this.c1.noteSozlu = c1NoteSozlu;
        }
        if(c2NoteSinav>=0 && c2NoteSinav<=100 && c2NoteSozlu>=0 && c2NoteSozlu<=100)
        {
            this.c2.noteSinav = c2NoteSinav;
            this.c2.noteSozlu = c2NoteSozlu;
        }
        if(c3NoteSinav>=0 && c3NoteSinav<=100 && c3NoteSozlu>=0 && c3NoteSozlu<=100)
        {
            this.c3.noteSinav = c3NoteSinav;
            this.c3.noteSozlu = c3NoteSozlu;
        }
    }

    void printNote()
    {
        System.out.println("Tarih Sınav Notu :"+this.c1.noteSinav);
        System.out.println("Tarih Sözlü Notu :"+this.c1.noteSozlu);

        System.out.println("Matematik Sınav Notu :"+this.c2.noteSinav);
        System.out.println("Matematik Sözlü Notu :"+this.c2.noteSozlu);

        System.out.println("İngilizce Sınav :"+this.c3.noteSinav);
        System.out.println("İngilizce Sözlü :"+this.c3.noteSozlu);

        System.out.println("Ortalama :"+this.avarage);
    }
    void isPass()
    {
        calcAvarage();
        System.out.println("===============");
        if(this.avarage >=50) System.out.println("Geçti.");
        else System.out.println("Kaldı.");
        printNote();
        System.out.println("===============");
        
    }
    void calcAvarage()
    {
        double trhOrt =this.c1.noteSinav*0.8 + this.c1.noteSozlu*0.2; 
        double matOrt =this.c2.noteSinav*0.9 + this.c2.noteSozlu*0.1; 
        double ingOrt =this.c3.noteSinav*0.5 + this.c3.noteSozlu*0.5; 
        this.avarage = (trhOrt + matOrt + ingOrt)/3;
    }


}
