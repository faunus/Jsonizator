package io.pan.jsonizator.io.reader;

import io.pan.jsonizator.content.Content;
import io.pan.jsonizator.content.MutableContent;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSystemReader implements Reader {

    private final String file;

    public FileSystemReader(String file) {
        this.file = file;
    }

    @Override
    public Content get() {
        try {
            return new MutableContent(
                    Files.readString(Path.of(file))
            );
        } catch (IOException e) {
            throw new FileReadingException(file, e);
        }
    }
}
