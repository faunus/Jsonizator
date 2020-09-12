package io.pan.jsonizator.content;

import io.pan.jsonizator.rule.Rule;

public class MutableContent implements Content {

    private String content;

    public MutableContent(String content) {
        this.content = content;
    }

    @Override
    public Content modifyBy(Rule rule) {
        content = content.replaceAll(
                rule.condition().get(),
                rule.action().get()
        );
        return this;
    }
}
