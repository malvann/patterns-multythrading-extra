package patterns.creating.builder.impl;

import patterns.creating.builder.Builder;
import patterns.creating.builder.entity.Docs;

public class DocsBuilder implements Builder<Docs> {
    private Docs docs;

    @Override
    public void reset() {
        docs = new Docs();
    }

    @Override
    public void setFoundation() {
        docs.setFoundation("Foundation");
    }

    @Override
    public void setWalls() {
        docs.setWalls("Walls");
    }

    @Override
    public void setRoof() {
        docs.setRoof("Roof");
    }

    @Override
    public Docs getResult() {
        return docs;
    }
}
