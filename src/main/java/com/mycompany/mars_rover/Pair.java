package com.mycompany.mars_rover;

class Pair<T, L> {

    public T Frist;
    public L Second;

    public Pair(T Frist, L Second) {
        this.Frist = Frist;
        this.Second = Second;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }
        if (!(o instanceof Pair)) {
            return false;
        }
        Pair<?, ?> c = (Pair<?, ?>) o;
        return Frist.equals(c.Frist) && Second.equals(c.Second);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 96767248 * hash + (this.Frist != null ? this.Frist.hashCode() : 0);
        hash = 54527423 * hash + (this.Second != null ? this.Second.hashCode() : 0);
        return hash;
    }

    public void print() {
        System.out.println("Frist" + this.Frist + "Second" + this.Second);
    }
}