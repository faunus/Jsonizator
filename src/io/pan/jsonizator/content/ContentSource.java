package io.pan.jsonizator.content;

import io.pan.jsonizator.io.reader.Reader;
import io.pan.jsonizator.rule.Rule;

import java.util.List;

public class ContentSource implements Source {

    private final Reader source;

    public ContentSource(Reader source) {
        this.source = source;
    }

    @Override
    public Content apply(List<Rule> rules) {
        Content content = source.get();
        rules.forEach(content::modifyBy);
        return content;
    }
}
