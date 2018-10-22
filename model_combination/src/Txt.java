/**
 * @create 2018-10-22 15:59 by Toliy
 * @desc
 **/
public class Txt extends Dirs {

    private String name;

    public Txt(String name) {
        this.name = name;
    }

    @Override
    public void addDirs(Dirs dirs) {
        throw new UnsupportedOperationException("我是" + name + "文本文件，是最底层节点了，无法再在我基础上面新增节点");
    }

    @Override
    public void delDirs(Dirs dirs) {
        throw new UnsupportedOperationException("我是" + name + "文本文件，是最底层节点了，无法再在我基础上面删除节点");
    }

    @Override
    public Dirs getChild(int index) {
        throw new UnsupportedOperationException("我是" + name + "文本文件，是最底层节点了，无法获取下面节点");
    }

    @Override
    public void display(String path) {
        System.out.print("我是" + name + "文本文件，啦啦啦啦啦啦--->");
        System.out.print("我所在的路径：【" + path + "/" + name + "】");
        System.out.println();
    }
}
