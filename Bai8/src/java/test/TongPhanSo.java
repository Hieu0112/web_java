import java.util.Scanner;
class PhanSo{
    private long tu;
    private long mau;
    private String dau;
    public PhanSo(long tu,long mau){
        this.tu=tu;
        this.mau=mau;
        this.dau="";
        int dem=0;
        if(tu<0){
            dem+=1;
            this.tu*=-1;
        }
        if(mau<0){
            dem+=1;
            this.mau*=-1;
        }
        if(dem==1){
            dau="-";
        }
    }
    public long getTu(){
        return tu;
    }
    public long getMau(){
        return mau;
    }
    public long Gcd(){
        while(tu*mau!=0){
            if(tu>mau) tu%=mau;
            else mau%=tu;
        }
        return tu+mau;
    }

    @Override
    public String toString() {
        long a=tu,b=mau;
        if(a==0){
            return "0";
        }
        return this.dau+(a/Gcd())+"/"+(b/Gcd());
    }
}
class Tong{
    private PhanSo p1;
    public Tong(PhanSo p1){
        this.p1=p1;
    }
    public PhanSo TongSo(PhanSo p){
        long x=p1.getTu()*p.getMau()-p1.getMau()*p.getTu();
        long y=p1.getMau()*p.getMau();
        PhanSo p2=new PhanSo(x,y);
        return p2;
    }
}
public class TongPhanSo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long tu1=sc.nextLong();
        long mau1=sc.nextLong();
        long tu2=sc.nextLong();
        long mau2=sc.nextLong();
        PhanSo p1=new PhanSo(tu1,mau1);
        PhanSo p2=new PhanSo(tu2,mau2);
        Tong s=new Tong(p1);
        PhanSo ps=s.TongSo(p2);
        System.out.println(ps.toString());
    }
}