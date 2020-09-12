package io.pan.jsonizator.io.reader;

public class FileReadingException extends RuntimeException {

    public FileReadingException(String file, Throwable cause) {
        super("Error during reading " + file, cause);
    }
}
