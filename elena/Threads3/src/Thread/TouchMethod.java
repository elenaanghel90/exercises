package Thread;

import java.nio.file.Path;

public class TouchMethod implements Method {
    public Path path;

    public TouchMethod(Path path){
        this.path = path;
    }
}
