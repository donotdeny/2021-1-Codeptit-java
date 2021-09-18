import java.util.Scanner;

class J04005{
    private String name;
    private String date;
    private float first;
    private float second;
    private float third;
    SV(String name, String date, float first, float second, float third){
        this.name = name;
        this.date = date;
        this.first = first;
        this.second = second;
        this.third = third;
    }
    void getInfor(){
        System.out.println(this.name + " " + this.date + " " + String.format("%.01f", this.first + this.second + this.third));
    }
}

public class test{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        String name = ip.nextLine();
        String date = ip.nextLine();
        float first = ip.nextFloat();
        float second = ip.nextFloat();
        float third = ip.nextFloat();
        SV obj = new SV(name, date, first, second, third);
        obj.getInfor();
        ip.close();
    }
}
