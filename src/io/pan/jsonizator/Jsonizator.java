package io.pan.jsonizator;

import io.pan.jsonizator.content.Source;
import io.pan.jsonizator.io.writer.Writer;
import io.pan.jsonizator.rule.Rule;

import java.util.Arrays;
import java.util.List;

public class Jsonizator implements Application {

    private final Source source;
    private final Writer writer;
    private final List<Rule> rules;

    public Jsonizator(Source source, Writer writer, List<Rule> rules) {
        this.source = source;
        this.writer = writer;
        this.rules = rules;
    }

    public Jsonizator(Source source, Writer writer, Rule... rules) {
        this(source, writer, Arrays.asList(rules));
    }

    public void run() {
        writer.save(source.apply(rules).toString());
    }
}
