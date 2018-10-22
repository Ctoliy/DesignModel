import java.util.ArrayList;
import java.util.List;

/**
 * @create 2018-10-22 15:50 by Toliy
 * @desc 文件夹
 **/
public class Dir extends Dirs {

    private String name;

    public Dir(String name) {
        this.name = name;
    }

    public List<Dirs> getDirsList() {
        return dirsList;
    }

    public Dir() {
    }

    List<Dirs> dirsList = new ArrayList<>();

    @Override
    public void addDirs(Dirs dirs) {
        dirs.name = name+"/"+dirs.name;
        dirsList.add(dirs);
    }

    @Override
    public void delDirs(Dirs dirs) {
        dirsList.remove(dirs);
    }

    @Override
    public Dirs getChild(int index) {
        return dirsList.get(index);
    }

    @Override
    public void display(String path) {
        path = path.isEmpty()?name:path+"/"+name;
        System.out.println("【我的路径是" + path + "】");
        for (Dirs dirs : dirsList) {
            dirs.display(path);
        }
    }
}
