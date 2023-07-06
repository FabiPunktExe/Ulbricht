package fabi.ulbricht;

import fabi.ulbricht.obfuscator.Obfuscator;

import java.io.File;

public class Ulbricht {
    public static void obfuscate(File input, File output) {
        Obfuscator obfuscator = new Obfuscator();
        obfuscator.load(input);
        obfuscator.obfuscate();
        obfuscator.export(output);
    }
}