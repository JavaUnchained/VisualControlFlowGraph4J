package com.kovalkov.cfg.generator;

import java.util.regex.Pattern;

public final class Const {
    public static final String PATH_TO_GRAPH = "resources/generated/";
    public static final String PATH_TO_EXAMPLES = "src/main/java/com/kovalkov/cfg/examples";
    public static final String EXAMPLE_TYPE = ".java";
    public static final String METHOD_HEADER = "Method: ";
    public static final String CONTINUE = "continue";
    public static final String BREAK = "break";
    public static final String END_OF_PROGRAM = "end of program";
    public static final Pattern COMPILE = Pattern.compile(";");
    public static final Pattern PATTERN = Pattern.compile("/*\\*.*\\*/[\n]?");
    public static final Pattern COMPILE1 = Pattern.compile("//.*\n");
}
