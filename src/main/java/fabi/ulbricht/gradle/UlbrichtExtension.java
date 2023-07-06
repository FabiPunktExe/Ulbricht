package fabi.ulbricht.gradle;

import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.OutputFile;

public class UlbrichtExtension {
    @InputFile
    RegularFileProperty input;

    @OutputFile
    RegularFileProperty output;
}
