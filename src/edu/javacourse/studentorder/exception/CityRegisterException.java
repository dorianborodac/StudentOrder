package edu.javacourse.studentorder.exception;
//grupa de obiecte care pot fi exceptii
public class CityRegisterException extends Exception {

    public CityRegisterException() {
    }

    public CityRegisterException(String message) {
        super(message);
    }

    public CityRegisterException(String message, Throwable cause) {
        super(message, cause);
    }
}
