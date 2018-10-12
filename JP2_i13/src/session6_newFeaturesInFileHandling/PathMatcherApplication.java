/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session6_newFeaturesInFileHandling;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import static java.nio.file.FileVisitResult.CONTINUE;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maithicamnhung
 */
class Finder extends SimpleFileVisitor<Path>{
    private Path file;
    private PathMatcher matcher;
    private int num;

    public Finder(Path file, PathMatcher matcher) {
        this.file = file;
        this.matcher = matcher;
    }
    private void find(Path file){
        Path name = file.getFileName();
        if(name != null && matcher.matches(name)){
            num++;
            System.out.println(file);
        }
    }
    void done(){
        System.out.println("Matcher: " + num);
    }
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr){
        find(file);
        return CONTINUE;
    }
    @Override
    public FileVisitResult preVisitDirectory(Path dir, 
            BasicFileAttributes attrs){
        find(dir);
        return CONTINUE;
    }
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc){
        System.out.println(exc);
        return CONTINUE;
    }
}

public class PathMatcherApplication {
    public static void main(String[] args) {
        Path pathObj = Paths.get("D:/CUSC");
        PathMatcher matcherObj = 
                FileSystems.getDefault().getPathMatcher("glob:" +  "*.txt");
        Finder finder = new Finder(pathObj, matcherObj);
        finder.done();
        try {
            Files.walkFileTree(pathObj, finder);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finder.done();
    }
}
