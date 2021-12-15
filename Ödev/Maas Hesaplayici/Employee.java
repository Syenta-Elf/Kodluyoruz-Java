/**
 * Employee
 */

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax()
    {
        if(this.salary<1000)
        {
            return 0;
        }
        else
        {
            return this.salary*0.03;
        }
    }
    double bonus()
    {
        if(this.workHours>40)
        {
            return (workHours-40)*30.0;
        }
        else
        {
            return 0.0;
        }
    }

    double raiseSalary()
    {
        if(2021-hireYear<10)
        {
            return this.salary*0.05;
        }
        else if(2021-hireYear>10 && 2021-hireYear<20)
        {
            return this.salary*0.1;
        }
        else
        {
            return this.salary*0.15;
        }
    }
    void printInfo()
    {
        System.out.println("====================================================");
        System.out.println("Adı:"+this.name);
        System.out.println("Maaşı:"+this.salary);
        System.out.println("Çalışma Saati:"+workHours);
        System.out.println("Başlangıç yılı:"+hireYear);

        System.out.println("Vergi:"+tax());
        System.out.println("Bonus:"+bonus());
        System.out.println("Maaş Artışı:"+raiseSalary());
        System.out.println("Vergi ve bonuslarla birlikte maaş:"+(this.salary+bonus()-tax()));
        System.out.println("Toplam maaş:"+(this.salary+raiseSalary()+bonus()-tax()));
        System.out.println("====================================================");
    }


}