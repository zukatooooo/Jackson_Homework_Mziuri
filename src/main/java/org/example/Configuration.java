package org.example;

public class Configuration {
    private String configVersion;
	private int buildCount;
	private String author;
	private Mode appMode;
	private Encoding encoding;

	public Configuration(String configVersion, int buildCount, String author, Mode appMode, Encoding encoding) {
		this.configVersion = configVersion;
		this.buildCount = buildCount;
		this.author = author;
		this.appMode = appMode;
		this.encoding = encoding;
	}

	public String getConfigVersion() {
		return configVersion;
	}

	public int getBuildCount() {
		return buildCount;
	}

	public String getAuthor() {
		return author;
	}

	public Mode getAppMode() {
		return appMode;
	}

	public Encoding getEncoding() {
		return encoding;
	}
}
