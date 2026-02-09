package model;

public class ExpressionException extends Exception{
    private String messageDetails;

    public ExpressionException(String message, String messageDetails) {
        super(message);
        this.messageDetails = messageDetails;
    }

    public String getMessageDetails() {
        return messageDetails;
    }
}

