package us.opencart.abstracta.exceptions;

public class ExceptionProduct extends AssertionError{
    public static final String PRODUCTO_ERROR = "El producto no existe";

    public ExceptionProduct(String message, Throwable cause) {
        super(message, cause);
    }
}
