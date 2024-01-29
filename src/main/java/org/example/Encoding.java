package org.example;

public class Encoding {
    private int utf;
    private char unixVersion;

    public Encoding(int utf, char unixVersion) {
        this.utf = utf;
        this.unixVersion = unixVersion;
    }

    public int getUtf() {
        return utf;
    }

    public char getUnixVersion() {
        return unixVersion;
    }
}
