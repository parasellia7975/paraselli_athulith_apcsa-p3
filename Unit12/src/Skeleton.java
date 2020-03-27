//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
    //add instance variables
    private String name;
    private int size;


    //add a constructor
    public Skeleton(String name, int sz) {
        setName(name);
        setSize(sz);
    }
    public Skeleton() {
        setName("");
        setSize(0);
    }
    public void setName(String nm) {
        name = nm;
    }
    public void setSize(int sz) {
        size = sz;
    }
    @Override
    public int getHowBig() {
        return size;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean isBigger(Monster Other) {
        if(this.getHowBig()>Other.getHowBig()) {
            return true;
        }
        return false;
    }
    @Override
    public boolean isSmaller(Monster Other) {
        if(this.getHowBig()<Other.getHowBig()) {
            return true;
        }
        return false;
    }
    @Override
    public boolean namesTheSame(Monster Other) {
        if(this.getName().equals(Other.getName())) {
            return true;
        }

        return false;
    }

    //add a toString
    public String toString() {
        return "" + name + " - " + size;
    }
}