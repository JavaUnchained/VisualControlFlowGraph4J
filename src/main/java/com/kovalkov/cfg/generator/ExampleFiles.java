package com.kovalkov.cfg.generator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleFiles {
    public static List<File> getExampl(final String folder) throws IOException {
        return Files.walk(Paths.get(folder)).filter(Files::isRegularFile).map(Path::toFile).collect(Collectors.toList());
    }
}
