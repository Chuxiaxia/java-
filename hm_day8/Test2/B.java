package hm_day8.Test2;

abstract class B extends A{
    int numb = 20;

    public B() {

    }

    public B(int numa, int numb) {
        super(numa);
        this.numb = numb;
    }

    abstract public void showB();
}
