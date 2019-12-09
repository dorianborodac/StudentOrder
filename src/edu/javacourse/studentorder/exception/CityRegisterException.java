package edu.javacourse.studentorder.exception;
//grupa de obiecte care pot fi exceptii
public class CityRegisterException extends Exception {
    private String code;


    public CityRegisterException() {
    }

    public CityRegisterException(String code,String message) {
        super(message);
        this.code = code;
    }

    public CityRegisterException(String code,String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
