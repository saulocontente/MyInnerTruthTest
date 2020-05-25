package br.scontente.utils;

import br.scontente.exceptions.InvalidOperationalSystemException;

import java.io.File;

public enum OS {

    WINDOWS("Windows", "chromedriver/windows/chromedriver.exe"),
    MACOSX("Mac", "chromedriver/macos/chromedriver"),
    LINUX("Linux", "chromedriver/linux/chromedriver");

    private String os;
    private String path;

    OS(String os, String path) {
        this.os = os;
        this.path = path;
    }

    public static String getDriverPathByOS() {
        String osName = System.getProperty("os.name");
        
        for (OS operationalSystem : OS.values()) {
            if(osName.contains(operationalSystem.os)) {
                return new File(operationalSystem.path).getAbsolutePath();
            }
        }    
        throw new InvalidOperationalSystemException("Operational System Not Supported",null);
    }

}