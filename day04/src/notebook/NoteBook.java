package notebook;

import java.util.ArrayList;
import java.util.HashSet;

class Value {
    private int i = 0;

    public void set(int i) {
        this.i = i;
    }

    public int get() {
        return i;
    }

}

public class NoteBook {
    private ArrayList<String> notes = new ArrayList<String>();

    public void add(String s) {
        notes.add(s);

    }

    public void add(String s, int location) {

        notes.add(location, s);
    }

    public int getSize() {
        return notes.size();

    }

    public void removeIndex(int index) {
        notes.remove(index);
    }

    public String getString(int index) {
        return notes.get(index);
    }

    public String[] list() {
        String[] a = new String[notes.size()];
        notes.toArray(a);
        return a;
    }

    public static void main(String[] args) {
        ArrayList<String> b = new ArrayList<String>();
        b.add("pang");
        b.add("xiao");
        b.add("pang");
        for (String s : b) {
            System.out.println(s);
        }
        System.out.println("------");
        HashSet<String> s = new HashSet<String>();
        s.add("pang");
        s.add("xiao");
        s.add("pang");
        for (String k : s) {
            System.out.println(k);
        }
//        Value []a=new Value[10];//对象数组
//        for(int i=0;i<a.length;i++)
//        {
//            a[i]=new Value();//每次开辟一片连续的存储空间，每个a[i]是一个引用地址，该句相当于Value a[0]=new Value(),Value a[1]=new Value()依次类推...
//            a[i].set(i);//每次改变Value类的成员变量i值且，房子已经确定
//        }
//        for(Value l:a){
//            System.out.println(l.get());//l与a[i]共同管理那一片区域，每次输出get()返回的对应的房子对应的值，从下标为0的地方开始
//        }
//
//
//        System.out.println();
//        for(Value v:a){//a[i]=v,共同管理那一片存储区域
//            v.set(0);
//
//        }
//        for (Value k:a){
//            System.out.println(k.get());
//        }


//        NoteBook nb = new NoteBook();
//        nb.add("fisrt");
//        nb.add("second");
//        nb.add("third");
//        nb.add("five", 1);
//        nb.removeIndex(2);
//        System.out.println(nb.getSize());
//
//        String[] b = nb.list();
//        for (String s : b) {
//            System.out.println(s);
//        }
//        System.out.println(nb.getString(2));
//        String [] a=new String[10];
//        int [] b=new int[10];
//        for(int i=0;i<a.length;i++){
//            a[i]="tr"+i;
//        }
//        System.out.println(a[0].substring(0,1));
//        System.out.println(a[1]);
//        System.out.println(b[0]);
    }
}
