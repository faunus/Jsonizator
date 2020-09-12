package io.pan.jsonizator.io.writer;

public class FileWritingException extends RuntimeException {

    public FileWritingException(String file, Throwable cause) {
        super("Error during writing " + file, cause);
    }
}
