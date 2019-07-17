package tree;

import java.util.ArrayList;

public class StackDemo<E> {
	private ArrayList<E> array=new ArrayList<>();
	
	public int getsize() {
		return array.size();
	}
	//获取栈顶元素
	public E peek() {
		return array.get(getsize()-1);
	}
	//入栈
	public void push(E o) {
		array.add(o);
	}
	//出栈
	public E pop() {
		E o=array.get(getsize()-1);
		array.remove(getsize()-1);
		return o;
	}
	//判读栈是否为空
	public boolean isEmpty() {
		return array.isEmpty();
	}
	//重写tostring方法
	public String toString() {
		return "stack:"+array.toString();
	}
}
