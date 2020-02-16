package Thread;

import java.nio.file.Path;

public class AppendMethod implements Method {
    public Path path;
    public String text;

    public AppendMethod(Path path, String text) {
        this.path = path;
        this.text = text;
    }
}
