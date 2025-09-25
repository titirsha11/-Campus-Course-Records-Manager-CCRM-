package edu.ccrm.io;

import edu.ccrm.config.AppConfig;
import edu.ccrm.exception.CCRMException;

import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class FileUtilityService {
    private final AppConfig config = AppConfig.getInstance();

    // Utility to ensure the data directory exists
    private void ensureDirectory(Path dir) throws IOException {
        if (!Files.exists(dir)) {
            Files.createDirectories(dir);
            System.out.println("Created directory: " + dir);
        }
    }

    /**
     * Backs up exported data to a timestamped folder.
     * Demonstrates NIO.2: