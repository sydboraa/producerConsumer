package utils;

import java.util.Stack;

/**
 * Created by sb on 06.01.2016.
 * Source: http://stackoverflow.com/questions/7727919/creating-a-fixed-size-stack
 */
public class SizedStack<T> extends Stack<T> {
    private int maxSize;

    public SizedStack(int size) {
        super();
        this.maxSize = size;
    }

    @Override
    public Object push(Object object) {
        //If the stack is too big, remove elements until it's the right size.
        while (this.size() >= maxSize) {
            this.remove(0);
        }
        return super.push((T) object);
    }
}
