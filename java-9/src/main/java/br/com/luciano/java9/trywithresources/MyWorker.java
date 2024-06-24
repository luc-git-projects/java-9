package br.com.luciano.java9.trywithresources;

public class MyWorker implements AutoCloseable{

    public MyWorker() {
        System.out.println("Creating the resource");
    }

    public void  doSomething(){
        System.out.println("Doing Something");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing the resource");
    }
}
