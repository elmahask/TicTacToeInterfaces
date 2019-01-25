package Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface ClientInterface extends Remote {

    // Set client status to 1 (Active)
    void setClientActive(String str) throws RemoteException;

    // Set client status to 0 (Unactive)
    void setClientInactive(String str) throws RemoteException;

    void receiveInvitation(String sender, String receiver) throws RemoteException;

    void acceptInvitation(String sender, String receiver) throws RemoteException;

    void rejectInvitation(String sender, String receiver) throws RemoteException;

    void receiveMove(int rowIndex, int columnIndex, char symbol) throws RemoteException;

    void winMessage() throws RemoteException;

    void loseMessage() throws RemoteException;

    void drawMessage() throws RemoteException;

    void receiveMsg(String sender, String msg, String receiver) throws RemoteException;

    void receiveErrorMesssage(String userName) throws RemoteException;

    void receiveResetMove() throws RemoteException;

    void resetGame() throws RemoteException;

    void updatePlayerScore(int win, int lose, int draw) throws RemoteException;

    void makeRestVisible() throws RemoteException;

    void makeRestInVisible() throws RemoteException;

    void notifyOthers(String userName) throws RemoteException;
    
    void updateScoreDuringInit(int win ,int lose ,int draw)throws RemoteException;
    
  //  public void getScoreDuringInit()  

}
