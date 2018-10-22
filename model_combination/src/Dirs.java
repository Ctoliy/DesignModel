/**
 * @create 2018-10-22 15:46 by Toliy
 * @desc 文件夹 对外  组合模式推荐使用透明模式，如果需要使用安全模式就将add/del这个方法的实现放到
 * 子组合中
 **/
public abstract class Dirs {
    String name;

    public abstract void addDirs(Dirs dirs);

    public abstract void delDirs(Dirs dirs);

    public abstract Dirs getChild(int index);

    public abstract void display(String path);

}
