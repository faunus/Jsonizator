package io.pan.jsonizator;

import io.pan.jsonizator.content.ContentSource;
import io.pan.jsonizator.io.writer.ContentWriter;
import io.pan.jsonizator.io.reader.FileSystemReader;
import io.pan.jsonizator.io.writer.JsonPath;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
    new Jsonizator(
           new ContentSource(
                    new FileSystemReader(args[0])
            ),
            new ContentWriter(
                    new JsonPath(args[0])
            ),
            Collections.EMPTY_LIST
    ).run();
    }
}
