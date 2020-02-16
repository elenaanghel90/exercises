package Thread;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.List;

public class CommandExecutor extends Thread {
    private List<Method> queue;

    public CommandExecutor(List<Method> queue) {
        this.queue = queue;
    }

    private void executeCat(CatMethod catm) {
        try {
            List<String> lines = Files.readAllLines(catm.path);//ca sa scriem liniile
            for (String x : lines) {
                System.out.println(x);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void exectuteLs(LsMethod lsm) {
        if (!Files.exists(lsm.path)) {
            System.err.println("Directory doesn't exist ");
        } else {
            File file = lsm.path.toFile();

            if (Files.isDirectory(lsm.path)) {
                File[] children = file.listFiles();//cum se itereaza fiecare fisier dintr-un director
                for (int i = 0; i < children.length; ++i) {
                    System.out.println(children[i].getName());
                }
            } else {
                System.out.println(file.getName());
            }
        }
    }

    private void executeEcho(EchoMethod ecm) {
        System.out.println(ecm.text);
    }

    private void executeTouch(TouchMethod tcm) {
        try {
            if (!Files.exists(tcm.path)) {
                Files.createFile(tcm.path);
            } else {
                Files.setLastModifiedTime(tcm.path, FileTime.from(Instant.now()));
            }
        } catch (IOException e) {
            System.err.println("Cannot create/ modify file ");
        }
    }

    public void executeAppend(AppendMethod apm) {
        if (!Files.exists(apm.path)) {
            System.out.println("Missing path ");
        } else {
            try (BufferedWriter writer = Files.newBufferedWriter(apm.path, StandardOpenOption.APPEND)) { //StandardOpenOption.APPEND este necesar pentru a nu suprascrie fisierul, ci pentru a adauga textul la sfarsit
                writer.write(apm.text);//executa operatiunea in memorie
                //writer.flush();//flush ia ce ai scris si il scrie in fisier. Nu este necesar sa il apelamm pentru ca se execut automat la inchiderea streamului
            } catch (IOException e) {
                System.err.println("Cannot write to file ");
            }
        }
    }

    @Override
    public void run() {
        while (true) {
            sleep();
            Method m = null;
            synchronized (queue) {
                if (queue.size() > 0) {
                    m = queue.remove(0);
                }
                if (m instanceof CatMethod) {
                    executeCat((CatMethod) m);//facem cast; ca sa poti folosi ceva din CatMethod

                } else if (m instanceof ExitMethod) {
                    queue.add(m); //mai punem un m in coada; altfel primul thread ar fi vazut mesajul si urmatorul ar fi ramas agatat, ca el nu ar mai fi vazut mesajul de iesire; astfel fiecare thread va pune un m in coada
                    break;
                } else if (m instanceof LsMethod) {
                    exectuteLs((LsMethod) m);

                } else if (m instanceof EchoMethod) {
                    executeEcho((EchoMethod) m);
                } else if (m instanceof TouchMethod) {
                    executeTouch((TouchMethod) m);
                } else if (m instanceof AppendMethod) {
                    executeAppend((AppendMethod) m);
                }
            }
        }
    }

    private void sleep() {
        try {
//            System.out.println("[" + Thread.currentThread().getName() + "] Looking for commands to execute");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
