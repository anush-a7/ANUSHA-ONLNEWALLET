package com.capg.onlinewallet.dao;

public class OnlineWalletNotFoundException extends RuntimeException{
    public OnlineWalletNotFoundException(String message){
        super(message);
    }

    public OnlineWalletNotFoundException(String message,Throwable exception){
        super(message,exception);
    }
}
