import java.rmi.*;

public interface MaxMin extends Remote
{
    public String getGreetingMessage(String args []) throws RemoteException;
}