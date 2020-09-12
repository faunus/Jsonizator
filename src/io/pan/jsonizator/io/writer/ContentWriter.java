package io.pan.jsonizator.io.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Supplier;

public class ContentWriter implements Writer {

    private final Supplier<String> path;

    public ContentWriter(Supplier<String> path) {
        this.path = path;
    }

    @Override
    public void save(String content) {
        String jsonPath = path.get();
        try (FileWriter writer = new FileWriter(jsonPath)){
            writer.write(content);
        } catch (IOException e) {
            throw new FileWritingException(jsonPath, e);
        }
    }
}
