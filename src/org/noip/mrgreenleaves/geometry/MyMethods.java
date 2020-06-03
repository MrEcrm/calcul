package org.noip.mrgreenleaves.geometry;

public class MyMethods {

    private int data = 0;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    protected Object clone()
    {
        MyMethods oneMethod = new MyMethods();
        oneMethod.setData(data);
        return oneMethod;
    }

    public boolean equals(Object obj)
    {
        if(this==obj)
            return true;

        if(obj == null || this.getClass() != obj.getClass())
            return false;

        return (data == ((MyMethods)obj).getData());
    }
}
