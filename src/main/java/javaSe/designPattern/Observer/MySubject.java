package javaSe.designPattern.Observer;


public class MySubject extends AbstractSubject{
	@Override  
    public void operation() {  
        System.out.println("go with girls");  
        notifyObservers();  
    }  
}
