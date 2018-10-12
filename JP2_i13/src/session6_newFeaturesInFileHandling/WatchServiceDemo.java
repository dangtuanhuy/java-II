/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

/**
 *
 * @author maithicamnhung
 */
public class WatchServiceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path directory = Paths.get("D:\\DATA\\");

        try {
            WatchService fileSystemWatchService = FileSystems.getDefault().newWatchService();
            WatchKey watchKey = directory.register(fileSystemWatchService,
                    StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY,
                    StandardWatchEventKinds.ENTRY_DELETE);
            while (true) {
                WatchKey watchKeyActual = fileSystemWatchService.take();
                for (WatchEvent<?> event : watchKeyActual.pollEvents()) {
                    WatchEvent.Kind<?> eventKind = event.kind();

                    if (eventKind == StandardWatchEventKinds.OVERFLOW) {
                        continue;
                    }

                    WatchEvent<Path> eventPath = (WatchEvent<Path>) event;
                    Path fileName = eventPath.context();
                    System.out.println("Event " + eventKind + " occurred on " + fileName);
                }
                boolean isReset = watchKeyActual.reset();
                if (!isReset) {
                    break;
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }
}
