package fabi.ulbricht.gradle;

import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;
import org.gradle.jvm.tasks.Jar;

public abstract class UlbrichtTask extends Jar {
    @InputFile
    RegularFileProperty input;

    @OutputFile
    RegularFileProperty output;

    @TaskAction
    void obfuscate() {
        System.out.printf("Obfuscating %s\n", input.get().getAsFile().getPath());
    }
}