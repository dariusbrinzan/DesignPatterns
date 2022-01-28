import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

public class FileSystemz {
    INode root;
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    private int n = 0;

    public FileSystemz() {
        root = new INodeDirectory(":/");
        map.put("/", n);
    }

    public void ADD(String path) {
        String[] paths = path.split("/");

        if(paths.length == 2) {
            INode node = new INode(paths[paths.length - 1]);
            ++n;
            map.put(paths[paths.length - 1], n);
        } else {
            for (int i = 0; i < paths.length; ++i) {
                if(i == paths.length - 1) {
                    if(map.containsKey(paths[i])) {
                        System.out.println("invalid");
                    } else {
                        INodeFile file = new INodeFile(paths[i]);
                        ++n;
                        map.put(paths[i],n);
                    }
                } else if(!map.containsKey(paths[i])) {
                    throw new UnsupportedOperationException("You have to create" + paths[i] + "first!");
                }
            }
        }
    }

    public void Q01(File file) {
        String[] contents = file.list();

        assert contents != null;
        for (String content : contents) {
            System.out.println(content);
        }
    }

    public static boolean checkDir(String path) {
        return path !=null && new File(path).isDirectory();
    }

    public void Q02(String path) {
        if(checkDir(path)) {
            System.out.println("folder");
        } else {
            System.out.println("file");
        }
    }

    public static void main(String[] args) {
        FileSystemz fileSystemz = new FileSystemz();
        fileSystemz.ADD("/sdcard/Music/album/cover.jpg");

        fileSystemz.Q02("/sdcard/Music/album/cover.jpg");
    }
}
class INode {

    private String name;

    private long accessTime;

    public INode(String name) {
        this.name = name;
        this.accessTime = System.currentTimeMillis();
    }

    public long getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(long accessTime) {
        this.accessTime = accessTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class INodeFile extends INode {

    public INodeFile(String name) {
        super(name);
    }
}

class INodeDirectory extends INode {

    public INodeDirectory(String name) {
        super(name);
    }
}
