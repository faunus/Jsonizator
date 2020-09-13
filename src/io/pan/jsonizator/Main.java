package io.pan.jsonizator;

import io.pan.jsonizator.content.ContentSource;
import io.pan.jsonizator.io.reader.FileSystemReader;
import io.pan.jsonizator.io.writer.ContentWriter;
import io.pan.jsonizator.io.writer.JsonPath;
import io.pan.jsonizator.rule.DefaultRule;
import io.pan.jsonizator.rule.action.AddEndLineQuotes;
import io.pan.jsonizator.rule.action.AddQuotes;
import io.pan.jsonizator.rule.action.Delete;
import io.pan.jsonizator.rule.condition.ClassName;
import io.pan.jsonizator.rule.condition.EndOfLineAfterStringValue;
import io.pan.jsonizator.rule.condition.SpaceBeforeStringValue;

public class Main {

    public static void main(String[] args) {
    new Jsonizator(
           new ContentSource(
                    new FileSystemReader(args[0])
            ),
            new ContentWriter(
                    new JsonPath(args[0])
            ),
            new DefaultRule(
                    new ClassName(), new Delete()
            ),
            new DefaultRule(
                    new SpaceBeforeStringValue(), new AddQuotes()
            ),
            new DefaultRule(
                    new EndOfLineAfterStringValue(), new AddEndLineQuotes()
            )
    ).run();
    }
}
