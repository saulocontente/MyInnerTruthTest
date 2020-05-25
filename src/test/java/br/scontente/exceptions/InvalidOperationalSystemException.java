package br.scontente.exceptions;

public class InvalidOperationalSystemException extends RuntimeException {

    public InvalidOperationalSystemException(String msg, Throwable err){
        super(msg, err);
    }

}