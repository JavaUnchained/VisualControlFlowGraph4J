package com.kovalkov.cfg.generator.CFG;

import guru.nidi.graphviz.engine.Format;

public enum Formats {
    SVG(Format.SVG, ".svg"),
    PNG(Format.PNG, ".png"),
    JSON(Format.JSON, ".json");

    private final Format format;
    private final String extend;

    Formats(final Format format,final String extend) {
        this.format = format;
        this.extend = extend;

    }

    public Format getFormat() {return format; }

    public String getExtend() {return extend; }
}
