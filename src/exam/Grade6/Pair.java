package exam.Grade6;

public class Pair<K, T> {
    private K first;
    private T last;

    public Pair() {
    }

    public Pair(K first, T last) {
        this.first = first;
        this.last = last;
    }

    public K first(){
        return first;
    }
    public T last(){
        return last;
    }

    public <M> Pair<M, T> replaceFirst(M o){
        return new Pair<M, T>(o, last);
    }
    public <M> Pair<K, M> replaceLast(M o){
        return new Pair<K, M>(first, o);
    }
    public Pair<T, K> swap(){
        return new Pair<T, K>(last, first);
    }
}
