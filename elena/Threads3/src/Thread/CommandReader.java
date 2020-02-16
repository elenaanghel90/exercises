package Thread;

import java.nio.file.Paths;
import java.util.*;

public class CommandReader extends Thread {
    private List<Method> queue;

    public CommandReader(List<Method> queue) {
        this.queue = queue;
    }

    public static void main(String[] args) {
        // List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>()); //metoda de a obtine o lista safe; garanteaza fiecare operatie individual ca e thread safe
        List<Method> queue = Collections.synchronizedList(new LinkedList<>()); //metoda thread-safe

        CommandReader cr = new CommandReader(queue);
        cr.start();

        CommandExecutor cx1 = new CommandExecutor(queue);
        CommandExecutor cx2 = new CommandExecutor(queue);
//        cx1.setDaemon(true); //opreste executorul din rulare
//        cx2.setDaemon(true);
        cx1.start();
        cx2.start();
    }

    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        Boolean isRunning = true;

        while (isRunning) {
            sleep();
            System.out.print(">");
            String line = scan.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(line); //dam un string mai lung si imparte stringul
            Integer tokenNumber = tokenizer.countTokens();
            if (tokenNumber == 0) {
                continue;
            }
            String command = tokenizer.nextToken();
            switch (command) {
                case "cat":
                    if (tokenizer.hasMoreTokens()) //daca are mai multe tokenuri
                    {
                        String pathStr = tokenizer.nextToken();
                        CatMethod action = new CatMethod(Paths.get(pathStr));
                        queue.add(action);
                    } else {
                        System.err.println("Missing path ");
                    }
                    break;
                case "ls":
                    if (tokenizer.hasMoreTokens()) {
                        String pathStr = tokenizer.nextToken();
                        LsMethod action = new LsMethod(Paths.get(pathStr));
                        queue.add(action);
                    } else {
                        System.err.println("Missing path ");
                    }
                    break;
                case "echo":
                    String text = "";
                    while (tokenizer.hasMoreTokens()) {
                        text += " " + tokenizer.nextToken();//tokenizer ne ajuta sa luam tokenurile si next sa il adauga
                    }
                    EchoMethod echo = new EchoMethod(text.trim());//trim ca sa nu ne mai afiseze un spatiu in plus
                    queue.add(echo);
                    break;
                case "touch":
                    if (tokenizer.hasMoreTokens()) {
                        String pathStr = tokenizer.nextToken();
                        TouchMethod action = new TouchMethod(Paths.get(pathStr));
                        queue.add(action);
                    } else {
                        System.err.println("Missing path ");
                    }
                    break;
                case "append":
                    if (tokenizer.hasMoreTokens()) {
                        String pathStr = tokenizer.nextToken();
                        if (tokenizer.hasMoreTokens()) {
                            String textStr = tokenizer.nextToken();
                            AppendMethod action = new AppendMethod(Paths.get(pathStr), textStr);
                            queue.add(action);
                        } else {
                            System.err.println("Missing text ");
                        }
                    } else {
                        System.err.println("Missing path ");
                    }
                    break;

                case "exit":
                    queue.add(new ExitMethod()); //in loc de setDaemon
                    isRunning = false;
                    break;
            }
        }
        scan.close();
    }

    private void sleep() {
        try {
//            System.out.println("[" + Thread.currentThread().getName() + "] Looking for commands to read");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
