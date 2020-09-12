package io.pan.jsonizator.io.writer;

import java.util.function.Supplier;

public class JsonPath implements Supplier<String> {

    private final String sourcePath;

    public JsonPath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    @Override
    public String get() {
        return sourcePath.replace(".txt", ".json");
    }
}
