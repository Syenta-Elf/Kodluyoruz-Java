import java.util.Scanner;

/**
 Course Sınıfı Özellikleri :

    Nitelikler : name,code,prefix,note,Teacher
    Metotlar : Course() , addTeacher() , printTeacher()

Teacher Sınıfı Özellikleri :

    Nitelikler : name,mpno,branch
    Metotlar : Teacher()

Student Sınıfı Özellikleri :

    Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
    Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
 */
public class OgrenciBilgiSistemi {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut", "555 555 55 55", "TRH");
        Teacher t2 = new Teacher("Aslı", "555 555 55 44", "MAT");
        Teacher t3 = new Teacher("Kamil", "555 555 44 44", "ING");
        Course matematik = new Course("Matematik", "101", "MAT");
        Course tarih = new Course("Tarih", "101","TRH" );
        Course ingilizce = new Course("İngilizce", "101", "ING");
        tarih.addTeacher(t1);
        matematik.addTeacher(t2);
        ingilizce.addTeacher(t3);

        Student s1 = new Student("Berk", "3421", "3", tarih,matematik,ingilizce);
        s1.addBulkExamNote(80, 90, 50, 50, 90, 90);
        s1.isPass();

        Student s2 = new Student("Ebru", "3516" , "1", tarih,matematik,ingilizce);
        s2.addBulkExamNote(70, 85, 65, 76, 69, 64);
        s2.isPass();
        
    }
}
