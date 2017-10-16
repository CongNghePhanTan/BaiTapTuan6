import java.rmi.*;
import java.rmi.server.*;

public class MaxMinImplementation extends UnicastRemoteObject implements MaxMin {
    public MaxMinImplementation() throws RemoteException {
        //There is no action need in this moment.
    }  
    @Override
    public String getGreetingMessage(String args[]) throws RemoteException {
       String s="";
       int max=Integer.parseInt(args[0]);
       int min = Integer.parseInt(args[0]);
        for(String arg : args )
        {
        	if(max < (Integer.parseInt(arg))){
                max = Integer.parseInt(arg);
            }
            if(min >Integer.parseInt(arg)){
                min =Integer.parseInt(arg);
            }
        	s = " \n Min = " + min + "\n Max = " + max;
        }
        return s;
    }
}
