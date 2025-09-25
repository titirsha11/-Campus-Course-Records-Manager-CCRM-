package edu.ccrm.config;
public class AppConfig {
    private static AppConfig instance;
    private String dataFolderPath;
    // Private constructor prevents instantiation from other classes
    private AppConfig() {
        // In a real scenario you might read from a config file or system args
        this.dataFolderPath = "./data";
    }
    
    // Singleton accessor
    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }
    public String getDataFolderPath() {
        return dataFolderPath;
    }
    
    public void setDataFolderPath(String dataFolderPath) {
        this.dataFolderPath = dataFolderPath;
    }
}