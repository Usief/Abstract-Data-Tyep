package comp1110.homework.A01;

public class ArrayList<T> implements List<T>{
    static final int INITIAL_SIZE = 2;
    static final double GROWTH_FACTOR = 1.5;

    T[] values = (T[]) new Object[INITIAL_SIZE];
    int elements = 0;

    @Override
    public void add(T e){
        if(elements == values.length){
            T[] tmp = (T[]) new Object[(int)(values.length*GROWTH_FACTOR)];
            for (int i=0; i<values.length;i++){
                tmp[i] = values[i];
            }
            values = tmp;
        }
        values[elements++] = e;
    }

    @Override
    public void remove(int index){
        elements--;
        for(int i=index;i<elements;i++){
            values[i] = values[i+1];
        }
    }

    @Override
    public void reverse(){
        for (int i=0;i<elements/2;i++){
            T tmp = values[i];
            values[i] = values[(elements-1)-i];
            values[(elements-1)-i] = tmp;
        }
    }

    @Override
    public T get(int index){
        if (index < elements){
            return values[index];
        }else{
            return null;
        }
    }

    @Override
    public int size(){
        return elements;
    }

    @Override
    public String toString(){
        String rtn = "";
        for(int i=0;i<elements;i++){
            rtn += ((i!=0) ? " ": "") + values[i];
        }
        return rtn;
    }
}
